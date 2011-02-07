/**
 * CustomCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201101;


/**
 * {@link CustomCriteria} represents the available types for criteria
 * targeting
 *             i.e. {@link PredefinedCustomCriteria} and {@link FreeFormCustomCriteria}.
 */
public abstract class CustomCriteria  extends com.google.api.ads.dfp.v201101.CustomCriteriaNode  implements java.io.Serializable {
    /* The {@link CustomTargetingKey#id} of the {@link CustomTargetingKey}
     * object
     *                     that was created using {@link CustomTargetingService}.
     * This attribute is
     *                     required. */
    private java.lang.Long keyId;

    /* The comparison operator. This attribute is required. */
    private com.google.api.ads.dfp.v201101.CustomCriteriaComparisonOperator operator;

    public CustomCriteria() {
    }

    public CustomCriteria(
           java.lang.String customCriteriaNodeType,
           java.lang.Long keyId,
           com.google.api.ads.dfp.v201101.CustomCriteriaComparisonOperator operator) {
        super(
            customCriteriaNodeType);
        this.keyId = keyId;
        this.operator = operator;
    }


    /**
     * Gets the keyId value for this CustomCriteria.
     * 
     * @return keyId   * The {@link CustomTargetingKey#id} of the {@link CustomTargetingKey}
     * object
     *                     that was created using {@link CustomTargetingService}.
     * This attribute is
     *                     required.
     */
    public java.lang.Long getKeyId() {
        return keyId;
    }


    /**
     * Sets the keyId value for this CustomCriteria.
     * 
     * @param keyId   * The {@link CustomTargetingKey#id} of the {@link CustomTargetingKey}
     * object
     *                     that was created using {@link CustomTargetingService}.
     * This attribute is
     *                     required.
     */
    public void setKeyId(java.lang.Long keyId) {
        this.keyId = keyId;
    }


    /**
     * Gets the operator value for this CustomCriteria.
     * 
     * @return operator   * The comparison operator. This attribute is required.
     */
    public com.google.api.ads.dfp.v201101.CustomCriteriaComparisonOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this CustomCriteria.
     * 
     * @param operator   * The comparison operator. This attribute is required.
     */
    public void setOperator(com.google.api.ads.dfp.v201101.CustomCriteriaComparisonOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCriteria)) return false;
        CustomCriteria other = (CustomCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyId==null && other.getKeyId()==null) || 
             (this.keyId!=null &&
              this.keyId.equals(other.getKeyId()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getKeyId() != null) {
            _hashCode += getKeyId().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "CustomCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "keyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "CustomCriteria.ComparisonOperator"));
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
