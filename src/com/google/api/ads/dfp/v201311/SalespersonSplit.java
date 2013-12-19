/**
 * SalespersonSplit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * A {@code SalespersonSplit} represents a salesperson and his/her
 * split.
 */
public class SalespersonSplit  implements java.io.Serializable {
    /* The unique ID of the {@link User} responsible for the sales
     * of the
     *                 {@link Proposal}. This attribute is required. */
    private java.lang.Long userId;

    /* The split can be attributed to the salesperson.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0. */
    private java.lang.Integer split;

    public SalespersonSplit() {
    }

    public SalespersonSplit(
           java.lang.Long userId,
           java.lang.Integer split) {
           this.userId = userId;
           this.split = split;
    }


    /**
     * Gets the userId value for this SalespersonSplit.
     * 
     * @return userId   * The unique ID of the {@link User} responsible for the sales
     * of the
     *                 {@link Proposal}. This attribute is required.
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SalespersonSplit.
     * 
     * @param userId   * The unique ID of the {@link User} responsible for the sales
     * of the
     *                 {@link Proposal}. This attribute is required.
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the split value for this SalespersonSplit.
     * 
     * @return split   * The split can be attributed to the salesperson.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public java.lang.Integer getSplit() {
        return split;
    }


    /**
     * Sets the split value for this SalespersonSplit.
     * 
     * @param split   * The split can be attributed to the salesperson.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public void setSplit(java.lang.Integer split) {
        this.split = split;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalespersonSplit)) return false;
        SalespersonSplit other = (SalespersonSplit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.split==null && other.getSplit()==null) || 
             (this.split!=null &&
              this.split.equals(other.getSplit())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getSplit() != null) {
            _hashCode += getSplit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalespersonSplit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "SalespersonSplit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("split");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "split"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
