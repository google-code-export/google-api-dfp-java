/**
 * RedirectAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201203;


/**
 * An externally hosted asset.
 */
public abstract class RedirectAsset  extends com.google.api.ads.dfp.v201203.Asset  implements java.io.Serializable {
    /* The URL where the asset is hosted. */
    private java.lang.String redirectUrl;

    public RedirectAsset() {
    }

    public RedirectAsset(
           java.lang.String assetType,
           java.lang.String redirectUrl) {
        super(
            assetType);
        this.redirectUrl = redirectUrl;
    }


    /**
     * Gets the redirectUrl value for this RedirectAsset.
     * 
     * @return redirectUrl   * The URL where the asset is hosted.
     */
    public java.lang.String getRedirectUrl() {
        return redirectUrl;
    }


    /**
     * Sets the redirectUrl value for this RedirectAsset.
     * 
     * @param redirectUrl   * The URL where the asset is hosted.
     */
    public void setRedirectUrl(java.lang.String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RedirectAsset)) return false;
        RedirectAsset other = (RedirectAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.redirectUrl==null && other.getRedirectUrl()==null) || 
             (this.redirectUrl!=null &&
              this.redirectUrl.equals(other.getRedirectUrl())));
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
        if (getRedirectUrl() != null) {
            _hashCode += getRedirectUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RedirectAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "RedirectAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "redirectUrl"));
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
