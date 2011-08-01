/**
 * LineItemCreativeAssociationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201107;

public class LineItemCreativeAssociationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineItemCreativeAssociationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _NOT_SERVING = "NOT_SERVING";
    public static final java.lang.String _INACTIVE = "INACTIVE";
    public static final java.lang.String _DELETED = "DELETED";
    public static final LineItemCreativeAssociationStatus ACTIVE = new LineItemCreativeAssociationStatus(_ACTIVE);
    public static final LineItemCreativeAssociationStatus NOT_SERVING = new LineItemCreativeAssociationStatus(_NOT_SERVING);
    public static final LineItemCreativeAssociationStatus INACTIVE = new LineItemCreativeAssociationStatus(_INACTIVE);
    public static final LineItemCreativeAssociationStatus DELETED = new LineItemCreativeAssociationStatus(_DELETED);
    public java.lang.String getValue() { return _value_;}
    public static LineItemCreativeAssociationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LineItemCreativeAssociationStatus enumeration = (LineItemCreativeAssociationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineItemCreativeAssociationStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LineItemCreativeAssociationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "LineItemCreativeAssociation.Status"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
