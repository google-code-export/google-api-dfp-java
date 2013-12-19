/**
 * CustomTargetingValueMatchType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;

public class CustomTargetingValueMatchType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomTargetingValueMatchType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EXACT = "EXACT";
    public static final java.lang.String _BROAD = "BROAD";
    public static final java.lang.String _PREFIX = "PREFIX";
    public static final java.lang.String _BROAD_PREFIX = "BROAD_PREFIX";
    public static final java.lang.String _SUFFIX = "SUFFIX";
    public static final java.lang.String _CONTAINS = "CONTAINS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CustomTargetingValueMatchType EXACT = new CustomTargetingValueMatchType(_EXACT);
    public static final CustomTargetingValueMatchType BROAD = new CustomTargetingValueMatchType(_BROAD);
    public static final CustomTargetingValueMatchType PREFIX = new CustomTargetingValueMatchType(_PREFIX);
    public static final CustomTargetingValueMatchType BROAD_PREFIX = new CustomTargetingValueMatchType(_BROAD_PREFIX);
    public static final CustomTargetingValueMatchType SUFFIX = new CustomTargetingValueMatchType(_SUFFIX);
    public static final CustomTargetingValueMatchType CONTAINS = new CustomTargetingValueMatchType(_CONTAINS);
    public static final CustomTargetingValueMatchType UNKNOWN = new CustomTargetingValueMatchType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CustomTargetingValueMatchType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomTargetingValueMatchType enumeration = (CustomTargetingValueMatchType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomTargetingValueMatchType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomTargetingValueMatchType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CustomTargetingValue.MatchType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
