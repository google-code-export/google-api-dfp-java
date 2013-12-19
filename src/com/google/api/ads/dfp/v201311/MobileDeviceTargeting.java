/**
 * MobileDeviceTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Represents mobile devices that are being targeted or excluded by
 * the {@link LineItem}.
 */
public class MobileDeviceTargeting  implements java.io.Serializable {
    /* Mobile devices that are being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201311.Technology[] targetedMobileDevices;

    /* Mobile devices that are being excluded by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201311.Technology[] excludedMobileDevices;

    public MobileDeviceTargeting() {
    }

    public MobileDeviceTargeting(
           com.google.api.ads.dfp.v201311.Technology[] targetedMobileDevices,
           com.google.api.ads.dfp.v201311.Technology[] excludedMobileDevices) {
           this.targetedMobileDevices = targetedMobileDevices;
           this.excludedMobileDevices = excludedMobileDevices;
    }


    /**
     * Gets the targetedMobileDevices value for this MobileDeviceTargeting.
     * 
     * @return targetedMobileDevices   * Mobile devices that are being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201311.Technology[] getTargetedMobileDevices() {
        return targetedMobileDevices;
    }


    /**
     * Sets the targetedMobileDevices value for this MobileDeviceTargeting.
     * 
     * @param targetedMobileDevices   * Mobile devices that are being targeted by the {@link LineItem}.
     */
    public void setTargetedMobileDevices(com.google.api.ads.dfp.v201311.Technology[] targetedMobileDevices) {
        this.targetedMobileDevices = targetedMobileDevices;
    }

    public com.google.api.ads.dfp.v201311.Technology getTargetedMobileDevices(int i) {
        return this.targetedMobileDevices[i];
    }

    public void setTargetedMobileDevices(int i, com.google.api.ads.dfp.v201311.Technology _value) {
        this.targetedMobileDevices[i] = _value;
    }


    /**
     * Gets the excludedMobileDevices value for this MobileDeviceTargeting.
     * 
     * @return excludedMobileDevices   * Mobile devices that are being excluded by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201311.Technology[] getExcludedMobileDevices() {
        return excludedMobileDevices;
    }


    /**
     * Sets the excludedMobileDevices value for this MobileDeviceTargeting.
     * 
     * @param excludedMobileDevices   * Mobile devices that are being excluded by the {@link LineItem}.
     */
    public void setExcludedMobileDevices(com.google.api.ads.dfp.v201311.Technology[] excludedMobileDevices) {
        this.excludedMobileDevices = excludedMobileDevices;
    }

    public com.google.api.ads.dfp.v201311.Technology getExcludedMobileDevices(int i) {
        return this.excludedMobileDevices[i];
    }

    public void setExcludedMobileDevices(int i, com.google.api.ads.dfp.v201311.Technology _value) {
        this.excludedMobileDevices[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileDeviceTargeting)) return false;
        MobileDeviceTargeting other = (MobileDeviceTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedMobileDevices==null && other.getTargetedMobileDevices()==null) || 
             (this.targetedMobileDevices!=null &&
              java.util.Arrays.equals(this.targetedMobileDevices, other.getTargetedMobileDevices()))) &&
            ((this.excludedMobileDevices==null && other.getExcludedMobileDevices()==null) || 
             (this.excludedMobileDevices!=null &&
              java.util.Arrays.equals(this.excludedMobileDevices, other.getExcludedMobileDevices())));
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
        if (getTargetedMobileDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedMobileDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedMobileDevices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedMobileDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedMobileDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedMobileDevices(), i);
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
        new org.apache.axis.description.TypeDesc(MobileDeviceTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "MobileDeviceTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedMobileDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "targetedMobileDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedMobileDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "excludedMobileDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Technology"));
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
