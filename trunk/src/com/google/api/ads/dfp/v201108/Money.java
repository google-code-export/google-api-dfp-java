/**
 * Money.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201108;


/**
 * Represents a money amount.
 */
public class Money  implements java.io.Serializable {
    /* Three letter currency code in string format. */
    private java.lang.String currencyCode;

    /* Money values are always specified in terms of micros which
     * are a millionth
     *                 of the fundamental currency unit. For US dollars,
     * $1 is 1,000,000 micros. */
    private java.lang.Long microAmount;

    public Money() {
    }

    public Money(
           java.lang.String currencyCode,
           java.lang.Long microAmount) {
           this.currencyCode = currencyCode;
           this.microAmount = microAmount;
    }


    /**
     * Gets the currencyCode value for this Money.
     * 
     * @return currencyCode   * Three letter currency code in string format.
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Money.
     * 
     * @param currencyCode   * Three letter currency code in string format.
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the microAmount value for this Money.
     * 
     * @return microAmount   * Money values are always specified in terms of micros which
     * are a millionth
     *                 of the fundamental currency unit. For US dollars,
     * $1 is 1,000,000 micros.
     */
    public java.lang.Long getMicroAmount() {
        return microAmount;
    }


    /**
     * Sets the microAmount value for this Money.
     * 
     * @param microAmount   * Money values are always specified in terms of micros which
     * are a millionth
     *                 of the fundamental currency unit. For US dollars,
     * $1 is 1,000,000 micros.
     */
    public void setMicroAmount(java.lang.Long microAmount) {
        this.microAmount = microAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Money)) return false;
        Money other = (Money) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.microAmount==null && other.getMicroAmount()==null) || 
             (this.microAmount!=null &&
              this.microAmount.equals(other.getMicroAmount())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getMicroAmount() != null) {
            _hashCode += getMicroAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Money.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "Money"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "microAmount"));
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
