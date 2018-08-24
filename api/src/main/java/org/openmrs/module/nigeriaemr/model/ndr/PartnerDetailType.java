package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for PartnerDetailType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartnerPreTestCounseled" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerAcceptsHIVTest" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DateOfTest" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PartnerHIVTestResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Pos"/>
 *               &lt;enumeration value="Neg"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerPostTestCounseled" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerHBVStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Pos"/>
 *               &lt;enumeration value="Neg"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerHCVStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Pos"/>
 *               &lt;enumeration value="Neg"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerSyphilisStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="NR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PartnerReferredTo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="FP"/>
 *               &lt;enumeration value="ART"/>
 *               &lt;enumeration value="Other"/>
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
@XmlType(name = "PartnerDetailType", propOrder = { "partnerAge", "partnerPreTestCounseled", "partnerAcceptsHIVTest",
        "dateOfTest", "partnerHIVTestResult", "partnerPostTestCounseled", "partnerHBVStatus", "partnerHCVStatus",
        "partnerSyphilisStatus", "partnerReferredTo" })
public class PartnerDetailType {
	
	@XmlElement(name = "PartnerAge")
	protected Integer partnerAge;
	
	@XmlElement(name = "PartnerPreTestCounseled")
	protected String partnerPreTestCounseled;
	
	@XmlElement(name = "PartnerAcceptsHIVTest")
	protected String partnerAcceptsHIVTest;
	
	@XmlElement(name = "DateOfTest")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dateOfTest;
	
	@XmlElement(name = "PartnerHIVTestResult")
	protected String partnerHIVTestResult;
	
	@XmlElement(name = "PartnerPostTestCounseled")
	protected String partnerPostTestCounseled;
	
	@XmlElement(name = "PartnerHBVStatus")
	protected String partnerHBVStatus;
	
	@XmlElement(name = "PartnerHCVStatus")
	protected String partnerHCVStatus;
	
	@XmlElement(name = "PartnerSyphilisStatus")
	protected String partnerSyphilisStatus;
	
	@XmlElement(name = "PartnerReferredTo")
	protected String partnerReferredTo;
	
	/**
	 * Gets the value of the partnerAge property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getPartnerAge() {
		return partnerAge;
	}
	
	/**
	 * Sets the value of the partnerAge property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setPartnerAge(Integer value) {
		this.partnerAge = value;
	}
	
	/**
	 * Gets the value of the partnerPreTestCounseled property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerPreTestCounseled() {
		return partnerPreTestCounseled;
	}
	
	/**
	 * Sets the value of the partnerPreTestCounseled property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerPreTestCounseled(String value) {
		this.partnerPreTestCounseled = value;
	}
	
	/**
	 * Gets the value of the partnerAcceptsHIVTest property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerAcceptsHIVTest() {
		return partnerAcceptsHIVTest;
	}
	
	/**
	 * Sets the value of the partnerAcceptsHIVTest property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerAcceptsHIVTest(String value) {
		this.partnerAcceptsHIVTest = value;
	}
	
	/**
	 * Gets the value of the dateOfTest property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDateOfTest() {
		return dateOfTest;
	}
	
	/**
	 * Sets the value of the dateOfTest property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDateOfTest(XMLGregorianCalendar value) {
		this.dateOfTest = value;
	}
	
	/**
	 * Gets the value of the partnerHIVTestResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerHIVTestResult() {
		return partnerHIVTestResult;
	}
	
	/**
	 * Sets the value of the partnerHIVTestResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerHIVTestResult(String value) {
		this.partnerHIVTestResult = value;
	}
	
	/**
	 * Gets the value of the partnerPostTestCounseled property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerPostTestCounseled() {
		return partnerPostTestCounseled;
	}
	
	/**
	 * Sets the value of the partnerPostTestCounseled property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerPostTestCounseled(String value) {
		this.partnerPostTestCounseled = value;
	}
	
	/**
	 * Gets the value of the partnerHBVStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerHBVStatus() {
		return partnerHBVStatus;
	}
	
	/**
	 * Sets the value of the partnerHBVStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerHBVStatus(String value) {
		this.partnerHBVStatus = value;
	}
	
	/**
	 * Gets the value of the partnerHCVStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerHCVStatus() {
		return partnerHCVStatus;
	}
	
	/**
	 * Sets the value of the partnerHCVStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerHCVStatus(String value) {
		this.partnerHCVStatus = value;
	}
	
	/**
	 * Gets the value of the partnerSyphilisStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerSyphilisStatus() {
		return partnerSyphilisStatus;
	}
	
	/**
	 * Sets the value of the partnerSyphilisStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerSyphilisStatus(String value) {
		this.partnerSyphilisStatus = value;
	}
	
	/**
	 * Gets the value of the partnerReferredTo property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPartnerReferredTo() {
		return partnerReferredTo;
	}
	
	/**
	 * Sets the value of the partnerReferredTo property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setPartnerReferredTo(String value) {
		this.partnerReferredTo = value;
	}
	
}
