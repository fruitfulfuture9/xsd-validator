
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchAndFinancialInstitutionIdentification3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}FinancialInstitutionIdentification5Choice"/&gt;
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}BranchData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification3", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification3 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification5Choice finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData brnchId;

    /**
     * Gets the value of the finInstnId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification5Choice }
     *     
     */
    public FinancialInstitutionIdentification5Choice getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification5Choice }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification5Choice value) {
        this.finInstnId = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData }
     *     
     */
    public BranchData getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData }
     *     
     */
    public void setBrnchId(BranchData value) {
        this.brnchId = value;
    }

}
