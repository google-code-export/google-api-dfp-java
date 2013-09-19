/**
 * DropDownCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * A custom field that has the drop-down data type.
 */
public class DropDownCustomField  extends com.google.api.ads.dfp.v201308.CustomField  implements java.io.Serializable {
    /* The options allowed for this custom field. This is read only. */
    private com.google.api.ads.dfp.v201308.CustomFieldOption[] options;

    public DropDownCustomField() {
    }

    public DropDownCustomField(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           java.lang.Boolean isActive,
           com.google.api.ads.dfp.v201308.CustomFieldEntityType entityType,
           com.google.api.ads.dfp.v201308.CustomFieldDataType dataType,
           com.google.api.ads.dfp.v201308.CustomFieldVisibility visibility,
           java.lang.String customFieldType,
           com.google.api.ads.dfp.v201308.CustomFieldOption[] options) {
        super(
            id,
            name,
            description,
            isActive,
            entityType,
            dataType,
            visibility,
            customFieldType);
        this.options = options;
    }


    /**
     * Gets the options value for this DropDownCustomField.
     * 
     * @return options   * The options allowed for this custom field. This is read only.
     */
    public com.google.api.ads.dfp.v201308.CustomFieldOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this DropDownCustomField.
     * 
     * @param options   * The options allowed for this custom field. This is read only.
     */
    public void setOptions(com.google.api.ads.dfp.v201308.CustomFieldOption[] options) {
        this.options = options;
    }

    public com.google.api.ads.dfp.v201308.CustomFieldOption getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.google.api.ads.dfp.v201308.CustomFieldOption _value) {
        this.options[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DropDownCustomField)) return false;
        DropDownCustomField other = (DropDownCustomField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions())));
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
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DropDownCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DropDownCustomField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CustomFieldOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
