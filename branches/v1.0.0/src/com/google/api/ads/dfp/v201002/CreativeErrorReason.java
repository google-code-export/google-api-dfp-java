/**
 * CreativeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;

public class CreativeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_IMAGE = "INVALID_IMAGE";
    public static final java.lang.String _ANIMATED_NOT_ALLOWED = "ANIMATED_NOT_ALLOWED";
    public static final java.lang.String _ANIMATION_TOO_LONG = "ANIMATION_TOO_LONG";
    public static final java.lang.String _CMYK_JPEG_NOT_ALLOWED = "CMYK_JPEG_NOT_ALLOWED";
    public static final java.lang.String _FLASH_NOT_ALLOWED = "FLASH_NOT_ALLOWED";
    public static final java.lang.String _ANIMATED_VISUAL_EFFECT = "ANIMATED_VISUAL_EFFECT";
    public static final java.lang.String _FLASH_ERROR = "FLASH_ERROR";
    public static final java.lang.String _LAYOUT_PROBLEM = "LAYOUT_PROBLEM";
    public static final java.lang.String _FLASH_AND_FALLBACK_URL_ARE_SAME = "FLASH_AND_FALLBACK_URL_ARE_SAME";
    public static final java.lang.String _FLASH_HAS_NETWORK_OBJECTS = "FLASH_HAS_NETWORK_OBJECTS";
    public static final java.lang.String _FLASH_HAS_NETWORK_METHODS = "FLASH_HAS_NETWORK_METHODS";
    public static final java.lang.String _FLASH_HAS_URL = "FLASH_HAS_URL";
    public static final java.lang.String _FLASH_HAS_MOUSE_TRACKING = "FLASH_HAS_MOUSE_TRACKING";
    public static final java.lang.String _FLASH_HAS_RANDOM_NUM = "FLASH_HAS_RANDOM_NUM";
    public static final java.lang.String _FLASH_SELF_TARGETS = "FLASH_SELF_TARGETS";
    public static final java.lang.String _FLASH_BAD_GETURL_TARGET = "FLASH_BAD_GETURL_TARGET";
    public static final java.lang.String _FLASH_WITHOUT_CLICKTAG = "FLASH_WITHOUT_CLICKTAG";
    public static final java.lang.String _FLASH_VERSION_NOT_SUPPORTED = "FLASH_VERSION_NOT_SUPPORTED";
    public static final java.lang.String _FLASH_NOT_SUPPORTED = "FLASH_NOT_SUPPORTED";
    public static final java.lang.String _UNEXPECTED_SIZE = "UNEXPECTED_SIZE";
    public static final java.lang.String _INVALID_INTERNAL_REDIRECT_URL = "INVALID_INTERNAL_REDIRECT_URL";
    public static final java.lang.String _DESTINATION_URL_REQUIRED = "DESTINATION_URL_REQUIRED";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE = "CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE";
    public static final CreativeErrorReason INVALID_IMAGE = new CreativeErrorReason(_INVALID_IMAGE);
    public static final CreativeErrorReason ANIMATED_NOT_ALLOWED = new CreativeErrorReason(_ANIMATED_NOT_ALLOWED);
    public static final CreativeErrorReason ANIMATION_TOO_LONG = new CreativeErrorReason(_ANIMATION_TOO_LONG);
    public static final CreativeErrorReason CMYK_JPEG_NOT_ALLOWED = new CreativeErrorReason(_CMYK_JPEG_NOT_ALLOWED);
    public static final CreativeErrorReason FLASH_NOT_ALLOWED = new CreativeErrorReason(_FLASH_NOT_ALLOWED);
    public static final CreativeErrorReason ANIMATED_VISUAL_EFFECT = new CreativeErrorReason(_ANIMATED_VISUAL_EFFECT);
    public static final CreativeErrorReason FLASH_ERROR = new CreativeErrorReason(_FLASH_ERROR);
    public static final CreativeErrorReason LAYOUT_PROBLEM = new CreativeErrorReason(_LAYOUT_PROBLEM);
    public static final CreativeErrorReason FLASH_AND_FALLBACK_URL_ARE_SAME = new CreativeErrorReason(_FLASH_AND_FALLBACK_URL_ARE_SAME);
    public static final CreativeErrorReason FLASH_HAS_NETWORK_OBJECTS = new CreativeErrorReason(_FLASH_HAS_NETWORK_OBJECTS);
    public static final CreativeErrorReason FLASH_HAS_NETWORK_METHODS = new CreativeErrorReason(_FLASH_HAS_NETWORK_METHODS);
    public static final CreativeErrorReason FLASH_HAS_URL = new CreativeErrorReason(_FLASH_HAS_URL);
    public static final CreativeErrorReason FLASH_HAS_MOUSE_TRACKING = new CreativeErrorReason(_FLASH_HAS_MOUSE_TRACKING);
    public static final CreativeErrorReason FLASH_HAS_RANDOM_NUM = new CreativeErrorReason(_FLASH_HAS_RANDOM_NUM);
    public static final CreativeErrorReason FLASH_SELF_TARGETS = new CreativeErrorReason(_FLASH_SELF_TARGETS);
    public static final CreativeErrorReason FLASH_BAD_GETURL_TARGET = new CreativeErrorReason(_FLASH_BAD_GETURL_TARGET);
    public static final CreativeErrorReason FLASH_WITHOUT_CLICKTAG = new CreativeErrorReason(_FLASH_WITHOUT_CLICKTAG);
    public static final CreativeErrorReason FLASH_VERSION_NOT_SUPPORTED = new CreativeErrorReason(_FLASH_VERSION_NOT_SUPPORTED);
    public static final CreativeErrorReason FLASH_NOT_SUPPORTED = new CreativeErrorReason(_FLASH_NOT_SUPPORTED);
    public static final CreativeErrorReason UNEXPECTED_SIZE = new CreativeErrorReason(_UNEXPECTED_SIZE);
    public static final CreativeErrorReason INVALID_INTERNAL_REDIRECT_URL = new CreativeErrorReason(_INVALID_INTERNAL_REDIRECT_URL);
    public static final CreativeErrorReason DESTINATION_URL_REQUIRED = new CreativeErrorReason(_DESTINATION_URL_REQUIRED);
    public static final CreativeErrorReason CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE = new CreativeErrorReason(_CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE);
    public java.lang.String getValue() { return _value_;}
    public static CreativeErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeErrorReason enumeration = (CreativeErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativeErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "CreativeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
