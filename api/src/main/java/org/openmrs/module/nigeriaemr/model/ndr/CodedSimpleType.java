package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CodedSimpleType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedSimpleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{}CodeType"/>
 *         &lt;element name="CodeDescTxt" type="{}CodeDescTxtType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedSimpleType", propOrder = { "code", "codeDescTxt" })
public class CodedSimpleType {
	
	@XmlElement(name = "Code", required = true)
	protected String code;
	
	@XmlElement(name = "CodeDescTxt")
	protected String codeDescTxt;
	
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
	
}
