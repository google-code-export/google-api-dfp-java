/**
 * ReservationDetailsErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201101;

public class ReservationDetailsErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReservationDetailsErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNLIMITED_UNITS_BOUGHT_NOT_ALLOWED = "UNLIMITED_UNITS_BOUGHT_NOT_ALLOWED";
    public static final java.lang.String _UNLIMITED_END_DATE_TIME_NOT_ALLOWED = "UNLIMITED_END_DATE_TIME_NOT_ALLOWED";
    public static final java.lang.String _PERCENTAGE_UNITS_BOUGHT_TOO_HIGH = "PERCENTAGE_UNITS_BOUGHT_TOO_HIGH";
    public static final java.lang.String _DURATION_NOT_ALLOWED = "DURATION_NOT_ALLOWED";
    public static final java.lang.String _UNIT_TYPE_NOT_ALLOWED = "UNIT_TYPE_NOT_ALLOWED";
    public static final java.lang.String _COST_TYPE_NOT_ALLOWED = "COST_TYPE_NOT_ALLOWED";
    public static final java.lang.String _COST_TYPE_UNIT_TYPE_MISMATCH_NOT_ALLOWED = "COST_TYPE_UNIT_TYPE_MISMATCH_NOT_ALLOWED";
    public static final java.lang.String _LINE_ITEM_TYPE_NOT_ALLOWED = "LINE_ITEM_TYPE_NOT_ALLOWED";
    public static final java.lang.String _NETWORK_REMNANT_ORDER_CANNOT_UPDATE_LINEITEM_TYPE = "NETWORK_REMNANT_ORDER_CANNOT_UPDATE_LINEITEM_TYPE";
    public static final ReservationDetailsErrorReason UNLIMITED_UNITS_BOUGHT_NOT_ALLOWED = new ReservationDetailsErrorReason(_UNLIMITED_UNITS_BOUGHT_NOT_ALLOWED);
    public static final ReservationDetailsErrorReason UNLIMITED_END_DATE_TIME_NOT_ALLOWED = new ReservationDetailsErrorReason(_UNLIMITED_END_DATE_TIME_NOT_ALLOWED);
    public static final ReservationDetailsErrorReason PERCENTAGE_UNITS_BOUGHT_TOO_HIGH = new ReservationDetailsErrorReason(_PERCENTAGE_UNITS_BOUGHT_TOO_HIGH);
    public static final ReservationDetailsErrorReason DURATION_NOT_ALLOWED = new ReservationDetailsErrorReason(_DURATION_NOT_ALLOWED);
    public static final ReservationDetailsErrorReason UNIT_TYPE_NOT_ALLOWED = new ReservationDetailsErrorReason(_UNIT_TYPE_NOT_ALLOWED);
    public static final ReservationDetailsErrorReason COST_TYPE_NOT_ALLOWED = new ReservationDetailsErrorReason(_COST_TYPE_NOT_ALLOWED);
    public static final ReservationDetailsErrorReason COST_TYPE_UNIT_TYPE_MISMATCH_NOT_ALLOWED = new ReservationDetailsErrorReason(_COST_TYPE_UNIT_TYPE_MISMATCH_NOT_ALLOWED);
    public static final ReservationDetailsErrorReason LINE_ITEM_TYPE_NOT_ALLOWED = new ReservationDetailsErrorReason(_LINE_ITEM_TYPE_NOT_ALLOWED);
    public static final ReservationDetailsErrorReason NETWORK_REMNANT_ORDER_CANNOT_UPDATE_LINEITEM_TYPE = new ReservationDetailsErrorReason(_NETWORK_REMNANT_ORDER_CANNOT_UPDATE_LINEITEM_TYPE);
    public java.lang.String getValue() { return _value_;}
    public static ReservationDetailsErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReservationDetailsErrorReason enumeration = (ReservationDetailsErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReservationDetailsErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReservationDetailsErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "ReservationDetailsError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
