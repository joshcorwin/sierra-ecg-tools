//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www3.medical.philips.com>TYPEmachine">
 *       &lt;attribute name="machineid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="detaildescription" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "machine")
public class Machine {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "machineid")
    protected String machineid;
    @XmlAttribute(name = "detaildescription", required = true)
    protected String detaildescription;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the machineid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineid() {
        return machineid;
    }

    /**
     * Sets the value of the machineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineid(String value) {
        this.machineid = value;
    }

    /**
     * Gets the value of the detaildescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetaildescription() {
        return detaildescription;
    }

    /**
     * Sets the value of the detaildescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetaildescription(String value) {
        this.detaildescription = value;
    }

}
