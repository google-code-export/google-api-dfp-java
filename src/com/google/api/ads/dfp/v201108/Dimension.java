/**
 * Dimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201108;

public class Dimension implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Dimension(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MONTH = "MONTH";
    public static final java.lang.String _WEEK = "WEEK";
    public static final java.lang.String _DATE = "DATE";
    public static final java.lang.String _DAY = "DAY";
    public static final java.lang.String _HOUR = "HOUR";
    public static final java.lang.String _LINE_ITEM = "LINE_ITEM";
    public static final java.lang.String _LINE_ITEM_TYPE = "LINE_ITEM_TYPE";
    public static final java.lang.String _ORDER = "ORDER";
    public static final java.lang.String _ADVERTISER = "ADVERTISER";
    public static final java.lang.String _SALESPERSON = "SALESPERSON";
    public static final java.lang.String _CREATIVE = "CREATIVE";
    public static final java.lang.String _CREATIVE_SIZE = "CREATIVE_SIZE";
    public static final java.lang.String _AD_UNIT = "AD_UNIT";
    public static final java.lang.String _PLACEMENT = "PLACEMENT";
    public static final java.lang.String _GENERIC_CRITERION_NAME = "GENERIC_CRITERION_NAME";
    public static final java.lang.String _COUNTRY_NAME = "COUNTRY_NAME";
    public static final java.lang.String _REGION_NAME = "REGION_NAME";
    public static final java.lang.String _CITY_NAME = "CITY_NAME";
    public static final java.lang.String _METRO_NAME = "METRO_NAME";
    public static final java.lang.String _CUSTOM_TARGETING = "CUSTOM_TARGETING";
    public static final Dimension MONTH = new Dimension(_MONTH);
    public static final Dimension WEEK = new Dimension(_WEEK);
    public static final Dimension DATE = new Dimension(_DATE);
    public static final Dimension DAY = new Dimension(_DAY);
    public static final Dimension HOUR = new Dimension(_HOUR);
    public static final Dimension LINE_ITEM = new Dimension(_LINE_ITEM);
    public static final Dimension LINE_ITEM_TYPE = new Dimension(_LINE_ITEM_TYPE);
    public static final Dimension ORDER = new Dimension(_ORDER);
    public static final Dimension ADVERTISER = new Dimension(_ADVERTISER);
    public static final Dimension SALESPERSON = new Dimension(_SALESPERSON);
    public static final Dimension CREATIVE = new Dimension(_CREATIVE);
    public static final Dimension CREATIVE_SIZE = new Dimension(_CREATIVE_SIZE);
    public static final Dimension AD_UNIT = new Dimension(_AD_UNIT);
    public static final Dimension PLACEMENT = new Dimension(_PLACEMENT);
    public static final Dimension GENERIC_CRITERION_NAME = new Dimension(_GENERIC_CRITERION_NAME);
    public static final Dimension COUNTRY_NAME = new Dimension(_COUNTRY_NAME);
    public static final Dimension REGION_NAME = new Dimension(_REGION_NAME);
    public static final Dimension CITY_NAME = new Dimension(_CITY_NAME);
    public static final Dimension METRO_NAME = new Dimension(_METRO_NAME);
    public static final Dimension CUSTOM_TARGETING = new Dimension(_CUSTOM_TARGETING);
    public java.lang.String getValue() { return _value_;}
    public static Dimension fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Dimension enumeration = (Dimension)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Dimension fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Dimension.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "Dimension"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
