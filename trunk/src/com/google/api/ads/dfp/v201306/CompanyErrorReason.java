/**
 * CompanyErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public class CompanyErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompanyErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE = "CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE";
    public static final java.lang.String _CANNOT_UPDATE_COMPANY_TYPE = "CANNOT_UPDATE_COMPANY_TYPE";
    public static final java.lang.String _INVALID_COMPANY_TYPE = "INVALID_COMPANY_TYPE";
    public static final java.lang.String _PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY = "PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY";
    public static final java.lang.String _THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE = "THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CompanyErrorReason CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE = new CompanyErrorReason(_CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE);
    public static final CompanyErrorReason CANNOT_UPDATE_COMPANY_TYPE = new CompanyErrorReason(_CANNOT_UPDATE_COMPANY_TYPE);
    public static final CompanyErrorReason INVALID_COMPANY_TYPE = new CompanyErrorReason(_INVALID_COMPANY_TYPE);
    public static final CompanyErrorReason PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY = new CompanyErrorReason(_PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY);
    public static final CompanyErrorReason THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE = new CompanyErrorReason(_THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE);
    public static final CompanyErrorReason UNKNOWN = new CompanyErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CompanyErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompanyErrorReason enumeration = (CompanyErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompanyErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CompanyErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CompanyError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
