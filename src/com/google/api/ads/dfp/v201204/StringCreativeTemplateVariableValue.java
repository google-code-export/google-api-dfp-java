/**
 * StringCreativeTemplateVariableValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201204;


/**
 * Stores values of {@link CreativeTemplateVariable} of
 *             {@link VariableType#STRING} and {@link VariableType#LIST}.
 */
public class StringCreativeTemplateVariableValue  extends com.google.api.ads.dfp.v201204.BaseCreativeTemplateVariableValue  implements java.io.Serializable {
    /* The string value of {@link CreativeTemplateVariable} */
    private java.lang.String value;

    public StringCreativeTemplateVariableValue() {
    }

    public StringCreativeTemplateVariableValue(
           java.lang.String uniqueName,
           java.lang.String baseCreativeTemplateVariableValueType,
           java.lang.String value) {
        super(
            uniqueName,
            baseCreativeTemplateVariableValueType);
        this.value = value;
    }


    /**
     * Gets the value value for this StringCreativeTemplateVariableValue.
     * 
     * @return value   * The string value of {@link CreativeTemplateVariable}
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this StringCreativeTemplateVariableValue.
     * 
     * @param value   * The string value of {@link CreativeTemplateVariable}
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringCreativeTemplateVariableValue)) return false;
        StringCreativeTemplateVariableValue other = (StringCreativeTemplateVariableValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StringCreativeTemplateVariableValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "StringCreativeTemplateVariableValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "value"));
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
