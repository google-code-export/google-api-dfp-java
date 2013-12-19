/**
 * CustomTargetingRateCardFeature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * A rate customization applied to custom criteria targeting.
 */
public class CustomTargetingRateCardFeature  extends com.google.api.ads.dfp.v201311.RateCardFeature  implements java.io.Serializable {
    /* The ID of the {@link CustomTargetingKey}.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation. */
    private java.lang.Long customTargetingKeyId;

    /* The ID of the {@link CustomTargetingValue}. {@code null} if
     * all custom
     *                     targeting values of the {@link #customTargetingKeyId}
     * shoule be matched.
     *                     
     *                     This attribute cannot be changed after creation. */
    private java.lang.Long customTargetingValueId;

    public CustomTargetingRateCardFeature() {
    }

    public CustomTargetingRateCardFeature(
           java.lang.String rateCardFeatureType,
           java.lang.Long customTargetingKeyId,
           java.lang.Long customTargetingValueId) {
        super(
            rateCardFeatureType);
        this.customTargetingKeyId = customTargetingKeyId;
        this.customTargetingValueId = customTargetingValueId;
    }


    /**
     * Gets the customTargetingKeyId value for this CustomTargetingRateCardFeature.
     * 
     * @return customTargetingKeyId   * The ID of the {@link CustomTargetingKey}.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public java.lang.Long getCustomTargetingKeyId() {
        return customTargetingKeyId;
    }


    /**
     * Sets the customTargetingKeyId value for this CustomTargetingRateCardFeature.
     * 
     * @param customTargetingKeyId   * The ID of the {@link CustomTargetingKey}.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public void setCustomTargetingKeyId(java.lang.Long customTargetingKeyId) {
        this.customTargetingKeyId = customTargetingKeyId;
    }


    /**
     * Gets the customTargetingValueId value for this CustomTargetingRateCardFeature.
     * 
     * @return customTargetingValueId   * The ID of the {@link CustomTargetingValue}. {@code null} if
     * all custom
     *                     targeting values of the {@link #customTargetingKeyId}
     * shoule be matched.
     *                     
     *                     This attribute cannot be changed after creation.
     */
    public java.lang.Long getCustomTargetingValueId() {
        return customTargetingValueId;
    }


    /**
     * Sets the customTargetingValueId value for this CustomTargetingRateCardFeature.
     * 
     * @param customTargetingValueId   * The ID of the {@link CustomTargetingValue}. {@code null} if
     * all custom
     *                     targeting values of the {@link #customTargetingKeyId}
     * shoule be matched.
     *                     
     *                     This attribute cannot be changed after creation.
     */
    public void setCustomTargetingValueId(java.lang.Long customTargetingValueId) {
        this.customTargetingValueId = customTargetingValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTargetingRateCardFeature)) return false;
        CustomTargetingRateCardFeature other = (CustomTargetingRateCardFeature) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customTargetingKeyId==null && other.getCustomTargetingKeyId()==null) || 
             (this.customTargetingKeyId!=null &&
              this.customTargetingKeyId.equals(other.getCustomTargetingKeyId()))) &&
            ((this.customTargetingValueId==null && other.getCustomTargetingValueId()==null) || 
             (this.customTargetingValueId!=null &&
              this.customTargetingValueId.equals(other.getCustomTargetingValueId())));
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
        if (getCustomTargetingKeyId() != null) {
            _hashCode += getCustomTargetingKeyId().hashCode();
        }
        if (getCustomTargetingValueId() != null) {
            _hashCode += getCustomTargetingValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomTargetingRateCardFeature.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CustomTargetingRateCardFeature"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "customTargetingKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "customTargetingValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
