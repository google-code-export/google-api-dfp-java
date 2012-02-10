/**
 * Browser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;


/**
 * Represents an internet browser.
 */
public class Browser  extends com.google.api.ads.dfp.v201201.Technology  implements java.io.Serializable {
    /* Browser major version. */
    private java.lang.String majorVersion;

    /* Browser minor version. */
    private java.lang.String minorVersion;

    public Browser() {
    }

    public Browser(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String technologyType,
           java.lang.String majorVersion,
           java.lang.String minorVersion) {
        super(
            id,
            name,
            technologyType);
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the majorVersion value for this Browser.
     * 
     * @return majorVersion   * Browser major version.
     */
    public java.lang.String getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this Browser.
     * 
     * @param majorVersion   * Browser major version.
     */
    public void setMajorVersion(java.lang.String majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this Browser.
     * 
     * @return minorVersion   * Browser minor version.
     */
    public java.lang.String getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this Browser.
     * 
     * @param minorVersion   * Browser minor version.
     */
    public void setMinorVersion(java.lang.String minorVersion) {
        this.minorVersion = minorVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Browser)) return false;
        Browser other = (Browser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion()))) &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Browser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "Browser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "minorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
