/**
 * MinuteOfHour.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;

public class MinuteOfHour implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MinuteOfHour(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ZERO = "ZERO";
    public static final java.lang.String _FIFTEEN = "FIFTEEN";
    public static final java.lang.String _THIRTY = "THIRTY";
    public static final java.lang.String _FORTY_FIVE = "FORTY_FIVE";
    public static final MinuteOfHour ZERO = new MinuteOfHour(_ZERO);
    public static final MinuteOfHour FIFTEEN = new MinuteOfHour(_FIFTEEN);
    public static final MinuteOfHour THIRTY = new MinuteOfHour(_THIRTY);
    public static final MinuteOfHour FORTY_FIVE = new MinuteOfHour(_FORTY_FIVE);
    public java.lang.String getValue() { return _value_;}
    public static MinuteOfHour fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MinuteOfHour enumeration = (MinuteOfHour)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MinuteOfHour fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MinuteOfHour.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "MinuteOfHour"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
