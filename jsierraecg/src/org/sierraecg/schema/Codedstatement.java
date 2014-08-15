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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www3.medical.philips.com}modifiers"/>
 *         &lt;element ref="{http://www3.medical.philips.com}scmodifiers"/>
 *         &lt;element ref="{http://www3.medical.philips.com}variables"/>
 *         &lt;element ref="{http://www3.medical.philips.com}unparsedstatement"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" use="required" type="{http://www3.medical.philips.com}TYPEcodedstatementsource" />
 *       &lt;attribute name="subtype" use="required" type="{http://www3.medical.philips.com}TYPEstatementsubtype" />
 *       &lt;attribute name="deleted" type="{http://www3.medical.philips.com}TYPEflag" default="False" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modifiers",
    "scmodifiers",
    "variables",
    "unparsedstatement"
})
@XmlRootElement(name = "codedstatement")
public class Codedstatement {

    @XmlElement(required = true)
    protected Modifiers modifiers;
    @XmlElement(required = true)
    protected Scmodifiers scmodifiers;
    @XmlElement(required = true)
    protected Variables variables;
    @XmlElement(required = true)
    protected Unparsedstatement unparsedstatement;
    @XmlAttribute(name = "source", required = true)
    protected String source;
    @XmlAttribute(name = "subtype", required = true)
    protected TYPEstatementsubtype subtype;
    @XmlAttribute(name = "deleted")
    protected TYPEflag deleted;

    /**
     * Gets the value of the modifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Modifiers }
     *     
     */
    public Modifiers getModifiers() {
        return modifiers;
    }

    /**
     * Sets the value of the modifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifiers }
     *     
     */
    public void setModifiers(Modifiers value) {
        this.modifiers = value;
    }

    /**
     * Gets the value of the scmodifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Scmodifiers }
     *     
     */
    public Scmodifiers getScmodifiers() {
        return scmodifiers;
    }

    /**
     * Sets the value of the scmodifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scmodifiers }
     *     
     */
    public void setScmodifiers(Scmodifiers value) {
        this.scmodifiers = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link Variables }
     *     
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variables }
     *     
     */
    public void setVariables(Variables value) {
        this.variables = value;
    }

    /**
     * Gets the value of the unparsedstatement property.
     * 
     * @return
     *     possible object is
     *     {@link Unparsedstatement }
     *     
     */
    public Unparsedstatement getUnparsedstatement() {
        return unparsedstatement;
    }

    /**
     * Sets the value of the unparsedstatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unparsedstatement }
     *     
     */
    public void setUnparsedstatement(Unparsedstatement value) {
        this.unparsedstatement = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEstatementsubtype }
     *     
     */
    public TYPEstatementsubtype getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEstatementsubtype }
     *     
     */
    public void setSubtype(TYPEstatementsubtype value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getDeleted() {
        if (deleted == null) {
            return TYPEflag.FALSE;
        } else {
            return deleted;
        }
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setDeleted(TYPEflag value) {
        this.deleted = value;
    }

}
