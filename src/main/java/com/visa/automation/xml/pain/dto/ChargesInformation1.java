
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargesInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChrgsAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}CurrencyAndAmount"/&gt;
 *         &lt;element name="ChrgsPty" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}BranchAndFinancialInstitutionIdentification3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesInformation1", propOrder = {
    "chrgsAmt",
    "chrgsPty"
})
public class ChargesInformation1 {

    @XmlElement(name = "ChrgsAmt", required = true)
    protected CurrencyAndAmount chrgsAmt;
    @XmlElement(name = "ChrgsPty", required = true)
    protected BranchAndFinancialInstitutionIdentification3 chrgsPty;

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setChrgsAmt(CurrencyAndAmount value) {
        this.chrgsAmt = value;
    }

    /**
     * Gets the value of the chrgsPty property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getChrgsPty() {
        return chrgsPty;
    }

    /**
     * Sets the value of the chrgsPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public void setChrgsPty(BranchAndFinancialInstitutionIdentification3 value) {
        this.chrgsPty = value;
    }

}
