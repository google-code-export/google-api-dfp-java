/**
 * CustomFieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;


/**
 * The value of a {@link CustomField} that does not have a {@link
 * CustomField#dataType}
 *             of {@link CustomFieldDataType#DROP_DOWN}.
 */
public class CustomFieldValue  extends com.google.api.ads.dfp.v201206.BaseCustomFieldValue  implements java.io.Serializable {
    /* The value for this field. The appropriate type of {@code Value}
     * is
     *                     determined by the {@code CustomField#dataType}
     * of the {@code CustomField}
     *                     that this conforms to.
     *                     
     *                     <table>
     *                     <tr><th>{@link CustomFieldDataType}</th><th>{@link
     * Value} type</th></tr>
     *                     <tr><td>{@link CustomFieldDataType#STRING STRING}</td><td>{@link
     * TextValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#NUMBER NUMBER}</td><td>{@link
     * NumberValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#TOGGLE TOGGLE}</td><td>{@link
     * BooleanValue}</td></tr>
     *                     </table> */
    private com.google.api.ads.dfp.v201206.Value value;

    public CustomFieldValue() {
    }

    public CustomFieldValue(
           java.lang.Long customFieldId,
           java.lang.String baseCustomFieldValueType,
           com.google.api.ads.dfp.v201206.Value value) {
        super(
            customFieldId,
            baseCustomFieldValueType);
        this.value = value;
    }


    /**
     * Gets the value value for this CustomFieldValue.
     * 
     * @return value   * The value for this field. The appropriate type of {@code Value}
     * is
     *                     determined by the {@code CustomField#dataType}
     * of the {@code CustomField}
     *                     that this conforms to.
     *                     
     *                     <table>
     *                     <tr><th>{@link CustomFieldDataType}</th><th>{@link
     * Value} type</th></tr>
     *                     <tr><td>{@link CustomFieldDataType#STRING STRING}</td><td>{@link
     * TextValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#NUMBER NUMBER}</td><td>{@link
     * NumberValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#TOGGLE TOGGLE}</td><td>{@link
     * BooleanValue}</td></tr>
     *                     </table>
     */
    public com.google.api.ads.dfp.v201206.Value getValue() {
        return value;
    }


    /**
     * Sets the value value for this CustomFieldValue.
     * 
     * @param value   * The value for this field. The appropriate type of {@code Value}
     * is
     *                     determined by the {@code CustomField#dataType}
     * of the {@code CustomField}
     *                     that this conforms to.
     *                     
     *                     <table>
     *                     <tr><th>{@link CustomFieldDataType}</th><th>{@link
     * Value} type</th></tr>
     *                     <tr><td>{@link CustomFieldDataType#STRING STRING}</td><td>{@link
     * TextValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#NUMBER NUMBER}</td><td>{@link
     * NumberValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#TOGGLE TOGGLE}</td><td>{@link
     * BooleanValue}</td></tr>
     *                     </table>
     */
    public void setValue(com.google.api.ads.dfp.v201206.Value value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldValue)) return false;
        CustomFieldValue other = (CustomFieldValue) obj;
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
        new org.apache.axis.description.TypeDesc(CustomFieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "CustomFieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "Value"));
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
