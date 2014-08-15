//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www3.medical.philips.com}serialcomparison" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}interpretationdatastructure"/>
 *         &lt;element ref="{http://www3.medical.philips.com}interpretationmeasurements"/>
 *         &lt;element ref="{http://www3.medical.philips.com}mdsignatureline"/>
 *         &lt;element ref="{http://www3.medical.philips.com}severity"/>
 *         &lt;element ref="{http://www3.medical.philips.com}statement" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="criteriaversion" use="required" type="{http://www3.medical.philips.com}TYPEcriteriaversion" />
 *       &lt;attribute name="criteriaversiondate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="customcriteriaversion" type="{http://www3.medical.philips.com}TYPEcustomcriteriaversion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serialcomparison",
    "interpretationdatastructure",
    "interpretationmeasurements",
    "mdsignatureline",
    "severity",
    "statement"
})
@XmlRootElement(name = "interpretation")
public class Interpretation {

    protected Serialcomparison serialcomparison;
    @XmlElement(required = true)
    protected Interpretationdatastructure interpretationdatastructure;
    @XmlElement(required = true)
    protected Interpretationmeasurements interpretationmeasurements;
    @XmlElement(required = true)
    protected String mdsignatureline;
    @XmlElement(required = true)
    protected Severity severity;
    @XmlElement(required = true)
    protected List<Statement> statement;
    @XmlAttribute(name = "date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "criteriaversion", required = true)
    protected String criteriaversion;
    @XmlAttribute(name = "criteriaversiondate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar criteriaversiondate;
    @XmlAttribute(name = "customcriteriaversion")
    protected String customcriteriaversion;

    /**
     * Gets the value of the serialcomparison property.
     * 
     * @return
     *     possible object is
     *     {@link Serialcomparison }
     *     
     */
    public Serialcomparison getSerialcomparison() {
        return serialcomparison;
    }

    /**
     * Sets the value of the serialcomparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link Serialcomparison }
     *     
     */
    public void setSerialcomparison(Serialcomparison value) {
        this.serialcomparison = value;
    }

    /**
     * Gets the value of the interpretationdatastructure property.
     * 
     * @return
     *     possible object is
     *     {@link Interpretationdatastructure }
     *     
     */
    public Interpretationdatastructure getInterpretationdatastructure() {
        return interpretationdatastructure;
    }

    /**
     * Sets the value of the interpretationdatastructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interpretationdatastructure }
     *     
     */
    public void setInterpretationdatastructure(Interpretationdatastructure value) {
        this.interpretationdatastructure = value;
    }

    /**
     * Gets the value of the interpretationmeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link Interpretationmeasurements }
     *     
     */
    public Interpretationmeasurements getInterpretationmeasurements() {
        return interpretationmeasurements;
    }

    /**
     * Sets the value of the interpretationmeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interpretationmeasurements }
     *     
     */
    public void setInterpretationmeasurements(Interpretationmeasurements value) {
        this.interpretationmeasurements = value;
    }

    /**
     * Gets the value of the mdsignatureline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdsignatureline() {
        return mdsignatureline;
    }

    /**
     * Sets the value of the mdsignatureline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdsignatureline(String value) {
        this.mdsignatureline = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Severity }
     *     
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Severity }
     *     
     */
    public void setSeverity(Severity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statement }
     * 
     * 
     */
    public List<Statement> getStatement() {
        if (statement == null) {
            statement = new ArrayList<Statement>();
        }
        return this.statement;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the criteriaversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaversion() {
        return criteriaversion;
    }

    /**
     * Sets the value of the criteriaversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaversion(String value) {
        this.criteriaversion = value;
    }

    /**
     * Gets the value of the criteriaversiondate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCriteriaversiondate() {
        return criteriaversiondate;
    }

    /**
     * Sets the value of the criteriaversiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCriteriaversiondate(XMLGregorianCalendar value) {
        this.criteriaversiondate = value;
    }

    /**
     * Gets the value of the customcriteriaversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomcriteriaversion() {
        return customcriteriaversion;
    }

    /**
     * Sets the value of the customcriteriaversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomcriteriaversion(String value) {
        this.customcriteriaversion = value;
    }

}
