/**
 * LineItemFlightDateErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;

public class LineItemFlightDateErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineItemFlightDateErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _START_DATE_TIME_IS_IN_PAST = "START_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _END_DATE_TIME_IS_IN_PAST = "END_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _END_DATE_TIME_NOT_AFTER_START_TIME = "END_DATE_TIME_NOT_AFTER_START_TIME";
    public static final java.lang.String _END_DATE_TIME_TOO_LATE = "END_DATE_TIME_TOO_LATE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final LineItemFlightDateErrorReason START_DATE_TIME_IS_IN_PAST = new LineItemFlightDateErrorReason(_START_DATE_TIME_IS_IN_PAST);
    public static final LineItemFlightDateErrorReason END_DATE_TIME_IS_IN_PAST = new LineItemFlightDateErrorReason(_END_DATE_TIME_IS_IN_PAST);
    public static final LineItemFlightDateErrorReason END_DATE_TIME_NOT_AFTER_START_TIME = new LineItemFlightDateErrorReason(_END_DATE_TIME_NOT_AFTER_START_TIME);
    public static final LineItemFlightDateErrorReason END_DATE_TIME_TOO_LATE = new LineItemFlightDateErrorReason(_END_DATE_TIME_TOO_LATE);
    public static final LineItemFlightDateErrorReason UNKNOWN = new LineItemFlightDateErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static LineItemFlightDateErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LineItemFlightDateErrorReason enumeration = (LineItemFlightDateErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineItemFlightDateErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LineItemFlightDateErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "LineItemFlightDateError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
