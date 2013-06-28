/**
 * VideoPositionWithinPod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * Represents a targetable position within a pod within a video stream.
 * A video ad can be targeted
 *             to any position in the pod (first, second, third ... last).
 * If there is only 1 ad in a pod,
 *             either first or last will target that position.
 */
public class VideoPositionWithinPod  implements java.io.Serializable {
    /* The specific index of the pod. The index is defined as:
     *                 <ul><li>1 = first</li>
     *                 <li>2 = second</li>
     *                 <li>3 = third</li>
     *                 <li>....</li>
     *                 <li>100 = last</li></ul>
     *                 100 will always be the last position. For example,
     * for a pod with 5 positions, 100 would
     *                 target position 5. Multiple targets against the index
     * 100 can exist.<br>
     *                 Positions over 100 are not supported. */
    private java.lang.Integer index;

    public VideoPositionWithinPod() {
    }

    public VideoPositionWithinPod(
           java.lang.Integer index) {
           this.index = index;
    }


    /**
     * Gets the index value for this VideoPositionWithinPod.
     * 
     * @return index   * The specific index of the pod. The index is defined as:
     *                 <ul><li>1 = first</li>
     *                 <li>2 = second</li>
     *                 <li>3 = third</li>
     *                 <li>....</li>
     *                 <li>100 = last</li></ul>
     *                 100 will always be the last position. For example,
     * for a pod with 5 positions, 100 would
     *                 target position 5. Multiple targets against the index
     * 100 can exist.<br>
     *                 Positions over 100 are not supported.
     */
    public java.lang.Integer getIndex() {
        return index;
    }


    /**
     * Sets the index value for this VideoPositionWithinPod.
     * 
     * @param index   * The specific index of the pod. The index is defined as:
     *                 <ul><li>1 = first</li>
     *                 <li>2 = second</li>
     *                 <li>3 = third</li>
     *                 <li>....</li>
     *                 <li>100 = last</li></ul>
     *                 100 will always be the last position. For example,
     * for a pod with 5 positions, 100 would
     *                 target position 5. Multiple targets against the index
     * 100 can exist.<br>
     *                 Positions over 100 are not supported.
     */
    public void setIndex(java.lang.Integer index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPositionWithinPod)) return false;
        VideoPositionWithinPod other = (VideoPositionWithinPod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex())));
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
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPositionWithinPod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "VideoPositionWithinPod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
