/**
 * ProductTemplateBaseRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * A base rate applied to a {@link ProductTemplate}.
 */
public class ProductTemplateBaseRate  extends com.google.api.ads.dfp.v201306.BaseRate  implements java.io.Serializable {
    /* The ID of {@link ProductTemplate} this base rate is applied
     * to.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation. */
    private java.lang.Long productTemplateId;

    /* The rate value.
     *                     
     *                     This attribute is required. The currency code
     * is read-only. */
    private com.google.api.ads.dfp.v201306.Money rate;

    public ProductTemplateBaseRate() {
    }

    public ProductTemplateBaseRate(
           java.lang.Long rateCardId,
           java.lang.Long id,
           com.google.api.ads.dfp.v201306.BaseRateStatus status,
           java.lang.String baseRateType,
           java.lang.Long productTemplateId,
           com.google.api.ads.dfp.v201306.Money rate) {
        super(
            rateCardId,
            id,
            status,
            baseRateType);
        this.productTemplateId = productTemplateId;
        this.rate = rate;
    }


    /**
     * Gets the productTemplateId value for this ProductTemplateBaseRate.
     * 
     * @return productTemplateId   * The ID of {@link ProductTemplate} this base rate is applied
     * to.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public java.lang.Long getProductTemplateId() {
        return productTemplateId;
    }


    /**
     * Sets the productTemplateId value for this ProductTemplateBaseRate.
     * 
     * @param productTemplateId   * The ID of {@link ProductTemplate} this base rate is applied
     * to.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public void setProductTemplateId(java.lang.Long productTemplateId) {
        this.productTemplateId = productTemplateId;
    }


    /**
     * Gets the rate value for this ProductTemplateBaseRate.
     * 
     * @return rate   * The rate value.
     *                     
     *                     This attribute is required. The currency code
     * is read-only.
     */
    public com.google.api.ads.dfp.v201306.Money getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ProductTemplateBaseRate.
     * 
     * @param rate   * The rate value.
     *                     
     *                     This attribute is required. The currency code
     * is read-only.
     */
    public void setRate(com.google.api.ads.dfp.v201306.Money rate) {
        this.rate = rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductTemplateBaseRate)) return false;
        ProductTemplateBaseRate other = (ProductTemplateBaseRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productTemplateId==null && other.getProductTemplateId()==null) || 
             (this.productTemplateId!=null &&
              this.productTemplateId.equals(other.getProductTemplateId()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate())));
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
        if (getProductTemplateId() != null) {
            _hashCode += getProductTemplateId().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductTemplateBaseRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductTemplateBaseRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "productTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money"));
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
