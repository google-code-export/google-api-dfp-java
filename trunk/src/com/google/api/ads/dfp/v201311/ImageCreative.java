/**
 * ImageCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * A {@code Creative} that displays an image.
 */
public class ImageCreative  extends com.google.api.ads.dfp.v201311.BaseImageCreative  implements java.io.Serializable {
    /* Alternative text to be rendered along with the creative used
     * mainly for accessibility.
     *                     This field is optional and has a maximum length
     * of 500 characters. */
    private java.lang.String altText;

    /* An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters. */
    private java.lang.String thirdPartyImpressionUrl;

    /* The list of secondary image assets associated with this creative.
     * This attribute is optional.
     *                     
     *                     <p>Secondary image assets can be used to store
     * different resolution versions of the
     *                     primary asset for use on non-standard density
     * screens. */
    private com.google.api.ads.dfp.v201311.CreativeAsset[] secondaryImageAssets;

    public ImageCreative() {
    }

    public ImageCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201311.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.v201311.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.v201311.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.v201311.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.Boolean overrideSize,
           com.google.api.ads.dfp.v201311.CreativeAsset primaryImageAsset,
           java.lang.String altText,
           java.lang.String thirdPartyImpressionUrl,
           com.google.api.ads.dfp.v201311.CreativeAsset[] secondaryImageAssets) {
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
            overrideSize,
            primaryImageAsset);
        this.altText = altText;
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
        this.secondaryImageAssets = secondaryImageAssets;
    }


    /**
     * Gets the altText value for this ImageCreative.
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
     * Sets the altText value for this ImageCreative.
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
     * Gets the thirdPartyImpressionUrl value for this ImageCreative.
     * 
     * @return thirdPartyImpressionUrl   * An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters.
     */
    public java.lang.String getThirdPartyImpressionUrl() {
        return thirdPartyImpressionUrl;
    }


    /**
     * Sets the thirdPartyImpressionUrl value for this ImageCreative.
     * 
     * @param thirdPartyImpressionUrl   * An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters.
     */
    public void setThirdPartyImpressionUrl(java.lang.String thirdPartyImpressionUrl) {
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
    }


    /**
     * Gets the secondaryImageAssets value for this ImageCreative.
     * 
     * @return secondaryImageAssets   * The list of secondary image assets associated with this creative.
     * This attribute is optional.
     *                     
     *                     <p>Secondary image assets can be used to store
     * different resolution versions of the
     *                     primary asset for use on non-standard density
     * screens.
     */
    public com.google.api.ads.dfp.v201311.CreativeAsset[] getSecondaryImageAssets() {
        return secondaryImageAssets;
    }


    /**
     * Sets the secondaryImageAssets value for this ImageCreative.
     * 
     * @param secondaryImageAssets   * The list of secondary image assets associated with this creative.
     * This attribute is optional.
     *                     
     *                     <p>Secondary image assets can be used to store
     * different resolution versions of the
     *                     primary asset for use on non-standard density
     * screens.
     */
    public void setSecondaryImageAssets(com.google.api.ads.dfp.v201311.CreativeAsset[] secondaryImageAssets) {
        this.secondaryImageAssets = secondaryImageAssets;
    }

    public com.google.api.ads.dfp.v201311.CreativeAsset getSecondaryImageAssets(int i) {
        return this.secondaryImageAssets[i];
    }

    public void setSecondaryImageAssets(int i, com.google.api.ads.dfp.v201311.CreativeAsset _value) {
        this.secondaryImageAssets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageCreative)) return false;
        ImageCreative other = (ImageCreative) obj;
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
              this.thirdPartyImpressionUrl.equals(other.getThirdPartyImpressionUrl()))) &&
            ((this.secondaryImageAssets==null && other.getSecondaryImageAssets()==null) || 
             (this.secondaryImageAssets!=null &&
              java.util.Arrays.equals(this.secondaryImageAssets, other.getSecondaryImageAssets())));
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
        if (getSecondaryImageAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryImageAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryImageAssets(), i);
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
        new org.apache.axis.description.TypeDesc(ImageCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ImageCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "altText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "thirdPartyImpressionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryImageAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "secondaryImageAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CreativeAsset"));
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
