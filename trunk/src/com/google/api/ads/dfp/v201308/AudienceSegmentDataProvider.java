/**
 * AudienceSegmentDataProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * Data provider that owns this segment. For a {@link FirstPartyAudienceSegment},
 * it would be the
 *             publisher network. For a {@link SharedAudienceSegment}
 * or a {@link ThirdPartyAudienceSegment}, it
 *             would be the entity that provides that {@link AudienceSegment}.
 */
public class AudienceSegmentDataProvider  implements java.io.Serializable {
    /* Name of the data provider. This attribute is readonly and is
     * assigned by Google. */
    private java.lang.String name;

    public AudienceSegmentDataProvider() {
    }

    public AudienceSegmentDataProvider(
           java.lang.String name) {
           this.name = name;
    }


    /**
     * Gets the name value for this AudienceSegmentDataProvider.
     * 
     * @return name   * Name of the data provider. This attribute is readonly and is
     * assigned by Google.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AudienceSegmentDataProvider.
     * 
     * @param name   * Name of the data provider. This attribute is readonly and is
     * assigned by Google.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceSegmentDataProvider)) return false;
        AudienceSegmentDataProvider other = (AudienceSegmentDataProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AudienceSegmentDataProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "AudienceSegmentDataProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "name"));
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
