/**
 * DropDownCustomFieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * A {@link CustomFieldValue} for a {@link CustomField} that has a
 * {@link CustomField#dataType}
 *             of {@link CustomFieldDataType#DROP_DOWN}
 */
public class DropDownCustomFieldValue  extends com.google.api.ads.dfp.v201308.BaseCustomFieldValue  implements java.io.Serializable {
    /* The {@link CustomFieldOption#id ID} of the {@link CustomFieldOption}
     * for
     *                     this value. */
    private java.lang.Long customFieldOptionId;

    public DropDownCustomFieldValue() {
    }

    public DropDownCustomFieldValue(
           java.lang.Long customFieldId,
           java.lang.String baseCustomFieldValueType,
           java.lang.Long customFieldOptionId) {
        super(
            customFieldId,
            baseCustomFieldValueType);
        this.customFieldOptionId = customFieldOptionId;
    }


    /**
     * Gets the customFieldOptionId value for this DropDownCustomFieldValue.
     * 
     * @return customFieldOptionId   * The {@link CustomFieldOption#id ID} of the {@link CustomFieldOption}
     * for
     *                     this value.
     */
    public java.lang.Long getCustomFieldOptionId() {
        return customFieldOptionId;
    }


    /**
     * Sets the customFieldOptionId value for this DropDownCustomFieldValue.
     * 
     * @param customFieldOptionId   * The {@link CustomFieldOption#id ID} of the {@link CustomFieldOption}
     * for
     *                     this value.
     */
    public void setCustomFieldOptionId(java.lang.Long customFieldOptionId) {
        this.customFieldOptionId = customFieldOptionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DropDownCustomFieldValue)) return false;
        DropDownCustomFieldValue other = (DropDownCustomFieldValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customFieldOptionId==null && other.getCustomFieldOptionId()==null) || 
             (this.customFieldOptionId!=null &&
              this.customFieldOptionId.equals(other.getCustomFieldOptionId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustomFieldOptionId() != null) {
            _hashCode += getCustomFieldOptionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DropDownCustomFieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DropDownCustomFieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldOptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "customFieldOptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
