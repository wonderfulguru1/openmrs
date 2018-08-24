package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for DeliveryEncounterType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryEncounterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOfDelivery" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TimeOfHIVDiagnosis" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GestationalAgeAtDelivery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HBVStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Pos"/>
 *               &lt;enumeration value="Neg"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HCVStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Pos"/>
 *               &lt;enumeration value="Neg"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WomanOnART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARTStartedinLDWard" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ROMDeliveryInterval" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModeOfDelivery" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Episiotomy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VaginalTear" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FeedingDecision" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="EBF"/>
 *               &lt;enumeration value="ERF"/>
 *               &lt;enumeration value="Mixed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaternalOutcome" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Alive"/>
 *               &lt;enumeration value="Dead"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryEncounterType", propOrder = { "dateOfDelivery", "timeOfHIVDiagnosis", "gestationalAgeAtDelivery",
        "hbvStatus", "hcvStatus", "womanOnART", "artStartedinLDWard", "romDeliveryInterval", "modeOfDelivery", "episiotomy",
        "vaginalTear", "feedingDecision", "maternalOutcome" })
public class DeliveryEncounterType {
	
	@XmlElement(name = "DateOfDelivery", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dateOfDelivery;
	
	@XmlElement(name = "TimeOfHIVDiagnosis")
	protected String timeOfHIVDiagnosis;
	
	@XmlElement(name = "GestationalAgeAtDelivery")
	protected Integer gestationalAgeAtDelivery;
	
	@XmlElement(name = "HBVStatus")
	protected String hbvStatus;
	
	@XmlElement(name = "HCVStatus")
	protected String hcvStatus;
	
	@XmlElement(name = "WomanOnART")
	protected String womanOnART;
	
	@XmlElement(name = "ARTStartedinLDWard")
	protected String artStartedinLDWard;
	
	@XmlElement(name = "ROMDeliveryInterval")
	protected String romDeliveryInterval;
	
	@XmlElement(name = "ModeOfDelivery")
	protected String modeOfDelivery;
	
	@XmlElement(name = "Episiotomy")
	protected String episiotomy;
	
	@XmlElement(name = "VaginalTear")
	protected String vaginalTear;
	
	@XmlElement(name = "FeedingDecision")
	protected String feedingDecision;
	
	@XmlElement(name = "MaternalOutcome")
	protected String maternalOutcome;
	
	/**
	 * Gets the value of the dateOfDelivery property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDateOfDelivery() {
		return dateOfDelivery;
	}
	
	/**
	 * Sets the value of the dateOfDelivery property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDateOfDelivery(XMLGregorianCalendar value) {
		this.dateOfDelivery = value;
	}
	
	/**
	 * Gets the value of the timeOfHIVDiagnosis property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTimeOfHIVDiagnosis() {
		return timeOfHIVDiagnosis;
	}
	
	/**
	 * Sets the value of the timeOfHIVDiagnosis property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTimeOfHIVDiagnosis(String value) {
		this.timeOfHIVDiagnosis = value;
	}
	
	/**
	 * Gets the value of the gestationalAgeAtDelivery property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getGestationalAgeAtDelivery() {
		return gestationalAgeAtDelivery;
	}
	
	/**
	 * Sets the value of the gestationalAgeAtDelivery property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setGestationalAgeAtDelivery(Integer value) {
		this.gestationalAgeAtDelivery = value;
	}
	
	/**
	 * Gets the value of the hbvStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getHBVStatus() {
		return hbvStatus;
	}
	
	/**
	 * Sets the value of the hbvStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setHBVStatus(String value) {
		this.hbvStatus = value;
	}
	
	/**
	 * Gets the value of the hcvStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getHCVStatus() {
		return hcvStatus;
	}
	
	/**
	 * Sets the value of the hcvStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setHCVStatus(String value) {
		this.hcvStatus = value;
	}
	
	/**
	 * Gets the value of the womanOnART property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getWomanOnART() {
		return womanOnART;
	}
	
	/**
	 * Sets the value of the womanOnART property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setWomanOnART(String value) {
		this.womanOnART = value;
	}
	
	/**
	 * Gets the value of the artStartedinLDWard property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getARTStartedinLDWard() {
		return artStartedinLDWard;
	}
	
	/**
	 * Sets the value of the artStartedinLDWard property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setARTStartedinLDWard(String value) {
		this.artStartedinLDWard = value;
	}
	
	/**
	 * Gets the value of the romDeliveryInterval property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getROMDeliveryInterval() {
		return romDeliveryInterval;
	}
	
	/**
	 * Sets the value of the romDeliveryInterval property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setROMDeliveryInterval(String value) {
		this.romDeliveryInterval = value;
	}
	
	/**
	 * Gets the value of the modeOfDelivery property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getModeOfDelivery() {
		return modeOfDelivery;
	}
	
	/**
	 * Sets the value of the modeOfDelivery property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setModeOfDelivery(String value) {
		this.modeOfDelivery = value;
	}
	
	/**
	 * Gets the value of the episiotomy property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getEpisiotomy() {
		return episiotomy;
	}
	
	/**
	 * Sets the value of the episiotomy property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setEpisiotomy(String value) {
		this.episiotomy = value;
	}
	
	/**
	 * Gets the value of the vaginalTear property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getVaginalTear() {
		return vaginalTear;
	}
	
	/**
	 * Sets the value of the vaginalTear property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setVaginalTear(String value) {
		this.vaginalTear = value;
	}
	
	/**
	 * Gets the value of the feedingDecision property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFeedingDecision() {
		return feedingDecision;
	}
	
	/**
	 * Sets the value of the feedingDecision property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setFeedingDecision(String value) {
		this.feedingDecision = value;
	}
	
	/**
	 * Gets the value of the maternalOutcome property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getMaternalOutcome() {
		return maternalOutcome;
	}
	
	/**
	 * Sets the value of the maternalOutcome property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setMaternalOutcome(String value) {
		this.maternalOutcome = value;
	}
	
}
