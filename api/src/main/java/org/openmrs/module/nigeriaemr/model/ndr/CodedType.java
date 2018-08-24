package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CodedType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{}CodeType"/>
 *         &lt;element name="CodeDescTxt" type="{}CodeDescTxtType"/>
 *         &lt;element name="CodeSystemCode" type="{}CodeSystemCodeType"/>
 *         &lt;element name="Text" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="255"/>
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
@XmlType(name = "CodedType", propOrder = { "code", "codeDescTxt", "codeSystemCode", "text" })
public class CodedType {
	
	@XmlElement(name = "Code", required = true)
	protected String code;
	
	@XmlElement(name = "CodeDescTxt", required = true)
	protected String codeDescTxt;
	
	@XmlElement(name = "CodeSystemCode", required = true)
	protected String codeSystemCode;
	
	@XmlElement(name = "Text")
	protected String text;
	
	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Sets the value of the code property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setCode(String value) {
		this.code = value;
	}
	
	/**
	 * Gets the value of the codeDescTxt property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getCodeDescTxt() {
		return codeDescTxt;
	}
	
	/**
	 * Sets the value of the codeDescTxt property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setCodeDescTxt(String value) {
		this.codeDescTxt = value;
	}
	
	/**
	 * Gets the value of the codeSystemCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getCodeSystemCode() {
		return codeSystemCode;
	}
	
	/**
	 * Sets the value of the codeSystemCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setCodeSystemCode(String value) {
		this.codeSystemCode = value;
	}
	
	/**
	 * Gets the value of the text property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Sets the value of the text property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setText(String value) {
		this.text = value;
	}
	
}
