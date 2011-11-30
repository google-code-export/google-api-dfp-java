/**
 * OrderActionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201107;

public class OrderActionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrderActionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PERMISSION_DENIED = "PERMISSION_DENIED";
    public static final java.lang.String _NOT_APPLICABLE = "NOT_APPLICABLE";
    public static final java.lang.String _IS_ARCHIVED = "IS_ARCHIVED";
    public static final java.lang.String _HAS_ENDED = "HAS_ENDED";
    public static final java.lang.String _CANNOT_APPROVE_WITH_UNRESERVED_LINE_ITEMS = "CANNOT_APPROVE_WITH_UNRESERVED_LINE_ITEMS";
    public static final java.lang.String _CANNOT_DELETE_ORDER_WITH_DELIVERED_LINEITEMS = "CANNOT_DELETE_ORDER_WITH_DELIVERED_LINEITEMS";
    public static final java.lang.String _CANNOT_APPROVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE = "CANNOT_APPROVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE";
    public static final OrderActionErrorReason PERMISSION_DENIED = new OrderActionErrorReason(_PERMISSION_DENIED);
    public static final OrderActionErrorReason NOT_APPLICABLE = new OrderActionErrorReason(_NOT_APPLICABLE);
    public static final OrderActionErrorReason IS_ARCHIVED = new OrderActionErrorReason(_IS_ARCHIVED);
    public static final OrderActionErrorReason HAS_ENDED = new OrderActionErrorReason(_HAS_ENDED);
    public static final OrderActionErrorReason CANNOT_APPROVE_WITH_UNRESERVED_LINE_ITEMS = new OrderActionErrorReason(_CANNOT_APPROVE_WITH_UNRESERVED_LINE_ITEMS);
    public static final OrderActionErrorReason CANNOT_DELETE_ORDER_WITH_DELIVERED_LINEITEMS = new OrderActionErrorReason(_CANNOT_DELETE_ORDER_WITH_DELIVERED_LINEITEMS);
    public static final OrderActionErrorReason CANNOT_APPROVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE = new OrderActionErrorReason(_CANNOT_APPROVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE);
    public java.lang.String getValue() { return _value_;}
    public static OrderActionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OrderActionErrorReason enumeration = (OrderActionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrderActionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OrderActionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "OrderActionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
