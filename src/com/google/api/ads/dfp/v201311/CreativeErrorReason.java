/**
 * CreativeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;

public class CreativeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FLASH_AND_FALLBACK_URL_ARE_SAME = "FLASH_AND_FALLBACK_URL_ARE_SAME";
    public static final java.lang.String _INVALID_INTERNAL_REDIRECT_URL = "INVALID_INTERNAL_REDIRECT_URL";
    public static final java.lang.String _DESTINATION_URL_REQUIRED = "DESTINATION_URL_REQUIRED";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE = "CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE = "CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE";
    public static final java.lang.String _MISSING_FEATURE = "MISSING_FEATURE";
    public static final java.lang.String _INVALID_COMPANY_TYPE = "INVALID_COMPANY_TYPE";
    public static final java.lang.String _INVALID_ADSENSE_CREATIVE_SIZE = "INVALID_ADSENSE_CREATIVE_SIZE";
    public static final java.lang.String _INVALID_AD_EXCHANGE_CREATIVE_SIZE = "INVALID_AD_EXCHANGE_CREATIVE_SIZE";
    public static final java.lang.String _DUPLICATE_ASSET_IN_CREATIVE = "DUPLICATE_ASSET_IN_CREATIVE";
    public static final java.lang.String _CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY = "CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE = "CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE";
    public static final java.lang.String _CANNOT_COPY_VIDEO_CREATIVE_ACROSS_ADVERTISERS = "CANNOT_COPY_VIDEO_CREATIVE_ACROSS_ADVERTISERS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativeErrorReason FLASH_AND_FALLBACK_URL_ARE_SAME = new CreativeErrorReason(_FLASH_AND_FALLBACK_URL_ARE_SAME);
    public static final CreativeErrorReason INVALID_INTERNAL_REDIRECT_URL = new CreativeErrorReason(_INVALID_INTERNAL_REDIRECT_URL);
    public static final CreativeErrorReason DESTINATION_URL_REQUIRED = new CreativeErrorReason(_DESTINATION_URL_REQUIRED);
    public static final CreativeErrorReason CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE = new CreativeErrorReason(_CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE);
    public static final CreativeErrorReason CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE = new CreativeErrorReason(_CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE);
    public static final CreativeErrorReason MISSING_FEATURE = new CreativeErrorReason(_MISSING_FEATURE);
    public static final CreativeErrorReason INVALID_COMPANY_TYPE = new CreativeErrorReason(_INVALID_COMPANY_TYPE);
    public static final CreativeErrorReason INVALID_ADSENSE_CREATIVE_SIZE = new CreativeErrorReason(_INVALID_ADSENSE_CREATIVE_SIZE);
    public static final CreativeErrorReason INVALID_AD_EXCHANGE_CREATIVE_SIZE = new CreativeErrorReason(_INVALID_AD_EXCHANGE_CREATIVE_SIZE);
    public static final CreativeErrorReason DUPLICATE_ASSET_IN_CREATIVE = new CreativeErrorReason(_DUPLICATE_ASSET_IN_CREATIVE);
    public static final CreativeErrorReason CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY = new CreativeErrorReason(_CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY);
    public static final CreativeErrorReason CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE = new CreativeErrorReason(_CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE);
    public static final CreativeErrorReason CANNOT_COPY_VIDEO_CREATIVE_ACROSS_ADVERTISERS = new CreativeErrorReason(_CANNOT_COPY_VIDEO_CREATIVE_ACROSS_ADVERTISERS);
    public static final CreativeErrorReason UNKNOWN = new CreativeErrorReason(_UNKNOWN);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CreativeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
