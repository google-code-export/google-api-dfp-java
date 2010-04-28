/**
 * ThirdPartyCreativeFormatStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201004;

public class ThirdPartyCreativeFormatStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ThirdPartyCreativeFormatStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EMPTY = "EMPTY";
    public static final java.lang.String _UNRECOGNIZED = "UNRECOGNIZED";
    public static final java.lang.String _RECOGNIZED = "RECOGNIZED";
    public static final java.lang.String _DISALLOWED = "DISALLOWED";
    public static final java.lang.String _ADSENSE = "ADSENSE";
    public static final java.lang.String _MAY_REQUIRE_MANUAL_MACROS = "MAY_REQUIRE_MANUAL_MACROS";
    public static final java.lang.String _ALREADY_HAS_MACROS = "ALREADY_HAS_MACROS";
    public static final ThirdPartyCreativeFormatStatus EMPTY = new ThirdPartyCreativeFormatStatus(_EMPTY);
    public static final ThirdPartyCreativeFormatStatus UNRECOGNIZED = new ThirdPartyCreativeFormatStatus(_UNRECOGNIZED);
    public static final ThirdPartyCreativeFormatStatus RECOGNIZED = new ThirdPartyCreativeFormatStatus(_RECOGNIZED);
    public static final ThirdPartyCreativeFormatStatus DISALLOWED = new ThirdPartyCreativeFormatStatus(_DISALLOWED);
    public static final ThirdPartyCreativeFormatStatus ADSENSE = new ThirdPartyCreativeFormatStatus(_ADSENSE);
    public static final ThirdPartyCreativeFormatStatus MAY_REQUIRE_MANUAL_MACROS = new ThirdPartyCreativeFormatStatus(_MAY_REQUIRE_MANUAL_MACROS);
    public static final ThirdPartyCreativeFormatStatus ALREADY_HAS_MACROS = new ThirdPartyCreativeFormatStatus(_ALREADY_HAS_MACROS);
    public java.lang.String getValue() { return _value_;}
    public static ThirdPartyCreativeFormatStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ThirdPartyCreativeFormatStatus enumeration = (ThirdPartyCreativeFormatStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ThirdPartyCreativeFormatStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ThirdPartyCreativeFormatStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "ThirdPartyCreative.FormatStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
