/**
 * AssignAdUnitsToPlacement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;


/**
 * The action used for assigning a group of {@link AdUnit} objects
 * to a
 *             {@link Placement}.
 */
public class AssignAdUnitsToPlacement  extends com.google.api.ads.dfp.v201002.AdUnitAction  implements java.io.Serializable {
    private java.lang.Long placementId;

    public AssignAdUnitsToPlacement() {
    }

    public AssignAdUnitsToPlacement(
           java.lang.String adUnitActionType,
           java.lang.Long placementId) {
        super(
            adUnitActionType);
        this.placementId = placementId;
    }


    /**
     * Gets the placementId value for this AssignAdUnitsToPlacement.
     * 
     * @return placementId
     */
    public java.lang.Long getPlacementId() {
        return placementId;
    }


    /**
     * Sets the placementId value for this AssignAdUnitsToPlacement.
     * 
     * @param placementId
     */
    public void setPlacementId(java.lang.Long placementId) {
        this.placementId = placementId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignAdUnitsToPlacement)) return false;
        AssignAdUnitsToPlacement other = (AssignAdUnitsToPlacement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.placementId==null && other.getPlacementId()==null) || 
             (this.placementId!=null &&
              this.placementId.equals(other.getPlacementId())));
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
        if (getPlacementId() != null) {
            _hashCode += getPlacementId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssignAdUnitsToPlacement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "AssignAdUnitsToPlacement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "placementId"));
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
