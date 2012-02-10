/**
 * ContentPartnerErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;

public class ContentPartnerErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ContentPartnerErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FEATURE_NOT_ENABLED = "FEATURE_NOT_ENABLED";
    public static final java.lang.String _INVALID_PARTNER_TYPE = "INVALID_PARTNER_TYPE";
    public static final java.lang.String _NO_PARTNER_CATCH_ALL = "NO_PARTNER_CATCH_ALL";
    public static final ContentPartnerErrorReason FEATURE_NOT_ENABLED = new ContentPartnerErrorReason(_FEATURE_NOT_ENABLED);
    public static final ContentPartnerErrorReason INVALID_PARTNER_TYPE = new ContentPartnerErrorReason(_INVALID_PARTNER_TYPE);
    public static final ContentPartnerErrorReason NO_PARTNER_CATCH_ALL = new ContentPartnerErrorReason(_NO_PARTNER_CATCH_ALL);
    public java.lang.String getValue() { return _value_;}
    public static ContentPartnerErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ContentPartnerErrorReason enumeration = (ContentPartnerErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ContentPartnerErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ContentPartnerErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "ContentPartnerError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
