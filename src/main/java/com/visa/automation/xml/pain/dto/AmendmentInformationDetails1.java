
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AmendmentInformationDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendmentInformationDetails1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlMndtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}PartyIdentification8" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}BranchAndFinancialInstitutionIdentification3" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}CashAccount7" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}PartyIdentification8" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}CashAccount7" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}BranchAndFinancialInstitutionIdentification3" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}CashAccount7" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlFnlColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Frequency1Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetails1", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlCdtrAgt",
    "orgnlCdtrAgtAcct",
    "orgnlDbtr",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt",
    "orgnlDbtrAgtAcct",
    "orgnlFnlColltnDt",
    "orgnlFrqcy"
})
public class AmendmentInformationDetails1 {

    @XmlElement(name = "OrgnlMndtId")
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    protected PartyIdentification8 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlCdtrAgt")
    protected BranchAndFinancialInstitutionIdentification3 orgnlCdtrAgt;
    @XmlElement(name = "OrgnlCdtrAgtAcct")
    protected CashAccount7 orgnlCdtrAgtAcct;
    @XmlElement(name = "OrgnlDbtr")
    protected PartyIdentification8 orgnlDbtr;
    @XmlElement(name = "OrgnlDbtrAcct")
    protected CashAccount7 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    protected BranchAndFinancialInstitutionIdentification3 orgnlDbtrAgt;
    @XmlElement(name = "OrgnlDbtrAgtAcct")
    protected CashAccount7 orgnlDbtrAgtAcct;
    @XmlElement(name = "OrgnlFnlColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlFnlColltnDt;
    @XmlElement(name = "OrgnlFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code orgnlFrqcy;

    /**
     * Gets the value of the orgnlMndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMndtId() {
        return orgnlMndtId;
    }

    /**
     * Sets the value of the orgnlMndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMndtId(String value) {
        this.orgnlMndtId = value;
    }

    /**
     * Gets the value of the orgnlCdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getOrgnlCdtrSchmeId() {
        return orgnlCdtrSchmeId;
    }

    /**
     * Sets the value of the orgnlCdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public void setOrgnlCdtrSchmeId(PartyIdentification8 value) {
        this.orgnlCdtrSchmeId = value;
    }

    /**
     * Gets the value of the orgnlCdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getOrgnlCdtrAgt() {
        return orgnlCdtrAgt;
    }

    /**
     * Sets the value of the orgnlCdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public void setOrgnlCdtrAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.orgnlCdtrAgt = value;
    }

    /**
     * Gets the value of the orgnlCdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getOrgnlCdtrAgtAcct() {
        return orgnlCdtrAgtAcct;
    }

    /**
     * Sets the value of the orgnlCdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setOrgnlCdtrAgtAcct(CashAccount7 value) {
        this.orgnlCdtrAgtAcct = value;
    }

    /**
     * Gets the value of the orgnlDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getOrgnlDbtr() {
        return orgnlDbtr;
    }

    /**
     * Sets the value of the orgnlDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public void setOrgnlDbtr(PartyIdentification8 value) {
        this.orgnlDbtr = value;
    }

    /**
     * Gets the value of the orgnlDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setOrgnlDbtrAcct(CashAccount7 value) {
        this.orgnlDbtrAcct = value;
    }

    /**
     * Gets the value of the orgnlDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification3 getOrgnlDbtrAgt() {
        return orgnlDbtrAgt;
    }

    /**
     * Sets the value of the orgnlDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification3 }
     *     
     */
    public void setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentification3 value) {
        this.orgnlDbtrAgt = value;
    }

    /**
     * Gets the value of the orgnlDbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getOrgnlDbtrAgtAcct() {
        return orgnlDbtrAgtAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setOrgnlDbtrAgtAcct(CashAccount7 value) {
        this.orgnlDbtrAgtAcct = value;
    }

    /**
     * Gets the value of the orgnlFnlColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlFnlColltnDt() {
        return orgnlFnlColltnDt;
    }

    /**
     * Sets the value of the orgnlFnlColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlFnlColltnDt(XMLGregorianCalendar value) {
        this.orgnlFnlColltnDt = value;
    }

    /**
     * Gets the value of the orgnlFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getOrgnlFrqcy() {
        return orgnlFrqcy;
    }

    /**
     * Sets the value of the orgnlFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public void setOrgnlFrqcy(Frequency1Code value) {
        this.orgnlFrqcy = value;
    }

}
