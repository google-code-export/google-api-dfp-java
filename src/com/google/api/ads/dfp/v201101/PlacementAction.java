/**
 * PlacementAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201101;


/**
 * Represents the actions that can be performed on {@link Placement}
 * objects.
 */
public abstract class PlacementAction  implements java.io.Serializable {
    /* This field indicates the subtype of PlacementAction of this
     * instance.  It is ignored
     *                 on input, and instead xsi:type should be specified. */
    private java.lang.String placementActionType;

    public PlacementAction() {
    }

    public PlacementAction(
           java.lang.String placementActionType) {
           this.placementActionType = placementActionType;
    }


    /**
     * Gets the placementActionType value for this PlacementAction.
     * 
     * @return placementActionType   * This field indicates the subtype of PlacementAction of this
     * instance.  It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public java.lang.String getPlacementActionType() {
        return placementActionType;
    }


    /**
     * Sets the placementActionType value for this PlacementAction.
     * 
     * @param placementActionType   * This field indicates the subtype of PlacementAction of this
     * instance.  It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public void setPlacementActionType(java.lang.String placementActionType) {
        this.placementActionType = placementActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementAction)) return false;
        PlacementAction other = (PlacementAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.placementActionType==null && other.getPlacementActionType()==null) || 
             (this.placementActionType!=null &&
              this.placementActionType.equals(other.getPlacementActionType())));
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
        if (getPlacementActionType() != null) {
            _hashCode += getPlacementActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "PlacementAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "PlacementAction.Type"));
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
