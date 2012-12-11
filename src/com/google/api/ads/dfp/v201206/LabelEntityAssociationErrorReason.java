/**
 * LabelEntityAssociationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;

public class LabelEntityAssociationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelEntityAssociationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_COMPANY_TYPE = "INVALID_COMPANY_TYPE";
    public static final java.lang.String _DUPLICATE_ASSOCIATION = "DUPLICATE_ASSOCIATION";
    public static final java.lang.String _INVALID_ASSOCIATION = "INVALID_ASSOCIATION";
    public static final java.lang.String _DUPLICATE_ASSOCIATION_WITH_NEGATION = "DUPLICATE_ASSOCIATION_WITH_NEGATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final LabelEntityAssociationErrorReason INVALID_COMPANY_TYPE = new LabelEntityAssociationErrorReason(_INVALID_COMPANY_TYPE);
    public static final LabelEntityAssociationErrorReason DUPLICATE_ASSOCIATION = new LabelEntityAssociationErrorReason(_DUPLICATE_ASSOCIATION);
    public static final LabelEntityAssociationErrorReason INVALID_ASSOCIATION = new LabelEntityAssociationErrorReason(_INVALID_ASSOCIATION);
    public static final LabelEntityAssociationErrorReason DUPLICATE_ASSOCIATION_WITH_NEGATION = new LabelEntityAssociationErrorReason(_DUPLICATE_ASSOCIATION_WITH_NEGATION);
    public static final LabelEntityAssociationErrorReason UNKNOWN = new LabelEntityAssociationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static LabelEntityAssociationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LabelEntityAssociationErrorReason enumeration = (LabelEntityAssociationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LabelEntityAssociationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LabelEntityAssociationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "LabelEntityAssociationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
