/**
 * ProductErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public class ProductErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TEMPLATE_NOT_FOUND = "TEMPLATE_NOT_FOUND";
    public static final java.lang.String _MALFORMED_PRODUCT_ID = "MALFORMED_PRODUCT_ID";
    public static final java.lang.String _BAD_PRODUCT_ID_FEATURE = "BAD_PRODUCT_ID_FEATURE";
    public static final java.lang.String _BAD_PRODUCT_TEMPLATE_ID = "BAD_PRODUCT_TEMPLATE_ID";
    public static final java.lang.String _CANNOT_UPDATE_ARCHIVED_PRODUCT = "CANNOT_UPDATE_ARCHIVED_PRODUCT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProductErrorReason TEMPLATE_NOT_FOUND = new ProductErrorReason(_TEMPLATE_NOT_FOUND);
    public static final ProductErrorReason MALFORMED_PRODUCT_ID = new ProductErrorReason(_MALFORMED_PRODUCT_ID);
    public static final ProductErrorReason BAD_PRODUCT_ID_FEATURE = new ProductErrorReason(_BAD_PRODUCT_ID_FEATURE);
    public static final ProductErrorReason BAD_PRODUCT_TEMPLATE_ID = new ProductErrorReason(_BAD_PRODUCT_TEMPLATE_ID);
    public static final ProductErrorReason CANNOT_UPDATE_ARCHIVED_PRODUCT = new ProductErrorReason(_CANNOT_UPDATE_ARCHIVED_PRODUCT);
    public static final ProductErrorReason UNKNOWN = new ProductErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProductErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductErrorReason enumeration = (ProductErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProductErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
