/**
 * SharedAudienceSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * A {@link SharedAudienceSegment} is an {@link AudienceSegment} owned
 * by another entity and shared
 *             with the publisher network.
 */
public class SharedAudienceSegment  extends com.google.api.ads.dfp.v201308.AudienceSegment  implements java.io.Serializable {
    public SharedAudienceSegment() {
    }

    public SharedAudienceSegment(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.v201308.AudienceSegmentStatus status,
           java.lang.Long size,
           com.google.api.ads.dfp.v201308.AudienceSegmentDataProvider dataProvider,
           com.google.api.ads.dfp.v201308.AudienceSegmentAudienceSegmentType type,
           java.lang.String audienceSegmentType) {
        super(
            id,
            name,
            description,
            status,
            size,
            dataProvider,
            type,
            audienceSegmentType);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedAudienceSegment)) return false;
        SharedAudienceSegment other = (SharedAudienceSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedAudienceSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "SharedAudienceSegment"));
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
