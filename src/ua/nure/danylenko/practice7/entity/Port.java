//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.21 at 01:24:30 AM EEST
//


package ua.nure.danylenko.practice7.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Port.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Port">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USB"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="LPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "Port")
@XmlEnum
public enum Port {

    USB,
    COM,
    LPT;

    public String value() {
        return name();
    }

    public static Port fromValue(String v) {
        return valueOf(v);
    }

}
