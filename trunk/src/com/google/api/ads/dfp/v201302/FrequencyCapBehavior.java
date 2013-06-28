/**
 * FrequencyCapBehavior.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201302;

public class FrequencyCapBehavior implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FrequencyCapBehavior(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TURN_ON = "TURN_ON";
    public static final java.lang.String _TURN_OFF = "TURN_OFF";
    public static final java.lang.String _DEFER = "DEFER";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FrequencyCapBehavior TURN_ON = new FrequencyCapBehavior(_TURN_ON);
    public static final FrequencyCapBehavior TURN_OFF = new FrequencyCapBehavior(_TURN_OFF);
    public static final FrequencyCapBehavior DEFER = new FrequencyCapBehavior(_DEFER);
    public static final FrequencyCapBehavior UNKNOWN = new FrequencyCapBehavior(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FrequencyCapBehavior fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FrequencyCapBehavior enumeration = (FrequencyCapBehavior)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FrequencyCapBehavior fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FrequencyCapBehavior.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "FrequencyCapBehavior"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
