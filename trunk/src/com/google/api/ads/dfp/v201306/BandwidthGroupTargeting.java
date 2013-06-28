/**
 * BandwidthGroupTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * Represents bandwidth groups that are being targeted or excluded
 * by the
 *             {@link LineItem}.
 */
public class BandwidthGroupTargeting  implements java.io.Serializable {
    /* Indicates whether bandwidth groups should be targeted or excluded.
     * This
     *                 attribute is optional and defaults to {@code true}. */
    private java.lang.Boolean isTargeted;

    /* The bandwidth groups that are being targeted or excluded by
     * the
     *                 {@link LineItem}. */
    private com.google.api.ads.dfp.v201306.Technology[] bandwidthGroups;

    public BandwidthGroupTargeting() {
    }

    public BandwidthGroupTargeting(
           java.lang.Boolean isTargeted,
           com.google.api.ads.dfp.v201306.Technology[] bandwidthGroups) {
           this.isTargeted = isTargeted;
           this.bandwidthGroups = bandwidthGroups;
    }


    /**
     * Gets the isTargeted value for this BandwidthGroupTargeting.
     * 
     * @return isTargeted   * Indicates whether bandwidth groups should be targeted or excluded.
     * This
     *                 attribute is optional and defaults to {@code true}.
     */
    public java.lang.Boolean getIsTargeted() {
        return isTargeted;
    }


    /**
     * Sets the isTargeted value for this BandwidthGroupTargeting.
     * 
     * @param isTargeted   * Indicates whether bandwidth groups should be targeted or excluded.
     * This
     *                 attribute is optional and defaults to {@code true}.
     */
    public void setIsTargeted(java.lang.Boolean isTargeted) {
        this.isTargeted = isTargeted;
    }


    /**
     * Gets the bandwidthGroups value for this BandwidthGroupTargeting.
     * 
     * @return bandwidthGroups   * The bandwidth groups that are being targeted or excluded by
     * the
     *                 {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201306.Technology[] getBandwidthGroups() {
        return bandwidthGroups;
    }


    /**
     * Sets the bandwidthGroups value for this BandwidthGroupTargeting.
     * 
     * @param bandwidthGroups   * The bandwidth groups that are being targeted or excluded by
     * the
     *                 {@link LineItem}.
     */
    public void setBandwidthGroups(com.google.api.ads.dfp.v201306.Technology[] bandwidthGroups) {
        this.bandwidthGroups = bandwidthGroups;
    }

    public com.google.api.ads.dfp.v201306.Technology getBandwidthGroups(int i) {
        return this.bandwidthGroups[i];
    }

    public void setBandwidthGroups(int i, com.google.api.ads.dfp.v201306.Technology _value) {
        this.bandwidthGroups[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BandwidthGroupTargeting)) return false;
        BandwidthGroupTargeting other = (BandwidthGroupTargeting) obj;
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
            ((this.bandwidthGroups==null && other.getBandwidthGroups()==null) || 
             (this.bandwidthGroups!=null &&
              java.util.Arrays.equals(this.bandwidthGroups, other.getBandwidthGroups())));
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
        if (getBandwidthGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBandwidthGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBandwidthGroups(), i);
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
        new org.apache.axis.description.TypeDesc(BandwidthGroupTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BandwidthGroupTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "isTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "bandwidthGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Technology"));
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
