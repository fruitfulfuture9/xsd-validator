
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pain.002.001.02" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.02}pain.002.001.02"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pain00200102"
})
public class Document {

    @XmlElement(name = "pain.002.001.02", required = true)
    protected Pain00200102 pain00200102;

    /**
     * Gets the value of the pain00200102 property.
     * 
     * @return
     *     possible object is
     *     {@link Pain00200102 }
     *     
     */
    public Pain00200102 getPain00200102() {
        return pain00200102;
    }

    /**
     * Sets the value of the pain00200102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pain00200102 }
     *     
     */
    public void setPain00200102(Pain00200102 value) {
        this.pain00200102 = value;
    }

}
