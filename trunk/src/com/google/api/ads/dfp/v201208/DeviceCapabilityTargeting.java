/**
 * DeviceCapabilityTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;


/**
 * Represents device capabilities that are being targeted or excluded
 * by the {@link LineItem}.
 */
public class DeviceCapabilityTargeting  implements java.io.Serializable {
    /* Device capabilities that are being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201208.Technology[] targetedDeviceCapabilities;

    /* Device capabilities that are being excluded by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201208.Technology[] excludedDeviceCapabilities;

    public DeviceCapabilityTargeting() {
    }

    public DeviceCapabilityTargeting(
           com.google.api.ads.dfp.v201208.Technology[] targetedDeviceCapabilities,
           com.google.api.ads.dfp.v201208.Technology[] excludedDeviceCapabilities) {
           this.targetedDeviceCapabilities = targetedDeviceCapabilities;
           this.excludedDeviceCapabilities = excludedDeviceCapabilities;
    }


    /**
     * Gets the targetedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @return targetedDeviceCapabilities   * Device capabilities that are being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201208.Technology[] getTargetedDeviceCapabilities() {
        return targetedDeviceCapabilities;
    }


    /**
     * Sets the targetedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @param targetedDeviceCapabilities   * Device capabilities that are being targeted by the {@link LineItem}.
     */
    public void setTargetedDeviceCapabilities(com.google.api.ads.dfp.v201208.Technology[] targetedDeviceCapabilities) {
        this.targetedDeviceCapabilities = targetedDeviceCapabilities;
    }

    public com.google.api.ads.dfp.v201208.Technology getTargetedDeviceCapabilities(int i) {
        return this.targetedDeviceCapabilities[i];
    }

    public void setTargetedDeviceCapabilities(int i, com.google.api.ads.dfp.v201208.Technology _value) {
        this.targetedDeviceCapabilities[i] = _value;
    }


    /**
     * Gets the excludedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @return excludedDeviceCapabilities   * Device capabilities that are being excluded by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201208.Technology[] getExcludedDeviceCapabilities() {
        return excludedDeviceCapabilities;
    }


    /**
     * Sets the excludedDeviceCapabilities value for this DeviceCapabilityTargeting.
     * 
     * @param excludedDeviceCapabilities   * Device capabilities that are being excluded by the {@link LineItem}.
     */
    public void setExcludedDeviceCapabilities(com.google.api.ads.dfp.v201208.Technology[] excludedDeviceCapabilities) {
        this.excludedDeviceCapabilities = excludedDeviceCapabilities;
    }

    public com.google.api.ads.dfp.v201208.Technology getExcludedDeviceCapabilities(int i) {
        return this.excludedDeviceCapabilities[i];
    }

    public void setExcludedDeviceCapabilities(int i, com.google.api.ads.dfp.v201208.Technology _value) {
        this.excludedDeviceCapabilities[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceCapabilityTargeting)) return false;
        DeviceCapabilityTargeting other = (DeviceCapabilityTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedDeviceCapabilities==null && other.getTargetedDeviceCapabilities()==null) || 
             (this.targetedDeviceCapabilities!=null &&
              java.util.Arrays.equals(this.targetedDeviceCapabilities, other.getTargetedDeviceCapabilities()))) &&
            ((this.excludedDeviceCapabilities==null && other.getExcludedDeviceCapabilities()==null) || 
             (this.excludedDeviceCapabilities!=null &&
              java.util.Arrays.equals(this.excludedDeviceCapabilities, other.getExcludedDeviceCapabilities())));
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
        if (getTargetedDeviceCapabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedDeviceCapabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedDeviceCapabilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedDeviceCapabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedDeviceCapabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedDeviceCapabilities(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceCapabilityTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "DeviceCapabilityTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedDeviceCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "targetedDeviceCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedDeviceCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "excludedDeviceCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "Technology"));
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
