/**
 * InventoryTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201104;

public class InventoryTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InventoryTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED = "AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED";
    public static final java.lang.String _INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED = "INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED";
    public static final java.lang.String _PARENT_CONTAINS_INVALID_MIX_OF_TARGETED_AND_EXCLUDED_AD_UNITS = "PARENT_CONTAINS_INVALID_MIX_OF_TARGETED_AND_EXCLUDED_AD_UNITS";
    public static final java.lang.String _INVENTORY_EXCLUSIONS_MUST_HAVE_PARENT_INVENTORY_UNIT = "INVENTORY_EXCLUSIONS_MUST_HAVE_PARENT_INVENTORY_UNIT";
    public static final java.lang.String _INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED = "INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED";
    public static final java.lang.String _INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED = "INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED";
    public static final java.lang.String _INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED = "INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED";
    public static final InventoryTargetingErrorReason AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED = new InventoryTargetingErrorReason(_AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED);
    public static final InventoryTargetingErrorReason INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED = new InventoryTargetingErrorReason(_INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED);
    public static final InventoryTargetingErrorReason PARENT_CONTAINS_INVALID_MIX_OF_TARGETED_AND_EXCLUDED_AD_UNITS = new InventoryTargetingErrorReason(_PARENT_CONTAINS_INVALID_MIX_OF_TARGETED_AND_EXCLUDED_AD_UNITS);
    public static final InventoryTargetingErrorReason INVENTORY_EXCLUSIONS_MUST_HAVE_PARENT_INVENTORY_UNIT = new InventoryTargetingErrorReason(_INVENTORY_EXCLUSIONS_MUST_HAVE_PARENT_INVENTORY_UNIT);
    public static final InventoryTargetingErrorReason INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED = new InventoryTargetingErrorReason(_INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED);
    public static final InventoryTargetingErrorReason INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED = new InventoryTargetingErrorReason(_INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED);
    public static final InventoryTargetingErrorReason INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED = new InventoryTargetingErrorReason(_INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED);
    public java.lang.String getValue() { return _value_;}
    public static InventoryTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InventoryTargetingErrorReason enumeration = (InventoryTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InventoryTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InventoryTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "InventoryTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
