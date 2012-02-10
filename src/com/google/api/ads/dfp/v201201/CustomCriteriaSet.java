/**
 * CustomCriteriaSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;


/**
 * A {@link CustomCriteriaSet} comprises of a set of {@link CustomCriteriaNode}
 * objects combined by the
 *             {@link CustomCriteriaSet.LogicalOperator#logicalOperator}.
 * The custom
 *             criteria targeting tree is subject to the rules defined
 * on
 *             {@link Targeting#customTargeting}.
 */
public class CustomCriteriaSet  extends com.google.api.ads.dfp.v201201.CustomCriteriaNode  implements java.io.Serializable {
    /* The logical operator to be applied to {@link CustomCriteriaSet#children}.
     * This attribute is required. */
    private com.google.api.ads.dfp.v201201.CustomCriteriaSetLogicalOperator logicalOperator;

    /* The custom criteria. This attribute is required. */
    private com.google.api.ads.dfp.v201201.CustomCriteriaNode[] children;

    public CustomCriteriaSet() {
    }

    public CustomCriteriaSet(
           java.lang.String customCriteriaNodeType,
           com.google.api.ads.dfp.v201201.CustomCriteriaSetLogicalOperator logicalOperator,
           com.google.api.ads.dfp.v201201.CustomCriteriaNode[] children) {
        super(
            customCriteriaNodeType);
        this.logicalOperator = logicalOperator;
        this.children = children;
    }


    /**
     * Gets the logicalOperator value for this CustomCriteriaSet.
     * 
     * @return logicalOperator   * The logical operator to be applied to {@link CustomCriteriaSet#children}.
     * This attribute is required.
     */
    public com.google.api.ads.dfp.v201201.CustomCriteriaSetLogicalOperator getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this CustomCriteriaSet.
     * 
     * @param logicalOperator   * The logical operator to be applied to {@link CustomCriteriaSet#children}.
     * This attribute is required.
     */
    public void setLogicalOperator(com.google.api.ads.dfp.v201201.CustomCriteriaSetLogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the children value for this CustomCriteriaSet.
     * 
     * @return children   * The custom criteria. This attribute is required.
     */
    public com.google.api.ads.dfp.v201201.CustomCriteriaNode[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this CustomCriteriaSet.
     * 
     * @param children   * The custom criteria. This attribute is required.
     */
    public void setChildren(com.google.api.ads.dfp.v201201.CustomCriteriaNode[] children) {
        this.children = children;
    }

    public com.google.api.ads.dfp.v201201.CustomCriteriaNode getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.google.api.ads.dfp.v201201.CustomCriteriaNode _value) {
        this.children[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCriteriaSet)) return false;
        CustomCriteriaSet other = (CustomCriteriaSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logicalOperator==null && other.getLogicalOperator()==null) || 
             (this.logicalOperator!=null &&
              this.logicalOperator.equals(other.getLogicalOperator()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren())));
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
        if (getLogicalOperator() != null) {
            _hashCode += getLogicalOperator().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
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
        new org.apache.axis.description.TypeDesc(CustomCriteriaSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "CustomCriteriaSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "logicalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "CustomCriteriaSet.LogicalOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "CustomCriteriaNode"));
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
