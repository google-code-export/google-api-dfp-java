/**
 * BaseDynamicAllocationCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;


/**
 * A base class for dynamic allocation creatives.
 */
public abstract class BaseDynamicAllocationCreative  extends com.google.api.ads.dfp.v201211.Creative  implements java.io.Serializable {
    /* The code snippet (ad tag) from Ad Exchange or AdSense to traffic
     * the dynamic allocation
     *                     creative. Only valid Ad Exchange or AdSense parameters
     * will be considered. Any extraneous HTML
     *                     or JavaScript will be ignored. */
    private java.lang.String codeSnippet;

    public BaseDynamicAllocationCreative() {
    }

    public BaseDynamicAllocationCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201211.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.v201211.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.v201211.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.v201211.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String codeSnippet) {
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
        this.codeSnippet = codeSnippet;
    }


    /**
     * Gets the codeSnippet value for this BaseDynamicAllocationCreative.
     * 
     * @return codeSnippet   * The code snippet (ad tag) from Ad Exchange or AdSense to traffic
     * the dynamic allocation
     *                     creative. Only valid Ad Exchange or AdSense parameters
     * will be considered. Any extraneous HTML
     *                     or JavaScript will be ignored.
     */
    public java.lang.String getCodeSnippet() {
        return codeSnippet;
    }


    /**
     * Sets the codeSnippet value for this BaseDynamicAllocationCreative.
     * 
     * @param codeSnippet   * The code snippet (ad tag) from Ad Exchange or AdSense to traffic
     * the dynamic allocation
     *                     creative. Only valid Ad Exchange or AdSense parameters
     * will be considered. Any extraneous HTML
     *                     or JavaScript will be ignored.
     */
    public void setCodeSnippet(java.lang.String codeSnippet) {
        this.codeSnippet = codeSnippet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseDynamicAllocationCreative)) return false;
        BaseDynamicAllocationCreative other = (BaseDynamicAllocationCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codeSnippet==null && other.getCodeSnippet()==null) || 
             (this.codeSnippet!=null &&
              this.codeSnippet.equals(other.getCodeSnippet())));
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
        if (getCodeSnippet() != null) {
            _hashCode += getCodeSnippet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseDynamicAllocationCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "BaseDynamicAllocationCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "codeSnippet"));
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
