
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCategoryPurpose1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCategoryPurpose1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CORT"/&gt;
 *     &lt;enumeration value="SALA"/&gt;
 *     &lt;enumeration value="TREA"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="GOVT"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="PENS"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SSBE"/&gt;
 *     &lt;enumeration value="SUPP"/&gt;
 *     &lt;enumeration value="TAXS"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *     &lt;enumeration value="VATX"/&gt;
 *     &lt;enumeration value="HEDG"/&gt;
 *     &lt;enumeration value="INTC"/&gt;
 *     &lt;enumeration value="WHLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentCategoryPurpose1Code")
@XmlEnum
public enum PaymentCategoryPurpose1Code {

    CORT,
    SALA,
    TREA,
    CASH,
    DIVI,
    GOVT,
    INTE,
    LOAN,
    PENS,
    SECU,
    SSBE,
    SUPP,
    TAXS,
    TRAD,
    VATX,
    HEDG,
    INTC,
    WHLD;

    public String value() {
        return name();
    }

    public static PaymentCategoryPurpose1Code fromValue(String v) {
        return valueOf(v);
    }

}
