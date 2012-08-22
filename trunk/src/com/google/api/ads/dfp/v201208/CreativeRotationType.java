/**
 * CreativeRotationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;

public class CreativeRotationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeRotationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EVEN = "EVEN";
    public static final java.lang.String _OPTIMIZED = "OPTIMIZED";
    public static final java.lang.String _MANUAL = "MANUAL";
    public static final java.lang.String _SEQUENTIAL = "SEQUENTIAL";
    public static final CreativeRotationType EVEN = new CreativeRotationType(_EVEN);
    public static final CreativeRotationType OPTIMIZED = new CreativeRotationType(_OPTIMIZED);
    public static final CreativeRotationType MANUAL = new CreativeRotationType(_MANUAL);
    public static final CreativeRotationType SEQUENTIAL = new CreativeRotationType(_SEQUENTIAL);
    public java.lang.String getValue() { return _value_;}
    public static CreativeRotationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeRotationType enumeration = (CreativeRotationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeRotationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativeRotationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "CreativeRotationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
