/**
 * BillFrom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;

public class BillFrom implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillFrom(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEFAULT = "DEFAULT";
    public static final java.lang.String _DFP = "DFP";
    public static final java.lang.String _THIRD_PARTY = "THIRD_PARTY";
    public static final java.lang.String _MANUAL = "MANUAL";
    public static final java.lang.String _CONTRACTED_GOAL = "CONTRACTED_GOAL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BillFrom DEFAULT = new BillFrom(_DEFAULT);
    public static final BillFrom DFP = new BillFrom(_DFP);
    public static final BillFrom THIRD_PARTY = new BillFrom(_THIRD_PARTY);
    public static final BillFrom MANUAL = new BillFrom(_MANUAL);
    public static final BillFrom CONTRACTED_GOAL = new BillFrom(_CONTRACTED_GOAL);
    public static final BillFrom UNKNOWN = new BillFrom(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BillFrom fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillFrom enumeration = (BillFrom)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillFrom fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillFrom.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "BillFrom"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
