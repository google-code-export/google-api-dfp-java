/**
 * DimensionAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;

public class DimensionAttribute implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DimensionAttribute(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LINE_ITEM_LABELS = "LINE_ITEM_LABELS";
    public static final java.lang.String _ORDER_START_DATE_TIME = "ORDER_START_DATE_TIME";
    public static final java.lang.String _ORDER_END_DATE_TIME = "ORDER_END_DATE_TIME";
    public static final java.lang.String _ORDER_EXTERNAL_ID = "ORDER_EXTERNAL_ID";
    public static final java.lang.String _ORDER_PO_NUMBER = "ORDER_PO_NUMBER";
    public static final java.lang.String _ORDER_AGENCY = "ORDER_AGENCY";
    public static final java.lang.String _ORDER_LABELS = "ORDER_LABELS";
    public static final java.lang.String _ORDER_TRAFFICKER = "ORDER_TRAFFICKER";
    public static final java.lang.String _ORDER_SECONDARY_TRAFFICKERS = "ORDER_SECONDARY_TRAFFICKERS";
    public static final java.lang.String _ORDER_SALESPERSON = "ORDER_SALESPERSON";
    public static final java.lang.String _ORDER_SECONDARY_SALESPEOPLE = "ORDER_SECONDARY_SALESPEOPLE";
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
    public static final java.lang.String _CREATIVE_OR_CREATIVE_SET = "CREATIVE_OR_CREATIVE_SET";
    public static final java.lang.String _MASTER_COMPANION_TYPE = "MASTER_COMPANION_TYPE";
    public static final java.lang.String _LINE_ITEM_CONTRACTED_QUANTITY = "LINE_ITEM_CONTRACTED_QUANTITY";
    public static final java.lang.String _ADVERTISER_LABELS = "ADVERTISER_LABELS";
    public static final java.lang.String _CREATIVE_CLICK_THROUGH_URL = "CREATIVE_CLICK_THROUGH_URL";
    public static final DimensionAttribute LINE_ITEM_LABELS = new DimensionAttribute(_LINE_ITEM_LABELS);
    public static final DimensionAttribute ORDER_START_DATE_TIME = new DimensionAttribute(_ORDER_START_DATE_TIME);
    public static final DimensionAttribute ORDER_END_DATE_TIME = new DimensionAttribute(_ORDER_END_DATE_TIME);
    public static final DimensionAttribute ORDER_EXTERNAL_ID = new DimensionAttribute(_ORDER_EXTERNAL_ID);
    public static final DimensionAttribute ORDER_PO_NUMBER = new DimensionAttribute(_ORDER_PO_NUMBER);
    public static final DimensionAttribute ORDER_AGENCY = new DimensionAttribute(_ORDER_AGENCY);
    public static final DimensionAttribute ORDER_LABELS = new DimensionAttribute(_ORDER_LABELS);
    public static final DimensionAttribute ORDER_TRAFFICKER = new DimensionAttribute(_ORDER_TRAFFICKER);
    public static final DimensionAttribute ORDER_SECONDARY_TRAFFICKERS = new DimensionAttribute(_ORDER_SECONDARY_TRAFFICKERS);
    public static final DimensionAttribute ORDER_SALESPERSON = new DimensionAttribute(_ORDER_SALESPERSON);
    public static final DimensionAttribute ORDER_SECONDARY_SALESPEOPLE = new DimensionAttribute(_ORDER_SECONDARY_SALESPEOPLE);
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
    public static final DimensionAttribute CREATIVE_OR_CREATIVE_SET = new DimensionAttribute(_CREATIVE_OR_CREATIVE_SET);
    public static final DimensionAttribute MASTER_COMPANION_TYPE = new DimensionAttribute(_MASTER_COMPANION_TYPE);
    public static final DimensionAttribute LINE_ITEM_CONTRACTED_QUANTITY = new DimensionAttribute(_LINE_ITEM_CONTRACTED_QUANTITY);
    public static final DimensionAttribute ADVERTISER_LABELS = new DimensionAttribute(_ADVERTISER_LABELS);
    public static final DimensionAttribute CREATIVE_CLICK_THROUGH_URL = new DimensionAttribute(_CREATIVE_CLICK_THROUGH_URL);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "DimensionAttribute"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
