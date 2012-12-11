/**
 * DayPartTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;

public class DayPartTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DayPartTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_HOUR = "INVALID_HOUR";
    public static final java.lang.String _INVALID_MINUTE = "INVALID_MINUTE";
    public static final java.lang.String _END_TIME_NOT_AFTER_START_TIME = "END_TIME_NOT_AFTER_START_TIME";
    public static final java.lang.String _TIME_PERIODS_OVERLAP = "TIME_PERIODS_OVERLAP";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DayPartTargetingErrorReason INVALID_HOUR = new DayPartTargetingErrorReason(_INVALID_HOUR);
    public static final DayPartTargetingErrorReason INVALID_MINUTE = new DayPartTargetingErrorReason(_INVALID_MINUTE);
    public static final DayPartTargetingErrorReason END_TIME_NOT_AFTER_START_TIME = new DayPartTargetingErrorReason(_END_TIME_NOT_AFTER_START_TIME);
    public static final DayPartTargetingErrorReason TIME_PERIODS_OVERLAP = new DayPartTargetingErrorReason(_TIME_PERIODS_OVERLAP);
    public static final DayPartTargetingErrorReason UNKNOWN = new DayPartTargetingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DayPartTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DayPartTargetingErrorReason enumeration = (DayPartTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DayPartTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DayPartTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "DayPartTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
