package org.openmrs.module.nigeriaemr.model.ndr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for HIVTestingEncounterType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIVTestingEncounterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestDetail" type="{}HIVTestDetailsType"/>
 *         &lt;element name="PreTestCounselling" type="{}HIVPreTestCounsellingType" minOccurs="0"/>
 *         &lt;element name="PostTestCounselling" type="{}PostTestCounsellingType" minOccurs="0"/>
 *         &lt;element name="HIVTestResult" type="{}HIVTestResultsType" minOccurs="0"/>
 *         &lt;element name="HIVRecencyTestResult" type="{}HIVRecencyTestResultType" minOccurs="0"/>
 *         &lt;element name="OtherTestingServices" type="{}OtherTestingServicesType" minOccurs="0"/>
 *         &lt;element name="PartnerNotificationServices" type="{}PartnerNotificationServicesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIVTestingEncounterType", propOrder = { "testDetail", "preTestCounselling", "postTestCounselling",
        "hivTestResult", "hivRecencyTestResult", "otherTestingServices", "partnerNotificationServices" })
public class HIVTestingEncounterType {
	
	@XmlElement(name = "TestDetail", required = true)
	protected HIVTestDetailsType testDetail;
	
	@XmlElement(name = "PreTestCounselling")
	protected HIVPreTestCounsellingType preTestCounselling;
	
	@XmlElement(name = "PostTestCounselling")
	protected PostTestCounsellingType postTestCounselling;
	
	@XmlElement(name = "HIVTestResult")
	protected HIVTestResultsType hivTestResult;
	
	@XmlElement(name = "HIVRecencyTestResult")
	protected HIVRecencyTestResultType hivRecencyTestResult;
	
	@XmlElement(name = "OtherTestingServices")
	protected OtherTestingServicesType otherTestingServices;
	
	@XmlElement(name = "PartnerNotificationServices")
	protected List<PartnerNotificationServicesType> partnerNotificationServices;
	
	/**
	 * Gets the value of the testDetail property.
	 * 
	 * @return possible object is {@link HIVTestDetailsType }
	 */
	public HIVTestDetailsType getTestDetail() {
		return testDetail;
	}
	
	/**
	 * Sets the value of the testDetail property.
	 * 
	 * @param value allowed object is {@link HIVTestDetailsType }
	 */
	public void setTestDetail(HIVTestDetailsType value) {
		this.testDetail = value;
	}
	
	/**
	 * Gets the value of the preTestCounselling property.
	 * 
	 * @return possible object is {@link HIVPreTestCounsellingType }
	 */
	public HIVPreTestCounsellingType getPreTestCounselling() {
		return preTestCounselling;
	}
	
	/**
	 * Sets the value of the preTestCounselling property.
	 * 
	 * @param value allowed object is {@link HIVPreTestCounsellingType }
	 */
	public void setPreTestCounselling(HIVPreTestCounsellingType value) {
		this.preTestCounselling = value;
	}
	
	/**
	 * Gets the value of the postTestCounselling property.
	 * 
	 * @return possible object is {@link PostTestCounsellingType }
	 */
	public PostTestCounsellingType getPostTestCounselling() {
		return postTestCounselling;
	}
	
	/**
	 * Sets the value of the postTestCounselling property.
	 * 
	 * @param value allowed object is {@link PostTestCounsellingType }
	 */
	public void setPostTestCounselling(PostTestCounsellingType value) {
		this.postTestCounselling = value;
	}
	
	/**
	 * Gets the value of the hivTestResult property.
	 * 
	 * @return possible object is {@link HIVTestResultsType }
	 */
	public HIVTestResultsType getHIVTestResult() {
		return hivTestResult;
	}
	
	/**
	 * Sets the value of the hivTestResult property.
	 * 
	 * @param value allowed object is {@link HIVTestResultsType }
	 */
	public void setHIVTestResult(HIVTestResultsType value) {
		this.hivTestResult = value;
	}
	
	/**
	 * Gets the value of the hivRecencyTestResult property.
	 * 
	 * @return possible object is {@link HIVRecencyTestResultType }
	 */
	public HIVRecencyTestResultType getHIVRecencyTestResult() {
		return hivRecencyTestResult;
	}
	
	/**
	 * Sets the value of the hivRecencyTestResult property.
	 * 
	 * @param value allowed object is {@link HIVRecencyTestResultType }
	 */
	public void setHIVRecencyTestResult(HIVRecencyTestResultType value) {
		this.hivRecencyTestResult = value;
	}
	
	/**
	 * Gets the value of the otherTestingServices property.
	 * 
	 * @return possible object is {@link OtherTestingServicesType }
	 */
	public OtherTestingServicesType getOtherTestingServices() {
		return otherTestingServices;
	}
	
	/**
	 * Sets the value of the otherTestingServices property.
	 * 
	 * @param value allowed object is {@link OtherTestingServicesType }
	 */
	public void setOtherTestingServices(OtherTestingServicesType value) {
		this.otherTestingServices = value;
	}
	
	/**
	 * Gets the value of the partnerNotificationServices property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the partnerNotificationServices property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
     *    getPartnerNotificationServices().add(newItem);
     * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PartnerNotificationServicesType }
	 */
	public List<PartnerNotificationServicesType> getPartnerNotificationServices() {
		if (partnerNotificationServices == null) {
			partnerNotificationServices = new ArrayList<PartnerNotificationServicesType>();
		}
		return this.partnerNotificationServices;
	}
	
}
