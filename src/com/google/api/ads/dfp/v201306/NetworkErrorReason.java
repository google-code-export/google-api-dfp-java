/**
 * NetworkErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public class NetworkErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _MULTI_CURRENCY_NOT_SUPPORTED = "MULTI_CURRENCY_NOT_SUPPORTED";
    public static final java.lang.String _UNSUPPORTED_CURRENCY = "UNSUPPORTED_CURRENCY";
    public static final java.lang.String _NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY = "NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY";
    public static final NetworkErrorReason UNKNOWN = new NetworkErrorReason(_UNKNOWN);
    public static final NetworkErrorReason MULTI_CURRENCY_NOT_SUPPORTED = new NetworkErrorReason(_MULTI_CURRENCY_NOT_SUPPORTED);
    public static final NetworkErrorReason UNSUPPORTED_CURRENCY = new NetworkErrorReason(_UNSUPPORTED_CURRENCY);
    public static final NetworkErrorReason NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY = new NetworkErrorReason(_NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY);
    public java.lang.String getValue() { return _value_;}
    public static NetworkErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkErrorReason enumeration = (NetworkErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "NetworkError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
