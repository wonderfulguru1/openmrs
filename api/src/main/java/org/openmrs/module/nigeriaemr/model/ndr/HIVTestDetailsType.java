package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for HIVTestDetailsType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIVTestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientCode" type="{}StringType"/>
 *         &lt;element name="DateOfVisit" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Setting">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="CT"/>
 *               &lt;enumeration value="PMTCT"/>
 *               &lt;enumeration value="TB"/>
 *               &lt;enumeration value="STI"/>
 *               &lt;enumeration value="FP"/>
 *               &lt;enumeration value="OPD"/>
 *               &lt;enumeration value="Ward"/>
 *               &lt;enumeration value="Outreach"/>
 *               &lt;enumeration value="Standalone"/>
 *               &lt;enumeration value="Others"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferredFrom" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Self"/>
 *               &lt;enumeration value="TB"/>
 *               &lt;enumeration value="STI"/>
 *               &lt;enumeration value="FP"/>
 *               &lt;enumeration value="OPD"/>
 *               &lt;enumeration value="Ward"/>
 *               &lt;enumeration value="BB"/>
 *               &lt;enumeration value="Others"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FirstTimeVisit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TypeOfSession" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Individual"/>
 *               &lt;enumeration value="Couple"/>
 *               &lt;enumeration value="Previous"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaritalStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="C"/>
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="G"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="O"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="U"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="T"/>
 *               &lt;enumeration value="W"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumberOfChildrenLessThanFive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfWivesOrCowives" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClientIdentiedFromIndex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IndexType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Biological"/>
 *               &lt;enumeration value="Sexual"/>
 *               &lt;enumeration value="Social"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IndexClientID" type="{}StringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIVTestDetailsType", propOrder = { "clientCode", "dateOfVisit", "setting", "referredFrom",
        "firstTimeVisit", "typeOfSession", "maritalStatus", "numberOfChildrenLessThanFive", "numberOfWivesOrCowives",
        "clientIdentiedFromIndex", "indexType", "indexClientID" })
public class HIVTestDetailsType {
	
	@XmlElement(name = "ClientCode", required = true)
	protected String clientCode;
	
	@XmlElement(name = "DateOfVisit", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dateOfVisit;
	
	@XmlElement(name = "Setting", required = true)
	protected String setting;
	
	@XmlElement(name = "ReferredFrom")
	protected String referredFrom;
	
	@XmlElement(name = "FirstTimeVisit")
	protected String firstTimeVisit;
	
	@XmlElement(name = "TypeOfSession")
	protected String typeOfSession;
	
	@XmlElement(name = "MaritalStatus")
	protected String maritalStatus;
	
	@XmlElement(name = "NumberOfChildrenLessThanFive")
	protected Integer numberOfChildrenLessThanFive;
	
	@XmlElement(name = "NumberOfWivesOrCowives")
	protected Integer numberOfWivesOrCowives;
	
	@XmlElement(name = "ClientIdentiedFromIndex")
	protected String clientIdentiedFromIndex;
	
	@XmlElement(name = "IndexType")
	protected String indexType;
	
	@XmlElement(name = "IndexClientID")
	protected String indexClientID;
	
	/**
	 * Gets the value of the clientCode property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getClientCode() {
		return clientCode;
	}
	
	/**
	 * Sets the value of the clientCode property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setClientCode(String value) {
		this.clientCode = value;
	}
	
	/**
	 * Gets the value of the dateOfVisit property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getDateOfVisit() {
		return dateOfVisit;
	}
	
	/**
	 * Sets the value of the dateOfVisit property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setDateOfVisit(XMLGregorianCalendar value) {
		this.dateOfVisit = value;
	}
	
	/**
	 * Gets the value of the setting property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getSetting() {
		return setting;
	}
	
	/**
	 * Sets the value of the setting property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setSetting(String value) {
		this.setting = value;
	}
	
	/**
	 * Gets the value of the referredFrom property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getReferredFrom() {
		return referredFrom;
	}
	
	/**
	 * Sets the value of the referredFrom property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setReferredFrom(String value) {
		this.referredFrom = value;
	}
	
	/**
	 * Gets the value of the firstTimeVisit property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFirstTimeVisit() {
		return firstTimeVisit;
	}
	
	/**
	 * Sets the value of the firstTimeVisit property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setFirstTimeVisit(String value) {
		this.firstTimeVisit = value;
	}
	
	/**
	 * Gets the value of the typeOfSession property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getTypeOfSession() {
		return typeOfSession;
	}
	
	/**
	 * Sets the value of the typeOfSession property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setTypeOfSession(String value) {
		this.typeOfSession = value;
	}
	
	/**
	 * Gets the value of the maritalStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	/**
	 * Sets the value of the maritalStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setMaritalStatus(String value) {
		this.maritalStatus = value;
	}
	
	/**
	 * Gets the value of the numberOfChildrenLessThanFive property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getNumberOfChildrenLessThanFive() {
		return numberOfChildrenLessThanFive;
	}
	
	/**
	 * Sets the value of the numberOfChildrenLessThanFive property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setNumberOfChildrenLessThanFive(Integer value) {
		this.numberOfChildrenLessThanFive = value;
	}
	
	/**
	 * Gets the value of the numberOfWivesOrCowives property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getNumberOfWivesOrCowives() {
		return numberOfWivesOrCowives;
	}
	
	/**
	 * Sets the value of the numberOfWivesOrCowives property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setNumberOfWivesOrCowives(Integer value) {
		this.numberOfWivesOrCowives = value;
	}
	
	/**
	 * Gets the value of the clientIdentiedFromIndex property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getClientIdentiedFromIndex() {
		return clientIdentiedFromIndex;
	}
	
	/**
	 * Sets the value of the clientIdentiedFromIndex property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setClientIdentiedFromIndex(String value) {
		this.clientIdentiedFromIndex = value;
	}
	
	/**
	 * Gets the value of the indexType property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getIndexType() {
		return indexType;
	}
	
	/**
	 * Sets the value of the indexType property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setIndexType(String value) {
		this.indexType = value;
	}
	
	/**
	 * Gets the value of the indexClientID property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getIndexClientID() {
		return indexClientID;
	}
	
	/**
	 * Sets the value of the indexClientID property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setIndexClientID(String value) {
		this.indexClientID = value;
	}
	
}
