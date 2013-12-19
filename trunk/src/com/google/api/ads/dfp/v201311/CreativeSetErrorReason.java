/**
 * CreativeSetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;

public class CreativeSetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeSetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VIDEO_FEATURE_REQUIRED = "VIDEO_FEATURE_REQUIRED";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES = "CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES";
    public static final java.lang.String _ROADBLOCK_FEATURE_REQUIRED = "ROADBLOCK_FEATURE_REQUIRED";
    public static final java.lang.String _MASTER_CREATIVE_CANNOT_BE_COMPANION = "MASTER_CREATIVE_CANNOT_BE_COMPANION";
    public static final java.lang.String _INVALID_ADVERTISER = "INVALID_ADVERTISER";
    public static final java.lang.String _UPDATE_MASTER_CREATIVE_NOT_ALLOWED = "UPDATE_MASTER_CREATIVE_NOT_ALLOWED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativeSetErrorReason VIDEO_FEATURE_REQUIRED = new CreativeSetErrorReason(_VIDEO_FEATURE_REQUIRED);
    public static final CreativeSetErrorReason CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES = new CreativeSetErrorReason(_CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES);
    public static final CreativeSetErrorReason ROADBLOCK_FEATURE_REQUIRED = new CreativeSetErrorReason(_ROADBLOCK_FEATURE_REQUIRED);
    public static final CreativeSetErrorReason MASTER_CREATIVE_CANNOT_BE_COMPANION = new CreativeSetErrorReason(_MASTER_CREATIVE_CANNOT_BE_COMPANION);
    public static final CreativeSetErrorReason INVALID_ADVERTISER = new CreativeSetErrorReason(_INVALID_ADVERTISER);
    public static final CreativeSetErrorReason UPDATE_MASTER_CREATIVE_NOT_ALLOWED = new CreativeSetErrorReason(_UPDATE_MASTER_CREATIVE_NOT_ALLOWED);
    public static final CreativeSetErrorReason UNKNOWN = new CreativeSetErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CreativeSetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeSetErrorReason enumeration = (CreativeSetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeSetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativeSetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CreativeSetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
