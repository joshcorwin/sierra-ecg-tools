//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="cm" type="{http://www3.medical.philips.com}TYPEheight"/>
 *           &lt;element name="inch" type="{http://www3.medical.philips.com}TYPEheight"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cm",
    "inch"
})
@XmlRootElement(name = "height")
public class Height {

    protected String cm;
    protected String inch;

    /**
     * Gets the value of the cm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCm() {
        return cm;
    }

    /**
     * Sets the value of the cm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCm(String value) {
        this.cm = value;
    }

    /**
     * Gets the value of the inch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInch() {
        return inch;
    }

    /**
     * Sets the value of the inch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInch(String value) {
        this.inch = value;
    }

}
