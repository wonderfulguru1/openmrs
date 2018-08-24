package org.openmrs.module.nigeriaemr.model.ndr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for HealthFacilityVisitType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthFacilityVisitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VisitStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="TI"/>
 *               &lt;enumeration value="TO"/>
 *               &lt;enumeration value="L"/>
 *               &lt;enumeration value="DC"/>
 *               &lt;enumeration value="X"/>
 *               &lt;enumeration value="LTFU"/>
 *               &lt;enumeration value="D"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Cotrimoxazole" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BreastFeeding" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="U"/>
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
@XmlType(name = "HealthFacilityVisitType", propOrder = { "visitDate", "visitStatus", "cotrimoxazole", "weight",
        "breastFeeding" })
public class HealthFacilityVisitType {
	
	@XmlElement(name = "VisitDate", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar visitDate;
	
	@XmlElement(name = "VisitStatus")
	protected String visitStatus;
	
	@XmlElement(name = "Cotrimoxazole")
	protected String cotrimoxazole;
	
	@XmlElement(name = "Weight")
	protected Integer weight;
	
	@XmlElement(name = "BreastFeeding")
	protected String breastFeeding;
	
	/**
	 * Gets the value of the visitDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getVisitDate() {
		return visitDate;
	}
	
	/**
	 * Sets the value of the visitDate property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setVisitDate(XMLGregorianCalendar value) {
		this.visitDate = value;
	}
	
	/**
	 * Gets the value of the visitStatus property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getVisitStatus() {
		return visitStatus;
	}
	
	/**
	 * Sets the value of the visitStatus property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setVisitStatus(String value) {
		this.visitStatus = value;
	}
	
	/**
	 * Gets the value of the cotrimoxazole property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getCotrimoxazole() {
		return cotrimoxazole;
	}
	
	/**
	 * Sets the value of the cotrimoxazole property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setCotrimoxazole(String value) {
		this.cotrimoxazole = value;
	}
	
	/**
	 * Gets the value of the weight property.
	 * 
	 * @return possible object is {@link Integer }
	 */
	public Integer getWeight() {
		return weight;
	}
	
	/**
	 * Sets the value of the weight property.
	 * 
	 * @param value allowed object is {@link Integer }
	 */
	public void setWeight(Integer value) {
		this.weight = value;
	}
	
	/**
	 * Gets the value of the breastFeeding property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getBreastFeeding() {
		return breastFeeding;
	}
	
	/**
	 * Sets the value of the breastFeeding property.
	 * 
	 * @param value allowed object is {@link String }
	 */
	public void setBreastFeeding(String value) {
		this.breastFeeding = value;
	}
	
}
