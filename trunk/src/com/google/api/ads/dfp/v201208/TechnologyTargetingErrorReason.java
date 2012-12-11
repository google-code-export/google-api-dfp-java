/**
 * TechnologyTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;

public class TechnologyTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TechnologyTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MOBILE_LINE_ITEM_CONTAINS_WEB_TECH_CRITERIA = "MOBILE_LINE_ITEM_CONTAINS_WEB_TECH_CRITERIA";
    public static final java.lang.String _WEB_LINE_ITEM_CONTAINS_MOBILE_TECH_CRITERIA = "WEB_LINE_ITEM_CONTAINS_MOBILE_TECH_CRITERIA";
    public static final java.lang.String _MOBILE_CARRIER_TARGETING_FEATURE_NOT_ENABLED = "MOBILE_CARRIER_TARGETING_FEATURE_NOT_ENABLED";
    public static final java.lang.String _DEVICE_CAPABILITY_TARGETING_FEATURE_NOT_ENABLED = "DEVICE_CAPABILITY_TARGETING_FEATURE_NOT_ENABLED";
    public static final java.lang.String _DEVICE_CATEGORY_TARGETING_FEATURE_NOT_ENABLED = "DEVICE_CATEGORY_TARGETING_FEATURE_NOT_ENABLED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TechnologyTargetingErrorReason MOBILE_LINE_ITEM_CONTAINS_WEB_TECH_CRITERIA = new TechnologyTargetingErrorReason(_MOBILE_LINE_ITEM_CONTAINS_WEB_TECH_CRITERIA);
    public static final TechnologyTargetingErrorReason WEB_LINE_ITEM_CONTAINS_MOBILE_TECH_CRITERIA = new TechnologyTargetingErrorReason(_WEB_LINE_ITEM_CONTAINS_MOBILE_TECH_CRITERIA);
    public static final TechnologyTargetingErrorReason MOBILE_CARRIER_TARGETING_FEATURE_NOT_ENABLED = new TechnologyTargetingErrorReason(_MOBILE_CARRIER_TARGETING_FEATURE_NOT_ENABLED);
    public static final TechnologyTargetingErrorReason DEVICE_CAPABILITY_TARGETING_FEATURE_NOT_ENABLED = new TechnologyTargetingErrorReason(_DEVICE_CAPABILITY_TARGETING_FEATURE_NOT_ENABLED);
    public static final TechnologyTargetingErrorReason DEVICE_CATEGORY_TARGETING_FEATURE_NOT_ENABLED = new TechnologyTargetingErrorReason(_DEVICE_CATEGORY_TARGETING_FEATURE_NOT_ENABLED);
    public static final TechnologyTargetingErrorReason UNKNOWN = new TechnologyTargetingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TechnologyTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TechnologyTargetingErrorReason enumeration = (TechnologyTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TechnologyTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TechnologyTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "TechnologyTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
