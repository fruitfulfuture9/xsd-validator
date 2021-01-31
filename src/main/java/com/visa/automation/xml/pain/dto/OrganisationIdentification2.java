
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationIdentification2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BIC" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}BICIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="IBEI" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}IBEIIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="BEI" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}BEIIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="EANGLN" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}EANGLNIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="USCHU" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}CHIPSUniversalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="DUNS" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}DunsIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="BkPtyId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}GenericIdentification3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification2", propOrder = {
    "bic",
    "ibei",
    "bei",
    "eangln",
    "uschu",
    "duns",
    "bkPtyId",
    "taxIdNb",
    "prtryId"
})
public class OrganisationIdentification2 {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "IBEI")
    protected String ibei;
    @XmlElement(name = "BEI")
    protected String bei;
    @XmlElement(name = "EANGLN")
    protected String eangln;
    @XmlElement(name = "USCHU")
    protected String uschu;
    @XmlElement(name = "DUNS")
    protected String duns;
    @XmlElement(name = "BkPtyId")
    protected String bkPtyId;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification3 prtryId;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the ibei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBEI() {
        return ibei;
    }

    /**
     * Sets the value of the ibei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBEI(String value) {
        this.ibei = value;
    }

    /**
     * Gets the value of the bei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEI() {
        return bei;
    }

    /**
     * Sets the value of the bei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEI(String value) {
        this.bei = value;
    }

    /**
     * Gets the value of the eangln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANGLN() {
        return eangln;
    }

    /**
     * Sets the value of the eangln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANGLN(String value) {
        this.eangln = value;
    }

    /**
     * Gets the value of the uschu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCHU() {
        return uschu;
    }

    /**
     * Sets the value of the uschu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSCHU(String value) {
        this.uschu = value;
    }

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNS(String value) {
        this.duns = value;
    }

    /**
     * Gets the value of the bkPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkPtyId() {
        return bkPtyId;
    }

    /**
     * Sets the value of the bkPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkPtyId(String value) {
        this.bkPtyId = value;
    }

    /**
     * Gets the value of the taxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Sets the value of the taxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdNb(String value) {
        this.taxIdNb = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification3 }
     *     
     */
    public GenericIdentification3 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification3 }
     *     
     */
    public void setPrtryId(GenericIdentification3 value) {
        this.prtryId = value;
    }

}
