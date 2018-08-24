package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ImmunizationType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmunizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisitID" type="{}StringType"/>
 *         &lt;element name="VisitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ImmunizationIdentifier" type="{}StringType"/>
 *         &lt;element name="ImmunizationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="LotNumber" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ManufacturerCode" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="ImmunizationType" type="{}CodedSimpleType"/>
 *         &lt;element name="SiteCode" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="RouteCode" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="Dose" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="SelfReported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Clinician" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="PerformedBy" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="CheckedBy" type="{}StringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmunizationType", propOrder = { "visitID", "visitDate", "immunizationIdentifier", "immunizationDate",
        "lotNumber", "expirationDate", "manufacturerCode", "immunizationType", "siteCode", "routeCode", "dose",
        "selfReported", "clinician", "performedBy", "checkedBy" })
public class ImmunizationType {
	
	@XmlElement(name = "VisitID", required = true)
	protected String visitID;
	
	@XmlElement(name = "VisitDate", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar visitDate;
	
	@XmlElement(name = "ImmunizationIdentifier", required = true)
	protected String immunizationIdentifier;
	
	@XmlElement(name = "ImmunizationDate", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar immunizationDate;
	
	@XmlElement(name = "LotNumber")
	protected String lotNumber;
	
	@XmlElement(name = "ExpirationDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar expirationDate;
	
	@XmlElement(name = "ManufacturerCode")
	protected String manufacturerCode;
	
	@XmlElement(name = "ImmunizationType", required = true)
	protected CodedSimpleType immunizationType;
	
	@XmlElement(name = "SiteCode")
	protected String siteCode;
	
	@XmlElement(name = "RouteCode")
	protected String routeCode;
	
	@XmlElement(name = "Dose")
	protected String dose;
	
	@XmlElement(name = "SelfReported")
	protected Boolean selfReported;
	
	@XmlElement(name = "Clinician")
	protected String clinician;
	
	@XmlElement(name = "PerformedBy")
	protected String performedBy;
	
	@XmlElement(name = "CheckedBy")
	protected String checkedBy;
	
	/**
	 * Gets the value of the visitID property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getVisitID() {
		return visitID;
	}
	
	/**
	 * Sets the value of the visitID property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setVisitID(String value) {
		this.visitID = value;
	}
	
	/**
	 * Gets the value of the visitDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getVisitDate() {
		return visitDate;
	}
	
	/**
	 * Sets the value of the visitDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setVisitDate(XMLGregorianCalendar value) {
		this.visitDate = value;
	}
	
	/**
	 * Gets the value of the immunizationIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getImmunizationIdentifier() {
		return immunizationIdentifier;
	}
	
	/**
	 * Sets the value of the immunizationIdentifier property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setImmunizationIdentifier(String value) {
		this.immunizationIdentifier = value;
	}
	
	/**
	 * Gets the value of the immunizationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getImmunizationDate() {
		return immunizationDate;
	}
	
	/**
	 * Sets the value of the immunizationDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setImmunizationDate(XMLGregorianCalendar value) {
		this.immunizationDate = value;
	}
	
	/**
	 * Gets the value of the lotNumber property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLotNumber() {
		return lotNumber;
	}
	
	/**
	 * Sets the value of the lotNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLotNumber(String value) {
		this.lotNumber = value;
	}
	
	/**
	 * Gets the value of the expirationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getExpirationDate() {
		return expirationDate;
	}
	
	/**
	 * Sets the value of the expirationDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setExpirationDate(XMLGregorianCalendar value) {
		this.expirationDate = value;
	}
	
	/**
	 * Gets the value of the manufacturerCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getManufacturerCode() {
		return manufacturerCode;
	}
	
	/**
	 * Sets the value of the manufacturerCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setManufacturerCode(String value) {
		this.manufacturerCode = value;
	}
	
	/**
	 * Gets the value of the immunizationType property.
	 * 
	 * @return possible object is {@link CodedSimpleType }
	 */
	public CodedSimpleType getImmunizationType() {
		return immunizationType;
	}
	
	/**
	 * Sets the value of the immunizationType property.
	 * 
	 * @param value allowed object is {@link CodedSimpleType }
	 */
	public void setImmunizationType(CodedSimpleType value) {
		this.immunizationType = value;
	}
	
	/**
	 * Gets the value of the siteCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSiteCode() {
		return siteCode;
	}
	
	/**
	 * Sets the value of the siteCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSiteCode(String value) {
		this.siteCode = value;
	}
	
	/**
	 * Gets the value of the routeCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRouteCode() {
		return routeCode;
	}
	
	/**
	 * Sets the value of the routeCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRouteCode(String value) {
		this.routeCode = value;
	}
	
	/**
	 * Gets the value of the dose property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDose() {
		return dose;
	}
	
	/**
	 * Sets the value of the dose property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDose(String value) {
		this.dose = value;
	}
	
	/**
	 * Gets the value of the selfReported property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isSelfReported() {
		return selfReported;
	}
	
	/**
	 * Sets the value of the selfReported property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setSelfReported(Boolean value) {
		this.selfReported = value;
	}
	
	/**
	 * Gets the value of the clinician property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getClinician() {
		return clinician;
	}
	
	/**
	 * Sets the value of the clinician property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setClinician(String value) {
		this.clinician = value;
	}
	
	/**
	 * Gets the value of the performedBy property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPerformedBy() {
		return performedBy;
	}
	
	/**
	 * Sets the value of the performedBy property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPerformedBy(String value) {
		this.performedBy = value;
	}
	
	/**
	 * Gets the value of the checkedBy property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getCheckedBy() {
		return checkedBy;
	}
	
	/**
	 * Sets the value of the checkedBy property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setCheckedBy(String value) {
		this.checkedBy = value;
	}
	
}
