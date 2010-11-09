/**
 * Targeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201010;


/**
 * Contains targeting criteria for {@link LineItem} objects. See
 *             {@link LineItem#targeting}.
 */
public class Targeting  implements java.io.Serializable {
    /* Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.v201010.GeoTargeting geoTargeting;

    /* Specifies what inventory is targeted by the {@link LineItem}.
     * This
     *                 attribute is required. */
    private com.google.api.ads.dfp.v201010.InventoryTargeting inventoryTargeting;

    public Targeting() {
    }

    public Targeting(
           com.google.api.ads.dfp.v201010.GeoTargeting geoTargeting,
           com.google.api.ads.dfp.v201010.InventoryTargeting inventoryTargeting) {
           this.geoTargeting = geoTargeting;
           this.inventoryTargeting = inventoryTargeting;
    }


    /**
     * Gets the geoTargeting value for this Targeting.
     * 
     * @return geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.v201010.GeoTargeting getGeoTargeting() {
        return geoTargeting;
    }


    /**
     * Sets the geoTargeting value for this Targeting.
     * 
     * @param geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional.
     */
    public void setGeoTargeting(com.google.api.ads.dfp.v201010.GeoTargeting geoTargeting) {
        this.geoTargeting = geoTargeting;
    }


    /**
     * Gets the inventoryTargeting value for this Targeting.
     * 
     * @return inventoryTargeting   * Specifies what inventory is targeted by the {@link LineItem}.
     * This
     *                 attribute is required.
     */
    public com.google.api.ads.dfp.v201010.InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }


    /**
     * Sets the inventoryTargeting value for this Targeting.
     * 
     * @param inventoryTargeting   * Specifies what inventory is targeted by the {@link LineItem}.
     * This
     *                 attribute is required.
     */
    public void setInventoryTargeting(com.google.api.ads.dfp.v201010.InventoryTargeting inventoryTargeting) {
        this.inventoryTargeting = inventoryTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Targeting)) return false;
        Targeting other = (Targeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoTargeting==null && other.getGeoTargeting()==null) || 
             (this.geoTargeting!=null &&
              this.geoTargeting.equals(other.getGeoTargeting()))) &&
            ((this.inventoryTargeting==null && other.getInventoryTargeting()==null) || 
             (this.inventoryTargeting!=null &&
              this.inventoryTargeting.equals(other.getInventoryTargeting())));
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
        if (getGeoTargeting() != null) {
            _hashCode += getGeoTargeting().hashCode();
        }
        if (getInventoryTargeting() != null) {
            _hashCode += getInventoryTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Targeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "Targeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "geoTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "inventoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "InventoryTargeting"));
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
