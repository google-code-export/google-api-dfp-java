/**
 * DeviceCategoryTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Represents device categories that are being targeted or excluded
 * by the {@link LineItem}.
 */
public class DeviceCategoryTargeting  implements java.io.Serializable {
    /* Device categories that are being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201311.Technology[] targetedDeviceCategories;

    /* Device categories that are being excluded by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201311.Technology[] excludedDeviceCategories;

    public DeviceCategoryTargeting() {
    }

    public DeviceCategoryTargeting(
           com.google.api.ads.dfp.v201311.Technology[] targetedDeviceCategories,
           com.google.api.ads.dfp.v201311.Technology[] excludedDeviceCategories) {
           this.targetedDeviceCategories = targetedDeviceCategories;
           this.excludedDeviceCategories = excludedDeviceCategories;
    }


    /**
     * Gets the targetedDeviceCategories value for this DeviceCategoryTargeting.
     * 
     * @return targetedDeviceCategories   * Device categories that are being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201311.Technology[] getTargetedDeviceCategories() {
        return targetedDeviceCategories;
    }


    /**
     * Sets the targetedDeviceCategories value for this DeviceCategoryTargeting.
     * 
     * @param targetedDeviceCategories   * Device categories that are being targeted by the {@link LineItem}.
     */
    public void setTargetedDeviceCategories(com.google.api.ads.dfp.v201311.Technology[] targetedDeviceCategories) {
        this.targetedDeviceCategories = targetedDeviceCategories;
    }

    public com.google.api.ads.dfp.v201311.Technology getTargetedDeviceCategories(int i) {
        return this.targetedDeviceCategories[i];
    }

    public void setTargetedDeviceCategories(int i, com.google.api.ads.dfp.v201311.Technology _value) {
        this.targetedDeviceCategories[i] = _value;
    }


    /**
     * Gets the excludedDeviceCategories value for this DeviceCategoryTargeting.
     * 
     * @return excludedDeviceCategories   * Device categories that are being excluded by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201311.Technology[] getExcludedDeviceCategories() {
        return excludedDeviceCategories;
    }


    /**
     * Sets the excludedDeviceCategories value for this DeviceCategoryTargeting.
     * 
     * @param excludedDeviceCategories   * Device categories that are being excluded by the {@link LineItem}.
     */
    public void setExcludedDeviceCategories(com.google.api.ads.dfp.v201311.Technology[] excludedDeviceCategories) {
        this.excludedDeviceCategories = excludedDeviceCategories;
    }

    public com.google.api.ads.dfp.v201311.Technology getExcludedDeviceCategories(int i) {
        return this.excludedDeviceCategories[i];
    }

    public void setExcludedDeviceCategories(int i, com.google.api.ads.dfp.v201311.Technology _value) {
        this.excludedDeviceCategories[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceCategoryTargeting)) return false;
        DeviceCategoryTargeting other = (DeviceCategoryTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedDeviceCategories==null && other.getTargetedDeviceCategories()==null) || 
             (this.targetedDeviceCategories!=null &&
              java.util.Arrays.equals(this.targetedDeviceCategories, other.getTargetedDeviceCategories()))) &&
            ((this.excludedDeviceCategories==null && other.getExcludedDeviceCategories()==null) || 
             (this.excludedDeviceCategories!=null &&
              java.util.Arrays.equals(this.excludedDeviceCategories, other.getExcludedDeviceCategories())));
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
        if (getTargetedDeviceCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedDeviceCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedDeviceCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedDeviceCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedDeviceCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedDeviceCategories(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceCategoryTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "DeviceCategoryTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedDeviceCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "targetedDeviceCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedDeviceCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "excludedDeviceCategories"));
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
