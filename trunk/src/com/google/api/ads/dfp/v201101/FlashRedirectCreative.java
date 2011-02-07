/**
 * FlashRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201101;


/**
 * A {@code Creative} that loads a Flash asset from a specified URL.
 * If the
 *             remote flash asset cannot be served, a fallback image
 * is used at an alternate
 *             URL.
 */
public class FlashRedirectCreative  extends com.google.api.ads.dfp.v201101.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The URL where the Flash asset resides. This attribute is required
     * and has a
     *                     maximum length of 1024 characters. */
    private java.lang.String flashUrl;

    /* The fallback URL to use if the Flash URL cannot be used. This
     * attribute is
     *                     required and has a maximum length of 1024 characters. */
    private java.lang.String fallbackUrl;

    /* The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google. */
    private java.lang.String fallbackPreviewUrl;

    public FlashRedirectCreative() {
    }

    public FlashRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201101.Size size,
           java.lang.String previewUrl,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.String flashUrl,
           java.lang.String fallbackUrl,
           java.lang.String fallbackPreviewUrl) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            creativeType,
            destinationUrl);
        this.flashUrl = flashUrl;
        this.fallbackUrl = fallbackUrl;
        this.fallbackPreviewUrl = fallbackPreviewUrl;
    }


    /**
     * Gets the flashUrl value for this FlashRedirectCreative.
     * 
     * @return flashUrl   * The URL where the Flash asset resides. This attribute is required
     * and has a
     *                     maximum length of 1024 characters.
     */
    public java.lang.String getFlashUrl() {
        return flashUrl;
    }


    /**
     * Sets the flashUrl value for this FlashRedirectCreative.
     * 
     * @param flashUrl   * The URL where the Flash asset resides. This attribute is required
     * and has a
     *                     maximum length of 1024 characters.
     */
    public void setFlashUrl(java.lang.String flashUrl) {
        this.flashUrl = flashUrl;
    }


    /**
     * Gets the fallbackUrl value for this FlashRedirectCreative.
     * 
     * @return fallbackUrl   * The fallback URL to use if the Flash URL cannot be used. This
     * attribute is
     *                     required and has a maximum length of 1024 characters.
     */
    public java.lang.String getFallbackUrl() {
        return fallbackUrl;
    }


    /**
     * Sets the fallbackUrl value for this FlashRedirectCreative.
     * 
     * @param fallbackUrl   * The fallback URL to use if the Flash URL cannot be used. This
     * attribute is
     *                     required and has a maximum length of 1024 characters.
     */
    public void setFallbackUrl(java.lang.String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }


    /**
     * Gets the fallbackPreviewUrl value for this FlashRedirectCreative.
     * 
     * @return fallbackPreviewUrl   * The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google.
     */
    public java.lang.String getFallbackPreviewUrl() {
        return fallbackPreviewUrl;
    }


    /**
     * Sets the fallbackPreviewUrl value for this FlashRedirectCreative.
     * 
     * @param fallbackPreviewUrl   * The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google.
     */
    public void setFallbackPreviewUrl(java.lang.String fallbackPreviewUrl) {
        this.fallbackPreviewUrl = fallbackPreviewUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlashRedirectCreative)) return false;
        FlashRedirectCreative other = (FlashRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flashUrl==null && other.getFlashUrl()==null) || 
             (this.flashUrl!=null &&
              this.flashUrl.equals(other.getFlashUrl()))) &&
            ((this.fallbackUrl==null && other.getFallbackUrl()==null) || 
             (this.fallbackUrl!=null &&
              this.fallbackUrl.equals(other.getFallbackUrl()))) &&
            ((this.fallbackPreviewUrl==null && other.getFallbackPreviewUrl()==null) || 
             (this.fallbackPreviewUrl!=null &&
              this.fallbackPreviewUrl.equals(other.getFallbackPreviewUrl())));
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
        if (getFlashUrl() != null) {
            _hashCode += getFlashUrl().hashCode();
        }
        if (getFallbackUrl() != null) {
            _hashCode += getFallbackUrl().hashCode();
        }
        if (getFallbackPreviewUrl() != null) {
            _hashCode += getFallbackPreviewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlashRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "FlashRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "flashUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "fallbackUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "fallbackPreviewUrl"));
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
