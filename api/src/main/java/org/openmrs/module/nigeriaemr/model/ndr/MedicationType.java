package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MedicationType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Drug" type="{}CodedSimpleType"/>
 *           &lt;element name="DrugOther" type="{}StringType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="FrequencyCode" type="{}CodeType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="QuantityPrescribed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QuantityDispensed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SingleDose" type="{}StringType" minOccurs="0"/>
 *         &lt;element name="TotalDailyDose" type="{}StringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationType", propOrder = { "drug", "drugOther", "frequencyCode", "duration", "quantityPrescribed",
        "quantityDispensed", "singleDose", "totalDailyDose" })
public class MedicationType {
	
	@XmlElement(name = "Drug")
	protected CodedSimpleType drug;
	
	@XmlElement(name = "DrugOther")
	protected String drugOther;
	
	@XmlElement(name = "FrequencyCode")
	protected String frequencyCode;
	
	@XmlElement(name = "Duration")
	protected String duration;
	
	@XmlElement(name = "QuantityPrescribed")
	protected Integer quantityPrescribed;
	
	@XmlElement(name = "QuantityDispensed")
	protected Integer quantityDispensed;
	
	@XmlElement(name = "SingleDose")
	protected String singleDose;
	
	@XmlElement(name = "TotalDailyDose")
	protected String totalDailyDose;
	
	/**
	 * Gets the value of the drug property.
	 * 
	 * @return possible object is {@link CodedSimpleType }
	 */
	public CodedSimpleType getDrug() {
		return drug;
	}
	
	/**
	 * Sets the value of the drug property.
	 * 
	 * @param value allowed object is {@link CodedSimpleType }
	 */
	public void setDrug(CodedSimpleType value) {
		this.drug = value;
	}
	
	/**
	 * Gets the value of the drugOther property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDrugOther() {
		return drugOther;
	}
	
	/**
	 * Sets the value of the drugOther property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDrugOther(String value) {
		this.drugOther = value;
	}
	
	/**
	 * Gets the value of the frequencyCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFrequencyCode() {
		return frequencyCode;
	}
	
	/**
	 * Sets the value of the frequencyCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setFrequencyCode(String value) {
		this.frequencyCode = value;
	}
	
	/**
	 * Gets the value of the duration property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDuration() {
		return duration;
	}
	
	/**
	 * Sets the value of the duration property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setDuration(String value) {
		this.duration = value;
	}
	
	/**
	 * Gets the value of the quantityPrescribed property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getQuantityPrescribed() {
		return quantityPrescribed;
	}
	
	/**
	 * Sets the value of the quantityPrescribed property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setQuantityPrescribed(Integer value) {
		this.quantityPrescribed = value;
	}
	
	/**
	 * Gets the value of the quantityDispensed property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getQuantityDispensed() {
		return quantityDispensed;
	}
	
	/**
	 * Sets the value of the quantityDispensed property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setQuantityDispensed(Integer value) {
		this.quantityDispensed = value;
	}
	
	/**
	 * Gets the value of the singleDose property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSingleDose() {
		return singleDose;
	}
	
	/**
	 * Sets the value of the singleDose property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSingleDose(String value) {
		this.singleDose = value;
	}
	
	/**
	 * Gets the value of the totalDailyDose property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTotalDailyDose() {
		return totalDailyDose;
	}
	
	/**
	 * Sets the value of the totalDailyDose property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTotalDailyDose(String value) {
		this.totalDailyDose = value;
	}
	
}
