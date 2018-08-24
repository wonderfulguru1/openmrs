package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for AnswerType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AnswerCode" type="{}CodedType"/>
 *           &lt;element name="AnswerDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="AnswerDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="AnswerNumeric" type="{}NumericType"/>
 *           &lt;element name="AnswerText">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="0"/>
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerType", propOrder = { "answerCode", "answerDate", "answerDateTime", "answerNumeric", "answerText" })
public class AnswerType {
	
	@XmlElement(name = "AnswerCode")
	protected CodedType answerCode;
	
	@XmlElement(name = "AnswerDate")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar answerDate;
	
	@XmlElement(name = "AnswerDateTime")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar answerDateTime;
	
	@XmlElement(name = "AnswerNumeric")
	protected NumericType answerNumeric;
	
	@XmlElement(name = "AnswerText")
	protected String answerText;
	
	/**
	 * Gets the value of the answerCode property.
	 * 
	 * @return possible object is {@link CodedType }
	 */
	public CodedType getAnswerCode() {
		return answerCode;
	}
	
	/**
	 * Sets the value of the answerCode property.
	 * 
	 * @param value allowed object is {@link CodedType }
	 */
	public void setAnswerCode(CodedType value) {
		this.answerCode = value;
	}
	
	/**
	 * Gets the value of the answerDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getAnswerDate() {
		return answerDate;
	}
	
	/**
	 * Sets the value of the answerDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setAnswerDate(XMLGregorianCalendar value) {
		this.answerDate = value;
	}
	
	/**
	 * Gets the value of the answerDateTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getAnswerDateTime() {
		return answerDateTime;
	}
	
	/**
	 * Sets the value of the answerDateTime property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setAnswerDateTime(XMLGregorianCalendar value) {
		this.answerDateTime = value;
	}
	
	/**
	 * Gets the value of the answerNumeric property.
	 * 
	 * @return possible object is {@link NumericType }
	 */
	public NumericType getAnswerNumeric() {
		return answerNumeric;
	}
	
	/**
	 * Sets the value of the answerNumeric property.
	 * 
	 * @param value allowed object is {@link NumericType }
	 */
	public void setAnswerNumeric(NumericType value) {
		this.answerNumeric = value;
	}
	
	/**
	 * Gets the value of the answerText property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getAnswerText() {
		return answerText;
	}
	
	/**
	 * Sets the value of the answerText property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setAnswerText(String value) {
		this.answerText = value;
	}
	
}
