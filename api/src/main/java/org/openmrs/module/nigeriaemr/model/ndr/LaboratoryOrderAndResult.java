package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for LaboratoryOrderAndResult complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaboratoryOrderAndResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LaboratoryTestTypeCode" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="OrderedTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LaboratoryOrderedTest" type="{}CodedSimpleType" minOccurs="0"/>
 *         &lt;element name="LaboratoryResultedTest" type="{}CodedSimpleType"/>
 *         &lt;element name="LaboratoryResult" type="{}AnswerType"/>
 *         &lt;element name="ResultedTestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OtherLaboratoryInformation" type="{}StringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaboratoryOrderAndResult", propOrder = { "laboratoryTestTypeCode", "orderedTestDate",
        "laboratoryOrderedTest", "laboratoryResultedTest", "laboratoryResult", "resultedTestDate",
        "otherLaboratoryInformation" })
public class LaboratoryOrderAndResult {
	
	@XmlElement(name = "LaboratoryTestTypeCode")
	protected String laboratoryTestTypeCode;
	
	@XmlElement(name = "OrderedTestDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar orderedTestDate;
	
	@XmlElement(name = "LaboratoryOrderedTest")
	protected CodedSimpleType laboratoryOrderedTest;
	
	@XmlElement(name = "LaboratoryResultedTest", required = true)
	protected CodedSimpleType laboratoryResultedTest;
	
	@XmlElement(name = "LaboratoryResult", required = true)
	protected AnswerType laboratoryResult;
	
	@XmlElement(name = "ResultedTestDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar resultedTestDate;
	
	@XmlElement(name = "OtherLaboratoryInformation")
	protected String otherLaboratoryInformation;
	
	/**
	 * Gets the value of the laboratoryTestTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLaboratoryTestTypeCode() {
		return laboratoryTestTypeCode;
	}
	
	/**
	 * Sets the value of the laboratoryTestTypeCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLaboratoryTestTypeCode(String value) {
		this.laboratoryTestTypeCode = value;
	}
	
	/**
	 * Gets the value of the orderedTestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getOrderedTestDate() {
		return orderedTestDate;
	}
	
	/**
	 * Sets the value of the orderedTestDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setOrderedTestDate(XMLGregorianCalendar value) {
		this.orderedTestDate = value;
	}
	
	/**
	 * Gets the value of the laboratoryOrderedTest property.
	 * 
	 * @return possible object is {@link CodedSimpleType }
	 */
	public CodedSimpleType getLaboratoryOrderedTest() {
		return laboratoryOrderedTest;
	}
	
	/**
	 * Sets the value of the laboratoryOrderedTest property.
	 * 
	 * @param value allowed object is {@link CodedSimpleType }
	 */
	public void setLaboratoryOrderedTest(CodedSimpleType value) {
		this.laboratoryOrderedTest = value;
	}
	
	/**
	 * Gets the value of the laboratoryResultedTest property.
	 * 
	 * @return possible object is {@link CodedSimpleType }
	 */
	public CodedSimpleType getLaboratoryResultedTest() {
		return laboratoryResultedTest;
	}
	
	/**
	 * Sets the value of the laboratoryResultedTest property.
	 * 
	 * @param value allowed object is {@link CodedSimpleType }
	 */
	public void setLaboratoryResultedTest(CodedSimpleType value) {
		this.laboratoryResultedTest = value;
	}
	
	/**
	 * Gets the value of the laboratoryResult property.
	 * 
	 * @return possible object is {@link AnswerType }
	 */
	public AnswerType getLaboratoryResult() {
		return laboratoryResult;
	}
	
	/**
	 * Sets the value of the laboratoryResult property.
	 * 
	 * @param value allowed object is {@link AnswerType }
	 */
	public void setLaboratoryResult(AnswerType value) {
		this.laboratoryResult = value;
	}
	
	/**
	 * Gets the value of the resultedTestDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getResultedTestDate() {
		return resultedTestDate;
	}
	
	/**
	 * Sets the value of the resultedTestDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setResultedTestDate(XMLGregorianCalendar value) {
		this.resultedTestDate = value;
	}
	
	/**
	 * Gets the value of the otherLaboratoryInformation property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getOtherLaboratoryInformation() {
		return otherLaboratoryInformation;
	}
	
	/**
	 * Sets the value of the otherLaboratoryInformation property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setOtherLaboratoryInformation(String value) {
		this.otherLaboratoryInformation = value;
	}
	
}
