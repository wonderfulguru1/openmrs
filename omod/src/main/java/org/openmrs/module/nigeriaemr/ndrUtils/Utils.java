package org.openmrs.module.nigeriaemr.ndrUtils;

import org.joda.time.Years;
import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.EncounterType;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.api.context.Context;
import org.openmrs.parameter.EncounterSearchCriteriaBuilder;
import org.openmrs.module.nigeriaemr.model.ndr.FacilityType;
import org.openmrs.module.nigeriaemr.ndrfactory.ClinicalDictionary;
import org.openmrs.module.nigeriaemr.ndrfactory.LabDictionary;
import org.openmrs.module.nigeriaemr.ndrfactory.PharmacyDictionary;
import org.openmrs.module.nigeriaemr.util.ZipUtil;
import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Months;

public class Utils {
	
	public final static int HIV_Enrollment_Encounter_Type_Id = 14;
	
	public final static int Pharmacy_Encounter_Type_Id = 13;
	
	public final static int Laboratory_Encounter_Type_Id = 11;
	
	public final static int Care_card_Encounter_Type_Id = 12;
	
	public final static int Adult_Ped_Initial_Encounter_Type_Id = 8;
	
	public final static int Client_Tracking_And_Termination_Encounter_Type_Id = 15;
	public final static int Client_Intake_Form_Encounter_Type_Id = 20;
	
	public final static int Patient_PEPFAR_Id = 3;
	
	public final static int Patient_Hospital_Id = 3;
	
	public final static int Patient_RNLSerial_No = 3;
	
	public final static int Reason_For_Termination = 165470;


	
	public static String getFacilityName() {
		return Context.getAdministrationService().getGlobalProperty("Facility_Name");
	}
	
	public static String getFacilityLocalId() {
		return Context.getAdministrationService().getGlobalProperty("facility_local_id");
	}
	
	public static String getNigeriaQualId() {
		return Context.getAdministrationService().getGlobalProperty("nigeria_qual_id");
	}
	
	public static String getFacilityDATIMId() {
		return Context.getAdministrationService().getGlobalProperty("facility_datim_code");
	}
	
	public static String getIPFullName() {
		return Context.getAdministrationService().getGlobalProperty("partner_full_name");
	}
	
	public static String getIPShortName() {
		return Context.getAdministrationService().getGlobalProperty("partner_short_name");
	}
	
	//date is always saved as yyyy-MM-dd
	public static Date getLastNDRDate() {
		String lastRunDateString = Context.getAdministrationService().getGlobalProperty("ndr_last_run_date");
		if (String.valueOf(lastRunDateString).isEmpty()) {
			return null;
		} else {
			try {
				return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(lastRunDateString);
			}
			catch (Exception e) {
				System.out.println("Last Date was not in the correct format");
				return null;
			}
		}
	}

	public static List<Encounter> getEncounterByPatientAndEncounterTypeId(Patient patient, int encounterTypeId) {

		EncounterType encounterType = Context.getEncounterService().getEncounterType(encounterTypeId);
		Collection<EncounterType> encounterTypes = new ArrayList<>();
		encounterTypes.add(encounterType);

		EncounterSearchCriteriaBuilder encounterSearch = new EncounterSearchCriteriaBuilder()
				.setPatient(patient).setEncounterTypes(encounterTypes).setIncludeVoided(false);

		List<Encounter> encounter =	Context.getEncounterService().getEncounters(encounterSearch.createEncounterSearchCriteria());
		return encounter;
	}
	
	public static void updateLast_NDR_Run_Date(Date date) {
		String dateString = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
		Context.getAdministrationService().updateGlobalProperty("ndr_last_run_date", dateString);
	}
	
	public static String getVisitId(Patient pts, Encounter enc) {
		String dateString = new SimpleDateFormat("dd-MM-yyyy").format(enc.getEncounterDatetime());
		return pts.getPatientIdentifier(3).getIdentifier() + "-" + dateString;
	}
	
