/**
 * CompanyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201204;

public class CompanyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompanyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HOUSE_ADVERTISER = "HOUSE_ADVERTISER";
    public static final java.lang.String _HOUSE_AGENCY = "HOUSE_AGENCY";
    public static final java.lang.String _ADVERTISER = "ADVERTISER";
    public static final java.lang.String _AGENCY = "AGENCY";
    public static final java.lang.String _AD_NETWORK = "AD_NETWORK";
    public static final CompanyType HOUSE_ADVERTISER = new CompanyType(_HOUSE_ADVERTISER);
    public static final CompanyType HOUSE_AGENCY = new CompanyType(_HOUSE_AGENCY);
    public static final CompanyType ADVERTISER = new CompanyType(_ADVERTISER);
    public static final CompanyType AGENCY = new CompanyType(_AGENCY);
    public static final CompanyType AD_NETWORK = new CompanyType(_AD_NETWORK);
    public java.lang.String getValue() { return _value_;}
    public static CompanyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompanyType enumeration = (CompanyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompanyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CompanyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "Company.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
