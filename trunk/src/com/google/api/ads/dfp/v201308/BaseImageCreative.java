/**
 * BaseImageCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * The base type for creatives that display an image.
 */
public abstract class BaseImageCreative  extends com.google.api.ads.dfp.v201308.HasDestinationUrlCreative  implements java.io.Serializable {
    /* Allows the creative size to differ from the actual image asset
     * size. This
     *                     attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* The primary image asset associated with this creative. This
     * attribute is required. */
    private com.google.api.ads.dfp.v201308.CreativeAsset primaryImageAsset;

    public BaseImageCreative() {
    }

    public BaseImageCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201308.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.v201308.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.v201308.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.v201308.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.Boolean overrideSize,
           com.google.api.ads.dfp.v201308.CreativeAsset primaryImageAsset) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType,
            destinationUrl);
        this.overrideSize = overrideSize;
        this.primaryImageAsset = primaryImageAsset;
    }


    /**
     * Gets the overrideSize value for this BaseImageCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual image asset
     * size. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this BaseImageCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual image asset
     * size. This
     *                     attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the primaryImageAsset value for this BaseImageCreative.
     * 
     * @return primaryImageAsset   * The primary image asset associated with this creative. This
     * attribute is required.
     */
    public com.google.api.ads.dfp.v201308.CreativeAsset getPrimaryImageAsset() {
        return primaryImageAsset;
    }


    /**
     * Sets the primaryImageAsset value for this BaseImageCreative.
     * 
     * @param primaryImageAsset   * The primary image asset associated with this creative. This
     * attribute is required.
     */
    public void setPrimaryImageAsset(com.google.api.ads.dfp.v201308.CreativeAsset primaryImageAsset) {
        this.primaryImageAsset = primaryImageAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseImageCreative)) return false;
        BaseImageCreative other = (BaseImageCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.primaryImageAsset==null && other.getPrimaryImageAsset()==null) || 
             (this.primaryImageAsset!=null &&
              this.primaryImageAsset.equals(other.getPrimaryImageAsset())));
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
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        if (getPrimaryImageAsset() != null) {
            _hashCode += getPrimaryImageAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseImageCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "BaseImageCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryImageAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "primaryImageAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CreativeAsset"));
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
