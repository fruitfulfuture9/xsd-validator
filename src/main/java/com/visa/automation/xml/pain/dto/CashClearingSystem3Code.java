
package com.visa.automation.xml.pain.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashClearingSystem3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashClearingSystem3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABE"/&gt;
 *     &lt;enumeration value="ART"/&gt;
 *     &lt;enumeration value="AVP"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="BAP"/&gt;
 *     &lt;enumeration value="BEL"/&gt;
 *     &lt;enumeration value="BOF"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CAM"/&gt;
 *     &lt;enumeration value="CBJ"/&gt;
 *     &lt;enumeration value="CHP"/&gt;
 *     &lt;enumeration value="DKC"/&gt;
 *     &lt;enumeration value="RTP"/&gt;
 *     &lt;enumeration value="EBA"/&gt;
 *     &lt;enumeration value="ELS"/&gt;
 *     &lt;enumeration value="ERP"/&gt;
 *     &lt;enumeration value="XCT"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HRM"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="LGS"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="MUP"/&gt;
 *     &lt;enumeration value="NOC"/&gt;
 *     &lt;enumeration value="PCH"/&gt;
 *     &lt;enumeration value="PDS"/&gt;
 *     &lt;enumeration value="PEG"/&gt;
 *     &lt;enumeration value="PNS"/&gt;
 *     &lt;enumeration value="PVE"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SLB"/&gt;
 *     &lt;enumeration value="SPG"/&gt;
 *     &lt;enumeration value="SSK"/&gt;
 *     &lt;enumeration value="TBF"/&gt;
 *     &lt;enumeration value="TGT"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="FDW"/&gt;
 *     &lt;enumeration value="BOJ"/&gt;
 *     &lt;enumeration value="FEY"/&gt;
 *     &lt;enumeration value="ZEN"/&gt;
 *     &lt;enumeration value="DDK"/&gt;
 *     &lt;enumeration value="AIP"/&gt;
 *     &lt;enumeration value="BCC"/&gt;
 *     &lt;enumeration value="BDS"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHS"/&gt;
 *     &lt;enumeration value="BIS"/&gt;
 *     &lt;enumeration value="BSP"/&gt;
 *     &lt;enumeration value="EPM"/&gt;
 *     &lt;enumeration value="EPN"/&gt;
 *     &lt;enumeration value="FDA"/&gt;
 *     &lt;enumeration value="GIS"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="KPS"/&gt;
 *     &lt;enumeration value="LKB"/&gt;
 *     &lt;enumeration value="MEP"/&gt;
 *     &lt;enumeration value="MRS"/&gt;
 *     &lt;enumeration value="NAM"/&gt;
 *     &lt;enumeration value="PTR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="ROS"/&gt;
 *     &lt;enumeration value="SCP"/&gt;
 *     &lt;enumeration value="STG"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TIS"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="UIS"/&gt;
 *     &lt;enumeration value="MOS"/&gt;
 *     &lt;enumeration value="ZET"/&gt;
 *     &lt;enumeration value="ZIS"/&gt;
 *     &lt;enumeration value="CHI"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashClearingSystem3Code")
@XmlEnum
public enum CashClearingSystem3Code {

    ABE,
    ART,
    AVP,
    AZM,
    BAP,
    BEL,
    BOF,
    BRL,
    CAD,
    CAM,
    CBJ,
    CHP,
    DKC,
    RTP,
    EBA,
    ELS,
    ERP,
    XCT,
    HRK,
    HRM,
    HUF,
    LGS,
    LVL,
    MUP,
    NOC,
    PCH,
    PDS,
    PEG,
    PNS,
    PVE,
    SEC,
    SIT,
    SLB,
    SPG,
    SSK,
    TBF,
    TGT,
    TOP,
    FDW,
    BOJ,
    FEY,
    ZEN,
    DDK,
    AIP,
    BCC,
    BDS,
    BGN,
    BHS,
    BIS,
    BSP,
    EPM,
    EPN,
    FDA,
    GIS,
    INC,
    JOD,
    KPS,
    LKB,
    MEP,
    MRS,
    NAM,
    PTR,
    ROL,
    ROS,
    SCP,
    STG,
    THB,
    TIS,
    TTD,
    UIS,
    MOS,
    ZET,
    ZIS,
    CHI,
    COP;

    public String value() {
        return name();
    }

    public static CashClearingSystem3Code fromValue(String v) {
        return valueOf(v);
    }

}
