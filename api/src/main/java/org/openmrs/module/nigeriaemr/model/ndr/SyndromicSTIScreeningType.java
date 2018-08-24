package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SyndromicSTIScreeningType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyndromicSTIScreeningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VaginalDischargeOrBurningWhenUrinating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LowerAbdominalPainsWithOrWithoutVaginalDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrethralDischargeOrBurningWhenUrinating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScrotalSwellingAndPain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GenitalSoreOrSwollenInguinalLymphNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyndromicSTIScreeningType", propOrder = { "vaginalDischargeOrBurningWhenUrinating",
        "lowerAbdominalPainsWithOrWithoutVaginalDischarge", "urethralDischargeOrBurningWhenUrinating",
        "scrotalSwellingAndPain", "genitalSoreOrSwollenInguinalLymphNodes" })
public class SyndromicSTIScreeningType {
	
	@XmlElement(name = "VaginalDischargeOrBurningWhenUrinating")
	protected Boolean vaginalDischargeOrBurningWhenUrinating;
	
	@XmlElement(name = "LowerAbdominalPainsWithOrWithoutVaginalDischarge")
	protected Boolean lowerAbdominalPainsWithOrWithoutVaginalDischarge;
	
	@XmlElement(name = "UrethralDischargeOrBurningWhenUrinating")
	protected Boolean urethralDischargeOrBurningWhenUrinating;
	
	@XmlElement(name = "ScrotalSwellingAndPain")
	protected Boolean scrotalSwellingAndPain;
	
	@XmlElement(name = "GenitalSoreOrSwollenInguinalLymphNodes")
	protected Boolean genitalSoreOrSwollenInguinalLymphNodes;
	
	/**
	 * Gets the value of the vaginalDischargeOrBurningWhenUrinating property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isVaginalDischargeOrBurningWhenUrinating() {
		return vaginalDischargeOrBurningWhenUrinating;
	}
	
	/**
	 * Sets the value of the vaginalDischargeOrBurningWhenUrinating property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setVaginalDischargeOrBurningWhenUrinating(Boolean value) {
		this.vaginalDischargeOrBurningWhenUrinating = value;
	}
	
	/**
	 * Gets the value of the lowerAbdominalPainsWithOrWithoutVaginalDischarge property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isLowerAbdominalPainsWithOrWithoutVaginalDischarge() {
		return lowerAbdominalPainsWithOrWithoutVaginalDischarge;
	}
	
	/**
	 * Sets the value of the lowerAbdominalPainsWithOrWithoutVaginalDischarge property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setLowerAbdominalPainsWithOrWithoutVaginalDischarge(Boolean value) {
		this.lowerAbdominalPainsWithOrWithoutVaginalDischarge = value;
	}
	
	/**
	 * Gets the value of the urethralDischargeOrBurningWhenUrinating property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isUrethralDischargeOrBurningWhenUrinating() {
		return urethralDischargeOrBurningWhenUrinating;
	}
	
	/**
	 * Sets the value of the urethralDischargeOrBurningWhenUrinating property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setUrethralDischargeOrBurningWhenUrinating(Boolean value) {
		this.urethralDischargeOrBurningWhenUrinating = value;
	}
	
	/**
	 * Gets the value of the scrotalSwellingAndPain property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isScrotalSwellingAndPain() {
		return scrotalSwellingAndPain;
	}
	
	/**
	 * Sets the value of the scrotalSwellingAndPain property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setScrotalSwellingAndPain(Boolean value) {
		this.scrotalSwellingAndPain = value;
	}
	
	/**
	 * Gets the value of the genitalSoreOrSwollenInguinalLymphNodes property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isGenitalSoreOrSwollenInguinalLymphNodes() {
		return genitalSoreOrSwollenInguinalLymphNodes;
	}
	
	/**
	 * Sets the value of the genitalSoreOrSwollenInguinalLymphNodes property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setGenitalSoreOrSwollenInguinalLymphNodes(Boolean value) {
		this.genitalSoreOrSwollenInguinalLymphNodes = value;
	}
	
}
