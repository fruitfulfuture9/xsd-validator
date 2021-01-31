
package com.visa.automation.xml.pain.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReasonInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusReasonInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StsOrgtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}PartyIdentification8" minOccurs="0"/&gt;
 *         &lt;element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}StatusReason1Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlStsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}Max105Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReasonInformation1", propOrder = {
    "stsOrgtr",
    "stsRsn",
    "addtlStsRsnInf"
})
public class StatusReasonInformation1 {

    @XmlElement(name = "StsOrgtr")
    protected PartyIdentification8 stsOrgtr;
    @XmlElement(name = "StsRsn")
    protected StatusReason1Choice stsRsn;
    @XmlElement(name = "AddtlStsRsnInf")
    protected List<String> addtlStsRsnInf;

    /**
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public void setStsOrgtr(PartyIdentification8 value) {
        this.stsOrgtr = value;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason1Choice }
     *     
     */
    public StatusReason1Choice getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason1Choice }
     *     
     */
    public void setStsRsn(StatusReason1Choice value) {
        this.stsRsn = value;
    }

    /**
     * Gets the value of the addtlStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlStsRsnInf() {
        if (addtlStsRsnInf == null) {
            addtlStsRsnInf = new ArrayList<String>();
        }
        return this.addtlStsRsnInf;
    }

}
