/**
 * StringCreativeTemplateVariable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;


/**
 * Represents a string variable defined in a creative template.
 *             <p>
 *             Use {@link StringCreativeTemplateVariableValue} to specify
 * the value
 *             for this variable when creating {@link TemplateCreative}
 * from the {@link TemplateCreative}.
 */
public class StringCreativeTemplateVariable  extends com.google.api.ads.dfp.v201208.CreativeTemplateVariable  implements java.io.Serializable {
    /* Default value to be filled in when creating creatives from
     * the creative
     *                     template. */
    private java.lang.String defaultValue;

    public StringCreativeTemplateVariable() {
    }

    public StringCreativeTemplateVariable(
           java.lang.String label,
           java.lang.String uniqueName,
           java.lang.String description,
           java.lang.Boolean isRequired,
           java.lang.String creativeTemplateVariableType,
           java.lang.String defaultValue) {
        super(
            label,
            uniqueName,
            description,
            isRequired,
            creativeTemplateVariableType);
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the defaultValue value for this StringCreativeTemplateVariable.
     * 
     * @return defaultValue   * Default value to be filled in when creating creatives from
     * the creative
     *                     template.
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this StringCreativeTemplateVariable.
     * 
     * @param defaultValue   * Default value to be filled in when creating creatives from
     * the creative
     *                     template.
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringCreativeTemplateVariable)) return false;
        StringCreativeTemplateVariable other = (StringCreativeTemplateVariable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue())));
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
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StringCreativeTemplateVariable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "StringCreativeTemplateVariable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "defaultValue"));
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
