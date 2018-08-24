package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for HIVRecencyTestResultType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIVRecencyTestResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecencyTestName" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="RecencyTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RapidRecencyAssay" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Recent"/>
 *               &lt;enumeration value="Long term"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ViralLoadTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ViralLoadTestResult" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="FinalHIVRecentTestinResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Recent"/>
 *               &lt;enumeration value="Long term"/>
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
@XmlType(name = "HIVRecencyTestResultType", propOrder = { "recencyTestName", "recencyTestDate", "rapidRecencyAssay",
        "viralLoadTestDate", "viralLoadTestResult", "finalHIVRecentTestinResult" })
public class HIVRecencyTestResultType {
	
	@XmlElement(name = "RecencyTestName")
	protected String recencyTestName;
	
	@XmlElement(name = "RecencyTestDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar recencyTestDate;
	
	@XmlElement(name = "RapidRecencyAssay")
	protected String rapidRecencyAssay;
	
	@XmlElement(name = "ViralLoadTestDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar viralLoadTestDate;
	
	@XmlElement(name = "ViralLoadTestResult")
	protected String viralLoadTestResult;
	
	@XmlElement(name = "FinalHIVRecentTestinResult")
	protected String finalHIVRecentTestinResult;
	
	/**
	 * Gets the value of the recencyTestName property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRecencyTestName() {
		return recencyTestName;
	}
	
	/**
	 * Sets the value of the recencyTestName property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRecencyTestName(String value) {
		this.recencyTestName = value;
	}
	
	/**
	 * Gets the value of the recencyTestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getRecencyTestDate() {
		return recencyTestDate;
	}
	
	/**
	 * Sets the value of the recencyTestDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setRecencyTestDate(XMLGregorianCalendar value) {
		this.recencyTestDate = value;
	}
	
	/**
	 * Gets the value of the rapidRecencyAssay property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getRapidRecencyAssay() {
		return rapidRecencyAssay;
	}
	
	/**
	 * Sets the value of the rapidRecencyAssay property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setRapidRecencyAssay(String value) {
		this.rapidRecencyAssay = value;
	}
	
	/**
	 * Gets the value of the viralLoadTestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getViralLoadTestDate() {
		return viralLoadTestDate;
	}
	
	/**
	 * Sets the value of the viralLoadTestDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setViralLoadTestDate(XMLGregorianCalendar value) {
		this.viralLoadTestDate = value;
	}
	
	/**
	 * Gets the value of the viralLoadTestResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getViralLoadTestResult() {
		return viralLoadTestResult;
	}
	
	/**
	 * Sets the value of the viralLoadTestResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setViralLoadTestResult(String value) {
		this.viralLoadTestResult = value;
	}
	
	/**
	 * Gets the value of the finalHIVRecentTestinResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFinalHIVRecentTestinResult() {
		return finalHIVRecentTestinResult;
	}
	
	/**
	 * Sets the value of the finalHIVRecentTestinResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setFinalHIVRecentTestinResult(String value) {
		this.finalHIVRecentTestinResult = value;
	}
	
}
