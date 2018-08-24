package org.openmrs.module.nigeriaemr.model.ndr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ConditionType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionCode" type="{}CodeType"/>
 *         &lt;element name="ProgramArea" type="{}ProgramAreaType"/>
 *         &lt;element name="PatientAddress" type="{}AddressType" minOccurs="0"/>
 *         &lt;element name="CommonQuestions" type="{}CommonQuestionsType" minOccurs="0"/>
 *         &lt;element name="ConditionSpecificQuestions" type="{}ConditionSpecificQuestionsType" minOccurs="0"/>
 *         &lt;element name="Encounters" type="{}EncountersType" minOccurs="0"/>
 *         &lt;element name="LaboratoryReport" type="{}LaboratoryReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Regimen" type="{}RegimenType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Immunization" type="{}ImmunizationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = { "conditionCode", "programArea", "patientAddress", "commonQuestions",
        "conditionSpecificQuestions", "encounters", "laboratoryReport", "regimen", "immunization", "pregnancyRecord",
        "hivTestRecords" })
public class ConditionType {
	
	@XmlElement(name = "ConditionCode", required = true)
	protected String conditionCode;
	
	@XmlElement(name = "ProgramArea", required = true)
	protected ProgramAreaType programArea;
	
	@XmlElement(name = "PatientAddress")
	protected AddressType patientAddress;
	
	@XmlElement(name = "CommonQuestions")
	protected CommonQuestionsType commonQuestions;
	
	@XmlElement(name = "ConditionSpecificQuestions")
	protected ConditionSpecificQuestionsType conditionSpecificQuestions;
	
	@XmlElement(name = "Encounters")
	protected EncountersType encounters;
	
	@XmlElement(name = "LaboratoryReport")
	protected List<LaboratoryReportType> laboratoryReport;
	
	@XmlElement(name = "Regimen")
	protected List<RegimenType> regimen;
	
	@XmlElement(name = "Immunization")
	protected List<ImmunizationType> immunization;
	
	@XmlElement(name = "PregnancyRecord")
	protected List<PregnancyEncounterType> pregnancyRecord;
	
	@XmlElement(name = "HIVTestRecords")
	protected List<HIVTestingEncounterType> hivTestRecords;
	
	/**
	 * Gets the value of the conditionCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getConditionCode() {
		return conditionCode;
	}
	
	/**
	 * Sets the value of the conditionCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setConditionCode(String value) {
		this.conditionCode = value;
	}
	
	/**
	 * Gets the value of the programArea property.
	 * 
	 * @return possible object is {@link ProgramAreaType }
	 */
	public ProgramAreaType getProgramArea() {
		return programArea;
	}
	
	/**
	 * Sets the value of the programArea property.
	 * 
	 * @param value allowed object is {@link ProgramAreaType }
	 */
	public void setProgramArea(ProgramAreaType value) {
		this.programArea = value;
	}
	
	/**
	 * Gets the value of the patientAddress property.
	 * 
	 * @return possible object is {@link AddressType }
	 */
	public AddressType getPatientAddress() {
		return patientAddress;
	}
	
	/**
	 * Sets the value of the patientAddress property.
	 * 
	 * @param value allowed object is {@link AddressType }
	 */
	public void setPatientAddress(AddressType value) {
		this.patientAddress = value;
	}
	
	/**
	 * Gets the value of the commonQuestions property.
	 * 
	 * @return possible object is {@link CommonQuestionsType }
	 */
	public CommonQuestionsType getCommonQuestions() {
		return commonQuestions;
	}
	
	/**
	 * Sets the value of the commonQuestions property.
	 * 
	 * @param value allowed object is {@link CommonQuestionsType }
	 */
	public void setCommonQuestions(CommonQuestionsType value) {
		this.commonQuestions = value;
	}
	
	/**
	 * Gets the value of the conditionSpecificQuestions property.
	 * 
	 * @return possible object is {@link ConditionSpecificQuestionsType }
	 */
	public ConditionSpecificQuestionsType getConditionSpecificQuestions() {
		return conditionSpecificQuestions;
	}
	
	/**
	 * Sets the value of the conditionSpecificQuestions property.
	 * 
	 * @param value allowed object is {@link ConditionSpecificQuestionsType }
	 */
	public void setConditionSpecificQuestions(ConditionSpecificQuestionsType value) {
		this.conditionSpecificQuestions = value;
	}
	
	/**
	 * Gets the value of the encounters property.
	 * 
	 * @return possible object is {@link EncountersType }
	 */
	public EncountersType getEncounters() {
		return encounters;
	}
	
	/**
	 * Sets the value of the encounters property.
	 * 
	 * @param value allowed object is {@link EncountersType }
	 */
	public void setEncounters(EncountersType value) {
		this.encounters = value;
	}
	
	/**
	 * Gets the value of the laboratoryReport property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the laboratoryReport property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
     *    getLaboratoryReport().add(newItem);
     * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link LaboratoryReportType }
	 */
	public List<LaboratoryReportType> getLaboratoryReport() {
		if (laboratoryReport == null) {
			laboratoryReport = new ArrayList<LaboratoryReportType>();
		}
		return this.laboratoryReport;
	}
	
	/**
	 * Gets the value of the regimen property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the regimen property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
     *    getRegimen().add(newItem);
     * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link RegimenType }
	 */
	public List<RegimenType> getRegimen() {
		if (regimen == null) {
			regimen = new ArrayList<RegimenType>();
		}
		return this.regimen;
	}
	
	/**
	 * Gets the value of the immunization property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the immunization property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
     *    getImmunization().add(newItem);
     * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ImmunizationType }
	 */
	public List<ImmunizationType> getImmunization() {
		if (immunization == null) {
			immunization = new ArrayList<ImmunizationType>();
		}
		return this.immunization;
	}
	
	/**
	 * Gets the value of the pregnancyRecord property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the pregnancyRecord property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 *    getPregnancyRecord().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PregnancyEncounterType }
	 */
	public List<PregnancyEncounterType> getPregnancyRecord() {
		if (pregnancyRecord == null) {
			pregnancyRecord = new ArrayList<PregnancyEncounterType>();
		}
		return this.pregnancyRecord;
	}
	
	/**
	 * Gets the value of the hivTestRecords property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the hivTestRecords property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 *    getHIVTestRecords().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link HIVTestingEncounterType }
	 */
	public List<HIVTestingEncounterType> getHIVTestRecords() {
		if (hivTestRecords == null) {
			hivTestRecords = new ArrayList<HIVTestingEncounterType>();
		}
		return this.hivTestRecords;
	}
}
