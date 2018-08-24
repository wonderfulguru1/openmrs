package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for knowledgeAssessmentType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="knowledgeAssessmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreviouslyTestedHIVNegative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientPregnant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientInformedAboutHIVTransmissionRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientInformedAboutRiskFactors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientInformedAboutPreventingHIV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientInformedAboutPossibleTestResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InformedConsentForHIVTestingGiven" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knowledgeAssessmentType", propOrder = { "previouslyTestedHIVNegative", "clientPregnant",
        "clientInformedAboutHIVTransmissionRoutes", "clientInformedAboutRiskFactors", "clientInformedAboutPreventingHIV",
        "clientInformedAboutPossibleTestResults", "informedConsentForHIVTestingGiven" })
public class KnowledgeAssessmentType {
	
	@XmlElement(name = "PreviouslyTestedHIVNegative")
	protected Boolean previouslyTestedHIVNegative;
	
	@XmlElement(name = "ClientPregnant")
	protected Boolean clientPregnant;
	
	@XmlElement(name = "ClientInformedAboutHIVTransmissionRoutes")
	protected Boolean clientInformedAboutHIVTransmissionRoutes;
	
	@XmlElement(name = "ClientInformedAboutRiskFactors")
	protected Boolean clientInformedAboutRiskFactors;
	
	@XmlElement(name = "ClientInformedAboutPreventingHIV")
	protected Boolean clientInformedAboutPreventingHIV;
	
	@XmlElement(name = "ClientInformedAboutPossibleTestResults")
	protected Boolean clientInformedAboutPossibleTestResults;
	
	@XmlElement(name = "InformedConsentForHIVTestingGiven")
	protected Boolean informedConsentForHIVTestingGiven;
	
	/**
	 * Gets the value of the previouslyTestedHIVNegative property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isPreviouslyTestedHIVNegative() {
		return previouslyTestedHIVNegative;
	}
	
	/**
	 * Sets the value of the previouslyTestedHIVNegative property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setPreviouslyTestedHIVNegative(Boolean value) {
		this.previouslyTestedHIVNegative = value;
	}
	
	/**
	 * Gets the value of the clientPregnant property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isClientPregnant() {
		return clientPregnant;
	}
	
	/**
	 * Sets the value of the clientPregnant property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setClientPregnant(Boolean value) {
		this.clientPregnant = value;
	}
	
	/**
	 * Gets the value of the clientInformedAboutHIVTransmissionRoutes property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isClientInformedAboutHIVTransmissionRoutes() {
		return clientInformedAboutHIVTransmissionRoutes;
	}
	
	/**
	 * Sets the value of the clientInformedAboutHIVTransmissionRoutes property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setClientInformedAboutHIVTransmissionRoutes(Boolean value) {
		this.clientInformedAboutHIVTransmissionRoutes = value;
	}
	
	/**
	 * Gets the value of the clientInformedAboutRiskFactors property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isClientInformedAboutRiskFactors() {
		return clientInformedAboutRiskFactors;
	}
	
	/**
	 * Sets the value of the clientInformedAboutRiskFactors property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setClientInformedAboutRiskFactors(Boolean value) {
		this.clientInformedAboutRiskFactors = value;
	}
	
	/**
	 * Gets the value of the clientInformedAboutPreventingHIV property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isClientInformedAboutPreventingHIV() {
		return clientInformedAboutPreventingHIV;
	}
	
	/**
	 * Sets the value of the clientInformedAboutPreventingHIV property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setClientInformedAboutPreventingHIV(Boolean value) {
		this.clientInformedAboutPreventingHIV = value;
	}
	
	/**
	 * Gets the value of the clientInformedAboutPossibleTestResults property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isClientInformedAboutPossibleTestResults() {
		return clientInformedAboutPossibleTestResults;
	}
	
	/**
	 * Sets the value of the clientInformedAboutPossibleTestResults property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setClientInformedAboutPossibleTestResults(Boolean value) {
		this.clientInformedAboutPossibleTestResults = value;
	}
	
	/**
	 * Gets the value of the informedConsentForHIVTestingGiven property.
	 * 
	 * @return possible object is {@link Boolean }
	 */
	public Boolean isInformedConsentForHIVTestingGiven() {
		return informedConsentForHIVTestingGiven;
	}
	
	/**
	 * Sets the value of the informedConsentForHIVTestingGiven property.
	 * 
	 * @param value allowed object is {@link Boolean }
	 */
	public void setInformedConsentForHIVTestingGiven(Boolean value) {
		this.informedConsentForHIVTestingGiven = value;
	}
	
}
