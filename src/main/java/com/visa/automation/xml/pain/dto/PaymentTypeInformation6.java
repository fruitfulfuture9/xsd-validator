
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeInformation6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Priority2Code" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}ServiceLevel2Choice" minOccurs="0"/&gt;
 *           &lt;element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}ClearingChannel2Code" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}LocalInstrument1Choice" minOccurs="0"/&gt;
 *         &lt;element name="SeqTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}SequenceType1Code" minOccurs="0"/&gt;
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}PaymentCategoryPurpose1Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation6", propOrder = {
    "instrPrty",
    "svcLvl",
    "clrChanl",
    "lclInstrm",
    "seqTp",
    "ctgyPurp"
})
public class PaymentTypeInformation6 {

    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "SvcLvl")
    protected ServiceLevel2Choice svcLvl;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument1Choice lclInstrm;
    @XmlElement(name = "SeqTp")
    @XmlSchemaType(name = "string")
    protected SequenceType1Code seqTp;
    @XmlElement(name = "CtgyPurp")
    @XmlSchemaType(name = "string")
    protected PaymentCategoryPurpose1Code ctgyPurp;

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel2Choice }
     *     
     */
    public ServiceLevel2Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel2Choice }
     *     
     */
    public void setSvcLvl(ServiceLevel2Choice value) {
        this.svcLvl = value;
    }

    /**
     * Gets the value of the clrChanl property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public ClearingChannel2Code getClrChanl() {
        return clrChanl;
    }

    /**
     * Sets the value of the clrChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public void setClrChanl(ClearingChannel2Code value) {
        this.clrChanl = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument1Choice }
     *     
     */
    public LocalInstrument1Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument1Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument1Choice value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the seqTp property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType1Code }
     *     
     */
    public SequenceType1Code getSeqTp() {
        return seqTp;
    }

    /**
     * Sets the value of the seqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType1Code }
     *     
     */
    public void setSeqTp(SequenceType1Code value) {
        this.seqTp = value;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCategoryPurpose1Code }
     *     
     */
    public PaymentCategoryPurpose1Code getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCategoryPurpose1Code }
     *     
     */
    public void setCtgyPurp(PaymentCategoryPurpose1Code value) {
        this.ctgyPurp = value;
    }

}
