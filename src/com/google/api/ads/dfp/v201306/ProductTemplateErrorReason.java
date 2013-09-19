/**
 * ProductTemplateErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public class ProductTemplateErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductTemplateErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_FEATURE_EXPANDED_EXCLUSIVE = "INVALID_FEATURE_EXPANDED_EXCLUSIVE";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED = "INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED = "INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_VALUE_TARGETED = "INVALID_EXPANDED_FEATURE_VALUE_TARGETED";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_VALUE_LOCKED = "INVALID_EXPANDED_FEATURE_VALUE_LOCKED";
    public static final java.lang.String _INVALID_FEATURE_TYPE = "INVALID_FEATURE_TYPE";
    public static final java.lang.String _INVALID_ROADBLOCKING_TYPE = "INVALID_ROADBLOCKING_TYPE";
    public static final java.lang.String _INVALID_TARGETING = "INVALID_TARGETING";
    public static final java.lang.String _INVALID_FREQUENCY_CAPS = "INVALID_FREQUENCY_CAPS";
    public static final java.lang.String _INVALID_TECHNOLOGY_INCLUDE_EXCLUDE = "INVALID_TECHNOLOGY_INCLUDE_EXCLUDE";
    public static final java.lang.String _INVALID_EXPANDED_PRODUCT_COUNT = "INVALID_EXPANDED_PRODUCT_COUNT";
    public static final java.lang.String _INVALID_TARGET_PLATFORM = "INVALID_TARGET_PLATFORM";
    public static final java.lang.String _INVALID_NON_TARGETING_FEATURE = "INVALID_NON_TARGETING_FEATURE";
    public static final java.lang.String _INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE = "INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE";
    public static final java.lang.String _INVALID_FEATURE_CARDINALITY_AT_MOST_ONE = "INVALID_FEATURE_CARDINALITY_AT_MOST_ONE";
    public static final java.lang.String _INVALID_FEATURE_CARDINALITY_EXACTLY_ONE = "INVALID_FEATURE_CARDINALITY_EXACTLY_ONE";
    public static final java.lang.String _INVALID_FEATURE_FOR_OFFLINE = "INVALID_FEATURE_FOR_OFFLINE";
    public static final java.lang.String _INVALID_RATE_TYPE_FOR_OFFLINE = "INVALID_RATE_TYPE_FOR_OFFLINE";
    public static final java.lang.String _INVALID_RATE_TYPE_FOR_DFP = "INVALID_RATE_TYPE_FOR_DFP";
    public static final java.lang.String _INVALID_LINE_ITEM_PRIORITY = "INVALID_LINE_ITEM_PRIORITY";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE = "INVALID_LINE_ITEM_TYPE";
    public static final java.lang.String _DUPLICATED_PLACEHOLDER_IN_NAMEMACRO = "DUPLICATED_PLACEHOLDER_IN_NAMEMACRO";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY = "INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY";
    public static final java.lang.String _INVALID_FEATURE_DEFAULT_TARGET_TYPE = "INVALID_FEATURE_DEFAULT_TARGET_TYPE";
    public static final java.lang.String _INVALID_FEATURE_VALUE_TARGET_TYPE = "INVALID_FEATURE_VALUE_TARGET_TYPE";
    public static final java.lang.String _INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE = "INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE";
    public static final java.lang.String _DUPLICATED_FEATURE = "DUPLICATED_FEATURE";
    public static final java.lang.String _DUPLICATED_CUSTOM_TARGETING_KEY = "DUPLICATED_CUSTOM_TARGETING_KEY";
    public static final java.lang.String _INVALID_CUSTOM_TARGETING_KEY_ID = "INVALID_CUSTOM_TARGETING_KEY_ID";
    public static final java.lang.String _INVALID_CUSTOM_TARGETING_VALUE_ID = "INVALID_CUSTOM_TARGETING_VALUE_ID";
    public static final java.lang.String _DUPLICATED_FEATURE_VALUE = "DUPLICATED_FEATURE_VALUE";
    public static final java.lang.String _MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO = "MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO";
    public static final java.lang.String _MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER = "MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER";
    public static final java.lang.String _MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER = "MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER";
    public static final java.lang.String _MISSING_SUBTYPE_FOR_CUSTOM_TARGETING = "MISSING_SUBTYPE_FOR_CUSTOM_TARGETING";
    public static final java.lang.String _COMPANION_NOT_ALLOWED = "COMPANION_NOT_ALLOWED";
    public static final java.lang.String _MISSING_COMPANION = "MISSING_COMPANION";
    public static final java.lang.String _CANNOT_MODIFY_READONLY_FEATURE = "CANNOT_MODIFY_READONLY_FEATURE";
    public static final java.lang.String _CANNOT_MODIFY_PRODUCT_TYPE = "CANNOT_MODIFY_PRODUCT_TYPE";
    public static final java.lang.String _CANNOT_ADD_SEGMENTATION = "CANNOT_ADD_SEGMENTATION";
    public static final java.lang.String _CANNOT_REMOVE_SEGMENTATION = "CANNOT_REMOVE_SEGMENTATION";
    public static final java.lang.String _CANNOT_REMOVE_VALUE_FROM_SEGMENTATION = "CANNOT_REMOVE_VALUE_FROM_SEGMENTATION";
    public static final java.lang.String _CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING = "CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING";
    public static final java.lang.String _CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE = "CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE";
    public static final java.lang.String _CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE = "CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProductTemplateErrorReason INVALID_FEATURE_EXPANDED_EXCLUSIVE = new ProductTemplateErrorReason(_INVALID_FEATURE_EXPANDED_EXCLUSIVE);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_VALUE_TARGETED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_VALUE_TARGETED);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_VALUE_LOCKED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_VALUE_LOCKED);
    public static final ProductTemplateErrorReason INVALID_FEATURE_TYPE = new ProductTemplateErrorReason(_INVALID_FEATURE_TYPE);
    public static final ProductTemplateErrorReason INVALID_ROADBLOCKING_TYPE = new ProductTemplateErrorReason(_INVALID_ROADBLOCKING_TYPE);
    public static final ProductTemplateErrorReason INVALID_TARGETING = new ProductTemplateErrorReason(_INVALID_TARGETING);
    public static final ProductTemplateErrorReason INVALID_FREQUENCY_CAPS = new ProductTemplateErrorReason(_INVALID_FREQUENCY_CAPS);
    public static final ProductTemplateErrorReason INVALID_TECHNOLOGY_INCLUDE_EXCLUDE = new ProductTemplateErrorReason(_INVALID_TECHNOLOGY_INCLUDE_EXCLUDE);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_PRODUCT_COUNT = new ProductTemplateErrorReason(_INVALID_EXPANDED_PRODUCT_COUNT);
    public static final ProductTemplateErrorReason INVALID_TARGET_PLATFORM = new ProductTemplateErrorReason(_INVALID_TARGET_PLATFORM);
    public static final ProductTemplateErrorReason INVALID_NON_TARGETING_FEATURE = new ProductTemplateErrorReason(_INVALID_NON_TARGETING_FEATURE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE = new ProductTemplateErrorReason(_INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_CARDINALITY_AT_MOST_ONE = new ProductTemplateErrorReason(_INVALID_FEATURE_CARDINALITY_AT_MOST_ONE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_CARDINALITY_EXACTLY_ONE = new ProductTemplateErrorReason(_INVALID_FEATURE_CARDINALITY_EXACTLY_ONE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_FOR_OFFLINE = new ProductTemplateErrorReason(_INVALID_FEATURE_FOR_OFFLINE);
    public static final ProductTemplateErrorReason INVALID_RATE_TYPE_FOR_OFFLINE = new ProductTemplateErrorReason(_INVALID_RATE_TYPE_FOR_OFFLINE);
    public static final ProductTemplateErrorReason INVALID_RATE_TYPE_FOR_DFP = new ProductTemplateErrorReason(_INVALID_RATE_TYPE_FOR_DFP);
    public static final ProductTemplateErrorReason INVALID_LINE_ITEM_PRIORITY = new ProductTemplateErrorReason(_INVALID_LINE_ITEM_PRIORITY);
    public static final ProductTemplateErrorReason INVALID_LINE_ITEM_TYPE = new ProductTemplateErrorReason(_INVALID_LINE_ITEM_TYPE);
    public static final ProductTemplateErrorReason DUPLICATED_PLACEHOLDER_IN_NAMEMACRO = new ProductTemplateErrorReason(_DUPLICATED_PLACEHOLDER_IN_NAMEMACRO);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY);
    public static final ProductTemplateErrorReason INVALID_FEATURE_DEFAULT_TARGET_TYPE = new ProductTemplateErrorReason(_INVALID_FEATURE_DEFAULT_TARGET_TYPE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_VALUE_TARGET_TYPE = new ProductTemplateErrorReason(_INVALID_FEATURE_VALUE_TARGET_TYPE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE = new ProductTemplateErrorReason(_INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE);
    public static final ProductTemplateErrorReason DUPLICATED_FEATURE = new ProductTemplateErrorReason(_DUPLICATED_FEATURE);
    public static final ProductTemplateErrorReason DUPLICATED_CUSTOM_TARGETING_KEY = new ProductTemplateErrorReason(_DUPLICATED_CUSTOM_TARGETING_KEY);
    public static final ProductTemplateErrorReason INVALID_CUSTOM_TARGETING_KEY_ID = new ProductTemplateErrorReason(_INVALID_CUSTOM_TARGETING_KEY_ID);
    public static final ProductTemplateErrorReason INVALID_CUSTOM_TARGETING_VALUE_ID = new ProductTemplateErrorReason(_INVALID_CUSTOM_TARGETING_VALUE_ID);
    public static final ProductTemplateErrorReason DUPLICATED_FEATURE_VALUE = new ProductTemplateErrorReason(_DUPLICATED_FEATURE_VALUE);
    public static final ProductTemplateErrorReason MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO = new ProductTemplateErrorReason(_MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO);
    public static final ProductTemplateErrorReason MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER = new ProductTemplateErrorReason(_MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER);
    public static final ProductTemplateErrorReason MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER = new ProductTemplateErrorReason(_MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER);
    public static final ProductTemplateErrorReason MISSING_SUBTYPE_FOR_CUSTOM_TARGETING = new ProductTemplateErrorReason(_MISSING_SUBTYPE_FOR_CUSTOM_TARGETING);
    public static final ProductTemplateErrorReason COMPANION_NOT_ALLOWED = new ProductTemplateErrorReason(_COMPANION_NOT_ALLOWED);
    public static final ProductTemplateErrorReason MISSING_COMPANION = new ProductTemplateErrorReason(_MISSING_COMPANION);
    public static final ProductTemplateErrorReason CANNOT_MODIFY_READONLY_FEATURE = new ProductTemplateErrorReason(_CANNOT_MODIFY_READONLY_FEATURE);
    public static final ProductTemplateErrorReason CANNOT_MODIFY_PRODUCT_TYPE = new ProductTemplateErrorReason(_CANNOT_MODIFY_PRODUCT_TYPE);
    public static final ProductTemplateErrorReason CANNOT_ADD_SEGMENTATION = new ProductTemplateErrorReason(_CANNOT_ADD_SEGMENTATION);
    public static final ProductTemplateErrorReason CANNOT_REMOVE_SEGMENTATION = new ProductTemplateErrorReason(_CANNOT_REMOVE_SEGMENTATION);
    public static final ProductTemplateErrorReason CANNOT_REMOVE_VALUE_FROM_SEGMENTATION = new ProductTemplateErrorReason(_CANNOT_REMOVE_VALUE_FROM_SEGMENTATION);
    public static final ProductTemplateErrorReason CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING = new ProductTemplateErrorReason(_CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING);
    public static final ProductTemplateErrorReason CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE = new ProductTemplateErrorReason(_CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE);
    public static final ProductTemplateErrorReason CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE = new ProductTemplateErrorReason(_CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE);
    public static final ProductTemplateErrorReason UNKNOWN = new ProductTemplateErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProductTemplateErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductTemplateErrorReason enumeration = (ProductTemplateErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductTemplateErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProductTemplateErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductTemplateError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
