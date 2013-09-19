/**
 * ContendingLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * Describes contending line items for a {@link Forecast}.
 */
public class ContendingLineItem  implements java.io.Serializable {
    /* The {@link LineItem#id Id} of the contending line item. */
    private java.lang.Long lineItemId;

    /* Number of impressions contended for by both the forecasted
     * line item and this line item. */
    private java.lang.Long contendingImpressions;

    public ContendingLineItem() {
    }

    public ContendingLineItem(
           java.lang.Long lineItemId,
           java.lang.Long contendingImpressions) {
           this.lineItemId = lineItemId;
           this.contendingImpressions = contendingImpressions;
    }


    /**
     * Gets the lineItemId value for this ContendingLineItem.
     * 
     * @return lineItemId   * The {@link LineItem#id Id} of the contending line item.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this ContendingLineItem.
     * 
     * @param lineItemId   * The {@link LineItem#id Id} of the contending line item.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the contendingImpressions value for this ContendingLineItem.
     * 
     * @return contendingImpressions   * Number of impressions contended for by both the forecasted
     * line item and this line item.
     */
    public java.lang.Long getContendingImpressions() {
        return contendingImpressions;
    }


    /**
     * Sets the contendingImpressions value for this ContendingLineItem.
     * 
     * @param contendingImpressions   * Number of impressions contended for by both the forecasted
     * line item and this line item.
     */
    public void setContendingImpressions(java.lang.Long contendingImpressions) {
        this.contendingImpressions = contendingImpressions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContendingLineItem)) return false;
        ContendingLineItem other = (ContendingLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemId==null && other.getLineItemId()==null) || 
             (this.lineItemId!=null &&
              this.lineItemId.equals(other.getLineItemId()))) &&
            ((this.contendingImpressions==null && other.getContendingImpressions()==null) || 
             (this.contendingImpressions!=null &&
              this.contendingImpressions.equals(other.getContendingImpressions())));
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
        if (getLineItemId() != null) {
            _hashCode += getLineItemId().hashCode();
        }
        if (getContendingImpressions() != null) {
            _hashCode += getContendingImpressions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContendingLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ContendingLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contendingImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "contendingImpressions"));
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
