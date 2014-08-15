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
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="leadname" use="required" type="{http://www3.medical.philips.com}TYPEleadname" />
 *       &lt;attribute name="duration" use="required" type="{http://www3.medical.philips.com}TYPEduration" />
 *       &lt;attribute name="ponset" use="required" type="{http://www3.medical.philips.com}TYPEfiducial" />
 *       &lt;attribute name="pend" use="required" type="{http://www3.medical.philips.com}TYPEfiducial" />
 *       &lt;attribute name="qonset" use="required" type="{http://www3.medical.philips.com}TYPEfiducial" />
 *       &lt;attribute name="qend" use="required" type="{http://www3.medical.philips.com}TYPEfiducial" />
 *       &lt;attribute name="tonset" use="required" type="{http://www3.medical.philips.com}TYPEfiducial" />
 *       &lt;attribute name="tend" use="required" type="{http://www3.medical.philips.com}TYPEfiducial" />
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
@XmlRootElement(name = "repbeat")
public class Repbeat {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "leadname", required = true)
    protected String leadname;
    @XmlAttribute(name = "duration", required = true)
    protected String duration;
    @XmlAttribute(name = "ponset", required = true)
    protected String ponset;
    @XmlAttribute(name = "pend", required = true)
    protected String pend;
    @XmlAttribute(name = "qonset", required = true)
    protected String qonset;
    @XmlAttribute(name = "qend", required = true)
    protected String qend;
    @XmlAttribute(name = "tonset", required = true)
    protected String tonset;
    @XmlAttribute(name = "tend", required = true)
    protected String tend;

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
     * Gets the value of the leadname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadname() {
        return leadname;
    }

    /**
     * Sets the value of the leadname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadname(String value) {
        this.leadname = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the ponset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPonset() {
        return ponset;
    }

    /**
     * Sets the value of the ponset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPonset(String value) {
        this.ponset = value;
    }

    /**
     * Gets the value of the pend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPend() {
        return pend;
    }

    /**
     * Sets the value of the pend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPend(String value) {
        this.pend = value;
    }

    /**
     * Gets the value of the qonset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQonset() {
        return qonset;
    }

    /**
     * Sets the value of the qonset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQonset(String value) {
        this.qonset = value;
    }

    /**
     * Gets the value of the qend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQend() {
        return qend;
    }

    /**
     * Sets the value of the qend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQend(String value) {
        this.qend = value;
    }

    /**
     * Gets the value of the tonset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTonset() {
        return tonset;
    }

    /**
     * Sets the value of the tonset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTonset(String value) {
        this.tonset = value;
    }

    /**
     * Gets the value of the tend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTend() {
        return tend;
    }

    /**
     * Sets the value of the tend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTend(String value) {
        this.tend = value;
    }

}
