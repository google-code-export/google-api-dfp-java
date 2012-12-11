/**
 * InvalidUrlErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;

public class InvalidUrlErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InvalidUrlErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ILLEGAL_CHARACTERS = "ILLEGAL_CHARACTERS";
    public static final java.lang.String _INVALID_FORMAT = "INVALID_FORMAT";
    public static final java.lang.String _INSECURE_SCHEME = "INSECURE_SCHEME";
    public static final java.lang.String _NO_SCHEME = "NO_SCHEME";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final InvalidUrlErrorReason ILLEGAL_CHARACTERS = new InvalidUrlErrorReason(_ILLEGAL_CHARACTERS);
    public static final InvalidUrlErrorReason INVALID_FORMAT = new InvalidUrlErrorReason(_INVALID_FORMAT);
    public static final InvalidUrlErrorReason INSECURE_SCHEME = new InvalidUrlErrorReason(_INSECURE_SCHEME);
    public static final InvalidUrlErrorReason NO_SCHEME = new InvalidUrlErrorReason(_NO_SCHEME);
    public static final InvalidUrlErrorReason UNKNOWN = new InvalidUrlErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static InvalidUrlErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InvalidUrlErrorReason enumeration = (InvalidUrlErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InvalidUrlErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InvalidUrlErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "InvalidUrlError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
