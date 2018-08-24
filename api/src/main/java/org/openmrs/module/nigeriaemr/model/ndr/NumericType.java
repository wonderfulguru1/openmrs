package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for NumericType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumericType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComparatorCode" type="{}ComparatorCodeType" minOccurs="0"/>
 *         &lt;element name="Value1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SeperatorCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Value2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Unit" type="{}CodedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericType", propOrder = { "comparatorCode", "value1", "seperatorCode", "value2", "unit" })
public class NumericType {
	
	@XmlElement(name = "ComparatorCode")
	protected String comparatorCode;
	
	@XmlElement(name = "Value1")
	protected float value1;
	
	@XmlElement(name = "SeperatorCode")
	protected String seperatorCode;
	
	@XmlElement(name = "Value2")
	protected Float value2;
	
	@XmlElement(name = "Unit")
	protected CodedType unit;
	
	/**
	 * Gets the value of the comparatorCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getComparatorCode() {
		return comparatorCode;
	}
	
	/**
	 * Sets the value of the comparatorCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setComparatorCode(String value) {
		this.comparatorCode = value;
	}
	
	/**
	 * Gets the value of the value1 property.
	 */
	public float getValue1() {
		return value1;
	}
	
	/**
	 * Sets the value of the value1 property.
	 */
	public void setValue1(float value) {
		this.value1 = value;
	}
	
	/**
	 * Gets the value of the seperatorCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSeperatorCode() {
		return seperatorCode;
	}
	
	/**
	 * Sets the value of the seperatorCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSeperatorCode(String value) {
		this.seperatorCode = value;
	}
	
	/**
	 * Gets the value of the value2 property.
	 * 
	 * @return possible object is {@link Float }
	 */
	public Float getValue2() {
		return value2;
	}
	
	/**
	 * Sets the value of the value2 property.
	 * 
	 * @param value allowed object is {@link Float }
	 */
	public void setValue2(Float value) {
		this.value2 = value;
	}
	
	/**
	 * Gets the value of the unit property.
	 * 
	 * @return possible object is {@link CodedType }
	 */
	public CodedType getUnit() {
		return unit;
	}
	
	/**
	 * Sets the value of the unit property.
	 * 
	 * @param value allowed object is {@link CodedType }
	 */
	public void setUnit(CodedType value) {
		this.unit = value;
	}
	
}
