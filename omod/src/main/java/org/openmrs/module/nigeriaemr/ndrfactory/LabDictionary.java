/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.nigeriaemr.ndrfactory;

import java.io.Console;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.module.nigeriaemr.model.ndr.AnswerType;
import org.openmrs.module.nigeriaemr.model.ndr.CodedSimpleType;
import org.openmrs.module.nigeriaemr.model.ndr.CodedType;
import org.openmrs.module.nigeriaemr.model.ndr.LaboratoryOrderAndResult;
import org.openmrs.module.nigeriaemr.model.ndr.LaboratoryReportType;
import org.openmrs.module.nigeriaemr.model.ndr.NumericType;
import org.openmrs.module.nigeriaemr.ndrUtils.Utils;
import static org.openmrs.module.nigeriaemr.ndrUtils.Utils.extractObs;
import static org.openmrs.module.nigeriaemr.ndrUtils.Utils.getXmlDate;


public class LabDictionary {

	public LabDictionary(){
		loadLabTestDictionary();
		loadLabTestUnitDictionary();
		loadLabTestUnitDescription();
		loadOtherCodedValues();
	}

	public final static int CD4_Count_Concept_Id = 5497;
	public final static int SERUM_CREATININE_CONCEPT_ID=164364;
	public final static int WEIGHT_CONCEPT_ID=5089;
	public final static int WHO_STAGING_CONCEPT_ID=5356;
	public final static int PCV_HCT_CONCEPT_ID=1015;
	public final static int ALT_SGPT_CONCEPT_ID=654;
	public final static int Viral_Load_CONCEPT_ID=856;


	final static int Ordered_By_Concept_Id = 164987;
	
	final static int Ordered_Date_Concept_id = 164989;
	
	final static int Checked_By_Concept_Id = 164983;
	final static int Checked_By_Date_Concept_Id = 164984;
	
	final static int Reported_By_Date_Concept_Id = 1644984;
	final static int Numeric_DataType_Concept_Id = 1;
	final static int Coded_DataType_ConceptId = 2;
	final static int Text_DataType_ConceptId = 3;
	final static int Visit_Type_Concept_Id = 164181;
	final static int Laboratory_Identifier_Concept_Id = 164409;

	private Map<Integer, Integer> labTestDictionary = new HashMap<>();
	private Map<Integer, String> labTestUnits = new HashMap<>();
	private Map<String, String> labTestUnitDescription = new HashMap<>();
	private Map<Integer, String> CodedAnswerDictionary = new HashMap<>();

	private void loadLabTestDictionary() {
		labTestDictionary = new HashMap<>();
		labTestDictionary.put(654,2);//SERUM GLUTAMIC-PYRUVIC TRANSAMINASE
		labTestDictionary.put(653,4);//SERUM GLUTAMIC-OXALOACETIC TRANSAMINASE
		labTestDictionary.put(655,7);//TOTAL BILIRUBIN
		labTestDictionary.put(CD4_Count_Concept_Id,11);//CD4 COUNT
		labTestDictionary.put(730,11);//CD4%
		labTestDictionary.put(1319,12);//LYMPHOCYTE COUNT
		labTestDictionary.put(1338,12);//LYMPHOCYTES (%) - MICROSCOPIC EXAM
		labTestDictionary.put(1007,18);//HIGH-DENSITY LIPOPROTEIN CHOLESTEROL
		labTestDictionary.put(1008,19);//LOW-DENSITY LIPOPROTEIN CHOLESTEROL
		labTestDictionary.put(164364,21);//Serum creatinine (mg/dL)
		labTestDictionary.put(160053,31);//Glucose measurement, serum, fasting (mmol/dL)
		labTestDictionary.put(1015,34);//HEMATOCRIT
		labTestDictionary.put(159430,42);//Hepatitis B Surface Antigen Test
		labTestDictionary.put(1325,43);//HEPATITIS C TEST - QUALITATIVE
		labTestDictionary.put(32 	,50);//MALARIAL SMEAR "
		labTestDictionary.put(885 	,52);//PAPANICOLAOU SMEAR "
		labTestDictionary.put(785,54);//ALKALINE PHOSPHATASE
		labTestDictionary.put(729,56);//Platelets
		labTestDictionary.put(1133,57);//SERUM POTASSIUM
		labTestDictionary.put(717 	,59);//TOTAL PROTEIN "
		labTestDictionary.put(1132,64);//SERUM SODIUM
		labTestDictionary.put(299 	,70);//VDRL "
		labTestDictionary.put(1006,72);//TOTAL CHOLESTEROL
		labTestDictionary.put(1009,74);//TRIGLYCERIDES
		labTestDictionary.put(856,80);//HIV VIRAL LOAD
		labTestDictionary.put(678,82);//WHITE BLOOD CELLS
		labTestDictionary.put(165398,0);//Additional Lab Tests
		labTestDictionary.put(1025,0);//BASOPHILS
		labTestDictionary.put(1341,0);//BASOPHILS (%) - MICROSCOPIC EXAM
		labTestDictionary.put(1024,0);//EOSINOPHILS
		labTestDictionary.put(1023,0);//MONOCYTES
		labTestDictionary.put(1339,0);//MONOCYTES (%) - MICROSCOPIC EXAM
		labTestDictionary.put(1022,13);//NEUTROPHILS
		labTestDictionary.put(45,58);//URINE PREGNANCY TEST
	}

