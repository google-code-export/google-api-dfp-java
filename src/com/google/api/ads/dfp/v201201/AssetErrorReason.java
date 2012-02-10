/**
 * AssetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;

public class AssetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AssetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NON_UNIQUE_NAME = "NON_UNIQUE_NAME";
    public static final java.lang.String _FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG";
    public static final java.lang.String _FILE_SIZE_TOO_LARGE = "FILE_SIZE_TOO_LARGE";
    public static final java.lang.String _INVALID_ASSET_ID = "INVALID_ASSET_ID";
    public static final AssetErrorReason NON_UNIQUE_NAME = new AssetErrorReason(_NON_UNIQUE_NAME);
    public static final AssetErrorReason FILE_NAME_TOO_LONG = new AssetErrorReason(_FILE_NAME_TOO_LONG);
    public static final AssetErrorReason FILE_SIZE_TOO_LARGE = new AssetErrorReason(_FILE_SIZE_TOO_LARGE);
    public static final AssetErrorReason INVALID_ASSET_ID = new AssetErrorReason(_INVALID_ASSET_ID);
    public java.lang.String getValue() { return _value_;}
    public static AssetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AssetErrorReason enumeration = (AssetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AssetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AssetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "AssetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
