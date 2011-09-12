/**
 * GeoTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201108;


/**
 * Provides line items the ability to target geographical locations.
 * By default,
 *             line items target all countries and their subdivisions.
 * With geographical
 *             targeting, you can target line items to specific countries,
 * regions, metro
 *             areas, and cities. You can also exclude the same.
 *             <p>
 *             The following rules apply for geographical targeting:
 *             </p>
 *             <ul>
 *             <li>You cannot target and exclude the same location</li>
 * <li>You cannot target a child whose parent has been excluded. So if
 * the state
 *             of Illinois has been excluded, then you cannot target
 * Chicago</li>
 *             <li>You must not target a location if you are also targeting
 * its parent.
 *             So if you are targeting New York City, you must not have
 * the state of New
 *             York as one of the targeted locations</li>
 *             </ul>
 */
public class GeoTargeting  implements java.io.Serializable {
    /* The geographical locations being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201108.Location[] targetedLocations;

    /* The geographical locations being excluded by the {@link LineItem}. */
    private com.google.api.ads.dfp.v201108.Location[] excludedLocations;

    public GeoTargeting() {
    }

    public GeoTargeting(
           com.google.api.ads.dfp.v201108.Location[] targetedLocations,
           com.google.api.ads.dfp.v201108.Location[] excludedLocations) {
           this.targetedLocations = targetedLocations;
           this.excludedLocations = excludedLocations;
    }


    /**
     * Gets the targetedLocations value for this GeoTargeting.
     * 
     * @return targetedLocations   * The geographical locations being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201108.Location[] getTargetedLocations() {
        return targetedLocations;
    }


    /**
     * Sets the targetedLocations value for this GeoTargeting.
     * 
     * @param targetedLocations   * The geographical locations being targeted by the {@link LineItem}.
     */
    public void setTargetedLocations(com.google.api.ads.dfp.v201108.Location[] targetedLocations) {
        this.targetedLocations = targetedLocations;
    }

    public com.google.api.ads.dfp.v201108.Location getTargetedLocations(int i) {
        return this.targetedLocations[i];
    }

    public void setTargetedLocations(int i, com.google.api.ads.dfp.v201108.Location _value) {
        this.targetedLocations[i] = _value;
    }


    /**
     * Gets the excludedLocations value for this GeoTargeting.
     * 
     * @return excludedLocations   * The geographical locations being excluded by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201108.Location[] getExcludedLocations() {
        return excludedLocations;
    }


    /**
     * Sets the excludedLocations value for this GeoTargeting.
     * 
     * @param excludedLocations   * The geographical locations being excluded by the {@link LineItem}.
     */
    public void setExcludedLocations(com.google.api.ads.dfp.v201108.Location[] excludedLocations) {
        this.excludedLocations = excludedLocations;
    }

    public com.google.api.ads.dfp.v201108.Location getExcludedLocations(int i) {
        return this.excludedLocations[i];
    }

    public void setExcludedLocations(int i, com.google.api.ads.dfp.v201108.Location _value) {
        this.excludedLocations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoTargeting)) return false;
        GeoTargeting other = (GeoTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedLocations==null && other.getTargetedLocations()==null) || 
             (this.targetedLocations!=null &&
              java.util.Arrays.equals(this.targetedLocations, other.getTargetedLocations()))) &&
            ((this.excludedLocations==null && other.getExcludedLocations()==null) || 
             (this.excludedLocations!=null &&
              java.util.Arrays.equals(this.excludedLocations, other.getExcludedLocations())));
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
        if (getTargetedLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "GeoTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "targetedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "excludedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
