/**
 * ProposalLineItemErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;

public class ProposalLineItemErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProposalLineItemErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_SAME_RATE_CARD = "NOT_SAME_RATE_CARD";
    public static final java.lang.String _LINE_ITEM_TYPE_NOT_ALLOWED = "LINE_ITEM_TYPE_NOT_ALLOWED";
    public static final java.lang.String _END_DATE_TIME_NOT_AFTER_START_TIME = "END_DATE_TIME_NOT_AFTER_START_TIME";
    public static final java.lang.String _END_DATE_TIME_TOO_LATE = "END_DATE_TIME_TOO_LATE";
    public static final java.lang.String _START_DATE_TIME_IS_IN_PAST = "START_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _END_DATE_TIME_IS_IN_PAST = "END_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _FRONTLOADED_NOT_ALLOWED = "FRONTLOADED_NOT_ALLOWED";
    public static final java.lang.String _ALL_ROADBLOCK_NOT_ALLOWED = "ALL_ROADBLOCK_NOT_ALLOWED";
    public static final java.lang.String _CREATIVE_SET_ROADBLOCK_NOT_ALLOWED = "CREATIVE_SET_ROADBLOCK_NOT_ALLOWED";
    public static final java.lang.String _ALREADY_STARTED = "ALREADY_STARTED";
    public static final java.lang.String _CONFLICT_WITH_PRODUCT = "CONFLICT_WITH_PRODUCT";
    public static final java.lang.String _MOBILE_TECH_CRITERIA_NOT_SUPPORTED = "MOBILE_TECH_CRITERIA_NOT_SUPPORTED";
    public static final java.lang.String _UNSUPPORTED_TARGETING_TYPE = "UNSUPPORTED_TARGETING_TYPE";
    public static final java.lang.String _WRONG_COST = "WRONG_COST";
    public static final java.lang.String _INVALID_PRIORITY_FOR_LINE_ITEM_TYPE = "INVALID_PRIORITY_FOR_LINE_ITEM_TYPE";
    public static final java.lang.String _UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED = "UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK = "CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK";
    public static final java.lang.String _SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED = "SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_RESERVATION_NOT_ALLOWED = "UPDATE_RESERVATION_NOT_ALLOWED";
    public static final java.lang.String _INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE = "INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE";
    public static final java.lang.String _INCONSISTENT_ROADBLOCK_TYPE = "INCONSISTENT_ROADBLOCK_TYPE";
    public static final java.lang.String _INVALID_UNITS_BOUGHT_BUFFER = "INVALID_UNITS_BOUGHT_BUFFER";
    public static final java.lang.String _UPDATE_COST_ADJUSTMENT_NOT_ALLOWED = "UPDATE_COST_ADJUSTMENT_NOT_ALLOWED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProposalLineItemErrorReason NOT_SAME_RATE_CARD = new ProposalLineItemErrorReason(_NOT_SAME_RATE_CARD);
    public static final ProposalLineItemErrorReason LINE_ITEM_TYPE_NOT_ALLOWED = new ProposalLineItemErrorReason(_LINE_ITEM_TYPE_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason END_DATE_TIME_NOT_AFTER_START_TIME = new ProposalLineItemErrorReason(_END_DATE_TIME_NOT_AFTER_START_TIME);
    public static final ProposalLineItemErrorReason END_DATE_TIME_TOO_LATE = new ProposalLineItemErrorReason(_END_DATE_TIME_TOO_LATE);
    public static final ProposalLineItemErrorReason START_DATE_TIME_IS_IN_PAST = new ProposalLineItemErrorReason(_START_DATE_TIME_IS_IN_PAST);
    public static final ProposalLineItemErrorReason END_DATE_TIME_IS_IN_PAST = new ProposalLineItemErrorReason(_END_DATE_TIME_IS_IN_PAST);
    public static final ProposalLineItemErrorReason FRONTLOADED_NOT_ALLOWED = new ProposalLineItemErrorReason(_FRONTLOADED_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason ALL_ROADBLOCK_NOT_ALLOWED = new ProposalLineItemErrorReason(_ALL_ROADBLOCK_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason CREATIVE_SET_ROADBLOCK_NOT_ALLOWED = new ProposalLineItemErrorReason(_CREATIVE_SET_ROADBLOCK_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason ALREADY_STARTED = new ProposalLineItemErrorReason(_ALREADY_STARTED);
    public static final ProposalLineItemErrorReason CONFLICT_WITH_PRODUCT = new ProposalLineItemErrorReason(_CONFLICT_WITH_PRODUCT);
    public static final ProposalLineItemErrorReason MOBILE_TECH_CRITERIA_NOT_SUPPORTED = new ProposalLineItemErrorReason(_MOBILE_TECH_CRITERIA_NOT_SUPPORTED);
    public static final ProposalLineItemErrorReason UNSUPPORTED_TARGETING_TYPE = new ProposalLineItemErrorReason(_UNSUPPORTED_TARGETING_TYPE);
    public static final ProposalLineItemErrorReason WRONG_COST = new ProposalLineItemErrorReason(_WRONG_COST);
    public static final ProposalLineItemErrorReason INVALID_PRIORITY_FOR_LINE_ITEM_TYPE = new ProposalLineItemErrorReason(_INVALID_PRIORITY_FOR_LINE_ITEM_TYPE);
    public static final ProposalLineItemErrorReason UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED = new ProposalLineItemErrorReason(_UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK = new ProposalLineItemErrorReason(_CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK);
    public static final ProposalLineItemErrorReason SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED = new ProposalLineItemErrorReason(_SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason UPDATE_RESERVATION_NOT_ALLOWED = new ProposalLineItemErrorReason(_UPDATE_RESERVATION_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE = new ProposalLineItemErrorReason(_INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE);
    public static final ProposalLineItemErrorReason INCONSISTENT_ROADBLOCK_TYPE = new ProposalLineItemErrorReason(_INCONSISTENT_ROADBLOCK_TYPE);
    public static final ProposalLineItemErrorReason INVALID_UNITS_BOUGHT_BUFFER = new ProposalLineItemErrorReason(_INVALID_UNITS_BOUGHT_BUFFER);
    public static final ProposalLineItemErrorReason UPDATE_COST_ADJUSTMENT_NOT_ALLOWED = new ProposalLineItemErrorReason(_UPDATE_COST_ADJUSTMENT_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason UNKNOWN = new ProposalLineItemErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProposalLineItemErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProposalLineItemErrorReason enumeration = (ProposalLineItemErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProposalLineItemErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProposalLineItemErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ProposalLineItemError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
