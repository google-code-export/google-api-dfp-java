/**
 * ImageRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * A {@code Creative} that loads an image asset from a specified URL.
 */
public class ImageRedirectCreative  extends com.google.api.ads.dfp.v201306.BaseImageRedirectCreative  implements java.io.Serializable {
    /* Alternative text to be rendered along with the creative used
     * mainly for accessibility.
     *                     This field is optional and has a maximum length
     * of 500 characters. */
    private java.lang.String altText;

    /* An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters. */
    private java.lang.String thirdPartyImpressionUrl;

    public ImageRedirectCreative() {
    }

    public ImageRedirectCreative(
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
           java.lang.String imageUrl,
           java.lang.String altText,
           java.lang.String thirdPartyImpressionUrl) {
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
            imageUrl);
        this.altText = altText;
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
    }


    /**
     * Gets the altText value for this ImageRedirectCreative.
     * 
     * @return altText   * Alternative text to be rendered along with the creative used
     * mainly for accessibility.
     *                     This field is optional and has a maximum length
     * of 500 characters.
     */
    public java.lang.String getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this ImageRedirectCreative.
     * 
     * @param altText   * Alternative text to be rendered along with the creative used
     * mainly for accessibility.
     *                     This field is optional and has a maximum length
     * of 500 characters.
     */
    public void setAltText(java.lang.String altText) {
        this.altText = altText;
    }


    /**
     * Gets the thirdPartyImpressionUrl value for this ImageRedirectCreative.
     * 
     * @return thirdPartyImpressionUrl   * An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters.
     */
    public java.lang.String getThirdPartyImpressionUrl() {
        return thirdPartyImpressionUrl;
    }


    /**
     * Sets the thirdPartyImpressionUrl value for this ImageRedirectCreative.
     * 
     * @param thirdPartyImpressionUrl   * An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters.
     */
    public void setThirdPartyImpressionUrl(java.lang.String thirdPartyImpressionUrl) {
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageRedirectCreative)) return false;
        ImageRedirectCreative other = (ImageRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
            ((this.thirdPartyImpressionUrl==null && other.getThirdPartyImpressionUrl()==null) || 
             (this.thirdPartyImpressionUrl!=null &&
              this.thirdPartyImpressionUrl.equals(other.getThirdPartyImpressionUrl())));
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
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
        }
        if (getThirdPartyImpressionUrl() != null) {
            _hashCode += getThirdPartyImpressionUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ImageRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "altText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "thirdPartyImpressionUrl"));
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
