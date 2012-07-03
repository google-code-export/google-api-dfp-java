/**
 * BaseCustomFieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;


/**
 * The value of a {@link CustomField} for a particular entity.
 */
public abstract class BaseCustomFieldValue  implements java.io.Serializable {
    /* Id of the {@code CustomField} to which this value belongs.
     * This attribute
     *                 is required. */
    private java.lang.Long customFieldId;

    /* Indicates that this instance is a subtype of BaseCustomFieldValue.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String baseCustomFieldValueType;

    public BaseCustomFieldValue() {
    }

    public BaseCustomFieldValue(
           java.lang.Long customFieldId,
           java.lang.String baseCustomFieldValueType) {
           this.customFieldId = customFieldId;
           this.baseCustomFieldValueType = baseCustomFieldValueType;
    }


    /**
     * Gets the customFieldId value for this BaseCustomFieldValue.
     * 
     * @return customFieldId   * Id of the {@code CustomField} to which this value belongs.
     * This attribute
     *                 is required.
     */
    public java.lang.Long getCustomFieldId() {
        return customFieldId;
    }


    /**
     * Sets the customFieldId value for this BaseCustomFieldValue.
     * 
     * @param customFieldId   * Id of the {@code CustomField} to which this value belongs.
     * This attribute
     *                 is required.
     */
    public void setCustomFieldId(java.lang.Long customFieldId) {
        this.customFieldId = customFieldId;
    }


    /**
     * Gets the baseCustomFieldValueType value for this BaseCustomFieldValue.
     * 
     * @return baseCustomFieldValueType   * Indicates that this instance is a subtype of BaseCustomFieldValue.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getBaseCustomFieldValueType() {
        return baseCustomFieldValueType;
    }


    /**
     * Sets the baseCustomFieldValueType value for this BaseCustomFieldValue.
     * 
     * @param baseCustomFieldValueType   * Indicates that this instance is a subtype of BaseCustomFieldValue.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setBaseCustomFieldValueType(java.lang.String baseCustomFieldValueType) {
        this.baseCustomFieldValueType = baseCustomFieldValueType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseCustomFieldValue)) return false;
        BaseCustomFieldValue other = (BaseCustomFieldValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customFieldId==null && other.getCustomFieldId()==null) || 
             (this.customFieldId!=null &&
              this.customFieldId.equals(other.getCustomFieldId()))) &&
            ((this.baseCustomFieldValueType==null && other.getBaseCustomFieldValueType()==null) || 
             (this.baseCustomFieldValueType!=null &&
              this.baseCustomFieldValueType.equals(other.getBaseCustomFieldValueType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomFieldId() != null) {
            _hashCode += getCustomFieldId().hashCode();
        }
        if (getBaseCustomFieldValueType() != null) {
            _hashCode += getBaseCustomFieldValueType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseCustomFieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "BaseCustomFieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "customFieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCustomFieldValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "BaseCustomFieldValue.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
