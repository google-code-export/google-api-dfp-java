/**
 * DateRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;

public class DateRangeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateRangeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TODAY = "TODAY";
    public static final java.lang.String _YESTERDAY = "YESTERDAY";
    public static final java.lang.String _LAST_WEEK = "LAST_WEEK";
    public static final java.lang.String _LAST_MONTH = "LAST_MONTH";
    public static final java.lang.String _CUSTOM_DATE = "CUSTOM_DATE";
    public static final DateRangeType TODAY = new DateRangeType(_TODAY);
    public static final DateRangeType YESTERDAY = new DateRangeType(_YESTERDAY);
    public static final DateRangeType LAST_WEEK = new DateRangeType(_LAST_WEEK);
    public static final DateRangeType LAST_MONTH = new DateRangeType(_LAST_MONTH);
    public static final DateRangeType CUSTOM_DATE = new DateRangeType(_CUSTOM_DATE);
    public java.lang.String getValue() { return _value_;}
    public static DateRangeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateRangeType enumeration = (DateRangeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateRangeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateRangeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "DateRangeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
