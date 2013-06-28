/**
 * FlashCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * A {@code Creative} that displays a Flash-based ad. If the Flash
 * ad cannot
 *             load, a fallback image is displayed instead.
 */
public class FlashCreative  extends com.google.api.ads.dfp.v201306.BaseFlashCreative  implements java.io.Serializable {
    /* A Swiffy asset that can be used as a fallback for this flash
     * creative.
     *                     This attribute is readonly. */
    private com.google.api.ads.dfp.v201306.SwiffyFallbackAsset swiffyAsset;

    /* Enables Swiffy fallback asset creation and serving.
     *                     
     *                     <p>If {@code true} during creation or update,
     * the flash asset will be converted to
     *                     a {@link #swiffyAsset Swiffy asset}. If successful,
     * the Swiffy asset will be used
     *                     for ad serving, which may lead to additional latency.
     * 
     *                     <p>To remove the swiffy asset, set this attribute
     * to {@code false} and
     *                     update the {@link #flashByteArray flash asset}.
     * 
     *                     <p>This attribute is optional and defaults to
     * false. */
    private java.lang.Boolean createSwiffyAsset;

    public FlashCreative() {
    }

    public FlashCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201306.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.v201306.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.v201306.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.v201306.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.String flashName,
           byte[] flashByteArray,
           java.lang.String fallbackImageName,
           byte[] fallbackImageByteArray,
           java.lang.Boolean overrideSize,
           java.lang.Boolean clickTagRequired,
           java.lang.String fallbackPreviewUrl,
           com.google.api.ads.dfp.v201306.Size flashAssetSize,
           com.google.api.ads.dfp.v201306.Size fallbackAssetSize,
           com.google.api.ads.dfp.v201306.SwiffyFallbackAsset swiffyAsset,
           java.lang.Boolean createSwiffyAsset) {
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
            destinationUrl,
            flashName,
            flashByteArray,
            fallbackImageName,
            fallbackImageByteArray,
            overrideSize,
            clickTagRequired,
            fallbackPreviewUrl,
            flashAssetSize,
            fallbackAssetSize);
        this.swiffyAsset = swiffyAsset;
        this.createSwiffyAsset = createSwiffyAsset;
    }


    /**
     * Gets the swiffyAsset value for this FlashCreative.
     * 
     * @return swiffyAsset   * A Swiffy asset that can be used as a fallback for this flash
     * creative.
     *                     This attribute is readonly.
     */
    public com.google.api.ads.dfp.v201306.SwiffyFallbackAsset getSwiffyAsset() {
        return swiffyAsset;
    }


    /**
     * Sets the swiffyAsset value for this FlashCreative.
     * 
     * @param swiffyAsset   * A Swiffy asset that can be used as a fallback for this flash
     * creative.
     *                     This attribute is readonly.
     */
    public void setSwiffyAsset(com.google.api.ads.dfp.v201306.SwiffyFallbackAsset swiffyAsset) {
        this.swiffyAsset = swiffyAsset;
    }


    /**
     * Gets the createSwiffyAsset value for this FlashCreative.
     * 
     * @return createSwiffyAsset   * Enables Swiffy fallback asset creation and serving.
     *                     
     *                     <p>If {@code true} during creation or update,
     * the flash asset will be converted to
     *                     a {@link #swiffyAsset Swiffy asset}. If successful,
     * the Swiffy asset will be used
     *                     for ad serving, which may lead to additional latency.
     * 
     *                     <p>To remove the swiffy asset, set this attribute
     * to {@code false} and
     *                     update the {@link #flashByteArray flash asset}.
     * 
     *                     <p>This attribute is optional and defaults to
     * false.
     */
    public java.lang.Boolean getCreateSwiffyAsset() {
        return createSwiffyAsset;
    }


    /**
     * Sets the createSwiffyAsset value for this FlashCreative.
     * 
     * @param createSwiffyAsset   * Enables Swiffy fallback asset creation and serving.
     *                     
     *                     <p>If {@code true} during creation or update,
     * the flash asset will be converted to
     *                     a {@link #swiffyAsset Swiffy asset}. If successful,
     * the Swiffy asset will be used
     *                     for ad serving, which may lead to additional latency.
     * 
     *                     <p>To remove the swiffy asset, set this attribute
     * to {@code false} and
     *                     update the {@link #flashByteArray flash asset}.
     * 
     *                     <p>This attribute is optional and defaults to
     * false.
     */
    public void setCreateSwiffyAsset(java.lang.Boolean createSwiffyAsset) {
        this.createSwiffyAsset = createSwiffyAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlashCreative)) return false;
        FlashCreative other = (FlashCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.swiffyAsset==null && other.getSwiffyAsset()==null) || 
             (this.swiffyAsset!=null &&
              this.swiffyAsset.equals(other.getSwiffyAsset()))) &&
            ((this.createSwiffyAsset==null && other.getCreateSwiffyAsset()==null) || 
             (this.createSwiffyAsset!=null &&
              this.createSwiffyAsset.equals(other.getCreateSwiffyAsset())));
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
        if (getSwiffyAsset() != null) {
            _hashCode += getSwiffyAsset().hashCode();
        }
        if (getCreateSwiffyAsset() != null) {
            _hashCode += getCreateSwiffyAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlashCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FlashCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swiffyAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "swiffyAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "SwiffyFallbackAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createSwiffyAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "createSwiffyAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
