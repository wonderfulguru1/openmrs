package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for NameType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameTypeCode" type="{}CodeType"/>
 *         &lt;element name="First" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="Middle" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="Last" type="{}StringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = { "nameTypeCode", "first", "middle", "last" })
public class NameType {
	
	@XmlElement(name = "NameTypeCode", required = true)
	protected String nameTypeCode;
	
	@XmlElement(name = "First")
	protected String first;
	
	@XmlElement(name = "Middle")
	protected String middle;
	
	@XmlElement(name = "Last")
	protected String last;
	
	/**
	 * Gets the value of the nameTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getNameTypeCode() {
		return nameTypeCode;
	}
	
	/**
	 * Sets the value of the nameTypeCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setNameTypeCode(String value) {
		this.nameTypeCode = value;
	}
	
	/**
	 * Gets the value of the first property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFirst() {
		return first;
	}
	
	/**
	 * Sets the value of the first property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setFirst(String value) {
		this.first = value;
	}
	
	/**
	 * Gets the value of the middle property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getMiddle() {
		return middle;
	}
	
	/**
	 * Sets the value of the middle property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setMiddle(String value) {
		this.middle = value;
	}
	
	/**
	 * Gets the value of the last property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getLast() {
		return last;
	}
	
	/**
	 * Sets the value of the last property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setLast(String value) {
		this.last = value;
	}
	
}
