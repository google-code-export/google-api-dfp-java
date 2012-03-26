/**
 * OrderErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201203;

public class OrderErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrderErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UPDATE_CANCELED_ORDER_NOT_ALLOWED = "UPDATE_CANCELED_ORDER_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED = "UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_ARCHIVED_ORDER_NOT_ALLOWED = "UPDATE_ARCHIVED_ORDER_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_MODIFY_PROPOSAL_ID = "CANNOT_MODIFY_PROPOSAL_ID";
    public static final java.lang.String _PRIMARY_USER_REQUIRED = "PRIMARY_USER_REQUIRED";
    public static final java.lang.String _PRIMARY_USER_CANNOT_BE_SECONDARY = "PRIMARY_USER_CANNOT_BE_SECONDARY";
    public static final OrderErrorReason UPDATE_CANCELED_ORDER_NOT_ALLOWED = new OrderErrorReason(_UPDATE_CANCELED_ORDER_NOT_ALLOWED);
    public static final OrderErrorReason UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED = new OrderErrorReason(_UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED);
    public static final OrderErrorReason UPDATE_ARCHIVED_ORDER_NOT_ALLOWED = new OrderErrorReason(_UPDATE_ARCHIVED_ORDER_NOT_ALLOWED);
    public static final OrderErrorReason CANNOT_MODIFY_PROPOSAL_ID = new OrderErrorReason(_CANNOT_MODIFY_PROPOSAL_ID);
    public static final OrderErrorReason PRIMARY_USER_REQUIRED = new OrderErrorReason(_PRIMARY_USER_REQUIRED);
    public static final OrderErrorReason PRIMARY_USER_CANNOT_BE_SECONDARY = new OrderErrorReason(_PRIMARY_USER_CANNOT_BE_SECONDARY);
    public java.lang.String getValue() { return _value_;}
    public static OrderErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OrderErrorReason enumeration = (OrderErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrderErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OrderErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "OrderError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
