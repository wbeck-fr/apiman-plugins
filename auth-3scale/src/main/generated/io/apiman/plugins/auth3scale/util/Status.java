//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.06.07 at 11:25:26 PM BST
//


package io.apiman.plugins.auth3scale.util;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
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
 *         &lt;element ref="{}authorized"/>
 *         &lt;element ref="{}reason"/>
 *         &lt;element ref="{}plan"/>
 *         &lt;element name="usage_reports">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}usage_report" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "authorized",
    "reason",
    "plan",
    "usageReports"
})
@XmlRootElement(name = "status")
public class Status {

    protected boolean authorized;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected String plan;
    @XmlElementWrapper(name = "usage_reports", required = true)
    @XmlElement(name="usage_report")
    protected List<UsageReport> usageReports;

    /**
     * Gets the value of the authorized property.
     *
     */
    public boolean isAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     *
     */
    public void setAuthorized(boolean value) {
        this.authorized = value;
    }

    /**
     * Gets the value of the reason property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the plan property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlan(String value) {
        this.plan = value;
    }

    /**
     * Gets the value of the usageReports property.
     *
     * @return
     *     possible object is
     *     {@link Status.UsageReports }
     *
     */
    public List<UsageReport> getUsageReports() {
        if (usageReports == null)
            return Collections.emptyList();
        return usageReports;
    }

    /**
     * Sets the value of the usageReports property.
     *
     * @param value
     *     allowed object is
     *     {@link Status.UsageReports }
     *
     */
    public void setUsageReports(List<UsageReport> value) {
        this.usageReports = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final int maxLen = 10;
        return String.format("Status [authorized=%s, reason=%s, plan=%s, usageReports=%s]", authorized, reason, plan, //$NON-NLS-1$
                usageReports != null ? usageReports.subList(0, Math.min(usageReports.size(), maxLen)) : null);
    }
}