	private void loadOtherCodedValues(){
		CodedAnswerDictionary = new HashMap<>();
		//visit type
		CodedAnswerDictionary.put(160530, "R"); //repeat
		CodedAnswerDictionary.put(164180, "B"); //baseline

	}
	
	private void loadLabTestUnitDictionary() {
		labTestUnits = new HashMap<>();
		labTestUnits.put(88, "48");
		labTestUnits.put(315, "60");
		labTestUnits.put(1153, "398");
		labTestUnits.put(365, "311");
		labTestUnits.put(331, "25");
		labTestUnits.put(1717, "48");
		labTestUnits.put(1168, "398");
		labTestUnits.put(366, "311");
		labTestUnits.put(1169, "48");
		labTestUnits.put(1718, "398");
		labTestUnits.put(367, "311");
		labTestUnits.put(1716, "48");
		labTestUnits.put(1170, "398");
		labTestUnits.put(1531, "311");
		labTestUnits.put(1719, "48");
		labTestUnits.put(1156, "398");
		labTestUnits.put(451, "257");
		labTestUnits.put(1150, "48");
		labTestUnits.put(7777906, "398");
		labTestUnits.put(1528, "257");
		labTestUnits.put(7777907, "398");
		labTestUnits.put(228, "136");
		labTestUnits.put(1529, "93");
		labTestUnits.put(375, "25");
		labTestUnits.put(1175, "311");
		labTestUnits.put(1159, "311");
		labTestUnits.put(313, "257");
		labTestUnits.put(308, "93");
		labTestUnits.put(309, "93");
		labTestUnits.put(1176, "311");
		labTestUnits.put(1530, "93");
		labTestUnits.put(329, "398");
		labTestUnits.put(332, "25");
	}
	
	private void loadLabTestUnitDescription() {
		labTestUnitDescription = new HashMap<>();
		labTestUnitDescription.put("48", "CellsPerMicroLiter,cell/ul");
		labTestUnitDescription.put("60", "CopiesPerMilliLiter,copies/ml");
		labTestUnitDescription.put("398", "percent,%");
		labTestUnitDescription.put("311", "MilliMolesPerLiter,mmol/L");
		labTestUnitDescription.put("25", "BillionPerLiter,10*9/L");
		labTestUnitDescription.put("257", "MicroMole,umol");
		labTestUnitDescription.put("136", "GramsPerDeciLiter,g/dL");
		labTestUnitDescription.put("93", "GramsPerDeciLiter,U/L");
	}
	
	private int getMappedValue(int conceptID) {
		try{
			return labTestDictionary.get(conceptID);
		}catch (Exception ex){
			System.out.println(ex.getMessage());
			throw ex;
		}
	}

	private String getMappedAnswerValue(int conceptID) {
		return CodedAnswerDictionary.get(conceptID);
	}

	private boolean isValidLabTest(int conceptID) {
		return labTestDictionary.keySet().contains(conceptID);
	}
	
