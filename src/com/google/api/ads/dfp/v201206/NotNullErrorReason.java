/**
 * NotNullErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;

public class NotNullErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NotNullErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ARG1_NULL = "ARG1_NULL";
    public static final java.lang.String _ARG2_NULL = "ARG2_NULL";
    public static final java.lang.String _ARG3_NULL = "ARG3_NULL";
    public static final java.lang.String _NULL = "NULL";
    public static final NotNullErrorReason ARG1_NULL = new NotNullErrorReason(_ARG1_NULL);
    public static final NotNullErrorReason ARG2_NULL = new NotNullErrorReason(_ARG2_NULL);
    public static final NotNullErrorReason ARG3_NULL = new NotNullErrorReason(_ARG3_NULL);
    public static final NotNullErrorReason NULL = new NotNullErrorReason(_NULL);
    public java.lang.String getValue() { return _value_;}
    public static NotNullErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NotNullErrorReason enumeration = (NotNullErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NotNullErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NotNullErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "NotNullError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
