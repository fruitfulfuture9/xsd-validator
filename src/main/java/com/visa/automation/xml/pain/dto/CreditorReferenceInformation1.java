
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditorReferenceInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorReferenceInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdtrRefTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}CreditorReferenceType1" minOccurs="0"/&gt;
 *         &lt;element name="CdtrRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceInformation1", propOrder = {
    "cdtrRefTp",
    "cdtrRef"
})
public class CreditorReferenceInformation1 {

    @XmlElement(name = "CdtrRefTp")
    protected CreditorReferenceType1 cdtrRefTp;
    @XmlElement(name = "CdtrRef")
    protected String cdtrRef;

    /**
     * Gets the value of the cdtrRefTp property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceType1 }
     *     
     */
    public CreditorReferenceType1 getCdtrRefTp() {
        return cdtrRefTp;
    }

    /**
     * Sets the value of the cdtrRefTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceType1 }
     *     
     */
    public void setCdtrRefTp(CreditorReferenceType1 value) {
        this.cdtrRefTp = value;
    }

    /**
     * Gets the value of the cdtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrRef() {
        return cdtrRef;
    }

    /**
     * Sets the value of the cdtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrRef(String value) {
        this.cdtrRef = value;
    }

}