	public LaboratoryReportType createLaboratoryOrderAndResult(Patient pts, Encounter enc, List<Obs> labObsList)
			throws DatatypeConfigurationException {
		
		LaboratoryReportType labReportType = new LaboratoryReportType();

		XMLGregorianCalendar convertedDate = Utils.getXmlDate(enc.getEncounterDatetime());
		labReportType.setVisitID(Utils.getVisitId(pts,enc));
		labReportType.setVisitDate(convertedDate);
		labReportType.setCollectionDate(convertedDate);

		Date artStartDate = Utils.getARTStartDate(pts);
		if (artStartDate != null) {
			labReportType.setARTStatusCode("A");
		}

		Obs obs = extractObs(Visit_Type_Concept_Id, labObsList);
		if(obs !=null && obs.getValueCoded() !=null){
			labReportType.setBaselineRepeatCode(getMappedAnswerValue(obs.getValueCoded().getConceptId()));
		}

		obs = extractObs(Laboratory_Identifier_Concept_Id, labObsList);
		if (obs != null) {
			labReportType.setLaboratoryTestIdentifier(obs.getValueText());
		}

		obs = extractObs(Ordered_By_Concept_Id, labObsList);
		if (obs != null) {
			labReportType.setClinician(obs.getValueText());
		}

		obs = extractObs(Checked_By_Concept_Id, labObsList);
		if (obs != null) {
			labReportType.setCheckedBy(obs.getValueText());
		}

		obs = extractObs(Reported_By_Date_Concept_Id, labObsList);
		if (obs != null) {
			labReportType.setReportedBy(obs.getValueText());
		}


		try{ //if there is no lab order and result, discard

			List<LaboratoryOrderAndResult> laboratoryOrderAndResultList = createLaboratoryOrderAndResult(enc, labObsList);
			if(laboratoryOrderAndResultList !=null && laboratoryOrderAndResultList.size() > 0){
				labReportType.getLaboratoryOrderAndResult().addAll(laboratoryOrderAndResultList);
				return labReportType;
			}
			else{
				return null;
			}

		}catch (Exception ex){
			System.out.println(ex.getMessage());
			throw ex;
		}


	}
	
	private List<LaboratoryOrderAndResult> createLaboratoryOrderAndResult(Encounter enc, List<Obs> obsList)
	        throws DatatypeConfigurationException {

		List<LaboratoryOrderAndResult> labResultList = new ArrayList<>();

		int conceptID;
		int dataType;
		CodedSimpleType cst;

		AnswerType answer;
		NumericType numeric;
		Date orderedDate = new Date();

		Obs obsEle = extractObs(Ordered_Date_Concept_id, obsList);
		if (obsEle != null) {
			orderedDate = obsEle.getValueDate();
		}

		LaboratoryOrderAndResult labOrderAndResult;
		for (Obs obs : obsList) {

			labOrderAndResult = new LaboratoryOrderAndResult();
			cst = new CodedSimpleType();

			conceptID = obs.getConcept().getId();
			dataType = obs.getConcept().getDatatype().getConceptDatatypeId();

			int ndrCodedValue;

			if (dataType == Numeric_DataType_Concept_Id && isValidLabTest(conceptID)) {

				ndrCodedValue = getMappedValue(conceptID);

				cst.setCode(Integer.toString(ndrCodedValue));
				cst.setCodeDescTxt(obs.getConcept().getName().getName());
				labOrderAndResult.setLaboratoryResultedTest(cst);

				answer = new AnswerType();
				numeric = new NumericType();
				numeric.setValue1((int) Math.round(obs.getValueNumeric()));

				if (orderedDate != null) {
					labOrderAndResult.setOrderedTestDate(getXmlDate(orderedDate));
				}
				labOrderAndResult.setResultedTestDate(getXmlDate(enc.getEncounterDatetime()));

				//TODO:revisit this implementation
				if (labTestUnits.containsKey(conceptID)) {

					CodedType ct = new CodedType();
					ct.setCode(labTestUnits.get(conceptID));

					String[] descriptionText = StringUtils.split(labTestUnitDescription.get(ct.getCode()), ",");
					if (descriptionText != null) {
						ct.setCodeDescTxt(descriptionText[0]);
						ct.setCodeSystemCode(StringEscapeUtils.escapeXml(descriptionText[1]));
					}
					numeric.setUnit(ct);
				}

				answer.setAnswerNumeric(numeric);
				labOrderAndResult.setLaboratoryResult(answer);
				labResultList.add(labOrderAndResult);
				
			} else if (dataType == Coded_DataType_ConceptId && isValidLabTest(conceptID)) {
				cst = new CodedSimpleType();

				//set the lab test code
				ndrCodedValue = getMappedValue(conceptID);
				cst.setCode(Integer.toString(ndrCodedValue));
				cst.setCodeDescTxt(obs.getConcept().getName().getName());
				labOrderAndResult.setLaboratoryResultedTest(cst);

				//get the answer
				CodedType ct = new CodedType();
				ct.setCode(obs.getValueCoded().getName().getName());
				ct.setCodeDescTxt(obs.getValueCoded().getName().getName());
				ct.setCodeSystemCode(obs.getValueCoded().getName().getName());

				answer = new AnswerType();
				answer.setAnswerCode(ct);
				labOrderAndResult.setLaboratoryResult(answer);

				if (orderedDate != null) {
					labOrderAndResult.setOrderedTestDate(getXmlDate(orderedDate));
				}
				labOrderAndResult.setResultedTestDate(getXmlDate(enc.getEncounterDatetime()));
				labResultList.add(labOrderAndResult);
			}
		}
		return labResultList;
	}
}
