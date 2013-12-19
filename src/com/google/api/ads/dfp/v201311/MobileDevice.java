/**
 * MobileDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Represents a Mobile Device.
 */
public class MobileDevice  extends com.google.api.ads.dfp.v201311.Technology  implements java.io.Serializable {
    /* Manufacturer Id. */
    private java.lang.Long manufacturerCriterionId;

    public MobileDevice() {
    }

    public MobileDevice(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String technologyType,
           java.lang.Long manufacturerCriterionId) {
        super(
            id,
            name,
            technologyType);
        this.manufacturerCriterionId = manufacturerCriterionId;
    }


    /**
     * Gets the manufacturerCriterionId value for this MobileDevice.
     * 
     * @return manufacturerCriterionId   * Manufacturer Id.
     */
    public java.lang.Long getManufacturerCriterionId() {
        return manufacturerCriterionId;
    }


    /**
     * Sets the manufacturerCriterionId value for this MobileDevice.
     * 
     * @param manufacturerCriterionId   * Manufacturer Id.
     */
    public void setManufacturerCriterionId(java.lang.Long manufacturerCriterionId) {
        this.manufacturerCriterionId = manufacturerCriterionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileDevice)) return false;
        MobileDevice other = (MobileDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.manufacturerCriterionId==null && other.getManufacturerCriterionId()==null) || 
             (this.manufacturerCriterionId!=null &&
              this.manufacturerCriterionId.equals(other.getManufacturerCriterionId())));
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
        if (getManufacturerCriterionId() != null) {
            _hashCode += getManufacturerCriterionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "MobileDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCriterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "manufacturerCriterionId"));
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
