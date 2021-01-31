
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionGroupStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionGroupStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTC"/&gt;
 *     &lt;enumeration value="RCVD"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="PDNG"/&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ACSP"/&gt;
 *     &lt;enumeration value="ACSC"/&gt;
 *     &lt;enumeration value="ACCR"/&gt;
 *     &lt;enumeration value="ACWC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionGroupStatus1Code")
@XmlEnum
public enum TransactionGroupStatus1Code {

    ACTC,
    RCVD,
    PART,
    RJCT,
    PDNG,
    ACCP,
    ACSP,
    ACSC,
    ACCR,
    ACWC;

    public String value() {
        return name();
    }

    public static TransactionGroupStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
