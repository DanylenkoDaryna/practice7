//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.21 at 01:24:30 AM EEST
//


package ua.nure.danylenko.practice7.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for group.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="group">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="input-output"/>
 *     &lt;enumeration value="multimedia"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "group")
@XmlEnum
public enum Group {

    @XmlEnumValue("input-output")
    INPUT_OUTPUT("input-output"),
    @XmlEnumValue("multimedia")
    MULTIMEDIA("multimedia");
    private final String value;

    Group(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Group fromValue(String v) {
        for (Group c: Group.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
