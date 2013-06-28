/**
 * BaseRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * A base rate that applies to a product template or product belonging
 * to rate
 *             card.
 */
public abstract class BaseRate  implements java.io.Serializable {
    /* The ID of the {@link RateCard} object to which this base rate
     * belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation. */
    private java.lang.Long rateCardId;

    /* Uniquely identifies the {@code BaseRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a base rate is
     *                 created. */
    private java.lang.Long id;

    /* The status of the {@code BaseRate}. This attribute is read-only
     * and is
     *                 assigned by Google. */
    private com.google.api.ads.dfp.v201306.BaseRateStatus status;

    /* Indicates that this instance is a subtype of BaseRate.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String baseRateType;

    public BaseRate() {
    }

    public BaseRate(
           java.lang.Long rateCardId,
           java.lang.Long id,
           com.google.api.ads.dfp.v201306.BaseRateStatus status,
           java.lang.String baseRateType) {
           this.rateCardId = rateCardId;
           this.id = id;
           this.status = status;
           this.baseRateType = baseRateType;
    }


    /**
     * Gets the rateCardId value for this BaseRate.
     * 
     * @return rateCardId   * The ID of the {@link RateCard} object to which this base rate
     * belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public java.lang.Long getRateCardId() {
        return rateCardId;
    }


    /**
     * Sets the rateCardId value for this BaseRate.
     * 
     * @param rateCardId   * The ID of the {@link RateCard} object to which this base rate
     * belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public void setRateCardId(java.lang.Long rateCardId) {
        this.rateCardId = rateCardId;
    }


    /**
     * Gets the id value for this BaseRate.
     * 
     * @return id   * Uniquely identifies the {@code BaseRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a base rate is
     *                 created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BaseRate.
     * 
     * @param id   * Uniquely identifies the {@code BaseRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a base rate is
     *                 created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the status value for this BaseRate.
     * 
     * @return status   * The status of the {@code BaseRate}. This attribute is read-only
     * and is
     *                 assigned by Google.
     */
    public com.google.api.ads.dfp.v201306.BaseRateStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BaseRate.
     * 
     * @param status   * The status of the {@code BaseRate}. This attribute is read-only
     * and is
     *                 assigned by Google.
     */
    public void setStatus(com.google.api.ads.dfp.v201306.BaseRateStatus status) {
        this.status = status;
    }


    /**
     * Gets the baseRateType value for this BaseRate.
     * 
     * @return baseRateType   * Indicates that this instance is a subtype of BaseRate.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getBaseRateType() {
        return baseRateType;
    }


    /**
     * Sets the baseRateType value for this BaseRate.
     * 
     * @param baseRateType   * Indicates that this instance is a subtype of BaseRate.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setBaseRateType(java.lang.String baseRateType) {
        this.baseRateType = baseRateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseRate)) return false;
        BaseRate other = (BaseRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rateCardId==null && other.getRateCardId()==null) || 
             (this.rateCardId!=null &&
              this.rateCardId.equals(other.getRateCardId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.baseRateType==null && other.getBaseRateType()==null) || 
             (this.baseRateType!=null &&
              this.baseRateType.equals(other.getBaseRateType())));
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
        if (getRateCardId() != null) {
            _hashCode += getRateCardId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBaseRateType() != null) {
            _hashCode += getBaseRateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BaseRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BaseRateStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BaseRate.Type"));
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
