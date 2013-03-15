/**
 * CustomTargetingKeyAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;


/**
 * Represents the actions that can be performed on {@link CustomTargetingKey}
 * objects.
 */
public abstract class CustomTargetingKeyAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of CustomTargetingKeyAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String customTargetingKeyActionType;

    public CustomTargetingKeyAction() {
    }

    public CustomTargetingKeyAction(
           java.lang.String customTargetingKeyActionType) {
           this.customTargetingKeyActionType = customTargetingKeyActionType;
    }


    /**
     * Gets the customTargetingKeyActionType value for this CustomTargetingKeyAction.
     * 
     * @return customTargetingKeyActionType   * Indicates that this instance is a subtype of CustomTargetingKeyAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getCustomTargetingKeyActionType() {
        return customTargetingKeyActionType;
    }


    /**
     * Sets the customTargetingKeyActionType value for this CustomTargetingKeyAction.
     * 
     * @param customTargetingKeyActionType   * Indicates that this instance is a subtype of CustomTargetingKeyAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setCustomTargetingKeyActionType(java.lang.String customTargetingKeyActionType) {
        this.customTargetingKeyActionType = customTargetingKeyActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTargetingKeyAction)) return false;
        CustomTargetingKeyAction other = (CustomTargetingKeyAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customTargetingKeyActionType==null && other.getCustomTargetingKeyActionType()==null) || 
             (this.customTargetingKeyActionType!=null &&
              this.customTargetingKeyActionType.equals(other.getCustomTargetingKeyActionType())));
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
        if (getCustomTargetingKeyActionType() != null) {
            _hashCode += getCustomTargetingKeyActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomTargetingKeyAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "CustomTargetingKeyAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingKeyActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "CustomTargetingKeyAction.Type"));
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