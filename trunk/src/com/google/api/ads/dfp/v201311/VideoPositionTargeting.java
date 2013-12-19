/**
 * VideoPositionTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Represents positions within and around a video where ads can be
 * targeted to.
 *             <p>
 *             Example positions could be {@code pre-roll} (before the
 * video plays),
 *             {@code post-roll} (after a video has completed playback)
 * and
 *             {@code mid-roll} (during video playback).
 */
public class VideoPositionTargeting  implements java.io.Serializable {
    /* The {@link VideoTargetingPosition} objects being targeted by
     * the
     *                 video {@link LineItem}. */
    private com.google.api.ads.dfp.v201311.VideoPositionTarget[] targetedPositions;

    public VideoPositionTargeting() {
    }

    public VideoPositionTargeting(
           com.google.api.ads.dfp.v201311.VideoPositionTarget[] targetedPositions) {
           this.targetedPositions = targetedPositions;
    }


    /**
     * Gets the targetedPositions value for this VideoPositionTargeting.
     * 
     * @return targetedPositions   * The {@link VideoTargetingPosition} objects being targeted by
     * the
     *                 video {@link LineItem}.
     */
    public com.google.api.ads.dfp.v201311.VideoPositionTarget[] getTargetedPositions() {
        return targetedPositions;
    }


    /**
     * Sets the targetedPositions value for this VideoPositionTargeting.
     * 
     * @param targetedPositions   * The {@link VideoTargetingPosition} objects being targeted by
     * the
     *                 video {@link LineItem}.
     */
    public void setTargetedPositions(com.google.api.ads.dfp.v201311.VideoPositionTarget[] targetedPositions) {
        this.targetedPositions = targetedPositions;
    }

    public com.google.api.ads.dfp.v201311.VideoPositionTarget getTargetedPositions(int i) {
        return this.targetedPositions[i];
    }

    public void setTargetedPositions(int i, com.google.api.ads.dfp.v201311.VideoPositionTarget _value) {
        this.targetedPositions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPositionTargeting)) return false;
        VideoPositionTargeting other = (VideoPositionTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedPositions==null && other.getTargetedPositions()==null) || 
             (this.targetedPositions!=null &&
              java.util.Arrays.equals(this.targetedPositions, other.getTargetedPositions())));
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
        if (getTargetedPositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedPositions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedPositions(), i);
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
        new org.apache.axis.description.TypeDesc(VideoPositionTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "VideoPositionTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedPositions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "targetedPositions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "VideoPositionTarget"));
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
