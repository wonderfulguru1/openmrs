package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for PatientDemographicsType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientDemographicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientIdentifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TreatmentFacility" type="{}FacilityType"/>
 *         &lt;element name="OtherPatientIdentifiers" type="{}IdentifiersType" minOccurs="0"/>
 *         &lt;element name="PatientDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PatientSexCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="O"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PatientDeceasedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PatientDeceasedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PatientPrimaryLanguageCode" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="PatientEducationLevelCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PatientOccupationCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="UNE"/>
 *               &lt;enumeration value="EMP"/>
 *               &lt;enumeration value="RET"/>
 *               &lt;enumeration value="STU"/>
 *               &lt;enumeration value="NA"/>
 *               &lt;enumeration value="UNK"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PatientMaritalStatusCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="O"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="U"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="T"/>
 *               &lt;enumeration value="W"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StateOfNigeriaOriginCode" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="PatientNotes" type="{}NoteType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientDemographicsType", propOrder = { "patientIdentifier", "treatmentFacility",
        "otherPatientIdentifiers", "patientDateOfBirth", "patientSexCode", "patientDeceasedIndicator",
        "patientDeceasedDate", "patientPrimaryLanguageCode", "patientEducationLevelCode", "patientOccupationCode",
        "patientMaritalStatusCode", "stateOfNigeriaOriginCode", "patientNotes" })
public class PatientDemographicsType {
	
	@XmlElement(name = "PatientIdentifier", required = true)
	protected String patientIdentifier;
	
	@XmlElement(name = "TreatmentFacility", required = true)
	protected FacilityType treatmentFacility;
	
	@XmlElement(name = "OtherPatientIdentifiers")
	protected IdentifiersType otherPatientIdentifiers;
	
	@XmlElement(name = "PatientDateOfBirth")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar patientDateOfBirth;
	
	@XmlElement(name = "PatientSexCode")
	protected String patientSexCode;
	
	@XmlElement(name = "PatientDeceasedIndicator")
	protected Boolean patientDeceasedIndicator;
	
	@XmlElement(name = "PatientDeceasedDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar patientDeceasedDate;
	
	@XmlElement(name = "PatientPrimaryLanguageCode")
	protected String patientPrimaryLanguageCode;
	
	@XmlElement(name = "PatientEducationLevelCode")
	protected String patientEducationLevelCode;
	
	@XmlElement(name = "PatientOccupationCode")
	protected String patientOccupationCode;
	
	@XmlElement(name = "PatientMaritalStatusCode")
	protected String patientMaritalStatusCode;
	
	@XmlElement(name = "StateOfNigeriaOriginCode")
	protected String stateOfNigeriaOriginCode;
	
	@XmlElement(name = "PatientNotes")
	protected NoteType patientNotes;
	
	/**
	 * Gets the value of the patientIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPatientIdentifier() {
		return patientIdentifier;
	}
	
	/**
	 * Sets the value of the patientIdentifier property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPatientIdentifier(String value) {
		this.patientIdentifier = value;
	}
	
	/**
	 * Gets the value of the treatmentFacility property.
	 * 
	 * @return possible object is {@link FacilityType }
	 */
	public FacilityType getTreatmentFacility() {
		return treatmentFacility;
	}
	
	/**
	 * Sets the value of the treatmentFacility property.
	 * 
	 * @param value allowed object is {@link FacilityType }
	 */
	public void setTreatmentFacility(FacilityType value) {
		this.treatmentFacility = value;
	}
	
	/**
	 * Gets the value of the otherPatientIdentifiers property.
	 * 
	 * @return possible object is {@link IdentifiersType }
	 */
	public IdentifiersType getOtherPatientIdentifiers() {
		return otherPatientIdentifiers;
	}
	
	/**
	 * Sets the value of the otherPatientIdentifiers property.
	 * 
	 * @param value allowed object is {@link IdentifiersType }
	 */
	public void setOtherPatientIdentifiers(IdentifiersType value) {
		this.otherPatientIdentifiers = value;
	}
	
	/**
	 * Gets the value of the patientDateOfBirth property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getPatientDateOfBirth() {
		return patientDateOfBirth;
	}
	
	/**
	 * Sets the value of the patientDateOfBirth property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setPatientDateOfBirth(XMLGregorianCalendar value) {
		this.patientDateOfBirth = value;
	}
	
	/**
	 * Gets the value of the patientSexCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPatientSexCode() {
		return patientSexCode;
	}
	
	/**
	 * Sets the value of the patientSexCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPatientSexCode(String value) {
		this.patientSexCode = value;
	}
	
	/**
	 * Gets the value of the patientDeceasedIndicator property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isPatientDeceasedIndicator() {
		return patientDeceasedIndicator;
	}
	
	/**
	 * Sets the value of the patientDeceasedIndicator property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setPatientDeceasedIndicator(Boolean value) {
		this.patientDeceasedIndicator = value;
	}
	
	/**
	 * Gets the value of the patientDeceasedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getPatientDeceasedDate() {
		return patientDeceasedDate;
	}
	
	/**
	 * Sets the value of the patientDeceasedDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setPatientDeceasedDate(XMLGregorianCalendar value) {
		this.patientDeceasedDate = value;
	}
	
	/**
	 * Gets the value of the patientPrimaryLanguageCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPatientPrimaryLanguageCode() {
		return patientPrimaryLanguageCode;
	}
	
	/**
	 * Sets the value of the patientPrimaryLanguageCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPatientPrimaryLanguageCode(String value) {
		this.patientPrimaryLanguageCode = value;
	}
	
	/**
	 * Gets the value of the patientEducationLevelCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPatientEducationLevelCode() {
		return patientEducationLevelCode;
	}
	
	/**
	 * Sets the value of the patientEducationLevelCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPatientEducationLevelCode(String value) {
		this.patientEducationLevelCode = value;
	}
	
	/**
	 * Gets the value of the patientOccupationCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPatientOccupationCode() {
		return patientOccupationCode;
	}
	
	/**
	 * Sets the value of the patientOccupationCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPatientOccupationCode(String value) {
		this.patientOccupationCode = value;
	}
	
	/**
	 * Gets the value of the patientMaritalStatusCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPatientMaritalStatusCode() {
		return patientMaritalStatusCode;
	}
	
	/**
	 * Sets the value of the patientMaritalStatusCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPatientMaritalStatusCode(String value) {
		this.patientMaritalStatusCode = value;
	}
	
	/**
	 * Gets the value of the stateOfNigeriaOriginCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getStateOfNigeriaOriginCode() {
		return stateOfNigeriaOriginCode;
	}
	
	/**
	 * Sets the value of the stateOfNigeriaOriginCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setStateOfNigeriaOriginCode(String value) {
		this.stateOfNigeriaOriginCode = value;
	}
	
	/**
	 * Gets the value of the patientNotes property.
	 * 
	 * @return possible object is {@link NoteType }
	 */
	public NoteType getPatientNotes() {
		return patientNotes;
	}
	
	/**
	 * Sets the value of the patientNotes property.
	 * 
	 * @param value allowed object is {@link NoteType }
	 */
	public void setPatientNotes(NoteType value) {
		this.patientNotes = value;
	}
	
}
