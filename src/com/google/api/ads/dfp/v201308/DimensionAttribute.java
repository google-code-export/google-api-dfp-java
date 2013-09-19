/**
 * DimensionAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;

public class DimensionAttribute implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DimensionAttribute(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LINE_ITEM_LABELS = "LINE_ITEM_LABELS";
    public static final java.lang.String _LINE_ITEM_LABEL_IDS = "LINE_ITEM_LABEL_IDS";
    public static final java.lang.String _LINE_ITEM_OPTIMIZABLE = "LINE_ITEM_OPTIMIZABLE";
    public static final java.lang.String _LINE_ITEM_DELIVERY_PACING = "LINE_ITEM_DELIVERY_PACING";
    public static final java.lang.String _LINE_ITEM_FREQUENCY_CAP = "LINE_ITEM_FREQUENCY_CAP";
    public static final java.lang.String _ADVERTISER_EXTERNAL_ID = "ADVERTISER_EXTERNAL_ID";
    public static final java.lang.String _ORDER_START_DATE_TIME = "ORDER_START_DATE_TIME";
    public static final java.lang.String _ORDER_END_DATE_TIME = "ORDER_END_DATE_TIME";
    public static final java.lang.String _ORDER_EXTERNAL_ID = "ORDER_EXTERNAL_ID";
    public static final java.lang.String _ORDER_PO_NUMBER = "ORDER_PO_NUMBER";
    public static final java.lang.String _ORDER_AGENCY = "ORDER_AGENCY";
    public static final java.lang.String _ORDER_AGENCY_ID = "ORDER_AGENCY_ID";
    public static final java.lang.String _ORDER_LABELS = "ORDER_LABELS";
    public static final java.lang.String _ORDER_LABEL_IDS = "ORDER_LABEL_IDS";
    public static final java.lang.String _ORDER_TRAFFICKER = "ORDER_TRAFFICKER";
    public static final java.lang.String _ORDER_SECONDARY_TRAFFICKERS = "ORDER_SECONDARY_TRAFFICKERS";
    public static final java.lang.String _ORDER_SALESPERSON = "ORDER_SALESPERSON";
    public static final java.lang.String _ORDER_SECONDARY_SALESPEOPLE = "ORDER_SECONDARY_SALESPEOPLE";
    public static final java.lang.String _ORDER_LIFETIME_IMPRESSIONS = "ORDER_LIFETIME_IMPRESSIONS";
    public static final java.lang.String _ORDER_LIFETIME_CLICKS = "ORDER_LIFETIME_CLICKS";
    public static final java.lang.String _ORDER_LIFETIME_MERGED_IMPRESSIONS = "ORDER_LIFETIME_MERGED_IMPRESSIONS";
    public static final java.lang.String _ORDER_LIFETIME_MERGED_CLICKS = "ORDER_LIFETIME_MERGED_CLICKS";
    public static final java.lang.String _ORDER_BOOKED_CPM = "ORDER_BOOKED_CPM";
    public static final java.lang.String _ORDER_BOOKED_CPC = "ORDER_BOOKED_CPC";
    public static final java.lang.String _LINE_ITEM_START_DATE_TIME = "LINE_ITEM_START_DATE_TIME";
    public static final java.lang.String _LINE_ITEM_END_DATE_TIME = "LINE_ITEM_END_DATE_TIME";
    public static final java.lang.String _LINE_ITEM_EXTERNAL_ID = "LINE_ITEM_EXTERNAL_ID";
    public static final java.lang.String _LINE_ITEM_COST_TYPE = "LINE_ITEM_COST_TYPE";
    public static final java.lang.String _LINE_ITEM_COST_PER_UNIT = "LINE_ITEM_COST_PER_UNIT";
    public static final java.lang.String _LINE_ITEM_CURRENCY_CODE = "LINE_ITEM_CURRENCY_CODE";
    public static final java.lang.String _LINE_ITEM_GOAL_QUANTITY = "LINE_ITEM_GOAL_QUANTITY";
    public static final java.lang.String _LINE_ITEM_SPONSORSHIP_GOAL_PERCENTAGE = "LINE_ITEM_SPONSORSHIP_GOAL_PERCENTAGE";
    public static final java.lang.String _LINE_ITEM_LIFETIME_IMPRESSIONS = "LINE_ITEM_LIFETIME_IMPRESSIONS";
    public static final java.lang.String _LINE_ITEM_LIFETIME_CLICKS = "LINE_ITEM_LIFETIME_CLICKS";
    public static final java.lang.String _LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS = "LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS";
    public static final java.lang.String _LINE_ITEM_LIFETIME_MERGED_CLICKS = "LINE_ITEM_LIFETIME_MERGED_CLICKS";
    public static final java.lang.String _LINE_ITEM_PRIORITY = "LINE_ITEM_PRIORITY";
    public static final java.lang.String _CREATIVE_OR_CREATIVE_SET = "CREATIVE_OR_CREATIVE_SET";
    public static final java.lang.String _MASTER_COMPANION_TYPE = "MASTER_COMPANION_TYPE";
    public static final java.lang.String _LINE_ITEM_CONTRACTED_QUANTITY = "LINE_ITEM_CONTRACTED_QUANTITY";
    public static final java.lang.String _LINE_ITEM_DISCOUNT = "LINE_ITEM_DISCOUNT";
    public static final java.lang.String _LINE_ITEM_NON_CPD_BOOKED_REVENUE = "LINE_ITEM_NON_CPD_BOOKED_REVENUE";
    public static final java.lang.String _ADVERTISER_LABELS = "ADVERTISER_LABELS";
    public static final java.lang.String _ADVERTISER_LABEL_IDS = "ADVERTISER_LABEL_IDS";
    public static final java.lang.String _CREATIVE_CLICK_THROUGH_URL = "CREATIVE_CLICK_THROUGH_URL";
    public static final java.lang.String _LINE_ITEM_CREATIVE_START_DATE = "LINE_ITEM_CREATIVE_START_DATE";
    public static final java.lang.String _LINE_ITEM_CREATIVE_END_DATE = "LINE_ITEM_CREATIVE_END_DATE";
    public static final java.lang.String _PROPOSAL_START_DATE_TIME = "PROPOSAL_START_DATE_TIME";
    public static final java.lang.String _PROPOSAL_END_DATE_TIME = "PROPOSAL_END_DATE_TIME";
    public static final java.lang.String _PROPOSAL_CREATION_DATE_TIME = "PROPOSAL_CREATION_DATE_TIME";
    public static final java.lang.String _PROPOSAL_PROBABILITY_TO_CLOSE = "PROPOSAL_PROBABILITY_TO_CLOSE";
    public static final java.lang.String _PROPOSAL_STATUS = "PROPOSAL_STATUS";
    public static final java.lang.String _PROPOSAL_CURRENCY = "PROPOSAL_CURRENCY";
    public static final java.lang.String _PROPOSAL_EXCHANGE_RATE = "PROPOSAL_EXCHANGE_RATE";
    public static final java.lang.String _PROPOSAL_AGENCY_COMMISSION_RATE = "PROPOSAL_AGENCY_COMMISSION_RATE";
    public static final java.lang.String _PROPOSAL_VAT_RATE = "PROPOSAL_VAT_RATE";
    public static final java.lang.String _PROPOSAL_DISCOUNT = "PROPOSAL_DISCOUNT";
    public static final java.lang.String _PROPOSAL_ADVERTISER_DISCOUNT = "PROPOSAL_ADVERTISER_DISCOUNT";
    public static final java.lang.String _PROPOSAL_ADVERTISER = "PROPOSAL_ADVERTISER";
    public static final java.lang.String _PROPOSAL_ADVERTISER_ID = "PROPOSAL_ADVERTISER_ID";
    public static final java.lang.String _PROPOSAL_AGENCIES = "PROPOSAL_AGENCIES";
    public static final java.lang.String _PROPOSAL_AGENCY_IDS = "PROPOSAL_AGENCY_IDS";
    public static final java.lang.String _PROPOSAL_PO_NUMBER = "PROPOSAL_PO_NUMBER";
    public static final java.lang.String _PROPOSAL_PRIMARY_SALESPERSON = "PROPOSAL_PRIMARY_SALESPERSON";
    public static final java.lang.String _PROPOSAL_SECONDARY_SALESPEOPLE = "PROPOSAL_SECONDARY_SALESPEOPLE";
    public static final java.lang.String _PROPOSAL_BILLING_SOURCE = "PROPOSAL_BILLING_SOURCE";
    public static final java.lang.String _PROPOSAL_BILLING_CAP = "PROPOSAL_BILLING_CAP";
    public static final java.lang.String _PROPOSAL_BILLING_SCHEDULE = "PROPOSAL_BILLING_SCHEDULE";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_START_DATE_TIME = "PROPOSAL_LINE_ITEM_START_DATE_TIME";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_END_DATE_TIME = "PROPOSAL_LINE_ITEM_END_DATE_TIME";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_RATE_TYPE = "PROPOSAL_LINE_ITEM_RATE_TYPE";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_COST_PER_UNIT = "PROPOSAL_LINE_ITEM_COST_PER_UNIT";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT = "PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_COST_PER_UNIT_GROSS = "PROPOSAL_LINE_ITEM_COST_PER_UNIT_GROSS";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT_GROSS = "PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT_GROSS";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_TYPE_AND_PRIORITY = "PROPOSAL_LINE_ITEM_TYPE_AND_PRIORITY";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_SIZE = "PROPOSAL_LINE_ITEM_SIZE";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_PRODUCT_ADJUSTMENT = "PROPOSAL_LINE_ITEM_PRODUCT_ADJUSTMENT";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_BUFFER = "PROPOSAL_LINE_ITEM_BUFFER";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_TARGET_RATE_NET = "PROPOSAL_LINE_ITEM_TARGET_RATE_NET";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_BILLING_SOURCE = "PROPOSAL_LINE_ITEM_BILLING_SOURCE";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_BILLING_CAP = "PROPOSAL_LINE_ITEM_BILLING_CAP";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_BILLING_SCHEDULE = "PROPOSAL_LINE_ITEM_BILLING_SCHEDULE";
    public static final java.lang.String _PRODUCT_TEMPLATE_RATE_TYPE = "PRODUCT_TEMPLATE_RATE_TYPE";
    public static final java.lang.String _PRODUCT_TEMPLATE_STATUS = "PRODUCT_TEMPLATE_STATUS";
    public static final java.lang.String _PRODUCT_TEMPLATE_TYPE_AND_PRIORITY = "PRODUCT_TEMPLATE_TYPE_AND_PRIORITY";
    public static final java.lang.String _PRODUCT_PRODUCT_TEMPLATE_NAME = "PRODUCT_PRODUCT_TEMPLATE_NAME";
    public static final java.lang.String _PRODUCT_RATE_TYPE = "PRODUCT_RATE_TYPE";
    public static final java.lang.String _PRODUCT_STATUS = "PRODUCT_STATUS";
    public static final java.lang.String _PRODUCT_TYPE_AND_PRIORITY = "PRODUCT_TYPE_AND_PRIORITY";
    public static final java.lang.String _PROPOSAL_ADVERTISER_TYPE = "PROPOSAL_ADVERTISER_TYPE";
    public static final java.lang.String _PROPOSAL_ADVERTISER_CREDIT_STATUS = "PROPOSAL_ADVERTISER_CREDIT_STATUS";
    public static final java.lang.String _PROPOSAL_AGENCY_TYPE = "PROPOSAL_AGENCY_TYPE";
    public static final java.lang.String _PROPOSAL_AGENCY_CREDIT_STATUS = "PROPOSAL_AGENCY_CREDIT_STATUS";
    public static final java.lang.String _CONTENT_CMS_NAME = "CONTENT_CMS_NAME";
    public static final java.lang.String _CONTENT_CMS_VIDEO_ID = "CONTENT_CMS_VIDEO_ID";
    public static final java.lang.String _AD_UNIT_CODE = "AD_UNIT_CODE";
    public static final DimensionAttribute LINE_ITEM_LABELS = new DimensionAttribute(_LINE_ITEM_LABELS);
    public static final DimensionAttribute LINE_ITEM_LABEL_IDS = new DimensionAttribute(_LINE_ITEM_LABEL_IDS);
    public static final DimensionAttribute LINE_ITEM_OPTIMIZABLE = new DimensionAttribute(_LINE_ITEM_OPTIMIZABLE);
    public static final DimensionAttribute LINE_ITEM_DELIVERY_PACING = new DimensionAttribute(_LINE_ITEM_DELIVERY_PACING);
    public static final DimensionAttribute LINE_ITEM_FREQUENCY_CAP = new DimensionAttribute(_LINE_ITEM_FREQUENCY_CAP);
    public static final DimensionAttribute ADVERTISER_EXTERNAL_ID = new DimensionAttribute(_ADVERTISER_EXTERNAL_ID);
    public static final DimensionAttribute ORDER_START_DATE_TIME = new DimensionAttribute(_ORDER_START_DATE_TIME);
    public static final DimensionAttribute ORDER_END_DATE_TIME = new DimensionAttribute(_ORDER_END_DATE_TIME);
    public static final DimensionAttribute ORDER_EXTERNAL_ID = new DimensionAttribute(_ORDER_EXTERNAL_ID);
    public static final DimensionAttribute ORDER_PO_NUMBER = new DimensionAttribute(_ORDER_PO_NUMBER);
    public static final DimensionAttribute ORDER_AGENCY = new DimensionAttribute(_ORDER_AGENCY);
    public static final DimensionAttribute ORDER_AGENCY_ID = new DimensionAttribute(_ORDER_AGENCY_ID);
    public static final DimensionAttribute ORDER_LABELS = new DimensionAttribute(_ORDER_LABELS);
    public static final DimensionAttribute ORDER_LABEL_IDS = new DimensionAttribute(_ORDER_LABEL_IDS);
    public static final DimensionAttribute ORDER_TRAFFICKER = new DimensionAttribute(_ORDER_TRAFFICKER);
    public static final DimensionAttribute ORDER_SECONDARY_TRAFFICKERS = new DimensionAttribute(_ORDER_SECONDARY_TRAFFICKERS);
    public static final DimensionAttribute ORDER_SALESPERSON = new DimensionAttribute(_ORDER_SALESPERSON);
    public static final DimensionAttribute ORDER_SECONDARY_SALESPEOPLE = new DimensionAttribute(_ORDER_SECONDARY_SALESPEOPLE);
    public static final DimensionAttribute ORDER_LIFETIME_IMPRESSIONS = new DimensionAttribute(_ORDER_LIFETIME_IMPRESSIONS);
    public static final DimensionAttribute ORDER_LIFETIME_CLICKS = new DimensionAttribute(_ORDER_LIFETIME_CLICKS);
    public static final DimensionAttribute ORDER_LIFETIME_MERGED_IMPRESSIONS = new DimensionAttribute(_ORDER_LIFETIME_MERGED_IMPRESSIONS);
    public static final DimensionAttribute ORDER_LIFETIME_MERGED_CLICKS = new DimensionAttribute(_ORDER_LIFETIME_MERGED_CLICKS);
    public static final DimensionAttribute ORDER_BOOKED_CPM = new DimensionAttribute(_ORDER_BOOKED_CPM);
    public static final DimensionAttribute ORDER_BOOKED_CPC = new DimensionAttribute(_ORDER_BOOKED_CPC);
    public static final DimensionAttribute LINE_ITEM_START_DATE_TIME = new DimensionAttribute(_LINE_ITEM_START_DATE_TIME);
    public static final DimensionAttribute LINE_ITEM_END_DATE_TIME = new DimensionAttribute(_LINE_ITEM_END_DATE_TIME);
    public static final DimensionAttribute LINE_ITEM_EXTERNAL_ID = new DimensionAttribute(_LINE_ITEM_EXTERNAL_ID);
    public static final DimensionAttribute LINE_ITEM_COST_TYPE = new DimensionAttribute(_LINE_ITEM_COST_TYPE);
    public static final DimensionAttribute LINE_ITEM_COST_PER_UNIT = new DimensionAttribute(_LINE_ITEM_COST_PER_UNIT);
    public static final DimensionAttribute LINE_ITEM_CURRENCY_CODE = new DimensionAttribute(_LINE_ITEM_CURRENCY_CODE);
    public static final DimensionAttribute LINE_ITEM_GOAL_QUANTITY = new DimensionAttribute(_LINE_ITEM_GOAL_QUANTITY);
    public static final DimensionAttribute LINE_ITEM_SPONSORSHIP_GOAL_PERCENTAGE = new DimensionAttribute(_LINE_ITEM_SPONSORSHIP_GOAL_PERCENTAGE);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_IMPRESSIONS = new DimensionAttribute(_LINE_ITEM_LIFETIME_IMPRESSIONS);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_CLICKS = new DimensionAttribute(_LINE_ITEM_LIFETIME_CLICKS);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS = new DimensionAttribute(_LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS);
    public static final DimensionAttribute LINE_ITEM_LIFETIME_MERGED_CLICKS = new DimensionAttribute(_LINE_ITEM_LIFETIME_MERGED_CLICKS);
    public static final DimensionAttribute LINE_ITEM_PRIORITY = new DimensionAttribute(_LINE_ITEM_PRIORITY);
    public static final DimensionAttribute CREATIVE_OR_CREATIVE_SET = new DimensionAttribute(_CREATIVE_OR_CREATIVE_SET);
    public static final DimensionAttribute MASTER_COMPANION_TYPE = new DimensionAttribute(_MASTER_COMPANION_TYPE);
    public static final DimensionAttribute LINE_ITEM_CONTRACTED_QUANTITY = new DimensionAttribute(_LINE_ITEM_CONTRACTED_QUANTITY);
    public static final DimensionAttribute LINE_ITEM_DISCOUNT = new DimensionAttribute(_LINE_ITEM_DISCOUNT);
    public static final DimensionAttribute LINE_ITEM_NON_CPD_BOOKED_REVENUE = new DimensionAttribute(_LINE_ITEM_NON_CPD_BOOKED_REVENUE);
    public static final DimensionAttribute ADVERTISER_LABELS = new DimensionAttribute(_ADVERTISER_LABELS);
    public static final DimensionAttribute ADVERTISER_LABEL_IDS = new DimensionAttribute(_ADVERTISER_LABEL_IDS);
    public static final DimensionAttribute CREATIVE_CLICK_THROUGH_URL = new DimensionAttribute(_CREATIVE_CLICK_THROUGH_URL);
    public static final DimensionAttribute LINE_ITEM_CREATIVE_START_DATE = new DimensionAttribute(_LINE_ITEM_CREATIVE_START_DATE);
    public static final DimensionAttribute LINE_ITEM_CREATIVE_END_DATE = new DimensionAttribute(_LINE_ITEM_CREATIVE_END_DATE);
    public static final DimensionAttribute PROPOSAL_START_DATE_TIME = new DimensionAttribute(_PROPOSAL_START_DATE_TIME);
    public static final DimensionAttribute PROPOSAL_END_DATE_TIME = new DimensionAttribute(_PROPOSAL_END_DATE_TIME);
    public static final DimensionAttribute PROPOSAL_CREATION_DATE_TIME = new DimensionAttribute(_PROPOSAL_CREATION_DATE_TIME);
    public static final DimensionAttribute PROPOSAL_PROBABILITY_TO_CLOSE = new DimensionAttribute(_PROPOSAL_PROBABILITY_TO_CLOSE);
    public static final DimensionAttribute PROPOSAL_STATUS = new DimensionAttribute(_PROPOSAL_STATUS);
    public static final DimensionAttribute PROPOSAL_CURRENCY = new DimensionAttribute(_PROPOSAL_CURRENCY);
    public static final DimensionAttribute PROPOSAL_EXCHANGE_RATE = new DimensionAttribute(_PROPOSAL_EXCHANGE_RATE);
    public static final DimensionAttribute PROPOSAL_AGENCY_COMMISSION_RATE = new DimensionAttribute(_PROPOSAL_AGENCY_COMMISSION_RATE);
    public static final DimensionAttribute PROPOSAL_VAT_RATE = new DimensionAttribute(_PROPOSAL_VAT_RATE);
    public static final DimensionAttribute PROPOSAL_DISCOUNT = new DimensionAttribute(_PROPOSAL_DISCOUNT);
    public static final DimensionAttribute PROPOSAL_ADVERTISER_DISCOUNT = new DimensionAttribute(_PROPOSAL_ADVERTISER_DISCOUNT);
    public static final DimensionAttribute PROPOSAL_ADVERTISER = new DimensionAttribute(_PROPOSAL_ADVERTISER);
    public static final DimensionAttribute PROPOSAL_ADVERTISER_ID = new DimensionAttribute(_PROPOSAL_ADVERTISER_ID);
    public static final DimensionAttribute PROPOSAL_AGENCIES = new DimensionAttribute(_PROPOSAL_AGENCIES);
    public static final DimensionAttribute PROPOSAL_AGENCY_IDS = new DimensionAttribute(_PROPOSAL_AGENCY_IDS);
    public static final DimensionAttribute PROPOSAL_PO_NUMBER = new DimensionAttribute(_PROPOSAL_PO_NUMBER);
    public static final DimensionAttribute PROPOSAL_PRIMARY_SALESPERSON = new DimensionAttribute(_PROPOSAL_PRIMARY_SALESPERSON);
    public static final DimensionAttribute PROPOSAL_SECONDARY_SALESPEOPLE = new DimensionAttribute(_PROPOSAL_SECONDARY_SALESPEOPLE);
    public static final DimensionAttribute PROPOSAL_BILLING_SOURCE = new DimensionAttribute(_PROPOSAL_BILLING_SOURCE);
    public static final DimensionAttribute PROPOSAL_BILLING_CAP = new DimensionAttribute(_PROPOSAL_BILLING_CAP);
    public static final DimensionAttribute PROPOSAL_BILLING_SCHEDULE = new DimensionAttribute(_PROPOSAL_BILLING_SCHEDULE);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_START_DATE_TIME = new DimensionAttribute(_PROPOSAL_LINE_ITEM_START_DATE_TIME);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_END_DATE_TIME = new DimensionAttribute(_PROPOSAL_LINE_ITEM_END_DATE_TIME);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_RATE_TYPE = new DimensionAttribute(_PROPOSAL_LINE_ITEM_RATE_TYPE);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_COST_PER_UNIT = new DimensionAttribute(_PROPOSAL_LINE_ITEM_COST_PER_UNIT);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT = new DimensionAttribute(_PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_COST_PER_UNIT_GROSS = new DimensionAttribute(_PROPOSAL_LINE_ITEM_COST_PER_UNIT_GROSS);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT_GROSS = new DimensionAttribute(_PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT_GROSS);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_TYPE_AND_PRIORITY = new DimensionAttribute(_PROPOSAL_LINE_ITEM_TYPE_AND_PRIORITY);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_SIZE = new DimensionAttribute(_PROPOSAL_LINE_ITEM_SIZE);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_PRODUCT_ADJUSTMENT = new DimensionAttribute(_PROPOSAL_LINE_ITEM_PRODUCT_ADJUSTMENT);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_BUFFER = new DimensionAttribute(_PROPOSAL_LINE_ITEM_BUFFER);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_TARGET_RATE_NET = new DimensionAttribute(_PROPOSAL_LINE_ITEM_TARGET_RATE_NET);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_BILLING_SOURCE = new DimensionAttribute(_PROPOSAL_LINE_ITEM_BILLING_SOURCE);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_BILLING_CAP = new DimensionAttribute(_PROPOSAL_LINE_ITEM_BILLING_CAP);
    public static final DimensionAttribute PROPOSAL_LINE_ITEM_BILLING_SCHEDULE = new DimensionAttribute(_PROPOSAL_LINE_ITEM_BILLING_SCHEDULE);
    public static final DimensionAttribute PRODUCT_TEMPLATE_RATE_TYPE = new DimensionAttribute(_PRODUCT_TEMPLATE_RATE_TYPE);
    public static final DimensionAttribute PRODUCT_TEMPLATE_STATUS = new DimensionAttribute(_PRODUCT_TEMPLATE_STATUS);
    public static final DimensionAttribute PRODUCT_TEMPLATE_TYPE_AND_PRIORITY = new DimensionAttribute(_PRODUCT_TEMPLATE_TYPE_AND_PRIORITY);
    public static final DimensionAttribute PRODUCT_PRODUCT_TEMPLATE_NAME = new DimensionAttribute(_PRODUCT_PRODUCT_TEMPLATE_NAME);
    public static final DimensionAttribute PRODUCT_RATE_TYPE = new DimensionAttribute(_PRODUCT_RATE_TYPE);
    public static final DimensionAttribute PRODUCT_STATUS = new DimensionAttribute(_PRODUCT_STATUS);
    public static final DimensionAttribute PRODUCT_TYPE_AND_PRIORITY = new DimensionAttribute(_PRODUCT_TYPE_AND_PRIORITY);
    public static final DimensionAttribute PROPOSAL_ADVERTISER_TYPE = new DimensionAttribute(_PROPOSAL_ADVERTISER_TYPE);
    public static final DimensionAttribute PROPOSAL_ADVERTISER_CREDIT_STATUS = new DimensionAttribute(_PROPOSAL_ADVERTISER_CREDIT_STATUS);
    public static final DimensionAttribute PROPOSAL_AGENCY_TYPE = new DimensionAttribute(_PROPOSAL_AGENCY_TYPE);
    public static final DimensionAttribute PROPOSAL_AGENCY_CREDIT_STATUS = new DimensionAttribute(_PROPOSAL_AGENCY_CREDIT_STATUS);
    public static final DimensionAttribute CONTENT_CMS_NAME = new DimensionAttribute(_CONTENT_CMS_NAME);
    public static final DimensionAttribute CONTENT_CMS_VIDEO_ID = new DimensionAttribute(_CONTENT_CMS_VIDEO_ID);
    public static final DimensionAttribute AD_UNIT_CODE = new DimensionAttribute(_AD_UNIT_CODE);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DimensionAttribute"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