	public static Obs extractObs(int conceptID, List<Obs> obsList) {

		if(obsList == null){
			return null;
		}
		return obsList.stream().filter(ele -> ele.getConcept().getConceptId() == conceptID).findFirst().orElse(null);
	}
	
	public static Encounter getLastEncounter(Patient patient) {

		List<Encounter> hivEnrollmentEncounter = Context.getEncounterService()
				.getEncountersByPatient(patient);

		//sort the list by date
		hivEnrollmentEncounter.sort(Comparator.comparing(Encounter::getEncounterDatetime));
		int size = hivEnrollmentEncounter.size();
		return hivEnrollmentEncounter.get(size - 1);
	}
	
	public static List<Obs> getCareCardObs(Patient patient, Date endDate) {

		List<Encounter> hivEnrollmentEncounter = Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterDatetime().before(endDate) && x.getEncounterType().getEncounterTypeId() == Care_card_Encounter_Type_Id)
				.sorted(Comparator.comparing(Encounter::getEncounterDatetime))
				.collect(Collectors.toList());

		if (hivEnrollmentEncounter != null && hivEnrollmentEncounter.size() > 0) {
			int lastIndex = hivEnrollmentEncounter.size()-1;
			return new ArrayList<>(hivEnrollmentEncounter.get(lastIndex).getAllObs(false));
		} else {
			return null;
		}
	}
	
	public static List<Obs> getHIVEnrollmentObs(Patient patient) {
		Optional<Encounter> hivEnrollmentEncounter = Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterType().getEncounterTypeId() == HIV_Enrollment_Encounter_Type_Id)
				.findAny();
		if (hivEnrollmentEncounter != null && hivEnrollmentEncounter.isPresent()) {
			return new ArrayList<>(hivEnrollmentEncounter.get().getAllObs(false));
		} else {
			return null;
		}
	}
	
	public static List<Encounter> getAllRegimenObs(Patient patient) {
		return Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterType().getEncounterTypeId() == Pharmacy_Encounter_Type_Id)
				.sorted(Comparator.comparing(Encounter::getEncounterDatetime))
				.collect(Collectors.toList());
	}
	
	public static List<Obs> getFirstRegimenObs(Patient patient) {
		List<Encounter> arvEncounter = getAllRegimenObs(patient);

		if (arvEncounter != null && arvEncounter.size() > 0) {
			return new ArrayList<>(arvEncounter.get(0).getAllObs(false));
		} else {
			return null;
		}
	}
	
	public static Obs getFirstRegimen(Patient patient) {
		
		List<Obs> FirstRegimenObs = getFirstRegimenObs(patient);
		return getRegimenFromObs(FirstRegimenObs);
		
	}
	
	public static Obs getRegimenFromObs(List<Obs> RegimenObs) {
		
		Obs regimenLine = Utils.extractObs(PharmacyDictionary.Prescribed_Regimen_Line_Concept_Id, RegimenObs);
		if (regimenLine != null && regimenLine.getValueCoded() != null) {
			Obs regimen = Utils.extractObs(regimenLine.getValueCoded().getConceptId(), RegimenObs);
			if (regimen != null && regimen.getValueCoded() != null) {
				return regimen;
			}
		}
		return null;
	}
	
	public static Date getARTStartDate(Patient patient) {
		
		List<Obs> FirstRegimenObs = getFirstRegimenObs(patient);
		Obs FirstRegimen = getRegimenFromObs(FirstRegimenObs);
		if (FirstRegimen != null && FirstRegimen.getValueCoded() != null) {
			return FirstRegimen.getObsDatetime();
		}
		return null;
	}
	
	public static XMLGregorianCalendar getXmlDate(Date date) throws DatatypeConfigurationException {
		XMLGregorianCalendar cal = null;
		if (date != null) {
			cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(date));
		}
		return cal;
	}
	
	public static XMLGregorianCalendar getXmlDateTime(Date date) throws DatatypeConfigurationException {
		XMLGregorianCalendar cal = null;
		if (date != null) {
			cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
			    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(date));
		}
		return cal;
	}
	
	public static FacilityType createFacilityType(String facilityName, String facilityID, String facilityTypeCode) {
		FacilityType facilityType = new FacilityType();
		facilityType.setFacilityName(facilityName);
		facilityType.setFacilityID(facilityID);
		facilityType.setFacilityTypeCode(facilityTypeCode);
		return facilityType;
	}
	
	public String ensureDownloadFolderExist(HttpServletRequest request) {
		//create report download folder at the server. skip if already exist
		String folder = new File(request.getRealPath(request.getContextPath())).getParentFile().toString() + "\\downloads"; //request.getRealPath(request.getContextPath()) + "\\reports";
		File dir = new File(folder);
		Boolean b = dir.mkdir();
		System.out.println("Creating download folder : " + folder + "was successful : " + b);
		return folder;
	}
	
	public String ensureReportFolderExist(HttpServletRequest request, String reportType) {
		String downloadFolder = ensureDownloadFolderExist(request);
		String reportFolder = downloadFolder + "/" + reportType;
		File dir = new File(reportFolder);
		dir.mkdir();
		System.out.println(reportType + " folder exist ? : " + dir.exists());
		
		//create today's folder
		boolean b;
		String dateString = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		String todayFolders = reportFolder + "/" + dateString;
		dir = new File(todayFolders);
		if (dir.exists()) {
			File[] previousFiles = dir.listFiles();
			assert previousFiles != null;
			for (File f : previousFiles) {
				b = f.delete();
				System.out.println("deleted previous xml successfully ? " + b);
			}
			b = dir.delete();
			System.out.println("deleted previous folder successfully ? " + b);
		}
		dir.mkdir();
		System.out.println(todayFolders + " folder exist ? " + dir.exists());
		
		return todayFolders;
	}
	
	public String ZipFolder(HttpServletRequest request, String folderToZip, String zipFileName, String reportType) {
		
		File toZIP = new File(folderToZip);
		if (!toZIP.exists() || toZIP.listFiles() == null || Objects.requireNonNull(toZIP.listFiles()).length == 0) {
			return "no new patient record found";
		}
		
		//Zip today's folder and name it with today's date
		
		//String zipFileName = new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + ".zip";
		ZipUtil appZip = new ZipUtil(folderToZip);
		appZip.generateFileList(toZIP);
		appZip.zipIt(toZIP.getParent() + "/" + zipFileName);
		
		return request.getContextPath() + "/downloads/" + reportType + "/" + zipFileName;
	}
	
	public static String formatDate(Date date) {
		return formatDate(date, "dd/MM/yyyy");
	}
	
	public static String formatDate(Date date, String format) {
		String dateString = "";
		if (date != null) {
			SimpleDateFormat df = new SimpleDateFormat(format);
			dateString = df.format(date);
		}
		return dateString;
	}
	
	public static String getPatientPEPFARId(Patient patient) {
		
		PatientIdentifier patientId = patient.getPatientIdentifier(Patient_PEPFAR_Id);
		
		if (patientId != null)
			return patientId.getIdentifier();
		else
			return "";
	}
	
	public static String getPatientHospitalNo(Patient patient) {
		
		PatientIdentifier patientId = patient.getPatientIdentifier(Patient_Hospital_Id);
		
		if (patientId != null)
			return patientId.getIdentifier();
		else
			return "";
	}
	
	public static String getPatientRNLSerialNo(Patient patient) {
		
		PatientIdentifier patientId = patient.getPatientIdentifier(Patient_RNLSerial_No);
		if (patientId != null)
			return patientId.getIdentifier();
		else
			return "";
	}
	
	public static Obs getLastAdherenceObs(Patient patient, Date endDate) {

		List<Encounter> encounters = Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterType().getEncounterTypeId() == Care_card_Encounter_Type_Id
								|| x.getEncounterType().getEncounterTypeId() == Pharmacy_Encounter_Type_Id)
				.sorted(Comparator.comparing(Encounter::getEncounterDatetime))
				.collect(Collectors.toList());

		List<Encounter> filteredList =  encounters.stream()
				.filter(x -> x.getEncounterDatetime().before(endDate))
				.collect(Collectors.toList());

		if (filteredList != null && filteredList.size() > 0) {
			int lastIndex = filteredList.size()-1;
			Encounter lastEncounter =  filteredList.get(lastIndex);

			Optional<Obs> adherenceObs = lastEncounter.getAllObs().stream()
					.filter(x-> x.getConcept().getConceptId() == ClinicalDictionary.ARV_Drug_Adherence_Concept_Id
					|| x.getConcept().getConceptId() == ClinicalDictionary.Cotrimoxazole_Adherence_Concept_Id
					|| x.getConcept().getConceptId() == ClinicalDictionary.INH_Adherence_Concept_Id)
					.findAny();

			if(adherenceObs !=null && adherenceObs.isPresent())
				return adherenceObs.get();
			else
				return null;
		} else {
			return null;
		}
	}
	
	public static List<Encounter> getLastEncounters(Patient patient, Date endDate) {

		return Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterDatetime().before(endDate) && (
						x.getEncounterType().getEncounterTypeId() == Adult_Ped_Initial_Encounter_Type_Id
								|| x.getEncounterType().getEncounterTypeId() == Care_card_Encounter_Type_Id))
				.sorted(Comparator.comparing(Encounter::getEncounterDatetime))
				.collect(Collectors.toList());
	}
	
	public static Obs getReasonForTerminationObs(Patient patient) {
		Optional<Encounter> encounter = Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterType().getEncounterTypeId() == Client_Tracking_And_Termination_Encounter_Type_Id)
				.findAny();

		if (encounter != null && encounter.isPresent()) {
			Optional<Obs> obs = encounter.get().getAllObs().stream()
					.filter(x -> x.getValueCoded().getConceptId() == Reason_For_Termination)
					.findAny();

			if (obs != null && obs.isPresent()) {
				return obs.get();
			}
		}
		return null;
	}
	
	public static Obs getAllTBStatusObs(Patient patient) {
		Optional<Encounter> encounter = Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterType().getEncounterTypeId() == Client_Tracking_And_Termination_Encounter_Type_Id)
				.findAny();

		if (encounter != null && encounter.isPresent()) {
			Optional<Obs> obs = encounter.get().getAllObs().stream()
					.filter(x -> x.getValueCoded().getConceptId() == Reason_For_Termination)
					.findAny();

			if (obs != null && obs.isPresent()) {
				return obs.get();
			}
		}
		return null;
	}
	
	public static Obs getHighestCD4Obs(Patient patient) {
		
		Concept CD4Concept = Context.getConceptService().getConcept(LabDictionary.CD4_Count_Concept_Id);
		List<Obs> allCD4Obs = Context.getObsService().getObservationsByPersonAndConcept(patient.getPerson(), CD4Concept);
		Double previousValue = 0.0;
		Obs highestCD4Value = null;
		
		for (Obs obs : allCD4Obs) {
			if (obs.getValueNumeric() > previousValue) {
				previousValue = obs.getValueNumeric();
				highestCD4Value = obs;
			}
		}
		return highestCD4Value;
		
		/*
		List<Obs> allCD4Obs = new ArrayList<>();
		List<Encounter> encounters = Context.getEncounterService()
				.getEncountersByPatient(patient).stream()
				.filter(x -> x.getEncounterType().getEncounterTypeId() == Laboratory_Encounter_Type_Id)
				.collect(Collectors.toList());

		for(Encounter enc: encounters){
			List<Obs> obs = enc.getAllObs(false).stream()
					.filter(x-> x.getValueCoded().getConceptId() == LabDictionary.CD4_Count_Concept_Id)
					.collect(Collectors.toList());
			allCD4Obs.addAll(obs);
		}*/
	}
	
	public static List<Obs> getObs(Patient patient, int ConceptId) {

		Concept concept = Context.getConceptService().getConcept(ConceptId);
		return Context.getObsService().getObservationsByPersonAndConcept(patient.getPerson(), concept).stream()
				.sorted(Comparator.comparing(Obs::getObsDatetime))
				.collect(Collectors.toList());
	}
	
	public static Obs getInitialObs(Patient patient, int Concept_Id ){

		Concept concept = Context.getConceptService().getConcept(Concept_Id);
		List<Obs> obs = Context.getObsService().getObservationsByPersonAndConcept(patient.getPerson(), concept);
		obs.sort(Comparator.comparing(Obs::getObsDatetime));

		if(obs.size() > 0){
			return obs.get(0);
		}
		return null;
	}
	
	public static Obs getLastObs(Patient patient, int Concept_Id, Date endDate ){

		Concept concept = Context.getConceptService().getConcept(Concept_Id);
		List<Obs> obs = Context.getObsService().getObservationsByPersonAndConcept(patient.getPerson(), concept)
				.stream().filter(x -> x.getObsDatetime().before(endDate))
				.sorted(Comparator.comparing(Obs::getObsDatetime))
				.collect(Collectors.toList());

		if(obs !=null && obs.size() > 0){
			int lastIndex = obs.size()-1;
			return obs.get(lastIndex);
		}
		return null;
	}
	
	public static Encounter getLastEncounter(Patient patient, Date endDate) {

		Optional<Encounter> encounters = Context.getEncounterService().getEncountersByPatient(patient)
				.stream().filter(x -> x.getEncounterDatetime().before(endDate))
				.max(Comparator.comparing(Encounter::getEncounterDatetime));

		if (encounters != null && encounters.isPresent()) {
			return encounters.get();
			/*encounters.sort(Comparator.comparing(Encounter::getEncounterDatetime));
			int lastIndex = encounters.size() - 1;
			return encounters.get(lastIndex);*/
		}
		return null;
	}
	
	public static int getDateDiffInMonth(Date startDate, Date endDate) {
		
		int monthDiff = 0;
		LocalDate d2 = new LocalDate(new DateTime(endDate));
		LocalDate d1 = new LocalDate(new DateTime(startDate));
		if (startDate != null && (d2.isAfter(d1) || d2.isEqual(d1))) {
			monthDiff = Months.monthsBetween(d1, d2).getMonths();
		}
		return monthDiff;
	}
	
	public static int getAge(Date dateOfBirth) {
		
		LocalDate d2 = new LocalDate(new DateTime(dateOfBirth));
		LocalDate d1 = new LocalDate(new DateTime());
		return Years.yearsBetween(d2, d1).getYears();
	}
	
	public static Obs getElementObs(int pos, List<Obs> s) {
		Iterator<Obs> it = s.iterator();
		int count = 0;
		Obs ele = null;
		while (it.hasNext() && count < pos && pos <= s.size()) {
			ele = it.next();
			count++;
		}
		return ele;
	}
	
	public void writeToFile(String filePath, String content) {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(filePath);
			bw = new BufferedWriter(fw);
			bw.write(content);
			System.out.println("Done");
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				if (bw != null)
					bw.close();
				
				if (fw != null)
					fw.close();
				
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	/*public String ensureTodayDownloadFolderExist(String parentFolder, HttpServletRequest request) {
		//create today's folder
		String dateString = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		String todayFolders = parentFolder + "/" + dateString;
		File dir = new File(todayFolders);
		Boolean b = dir.mkdir();
		System.out.println("creating folder : " + todayFolders + "was successful : " + b);
		return todayFolders;
	}*/
	
}
