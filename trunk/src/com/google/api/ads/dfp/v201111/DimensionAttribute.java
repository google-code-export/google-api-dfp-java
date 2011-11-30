/**
 * DimensionAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201111;

public class DimensionAttribute implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DimensionAttribute(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ORDER_START_DATE_TIME = "ORDER_START_DATE_TIME";
    public static final java.lang.String _ORDER_END_DATE_TIME = "ORDER_END_DATE_TIME";
    public static final java.lang.String _ORDER_EXTERNAL_ID = "ORDER_EXTERNAL_ID";
    public static final java.lang.String _ORDER_PO_NUMBER = "ORDER_PO_NUMBER";
    public static final java.lang.String _ORDER_TRAFFICKER = "ORDER_TRAFFICKER";
    public static final java.lang.String _ORDER_LIFETIME_IMPRESSIONS = "ORDER_LIFETIME_IMPRESSIONS";
    public static final java.lang.String _ORDER_LIFETIME_CLICKS = "ORDER_LIFETIME_CLICKS";
    public static final java.lang.String _ORDER_LIFETIME_MERGED_IMPRESSIONS = "ORDER_LIFETIME_MERGED_IMPRESSIONS";
    public static final java.lang.String _ORDER_LIFETIME_MERGED_CLICKS = "ORDER_LIFETIME_MERGED_CLICKS";
    public static final java.lang.String _LINE_ITEM_START_DATE_TIME = "LINE_ITEM_START_DATE_TIME";
    public static final java.lang.String _LINE_ITEM_END_DATE_TIME = "LINE_ITEM_END_DATE_TIME";
    public static final java.lang.String _LINE_ITEM_EXTERNAL_ID = "LINE_ITEM_EXTERNAL_ID";
    public static final java.lang.String _LINE_ITEM_COST_TYPE = "LINE_ITEM_COST_TYPE";
    public static final java.lang.String _LINE_ITEM_COST_PER_UNIT = "LINE_ITEM_COST_PER_UNIT";
    public static final java.lang.String _LINE_ITEM_GOAL_QUANTITY = "LINE_ITEM_GOAL_QUANTITY";
    public static final java.lang.String _LINE_ITEM_LIFETIME_IMPRESSIONS = "LINE_ITEM_LIFETIME_IMPRESSIONS";
    public static final java.lang.String _LINE_ITEM_LIFETIME_CLICKS = "LINE_ITEM_LIFETIME_CLICKS";
    public static final java.lang.String _LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS = "LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS";
    public static final java.lang.String _LINE_ITEM_LIFETIME_MERGED_CLICKS = "LINE_ITEM_LIFETIME_MERGED_CLICKS";
    public static final DimensionAttribute ORDER_START_DATE_TIME = new DimensionAttribute(_ORDER_START_DATE_TIME);
    public static final DimensionAttribute ORDER_END_DATE_TIME = new DimensionAttribute(_ORDER_END_DATE_TIME);
    public static final DimensionAttribute ORDER_EXTERNAL_ID = new DimensionAttribute(_ORDER_EXTERNAL_ID);
    public static final DimensionAttribute ORDER_PO_NUMBER = new DimensionAttribute(_ORDER_PO_NUMBER);
    public static final DimensionAttribute ORDER_TRAFFICKER = new DimensionAttribute(_ORDER_TRAFFICKER);
    public static final DimensionAttribute ORDER_LIFETIME_IMPRESSIONS = new DimensionAttribute(_ORDER_LIFETIME_IMPRESSIONS);
    public static final DimensionAttribute ORDER_LIFETIME_CLICKS = new DimensionAttribute(_ORDER_LIFETIME_CLICKS);
    public static final DimensionAttribute ORDER_LIFETIME_MERGED_IMPRESSIONS = new DimensionAttribute(_ORDER_LIFETIME_MERGED_IMPRESSIONS);
    public static final DimensionAttribute ORDER_LIFETIME_MERGED_CLICKS = new DimensionAttribute(_ORDER_LIFETIME_MERGED_CLICKS);
    public static final DimensionAttribute LINE_ITEM_START_DATE_TIME = new DimensionAttribute(_LINE_ITEM_START_DATE_TIME);
    public static final DimensionAttribute LINE_ITEM_END_DATE_TIME = new DimensionAttribute(_LINE_ITEM_END_DATE_TIME);
    public static final DimensionAttribute LINE_ITEM_EXTERNAL_ID = new DimensionAttribute(_LINE_ITEM_EXTERNAL_ID);
    public static final DimensionAttribute LINE_ITEM_COST_TYPE = new DimensionAttribute(_LINE_ITEM_COST_TYPE);
    public static final DimensionAttribute LINE_ITEM_COST_PER_UNIT = new DimensionAttribute(_LINE_ITEM_COST_PER_UNIT);
    public static final DimensionAttribute LINE_ITEM_GOAL_QUANTITY = new DimensionAttribute(_LINE_ITEM_GOAL_QUANTITY);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_IMPRESSIONS = new DimensionAttribute(_LINE_ITEM_LIFETIME_IMPRESSIONS);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_CLICKS = new DimensionAttribute(_LINE_ITEM_LIFETIME_CLICKS);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS = new DimensionAttribute(_LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_MERGED_CLICKS = new DimensionAttribute(_LINE_ITEM_LIFETIME_MERGED_CLICKS);
    public java.lang.String getValue() { return _value_;}
    public static DimensionAttribute fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DimensionAttribute enumeration = (DimensionAttribute)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DimensionAttribute fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DimensionAttribute.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "DimensionAttribute"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
