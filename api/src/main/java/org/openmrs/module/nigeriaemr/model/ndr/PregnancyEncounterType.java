package org.openmrs.module.nigeriaemr.model.ndr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PregnancyEncounterType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PregnancyEncounterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AntenatalRegistration" type="{}AntenatalRegistrationType"/>
 *         &lt;element name="PartnerDetail" type="{}PartnerDetailType" minOccurs="0"/>
 *         &lt;element name="DeliveryEncounter" type="{}DeliveryEncounterType" minOccurs="0"/>
 *         &lt;element name="Child" type="{}ChildType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PregnancyEncounterType", propOrder = { "antenatalRegistration", "partnerDetail", "deliveryEncounter",
        "child" })
public class PregnancyEncounterType {
	
	@XmlElement(name = "AntenatalRegistration", required = true)
	protected AntenatalRegistrationType antenatalRegistration;
	
	@XmlElement(name = "PartnerDetail")
	protected PartnerDetailType partnerDetail;
	
	@XmlElement(name = "DeliveryEncounter")
	protected DeliveryEncounterType deliveryEncounter;
	
	@XmlElement(name = "Child")
	protected List<ChildType> child;
	
	/**
	 * Gets the value of the antenatalRegistration property.
	 * 
	 * @return possible object is {@link AntenatalRegistrationType }
	 */
	public AntenatalRegistrationType getAntenatalRegistration() {
		return antenatalRegistration;
	}
	
	/**
	 * Sets the value of the antenatalRegistration property.
	 * 
	 * @param value allowed object is {@link AntenatalRegistrationType }
	 */
	public void setAntenatalRegistration(AntenatalRegistrationType value) {
		this.antenatalRegistration = value;
	}
	
	/**
	 * Gets the value of the partnerDetail property.
	 * 
	 * @return possible object is {@link PartnerDetailType }
	 */
	public PartnerDetailType getPartnerDetail() {
		return partnerDetail;
	}
	
	/**
	 * Sets the value of the partnerDetail property.
	 * 
	 * @param value allowed object is {@link PartnerDetailType }
	 */
	public void setPartnerDetail(PartnerDetailType value) {
		this.partnerDetail = value;
	}
	
	/**
	 * Gets the value of the deliveryEncounter property.
	 * 
	 * @return possible object is {@link DeliveryEncounterType }
	 */
	public DeliveryEncounterType getDeliveryEncounter() {
		return deliveryEncounter;
	}
	
	/**
	 * Sets the value of the deliveryEncounter property.
	 * 
	 * @param value allowed object is {@link DeliveryEncounterType }
	 */
	public void setDeliveryEncounter(DeliveryEncounterType value) {
		this.deliveryEncounter = value;
	}
	
	/**
	 * Gets the value of the child property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the child property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
     *    getChild().add(newItem);
     * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChildType }
	 */
	public List<ChildType> getChild() {
		if (child == null) {
			child = new ArrayList<ChildType>();
		}
		return this.child;
	}
	
}
