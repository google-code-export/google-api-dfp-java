/**
 * CustomCreativeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;

public class CustomCreativeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomCreativeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DUPLICATE_MACRO_NAME_FOR_CREATIVE = "DUPLICATE_MACRO_NAME_FOR_CREATIVE";
    public static final java.lang.String _SNIPPET_REFERENCES_MISSING_MACRO = "SNIPPET_REFERENCES_MISSING_MACRO";
    public static final java.lang.String _UNRECOGNIZED_MACRO = "UNRECOGNIZED_MACRO";
    public static final java.lang.String _CUSTOM_CREATIVE_NOT_ALLOWED = "CUSTOM_CREATIVE_NOT_ALLOWED";
    public static final java.lang.String _MISSING_INTERSTITIAL_MACRO = "MISSING_INTERSTITIAL_MACRO";
    public static final java.lang.String _DUPLICATE_ASSET_IN_MACROS = "DUPLICATE_ASSET_IN_MACROS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CustomCreativeErrorReason DUPLICATE_MACRO_NAME_FOR_CREATIVE = new CustomCreativeErrorReason(_DUPLICATE_MACRO_NAME_FOR_CREATIVE);
    public static final CustomCreativeErrorReason SNIPPET_REFERENCES_MISSING_MACRO = new CustomCreativeErrorReason(_SNIPPET_REFERENCES_MISSING_MACRO);
    public static final CustomCreativeErrorReason UNRECOGNIZED_MACRO = new CustomCreativeErrorReason(_UNRECOGNIZED_MACRO);
    public static final CustomCreativeErrorReason CUSTOM_CREATIVE_NOT_ALLOWED = new CustomCreativeErrorReason(_CUSTOM_CREATIVE_NOT_ALLOWED);
    public static final CustomCreativeErrorReason MISSING_INTERSTITIAL_MACRO = new CustomCreativeErrorReason(_MISSING_INTERSTITIAL_MACRO);
    public static final CustomCreativeErrorReason DUPLICATE_ASSET_IN_MACROS = new CustomCreativeErrorReason(_DUPLICATE_ASSET_IN_MACROS);
    public static final CustomCreativeErrorReason UNKNOWN = new CustomCreativeErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CustomCreativeErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomCreativeErrorReason enumeration = (CustomCreativeErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomCreativeErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomCreativeErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CustomCreativeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
