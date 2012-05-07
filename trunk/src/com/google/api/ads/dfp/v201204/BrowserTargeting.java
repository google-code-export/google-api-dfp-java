/**
 * BrowserTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201204;


/**
 * Represents browsers that are being targeted or excluded by the
 *             {@link LineItem}.
 */
public class BrowserTargeting  implements java.io.Serializable {
    /* Indicates whether browsers should be targeted or excluded.
     * This attribute
     *                 is optional and defaults to {@code true}. */
    private java.lang.Boolean isTargeted;

    /* Browsers that are being targeted or excluded by the {@link
     * LineItem}. */
    private com.google.api.ads.dfp.v201204.Technology[] browsers;

    public BrowserTargeting() {
    }

    public BrowserTargeting(
           java.lang.Boolean isTargeted,
           com.google.api.ads.dfp.v201204.Technology[] browsers) {
           this.isTargeted = isTargeted;
           this.browsers = browsers;
    }


    /**
     * Gets the isTargeted value for this BrowserTargeting.
     * 
     * @return isTargeted   * Indicates whether browsers should be targeted or excluded.
     * This attribute
     *                 is optional and defaults to {@code true}.
     */
    public java.lang.Boolean getIsTargeted() {
        return isTargeted;
    }


    /**
     * Sets the isTargeted value for this BrowserTargeting.
     * 
     * @param isTargeted   * Indicates whether browsers should be targeted or excluded.
     * This attribute
     *                 is optional and defaults to {@code true}.
     */
    public void setIsTargeted(java.lang.Boolean isTargeted) {
        this.isTargeted = isTargeted;
    }


    /**
     * Gets the browsers value for this BrowserTargeting.
     * 
     * @return browsers   * Browsers that are being targeted or excluded by the {@link
     * LineItem}.
     */
    public com.google.api.ads.dfp.v201204.Technology[] getBrowsers() {
        return browsers;
    }


    /**
     * Sets the browsers value for this BrowserTargeting.
     * 
     * @param browsers   * Browsers that are being targeted or excluded by the {@link
     * LineItem}.
     */
    public void setBrowsers(com.google.api.ads.dfp.v201204.Technology[] browsers) {
        this.browsers = browsers;
    }

    public com.google.api.ads.dfp.v201204.Technology getBrowsers(int i) {
        return this.browsers[i];
    }

    public void setBrowsers(int i, com.google.api.ads.dfp.v201204.Technology _value) {
        this.browsers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowserTargeting)) return false;
        BrowserTargeting other = (BrowserTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isTargeted==null && other.getIsTargeted()==null) || 
             (this.isTargeted!=null &&
              this.isTargeted.equals(other.getIsTargeted()))) &&
            ((this.browsers==null && other.getBrowsers()==null) || 
             (this.browsers!=null &&
              java.util.Arrays.equals(this.browsers, other.getBrowsers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIsTargeted() != null) {
            _hashCode += getIsTargeted().hashCode();
        }
        if (getBrowsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrowsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrowsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrowserTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "BrowserTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "isTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browsers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "browsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
