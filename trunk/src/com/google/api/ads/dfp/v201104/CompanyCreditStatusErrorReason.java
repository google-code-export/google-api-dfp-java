/**
 * CompanyCreditStatusErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201104;

public class CompanyCreditStatusErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompanyCreditStatusErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED = "COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_USE_CREDIT_STATUS_SETTING = "CANNOT_USE_CREDIT_STATUS_SETTING";
    public static final java.lang.String _CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING = "CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING";
    public static final java.lang.String _UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER = "UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER";
    public static final java.lang.String _UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM = "UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM";
    public static final CompanyCreditStatusErrorReason COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED = new CompanyCreditStatusErrorReason(_COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED);
    public static final CompanyCreditStatusErrorReason CANNOT_USE_CREDIT_STATUS_SETTING = new CompanyCreditStatusErrorReason(_CANNOT_USE_CREDIT_STATUS_SETTING);
    public static final CompanyCreditStatusErrorReason CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING = new CompanyCreditStatusErrorReason(_CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING);
    public static final CompanyCreditStatusErrorReason UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER = new CompanyCreditStatusErrorReason(_UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER);
    public static final CompanyCreditStatusErrorReason UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM = new CompanyCreditStatusErrorReason(_UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM);
    public java.lang.String getValue() { return _value_;}
    public static CompanyCreditStatusErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompanyCreditStatusErrorReason enumeration = (CompanyCreditStatusErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompanyCreditStatusErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CompanyCreditStatusErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "CompanyCreditStatusError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
