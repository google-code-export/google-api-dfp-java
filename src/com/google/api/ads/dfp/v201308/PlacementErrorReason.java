/**
 * PlacementErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;

public class PlacementErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PlacementErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_ENTITY_TYPE = "INVALID_ENTITY_TYPE";
    public static final java.lang.String _SHARED_INVENTORY_ASSIGNED = "SHARED_INVENTORY_ASSIGNED";
    public static final java.lang.String _PLACEMENTS_CANNOT_INCLUDE_INVENTORY_FROM_MULTIPLE_DISTRIBUTOR_NETWORKS = "PLACEMENTS_CANNOT_INCLUDE_INVENTORY_FROM_MULTIPLE_DISTRIBUTOR_NETWORKS";
    public static final java.lang.String _PLACEMENTS_CANNOT_INCLUDE_BOTH_LOCAL_AND_SHARED_INVENTORY = "PLACEMENTS_CANNOT_INCLUDE_BOTH_LOCAL_AND_SHARED_INVENTORY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final PlacementErrorReason INVALID_ENTITY_TYPE = new PlacementErrorReason(_INVALID_ENTITY_TYPE);
    public static final PlacementErrorReason SHARED_INVENTORY_ASSIGNED = new PlacementErrorReason(_SHARED_INVENTORY_ASSIGNED);
    public static final PlacementErrorReason PLACEMENTS_CANNOT_INCLUDE_INVENTORY_FROM_MULTIPLE_DISTRIBUTOR_NETWORKS = new PlacementErrorReason(_PLACEMENTS_CANNOT_INCLUDE_INVENTORY_FROM_MULTIPLE_DISTRIBUTOR_NETWORKS);
    public static final PlacementErrorReason PLACEMENTS_CANNOT_INCLUDE_BOTH_LOCAL_AND_SHARED_INVENTORY = new PlacementErrorReason(_PLACEMENTS_CANNOT_INCLUDE_BOTH_LOCAL_AND_SHARED_INVENTORY);
    public static final PlacementErrorReason UNKNOWN = new PlacementErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static PlacementErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PlacementErrorReason enumeration = (PlacementErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PlacementErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PlacementErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "PlacementError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
