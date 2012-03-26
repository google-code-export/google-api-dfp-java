/**
 * GeoTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201203;

public class GeoTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeoTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TARGETED_LOCATIONS_NOT_EXCLUDABLE = "TARGETED_LOCATIONS_NOT_EXCLUDABLE";
    public static final java.lang.String _EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED = "EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED";
    public static final java.lang.String _POSTAL_CODES_CANNOT_BE_EXCLUDED = "POSTAL_CODES_CANNOT_BE_EXCLUDED";
    public static final java.lang.String _UNTARGETABLE_LOCATION = "UNTARGETABLE_LOCATION";
    public static final GeoTargetingErrorReason TARGETED_LOCATIONS_NOT_EXCLUDABLE = new GeoTargetingErrorReason(_TARGETED_LOCATIONS_NOT_EXCLUDABLE);
    public static final GeoTargetingErrorReason EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED = new GeoTargetingErrorReason(_EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED);
    public static final GeoTargetingErrorReason POSTAL_CODES_CANNOT_BE_EXCLUDED = new GeoTargetingErrorReason(_POSTAL_CODES_CANNOT_BE_EXCLUDED);
    public static final GeoTargetingErrorReason UNTARGETABLE_LOCATION = new GeoTargetingErrorReason(_UNTARGETABLE_LOCATION);
    public java.lang.String getValue() { return _value_;}
    public static GeoTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GeoTargetingErrorReason enumeration = (GeoTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GeoTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GeoTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "GeoTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
