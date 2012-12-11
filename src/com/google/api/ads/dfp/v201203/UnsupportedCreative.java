/**
 * UnsupportedCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201203;


/**
 * A {@code Creative} that isn't supported by this version of the
 * API.
 *             This object is readonly and when encountered should be
 * reported
 *             on the DFP API forum.
 */
public class UnsupportedCreative  extends com.google.api.ads.dfp.v201203.Creative  implements java.io.Serializable {
    /* The creative type that is unsupported by this API version. */
    private java.lang.String unsupportedCreativeType;

    public UnsupportedCreative() {
    }

    public UnsupportedCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201203.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.v201203.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.v201203.DateTime lastModifiedDateTime,
           java.lang.String creativeType,
           java.lang.String unsupportedCreativeType) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            creativeType);
        this.unsupportedCreativeType = unsupportedCreativeType;
    }


    /**
     * Gets the unsupportedCreativeType value for this UnsupportedCreative.
     * 
     * @return unsupportedCreativeType   * The creative type that is unsupported by this API version.
     */
    public java.lang.String getUnsupportedCreativeType() {
        return unsupportedCreativeType;
    }


    /**
     * Sets the unsupportedCreativeType value for this UnsupportedCreative.
     * 
     * @param unsupportedCreativeType   * The creative type that is unsupported by this API version.
     */
    public void setUnsupportedCreativeType(java.lang.String unsupportedCreativeType) {
        this.unsupportedCreativeType = unsupportedCreativeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnsupportedCreative)) return false;
        UnsupportedCreative other = (UnsupportedCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.unsupportedCreativeType==null && other.getUnsupportedCreativeType()==null) || 
             (this.unsupportedCreativeType!=null &&
              this.unsupportedCreativeType.equals(other.getUnsupportedCreativeType())));
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
        if (getUnsupportedCreativeType() != null) {
            _hashCode += getUnsupportedCreativeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnsupportedCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "UnsupportedCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsupportedCreativeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "unsupportedCreativeType"));
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
