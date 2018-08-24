package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for HIVTestResultsType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIVTestResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScreeningTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ScreeningTestResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="NR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConfirmatoryTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConfirmatoryTestResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="NR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TieBreakerTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TieBreakerTestResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="NR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinalHIVTestResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Pos"/>
 *               &lt;enumeration value="Neg"/>
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
@XmlType(name = "HIVTestResultsType", propOrder = { "screeningTestDate", "screeningTestResult", "confirmatoryTestDate",
        "confirmatoryTestResult", "tieBreakerTestDate", "tieBreakerTestResult", "finalHIVTestResult" })
public class HIVTestResultsType {
	
	@XmlElement(name = "ScreeningTestDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar screeningTestDate;
	
	@XmlElement(name = "ScreeningTestResult")
	protected String screeningTestResult;
	
	@XmlElement(name = "ConfirmatoryTestDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar confirmatoryTestDate;
	
	@XmlElement(name = "ConfirmatoryTestResult")
	protected String confirmatoryTestResult;
	
	@XmlElement(name = "TieBreakerTestDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar tieBreakerTestDate;
	
	@XmlElement(name = "TieBreakerTestResult")
	protected String tieBreakerTestResult;
	
	@XmlElement(name = "FinalHIVTestResult")
	protected String finalHIVTestResult;
	
	/**
	 * Gets the value of the screeningTestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getScreeningTestDate() {
		return screeningTestDate;
	}
	
	/**
	 * Sets the value of the screeningTestDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setScreeningTestDate(XMLGregorianCalendar value) {
		this.screeningTestDate = value;
	}
	
	/**
	 * Gets the value of the screeningTestResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getScreeningTestResult() {
		return screeningTestResult;
	}
	
	/**
	 * Sets the value of the screeningTestResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setScreeningTestResult(String value) {
		this.screeningTestResult = value;
	}
	
	/**
	 * Gets the value of the confirmatoryTestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getConfirmatoryTestDate() {
		return confirmatoryTestDate;
	}
	
	/**
	 * Sets the value of the confirmatoryTestDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setConfirmatoryTestDate(XMLGregorianCalendar value) {
		this.confirmatoryTestDate = value;
	}
	
	/**
	 * Gets the value of the confirmatoryTestResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getConfirmatoryTestResult() {
		return confirmatoryTestResult;
	}
	
	/**
	 * Sets the value of the confirmatoryTestResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setConfirmatoryTestResult(String value) {
		this.confirmatoryTestResult = value;
	}
	
	/**
	 * Gets the value of the tieBreakerTestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getTieBreakerTestDate() {
		return tieBreakerTestDate;
	}
	
	/**
	 * Sets the value of the tieBreakerTestDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setTieBreakerTestDate(XMLGregorianCalendar value) {
		this.tieBreakerTestDate = value;
	}
	
	/**
	 * Gets the value of the tieBreakerTestResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTieBreakerTestResult() {
		return tieBreakerTestResult;
	}
	
	/**
	 * Sets the value of the tieBreakerTestResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTieBreakerTestResult(String value) {
		this.tieBreakerTestResult = value;
	}
	
	/**
	 * Gets the value of the finalHIVTestResult property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFinalHIVTestResult() {
		return finalHIVTestResult;
	}
	
	/**
	 * Sets the value of the finalHIVTestResult property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setFinalHIVTestResult(String value) {
		this.finalHIVTestResult = value;
	}
	
}
