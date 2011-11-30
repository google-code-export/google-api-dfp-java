/**
 * InventoryUnitSizesErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201111;

public class InventoryUnitSizesErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InventoryUnitSizesErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_SIZES = "INVALID_SIZES";
    public static final java.lang.String _INVALID_SIZE_FOR_PLATFORM = "INVALID_SIZE_FOR_PLATFORM";
    public static final java.lang.String _INVALID_SIZE_FOR_ENVIRONMENT = "INVALID_SIZE_FOR_ENVIRONMENT";
    public static final java.lang.String _INVALID_SIZE_FOR_MASTER = "INVALID_SIZE_FOR_MASTER";
    public static final java.lang.String _INVALID_SIZE_FOR_COMPANION = "INVALID_SIZE_FOR_COMPANION";
    public static final java.lang.String _DUPLICATE_MASTER_SIZES = "DUPLICATE_MASTER_SIZES";
    public static final java.lang.String _ASPECT_RATIO_NOT_SUPPORTED = "ASPECT_RATIO_NOT_SUPPORTED";
    public static final InventoryUnitSizesErrorReason INVALID_SIZES = new InventoryUnitSizesErrorReason(_INVALID_SIZES);
    public static final InventoryUnitSizesErrorReason INVALID_SIZE_FOR_PLATFORM = new InventoryUnitSizesErrorReason(_INVALID_SIZE_FOR_PLATFORM);
    public static final InventoryUnitSizesErrorReason INVALID_SIZE_FOR_ENVIRONMENT = new InventoryUnitSizesErrorReason(_INVALID_SIZE_FOR_ENVIRONMENT);
    public static final InventoryUnitSizesErrorReason INVALID_SIZE_FOR_MASTER = new InventoryUnitSizesErrorReason(_INVALID_SIZE_FOR_MASTER);
    public static final InventoryUnitSizesErrorReason INVALID_SIZE_FOR_COMPANION = new InventoryUnitSizesErrorReason(_INVALID_SIZE_FOR_COMPANION);
    public static final InventoryUnitSizesErrorReason DUPLICATE_MASTER_SIZES = new InventoryUnitSizesErrorReason(_DUPLICATE_MASTER_SIZES);
    public static final InventoryUnitSizesErrorReason ASPECT_RATIO_NOT_SUPPORTED = new InventoryUnitSizesErrorReason(_ASPECT_RATIO_NOT_SUPPORTED);
    public java.lang.String getValue() { return _value_;}
    public static InventoryUnitSizesErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InventoryUnitSizesErrorReason enumeration = (InventoryUnitSizesErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InventoryUnitSizesErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InventoryUnitSizesErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "InventoryUnitSizesError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
