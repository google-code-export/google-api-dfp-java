/**
 * LabelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;

public class LabelType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMPETITIVE_EXCLUSION = "COMPETITIVE_EXCLUSION";
    public static final java.lang.String _AD_UNIT_FREQUENCY_CAP = "AD_UNIT_FREQUENCY_CAP";
    public static final java.lang.String _AD_EXCLUSION = "AD_EXCLUSION";
    public static final java.lang.String _CREATIVE_WRAPPER = "CREATIVE_WRAPPER";
    public static final LabelType COMPETITIVE_EXCLUSION = new LabelType(_COMPETITIVE_EXCLUSION);
    public static final LabelType AD_UNIT_FREQUENCY_CAP = new LabelType(_AD_UNIT_FREQUENCY_CAP);
    public static final LabelType AD_EXCLUSION = new LabelType(_AD_EXCLUSION);
    public static final LabelType CREATIVE_WRAPPER = new LabelType(_CREATIVE_WRAPPER);
    public java.lang.String getValue() { return _value_;}
    public static LabelType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LabelType enumeration = (LabelType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LabelType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabelType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "LabelType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
