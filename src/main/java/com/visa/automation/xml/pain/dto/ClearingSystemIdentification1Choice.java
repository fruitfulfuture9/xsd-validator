
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingSystemIdentification1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingSystemIdentification1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ClrSysId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}CashClearingSystem3Code"/&gt;
 *           &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Max35Text"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemIdentification1Choice", propOrder = {
    "clrSysId",
    "prtry"
})
public class ClearingSystemIdentification1Choice {

    @XmlElement(name = "ClrSysId")
    @XmlSchemaType(name = "string")
    protected CashClearingSystem3Code clrSysId;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the clrSysId property.
     * 
     * @return
     *     possible object is
     *     {@link CashClearingSystem3Code }
     *     
     */
    public CashClearingSystem3Code getClrSysId() {
        return clrSysId;
    }

    /**
     * Sets the value of the clrSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashClearingSystem3Code }
     *     
     */
    public void setClrSysId(CashClearingSystem3Code value) {
        this.clrSysId = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}
