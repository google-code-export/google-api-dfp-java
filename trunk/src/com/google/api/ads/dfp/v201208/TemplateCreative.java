/**
 * TemplateCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;


/**
 * A {@code Creative} that is created by the specified creative template.
 */
public class TemplateCreative  extends com.google.api.ads.dfp.v201208.Creative  implements java.io.Serializable {
    /* Creative template ID that this creative is created from. */
    private java.lang.Long creativeTemplateId;

    /* {@code true} if this template instantiated creative is interstitial.
     * This attribute is read-only and is assigned by Google based on
     *                     the creative template. */
    private java.lang.Boolean isInterstitial;

    /* Stores values of {@link CreativeTemplateVariable} in the {@link
     * CreativeTemplate}. */
    private com.google.api.ads.dfp.v201208.BaseCreativeTemplateVariableValue[] creativeTemplateVariableValues;

    public TemplateCreative() {
    }

    public TemplateCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201208.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.v201208.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.v201208.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.v201208.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.Long creativeTemplateId,
           java.lang.Boolean isInterstitial,
           com.google.api.ads.dfp.v201208.BaseCreativeTemplateVariableValue[] creativeTemplateVariableValues) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType);
        this.creativeTemplateId = creativeTemplateId;
        this.isInterstitial = isInterstitial;
        this.creativeTemplateVariableValues = creativeTemplateVariableValues;
    }


    /**
     * Gets the creativeTemplateId value for this TemplateCreative.
     * 
     * @return creativeTemplateId   * Creative template ID that this creative is created from.
     */
    public java.lang.Long getCreativeTemplateId() {
        return creativeTemplateId;
    }


    /**
     * Sets the creativeTemplateId value for this TemplateCreative.
     * 
     * @param creativeTemplateId   * Creative template ID that this creative is created from.
     */
    public void setCreativeTemplateId(java.lang.Long creativeTemplateId) {
        this.creativeTemplateId = creativeTemplateId;
    }


    /**
     * Gets the isInterstitial value for this TemplateCreative.
     * 
     * @return isInterstitial   * {@code true} if this template instantiated creative is interstitial.
     * This attribute is read-only and is assigned by Google based on
     *                     the creative template.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this TemplateCreative.
     * 
     * @param isInterstitial   * {@code true} if this template instantiated creative is interstitial.
     * This attribute is read-only and is assigned by Google based on
     *                     the creative template.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the creativeTemplateVariableValues value for this TemplateCreative.
     * 
     * @return creativeTemplateVariableValues   * Stores values of {@link CreativeTemplateVariable} in the {@link
     * CreativeTemplate}.
     */
    public com.google.api.ads.dfp.v201208.BaseCreativeTemplateVariableValue[] getCreativeTemplateVariableValues() {
        return creativeTemplateVariableValues;
    }


    /**
     * Sets the creativeTemplateVariableValues value for this TemplateCreative.
     * 
     * @param creativeTemplateVariableValues   * Stores values of {@link CreativeTemplateVariable} in the {@link
     * CreativeTemplate}.
     */
    public void setCreativeTemplateVariableValues(com.google.api.ads.dfp.v201208.BaseCreativeTemplateVariableValue[] creativeTemplateVariableValues) {
        this.creativeTemplateVariableValues = creativeTemplateVariableValues;
    }

    public com.google.api.ads.dfp.v201208.BaseCreativeTemplateVariableValue getCreativeTemplateVariableValues(int i) {
        return this.creativeTemplateVariableValues[i];
    }

    public void setCreativeTemplateVariableValues(int i, com.google.api.ads.dfp.v201208.BaseCreativeTemplateVariableValue _value) {
        this.creativeTemplateVariableValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateCreative)) return false;
        TemplateCreative other = (TemplateCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creativeTemplateId==null && other.getCreativeTemplateId()==null) || 
             (this.creativeTemplateId!=null &&
              this.creativeTemplateId.equals(other.getCreativeTemplateId()))) &&
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial()))) &&
            ((this.creativeTemplateVariableValues==null && other.getCreativeTemplateVariableValues()==null) || 
             (this.creativeTemplateVariableValues!=null &&
              java.util.Arrays.equals(this.creativeTemplateVariableValues, other.getCreativeTemplateVariableValues())));
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
        if (getCreativeTemplateId() != null) {
            _hashCode += getCreativeTemplateId().hashCode();
        }
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        if (getCreativeTemplateVariableValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeTemplateVariableValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeTemplateVariableValues(), i);
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
        new org.apache.axis.description.TypeDesc(TemplateCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "TemplateCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "creativeTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInterstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "isInterstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTemplateVariableValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "creativeTemplateVariableValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "BaseCreativeTemplateVariableValue"));
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
