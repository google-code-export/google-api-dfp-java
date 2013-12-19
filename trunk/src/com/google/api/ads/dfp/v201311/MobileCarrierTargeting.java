/**
 * MobileCarrierTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Represents mobile carriers that are being targeted or excluded
 * by the {@link LineItem}.
 */
public class MobileCarrierTargeting  implements java.io.Serializable {
    /* Indicates whether mobile carriers should be targeted or excluded.
     * This
     *                 attribute is optional and defaults to {@code true}. */
    private java.lang.Boolean isTargeted;

    /* Mobile carriers that are being targeted or excluded by the
     *                 {@link LineItem}. */
    private com.google.api.ads.dfp.v201311.Technology[] mobileCarriers;

    public MobileCarrierTargeting() {
    }

    public MobileCarrierTargeting(
           java.lang.Boolean isTargeted,
           com.google.api.ads.dfp.v201311.Technology[] mobileCarriers) {
           this.isTargeted = isTargeted;
           this.mobileCarriers = mobileCarriers;
    }


    /**
     * Gets the isTargeted value for this MobileCarrierTargeting.
     * 
     * @return isTargeted   * Indicates whether mobile carriers should be targeted or excluded.
     * This
     *                 attribute is optional and defaults to {@code true}.
     */
    public java.lang.Boolean getIsTargeted() {
        return isTargeted;
    }


    /**
     * Sets the isTargeted value for this MobileCarrierTargeting.
     * 
     * @param isTargeted   * Indicates whether mobile carriers should be targeted or excluded.
     * This
     *                 attribute is optional and defaults to {@code true}.
     */
    public void setIsTargeted(java.lang.Boolean isTargeted) {
        this.isTargeted = isTargeted;
    }


    /**
     * Gets the mobileCarriers value for this MobileCarrierTargeting.
     * 
     * @return mobileCarriers   * Mobile carriers that are being targeted or excluded by the
     *                 {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201311.Technology[] getMobileCarriers() {
        return mobileCarriers;
    }


    /**
     * Sets the mobileCarriers value for this MobileCarrierTargeting.
     * 
     * @param mobileCarriers   * Mobile carriers that are being targeted or excluded by the
     *                 {@link LineItem}.
     */
    public void setMobileCarriers(com.google.api.ads.dfp.v201311.Technology[] mobileCarriers) {
        this.mobileCarriers = mobileCarriers;
    }

    public com.google.api.ads.dfp.v201311.Technology getMobileCarriers(int i) {
        return this.mobileCarriers[i];
    }

    public void setMobileCarriers(int i, com.google.api.ads.dfp.v201311.Technology _value) {
        this.mobileCarriers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileCarrierTargeting)) return false;
        MobileCarrierTargeting other = (MobileCarrierTargeting) obj;
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
            ((this.mobileCarriers==null && other.getMobileCarriers()==null) || 
             (this.mobileCarriers!=null &&
              java.util.Arrays.equals(this.mobileCarriers, other.getMobileCarriers())));
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
        if (getMobileCarriers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobileCarriers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobileCarriers(), i);
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
        new org.apache.axis.description.TypeDesc(MobileCarrierTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "MobileCarrierTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "isTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCarriers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "mobileCarriers"));
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
