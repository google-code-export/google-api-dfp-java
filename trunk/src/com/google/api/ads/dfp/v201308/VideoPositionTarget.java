/**
 * VideoPositionTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * Represents the options for targetable positions within a video.
 */
public class VideoPositionTarget  implements java.io.Serializable {
    /* The video position to target.  This attribute is required. */
    private com.google.api.ads.dfp.v201308.VideoPosition videoPosition;

    /* The video bumper type to target.  To target a video position
     * or a pod position,
     *                 this value must be null.  To target a bumper position
     * this value must be populated
     *                 and the line item must have a bumper type. */
    private com.google.api.ads.dfp.v201308.VideoBumperType videoBumperType;

    /* The video position within a pod to target.  To target a video
     * position or a bumper
     *                 position, this value must be null.  To target a position
     * within a pod this value must
     *                 be populated. */
    private com.google.api.ads.dfp.v201308.VideoPositionWithinPod videoPositionWithinPod;

    public VideoPositionTarget() {
    }

    public VideoPositionTarget(
           com.google.api.ads.dfp.v201308.VideoPosition videoPosition,
           com.google.api.ads.dfp.v201308.VideoBumperType videoBumperType,
           com.google.api.ads.dfp.v201308.VideoPositionWithinPod videoPositionWithinPod) {
           this.videoPosition = videoPosition;
           this.videoBumperType = videoBumperType;
           this.videoPositionWithinPod = videoPositionWithinPod;
    }


    /**
     * Gets the videoPosition value for this VideoPositionTarget.
     * 
     * @return videoPosition   * The video position to target.  This attribute is required.
     */
    public com.google.api.ads.dfp.v201308.VideoPosition getVideoPosition() {
        return videoPosition;
    }


    /**
     * Sets the videoPosition value for this VideoPositionTarget.
     * 
     * @param videoPosition   * The video position to target.  This attribute is required.
     */
    public void setVideoPosition(com.google.api.ads.dfp.v201308.VideoPosition videoPosition) {
        this.videoPosition = videoPosition;
    }


    /**
     * Gets the videoBumperType value for this VideoPositionTarget.
     * 
     * @return videoBumperType   * The video bumper type to target.  To target a video position
     * or a pod position,
     *                 this value must be null.  To target a bumper position
     * this value must be populated
     *                 and the line item must have a bumper type.
     */
    public com.google.api.ads.dfp.v201308.VideoBumperType getVideoBumperType() {
        return videoBumperType;
    }


    /**
     * Sets the videoBumperType value for this VideoPositionTarget.
     * 
     * @param videoBumperType   * The video bumper type to target.  To target a video position
     * or a pod position,
     *                 this value must be null.  To target a bumper position
     * this value must be populated
     *                 and the line item must have a bumper type.
     */
    public void setVideoBumperType(com.google.api.ads.dfp.v201308.VideoBumperType videoBumperType) {
        this.videoBumperType = videoBumperType;
    }


    /**
     * Gets the videoPositionWithinPod value for this VideoPositionTarget.
     * 
     * @return videoPositionWithinPod   * The video position within a pod to target.  To target a video
     * position or a bumper
     *                 position, this value must be null.  To target a position
     * within a pod this value must
     *                 be populated.
     */
    public com.google.api.ads.dfp.v201308.VideoPositionWithinPod getVideoPositionWithinPod() {
        return videoPositionWithinPod;
    }


    /**
     * Sets the videoPositionWithinPod value for this VideoPositionTarget.
     * 
     * @param videoPositionWithinPod   * The video position within a pod to target.  To target a video
     * position or a bumper
     *                 position, this value must be null.  To target a position
     * within a pod this value must
     *                 be populated.
     */
    public void setVideoPositionWithinPod(com.google.api.ads.dfp.v201308.VideoPositionWithinPod videoPositionWithinPod) {
        this.videoPositionWithinPod = videoPositionWithinPod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPositionTarget)) return false;
        VideoPositionTarget other = (VideoPositionTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.videoPosition==null && other.getVideoPosition()==null) || 
             (this.videoPosition!=null &&
              this.videoPosition.equals(other.getVideoPosition()))) &&
            ((this.videoBumperType==null && other.getVideoBumperType()==null) || 
             (this.videoBumperType!=null &&
              this.videoBumperType.equals(other.getVideoBumperType()))) &&
            ((this.videoPositionWithinPod==null && other.getVideoPositionWithinPod()==null) || 
             (this.videoPositionWithinPod!=null &&
              this.videoPositionWithinPod.equals(other.getVideoPositionWithinPod())));
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
        if (getVideoPosition() != null) {
            _hashCode += getVideoPosition().hashCode();
        }
        if (getVideoBumperType() != null) {
            _hashCode += getVideoBumperType().hashCode();
        }
        if (getVideoPositionWithinPod() != null) {
            _hashCode += getVideoPositionWithinPod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPositionTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "VideoPositionTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "videoPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "VideoPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoBumperType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "videoBumperType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "VideoBumperType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPositionWithinPod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "videoPositionWithinPod"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "VideoPositionWithinPod"));
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
