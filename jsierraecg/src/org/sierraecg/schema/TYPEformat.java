//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TYPEformat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TYPEformat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Narrow"/>
 *     &lt;enumeration value="Wide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TYPEformat")
@XmlEnum
public enum TYPEformat {

    @XmlEnumValue("Narrow")
    NARROW("Narrow"),
    @XmlEnumValue("Wide")
    WIDE("Wide");
    private final String value;

    TYPEformat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TYPEformat fromValue(String v) {
        for (TYPEformat c: TYPEformat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
