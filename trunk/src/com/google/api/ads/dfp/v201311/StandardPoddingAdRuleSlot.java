/**
 * StandardPoddingAdRuleSlot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * An ad rule slot with standard podding. A standard pod is a series
 * of video ads played
 *             back to back. Standard pods are defined by a {@link BaseAdRuleSlot#maxAdsInPod}
 * and a
 *             {@link BaseAdRuleSlot#maxVideoAdDuration}.
 */
public class StandardPoddingAdRuleSlot  extends com.google.api.ads.dfp.v201311.BaseAdRuleSlot  implements java.io.Serializable {
    public StandardPoddingAdRuleSlot() {
    }

    public StandardPoddingAdRuleSlot(
           java.lang.Long id,
           com.google.api.ads.dfp.v201311.AdRuleSlotBehavior slotBehavior,
           java.lang.Long minVideoAdDuration,
           java.lang.Long maxVideoAdDuration,
           com.google.api.ads.dfp.v201311.MidrollFrequencyType videoMidrollFrequencyType,
           java.lang.String videoMidrollFrequency,
           com.google.api.ads.dfp.v201311.AdRuleSlotBumper bumper,
           java.lang.Long maxBumperDuration,
           java.lang.Long minPodDuration,
           java.lang.Long maxPodDuration,
           java.lang.Integer maxAdsInPod,
           java.lang.String baseAdRuleSlotType) {
        super(
            id,
            slotBehavior,
            minVideoAdDuration,
            maxVideoAdDuration,
            videoMidrollFrequencyType,
            videoMidrollFrequency,
            bumper,
            maxBumperDuration,
            minPodDuration,
            maxPodDuration,
            maxAdsInPod,
            baseAdRuleSlotType);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StandardPoddingAdRuleSlot)) return false;
        StandardPoddingAdRuleSlot other = (StandardPoddingAdRuleSlot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StandardPoddingAdRuleSlot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "StandardPoddingAdRuleSlot"));
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
