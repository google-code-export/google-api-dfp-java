/**
 * Entity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201111;


/**
 * A marker interface to facilitate objects which are parameterized
 * with both
 *             domain entities and Grubby serializable POJOs
 */
public class Entity  implements java.io.Serializable {
    private com.google.api.ads.dfp.v201111.ThirdPartySlot thirdPartySlot;

    public Entity() {
    }

    public Entity(
           com.google.api.ads.dfp.v201111.ThirdPartySlot thirdPartySlot) {
           this.thirdPartySlot = thirdPartySlot;
    }


    /**
     * Gets the thirdPartySlot value for this Entity.
     * 
     * @return thirdPartySlot
     */
    public com.google.api.ads.dfp.v201111.ThirdPartySlot getThirdPartySlot() {
        return thirdPartySlot;
    }


    /**
     * Sets the thirdPartySlot value for this Entity.
     * 
     * @param thirdPartySlot
     */
    public void setThirdPartySlot(com.google.api.ads.dfp.v201111.ThirdPartySlot thirdPartySlot) {
        this.thirdPartySlot = thirdPartySlot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entity)) return false;
        Entity other = (Entity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.thirdPartySlot==null && other.getThirdPartySlot()==null) || 
             (this.thirdPartySlot!=null &&
              this.thirdPartySlot.equals(other.getThirdPartySlot())));
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
        if (getThirdPartySlot() != null) {
            _hashCode += getThirdPartySlot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "Entity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartySlot");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "ThirdPartySlot"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "ThirdPartySlot"));
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
