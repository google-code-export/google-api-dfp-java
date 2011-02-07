/**
 * PredefinedCustomCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201101;


/**
 * A {@link PredefinedCustomCriteria} object is used to perform custom
 * criteria
 *             targeting on custom targeting keys of type
 *             {@link CustomTargetingKey.Type#PREDEFINED}.
 */
public class PredefinedCustomCriteria  extends com.google.api.ads.dfp.v201101.CustomCriteria  implements java.io.Serializable {
    /* The ids of {@link CustomTargetingValue} objects to target the
     * custom
     *                     targeting key with id {@link CustomCriteria#keyId}.
     * This attribute is
     *                     required. */
    private long[] valueIds;

    public PredefinedCustomCriteria() {
    }

    public PredefinedCustomCriteria(
           java.lang.String customCriteriaNodeType,
           java.lang.Long keyId,
           com.google.api.ads.dfp.v201101.CustomCriteriaComparisonOperator operator,
           long[] valueIds) {
        super(
            customCriteriaNodeType,
            keyId,
            operator);
        this.valueIds = valueIds;
    }


    /**
     * Gets the valueIds value for this PredefinedCustomCriteria.
     * 
     * @return valueIds   * The ids of {@link CustomTargetingValue} objects to target the
     * custom
     *                     targeting key with id {@link CustomCriteria#keyId}.
     * This attribute is
     *                     required.
     */
    public long[] getValueIds() {
        return valueIds;
    }


    /**
     * Sets the valueIds value for this PredefinedCustomCriteria.
     * 
     * @param valueIds   * The ids of {@link CustomTargetingValue} objects to target the
     * custom
     *                     targeting key with id {@link CustomCriteria#keyId}.
     * This attribute is
     *                     required.
     */
    public void setValueIds(long[] valueIds) {
        this.valueIds = valueIds;
    }

    public long getValueIds(int i) {
        return this.valueIds[i];
    }

    public void setValueIds(int i, long _value) {
        this.valueIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PredefinedCustomCriteria)) return false;
        PredefinedCustomCriteria other = (PredefinedCustomCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.valueIds==null && other.getValueIds()==null) || 
             (this.valueIds!=null &&
              java.util.Arrays.equals(this.valueIds, other.getValueIds())));
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
        if (getValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueIds(), i);
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
        new org.apache.axis.description.TypeDesc(PredefinedCustomCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "PredefinedCustomCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "valueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
