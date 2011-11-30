/**
 * ContentTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201111;


/**
 * Used to target {@link LineItem}s to specific videos on a publisher's
 * site.
 */
public class ContentTargeting  implements java.io.Serializable {
    /* The IDs of content being targeted by the {@code LineItem}. */
    private long[] targetedContentIds;

    public ContentTargeting() {
    }

    public ContentTargeting(
           long[] targetedContentIds) {
           this.targetedContentIds = targetedContentIds;
    }


    /**
     * Gets the targetedContentIds value for this ContentTargeting.
     * 
     * @return targetedContentIds   * The IDs of content being targeted by the {@code LineItem}.
     */
    public long[] getTargetedContentIds() {
        return targetedContentIds;
    }


    /**
     * Sets the targetedContentIds value for this ContentTargeting.
     * 
     * @param targetedContentIds   * The IDs of content being targeted by the {@code LineItem}.
     */
    public void setTargetedContentIds(long[] targetedContentIds) {
        this.targetedContentIds = targetedContentIds;
    }

    public long getTargetedContentIds(int i) {
        return this.targetedContentIds[i];
    }

    public void setTargetedContentIds(int i, long _value) {
        this.targetedContentIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentTargeting)) return false;
        ContentTargeting other = (ContentTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedContentIds==null && other.getTargetedContentIds()==null) || 
             (this.targetedContentIds!=null &&
              java.util.Arrays.equals(this.targetedContentIds, other.getTargetedContentIds())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTargetedContentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedContentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedContentIds(), i);
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
        new org.apache.axis.description.TypeDesc(ContentTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "ContentTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedContentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "targetedContentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
