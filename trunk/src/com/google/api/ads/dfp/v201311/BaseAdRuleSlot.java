/**
 * BaseAdRuleSlot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Simple object representing an ad slot within an {@link AdRule}.
 * Ad rule slots
 *             contain information about the types/number of ads to display,
 * as well
 *             as additional information on how the ad server will generate
 * playlists.
 */
public abstract class BaseAdRuleSlot  implements java.io.Serializable {
    /* The unique ID for this ad rule slot. This attribute is required. */
    private java.lang.Long id;

    /* The {@link AdRuleSlotBehavior} for video ads for this slot.
     * This
     *                 attribute is optional and defaults to {@link AdRuleSlotBehavior#DEFER}.
     * 
     *                 <p>Indicates whether video ads are allowed for this
     * slot, or if the
     *                 decision is deferred to a lower-priority ad rule. */
    private com.google.api.ads.dfp.v201311.AdRuleSlotBehavior slotBehavior;

    /* The minimum duration in milliseconds of video ads within this
     * slot. This
     *                 attribute is optional and defaults to 0. */
    private java.lang.Long minVideoAdDuration;

    /* The maximum duration in milliseconds of video ads within this
     * slot. This
     *                 attribute is optional and defaults to 0. */
    private java.lang.Long maxVideoAdDuration;

    /* The frequency type for video ads in this ad rule slot. This
     * attribute
     *                 is required for mid-rolls, but if this is not a mid-roll,
     * the value is set to
     *                 {@link MidrollFrequencyType#NONE}. */
    private com.google.api.ads.dfp.v201311.MidrollFrequencyType videoMidrollFrequencyType;

    /* The mid-roll frequency of this ad rule slot for video ads.
     * This attribute is
     *                 required for mid-rolls, but if {@link MidrollFrequencyType}
     * is set to
     *                 {@link MidrollFrequencyType#NONE}, this value should
     * be ignored. For example,
     *                 if this slot has a frequency type of {@link MidrollFrequencyType#EVERY_N_SECONDS}
     * and {@code #videoMidrollFrequency} = "60", this would mean " play
     * a mid-roll every 60
     *                 seconds." */
    private java.lang.String videoMidrollFrequency;

    /* The {@link AdRuleSlotBumper} for this slot. This attribute
     * is optional and
     *                 defaults to {@link AdRuleSlotBumper#NONE}. */
    private com.google.api.ads.dfp.v201311.AdRuleSlotBumper bumper;

    /* The maximum duration of bumper ads within this slot. This attribute
     * is
     *                 optional and defaults to 0. */
    private java.lang.Long maxBumperDuration;

    /* The minimum pod duration in milliseconds for this slot. This
     * attribute is
     *                 optional and defaults to 0. */
    private java.lang.Long minPodDuration;

    /* The maximum pod duration in milliseconds for this slot. This
     * attribute is
     *                 optional and defaults to 0. */
    private java.lang.Long maxPodDuration;

    /* The maximum number of ads allowed in a pod in this slot. This
     * attribute is
     *                 optional and defaults to 0. */
    private java.lang.Integer maxAdsInPod;

    /* Indicates that this instance is a subtype of BaseAdRuleSlot.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String baseAdRuleSlotType;

    public BaseAdRuleSlot() {
    }

    public BaseAdRuleSlot(
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
           this.id = id;
           this.slotBehavior = slotBehavior;
           this.minVideoAdDuration = minVideoAdDuration;
           this.maxVideoAdDuration = maxVideoAdDuration;
           this.videoMidrollFrequencyType = videoMidrollFrequencyType;
           this.videoMidrollFrequency = videoMidrollFrequency;
           this.bumper = bumper;
           this.maxBumperDuration = maxBumperDuration;
           this.minPodDuration = minPodDuration;
           this.maxPodDuration = maxPodDuration;
           this.maxAdsInPod = maxAdsInPod;
           this.baseAdRuleSlotType = baseAdRuleSlotType;
    }


    /**
     * Gets the id value for this BaseAdRuleSlot.
     * 
     * @return id   * The unique ID for this ad rule slot. This attribute is required.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BaseAdRuleSlot.
     * 
     * @param id   * The unique ID for this ad rule slot. This attribute is required.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the slotBehavior value for this BaseAdRuleSlot.
     * 
     * @return slotBehavior   * The {@link AdRuleSlotBehavior} for video ads for this slot.
     * This
     *                 attribute is optional and defaults to {@link AdRuleSlotBehavior#DEFER}.
     * 
     *                 <p>Indicates whether video ads are allowed for this
     * slot, or if the
     *                 decision is deferred to a lower-priority ad rule.
     */
    public com.google.api.ads.dfp.v201311.AdRuleSlotBehavior getSlotBehavior() {
        return slotBehavior;
    }


    /**
     * Sets the slotBehavior value for this BaseAdRuleSlot.
     * 
     * @param slotBehavior   * The {@link AdRuleSlotBehavior} for video ads for this slot.
     * This
     *                 attribute is optional and defaults to {@link AdRuleSlotBehavior#DEFER}.
     * 
     *                 <p>Indicates whether video ads are allowed for this
     * slot, or if the
     *                 decision is deferred to a lower-priority ad rule.
     */
    public void setSlotBehavior(com.google.api.ads.dfp.v201311.AdRuleSlotBehavior slotBehavior) {
        this.slotBehavior = slotBehavior;
    }


    /**
     * Gets the minVideoAdDuration value for this BaseAdRuleSlot.
     * 
     * @return minVideoAdDuration   * The minimum duration in milliseconds of video ads within this
     * slot. This
     *                 attribute is optional and defaults to 0.
     */
    public java.lang.Long getMinVideoAdDuration() {
        return minVideoAdDuration;
    }


    /**
     * Sets the minVideoAdDuration value for this BaseAdRuleSlot.
     * 
     * @param minVideoAdDuration   * The minimum duration in milliseconds of video ads within this
     * slot. This
     *                 attribute is optional and defaults to 0.
     */
    public void setMinVideoAdDuration(java.lang.Long minVideoAdDuration) {
        this.minVideoAdDuration = minVideoAdDuration;
    }


    /**
     * Gets the maxVideoAdDuration value for this BaseAdRuleSlot.
     * 
     * @return maxVideoAdDuration   * The maximum duration in milliseconds of video ads within this
     * slot. This
     *                 attribute is optional and defaults to 0.
     */
    public java.lang.Long getMaxVideoAdDuration() {
        return maxVideoAdDuration;
    }


    /**
     * Sets the maxVideoAdDuration value for this BaseAdRuleSlot.
     * 
     * @param maxVideoAdDuration   * The maximum duration in milliseconds of video ads within this
     * slot. This
     *                 attribute is optional and defaults to 0.
     */
    public void setMaxVideoAdDuration(java.lang.Long maxVideoAdDuration) {
        this.maxVideoAdDuration = maxVideoAdDuration;
    }


    /**
     * Gets the videoMidrollFrequencyType value for this BaseAdRuleSlot.
     * 
     * @return videoMidrollFrequencyType   * The frequency type for video ads in this ad rule slot. This
     * attribute
     *                 is required for mid-rolls, but if this is not a mid-roll,
     * the value is set to
     *                 {@link MidrollFrequencyType#NONE}.
     */
    public com.google.api.ads.dfp.v201311.MidrollFrequencyType getVideoMidrollFrequencyType() {
        return videoMidrollFrequencyType;
    }


    /**
     * Sets the videoMidrollFrequencyType value for this BaseAdRuleSlot.
     * 
     * @param videoMidrollFrequencyType   * The frequency type for video ads in this ad rule slot. This
     * attribute
     *                 is required for mid-rolls, but if this is not a mid-roll,
     * the value is set to
     *                 {@link MidrollFrequencyType#NONE}.
     */
    public void setVideoMidrollFrequencyType(com.google.api.ads.dfp.v201311.MidrollFrequencyType videoMidrollFrequencyType) {
        this.videoMidrollFrequencyType = videoMidrollFrequencyType;
    }


    /**
     * Gets the videoMidrollFrequency value for this BaseAdRuleSlot.
     * 
     * @return videoMidrollFrequency   * The mid-roll frequency of this ad rule slot for video ads.
     * This attribute is
     *                 required for mid-rolls, but if {@link MidrollFrequencyType}
     * is set to
     *                 {@link MidrollFrequencyType#NONE}, this value should
     * be ignored. For example,
     *                 if this slot has a frequency type of {@link MidrollFrequencyType#EVERY_N_SECONDS}
     * and {@code #videoMidrollFrequency} = "60", this would mean " play
     * a mid-roll every 60
     *                 seconds."
     */
    public java.lang.String getVideoMidrollFrequency() {
        return videoMidrollFrequency;
    }


    /**
     * Sets the videoMidrollFrequency value for this BaseAdRuleSlot.
     * 
     * @param videoMidrollFrequency   * The mid-roll frequency of this ad rule slot for video ads.
     * This attribute is
     *                 required for mid-rolls, but if {@link MidrollFrequencyType}
     * is set to
     *                 {@link MidrollFrequencyType#NONE}, this value should
     * be ignored. For example,
     *                 if this slot has a frequency type of {@link MidrollFrequencyType#EVERY_N_SECONDS}
     * and {@code #videoMidrollFrequency} = "60", this would mean " play
     * a mid-roll every 60
     *                 seconds."
     */
    public void setVideoMidrollFrequency(java.lang.String videoMidrollFrequency) {
        this.videoMidrollFrequency = videoMidrollFrequency;
    }


    /**
     * Gets the bumper value for this BaseAdRuleSlot.
     * 
     * @return bumper   * The {@link AdRuleSlotBumper} for this slot. This attribute
     * is optional and
     *                 defaults to {@link AdRuleSlotBumper#NONE}.
     */
    public com.google.api.ads.dfp.v201311.AdRuleSlotBumper getBumper() {
        return bumper;
    }


    /**
     * Sets the bumper value for this BaseAdRuleSlot.
     * 
     * @param bumper   * The {@link AdRuleSlotBumper} for this slot. This attribute
     * is optional and
     *                 defaults to {@link AdRuleSlotBumper#NONE}.
     */
    public void setBumper(com.google.api.ads.dfp.v201311.AdRuleSlotBumper bumper) {
        this.bumper = bumper;
    }


    /**
     * Gets the maxBumperDuration value for this BaseAdRuleSlot.
     * 
     * @return maxBumperDuration   * The maximum duration of bumper ads within this slot. This attribute
     * is
     *                 optional and defaults to 0.
     */
    public java.lang.Long getMaxBumperDuration() {
        return maxBumperDuration;
    }


    /**
     * Sets the maxBumperDuration value for this BaseAdRuleSlot.
     * 
     * @param maxBumperDuration   * The maximum duration of bumper ads within this slot. This attribute
     * is
     *                 optional and defaults to 0.
     */
    public void setMaxBumperDuration(java.lang.Long maxBumperDuration) {
        this.maxBumperDuration = maxBumperDuration;
    }


    /**
     * Gets the minPodDuration value for this BaseAdRuleSlot.
     * 
     * @return minPodDuration   * The minimum pod duration in milliseconds for this slot. This
     * attribute is
     *                 optional and defaults to 0.
     */
    public java.lang.Long getMinPodDuration() {
        return minPodDuration;
    }


    /**
     * Sets the minPodDuration value for this BaseAdRuleSlot.
     * 
     * @param minPodDuration   * The minimum pod duration in milliseconds for this slot. This
     * attribute is
     *                 optional and defaults to 0.
     */
    public void setMinPodDuration(java.lang.Long minPodDuration) {
        this.minPodDuration = minPodDuration;
    }


    /**
     * Gets the maxPodDuration value for this BaseAdRuleSlot.
     * 
     * @return maxPodDuration   * The maximum pod duration in milliseconds for this slot. This
     * attribute is
     *                 optional and defaults to 0.
     */
    public java.lang.Long getMaxPodDuration() {
        return maxPodDuration;
    }


    /**
     * Sets the maxPodDuration value for this BaseAdRuleSlot.
     * 
     * @param maxPodDuration   * The maximum pod duration in milliseconds for this slot. This
     * attribute is
     *                 optional and defaults to 0.
     */
    public void setMaxPodDuration(java.lang.Long maxPodDuration) {
        this.maxPodDuration = maxPodDuration;
    }


    /**
     * Gets the maxAdsInPod value for this BaseAdRuleSlot.
     * 
     * @return maxAdsInPod   * The maximum number of ads allowed in a pod in this slot. This
     * attribute is
     *                 optional and defaults to 0.
     */
    public java.lang.Integer getMaxAdsInPod() {
        return maxAdsInPod;
    }


    /**
     * Sets the maxAdsInPod value for this BaseAdRuleSlot.
     * 
     * @param maxAdsInPod   * The maximum number of ads allowed in a pod in this slot. This
     * attribute is
     *                 optional and defaults to 0.
     */
    public void setMaxAdsInPod(java.lang.Integer maxAdsInPod) {
        this.maxAdsInPod = maxAdsInPod;
    }


    /**
     * Gets the baseAdRuleSlotType value for this BaseAdRuleSlot.
     * 
     * @return baseAdRuleSlotType   * Indicates that this instance is a subtype of BaseAdRuleSlot.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getBaseAdRuleSlotType() {
        return baseAdRuleSlotType;
    }


    /**
     * Sets the baseAdRuleSlotType value for this BaseAdRuleSlot.
     * 
     * @param baseAdRuleSlotType   * Indicates that this instance is a subtype of BaseAdRuleSlot.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setBaseAdRuleSlotType(java.lang.String baseAdRuleSlotType) {
        this.baseAdRuleSlotType = baseAdRuleSlotType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseAdRuleSlot)) return false;
        BaseAdRuleSlot other = (BaseAdRuleSlot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.slotBehavior==null && other.getSlotBehavior()==null) || 
             (this.slotBehavior!=null &&
              this.slotBehavior.equals(other.getSlotBehavior()))) &&
            ((this.minVideoAdDuration==null && other.getMinVideoAdDuration()==null) || 
             (this.minVideoAdDuration!=null &&
              this.minVideoAdDuration.equals(other.getMinVideoAdDuration()))) &&
            ((this.maxVideoAdDuration==null && other.getMaxVideoAdDuration()==null) || 
             (this.maxVideoAdDuration!=null &&
              this.maxVideoAdDuration.equals(other.getMaxVideoAdDuration()))) &&
            ((this.videoMidrollFrequencyType==null && other.getVideoMidrollFrequencyType()==null) || 
             (this.videoMidrollFrequencyType!=null &&
              this.videoMidrollFrequencyType.equals(other.getVideoMidrollFrequencyType()))) &&
            ((this.videoMidrollFrequency==null && other.getVideoMidrollFrequency()==null) || 
             (this.videoMidrollFrequency!=null &&
              this.videoMidrollFrequency.equals(other.getVideoMidrollFrequency()))) &&
            ((this.bumper==null && other.getBumper()==null) || 
             (this.bumper!=null &&
              this.bumper.equals(other.getBumper()))) &&
            ((this.maxBumperDuration==null && other.getMaxBumperDuration()==null) || 
             (this.maxBumperDuration!=null &&
              this.maxBumperDuration.equals(other.getMaxBumperDuration()))) &&
            ((this.minPodDuration==null && other.getMinPodDuration()==null) || 
             (this.minPodDuration!=null &&
              this.minPodDuration.equals(other.getMinPodDuration()))) &&
            ((this.maxPodDuration==null && other.getMaxPodDuration()==null) || 
             (this.maxPodDuration!=null &&
              this.maxPodDuration.equals(other.getMaxPodDuration()))) &&
            ((this.maxAdsInPod==null && other.getMaxAdsInPod()==null) || 
             (this.maxAdsInPod!=null &&
              this.maxAdsInPod.equals(other.getMaxAdsInPod()))) &&
            ((this.baseAdRuleSlotType==null && other.getBaseAdRuleSlotType()==null) || 
             (this.baseAdRuleSlotType!=null &&
              this.baseAdRuleSlotType.equals(other.getBaseAdRuleSlotType())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSlotBehavior() != null) {
            _hashCode += getSlotBehavior().hashCode();
        }
        if (getMinVideoAdDuration() != null) {
            _hashCode += getMinVideoAdDuration().hashCode();
        }
        if (getMaxVideoAdDuration() != null) {
            _hashCode += getMaxVideoAdDuration().hashCode();
        }
        if (getVideoMidrollFrequencyType() != null) {
            _hashCode += getVideoMidrollFrequencyType().hashCode();
        }
        if (getVideoMidrollFrequency() != null) {
            _hashCode += getVideoMidrollFrequency().hashCode();
        }
        if (getBumper() != null) {
            _hashCode += getBumper().hashCode();
        }
        if (getMaxBumperDuration() != null) {
            _hashCode += getMaxBumperDuration().hashCode();
        }
        if (getMinPodDuration() != null) {
            _hashCode += getMinPodDuration().hashCode();
        }
        if (getMaxPodDuration() != null) {
            _hashCode += getMaxPodDuration().hashCode();
        }
        if (getMaxAdsInPod() != null) {
            _hashCode += getMaxAdsInPod().hashCode();
        }
        if (getBaseAdRuleSlotType() != null) {
            _hashCode += getBaseAdRuleSlotType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseAdRuleSlot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "BaseAdRuleSlot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "slotBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "AdRuleSlotBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minVideoAdDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "minVideoAdDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVideoAdDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "maxVideoAdDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMidrollFrequencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "videoMidrollFrequencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "MidrollFrequencyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMidrollFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "videoMidrollFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bumper");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "bumper"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "AdRuleSlotBumper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBumperDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "maxBumperDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minPodDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "minPodDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPodDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "maxPodDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAdsInPod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "maxAdsInPod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAdRuleSlotType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "BaseAdRuleSlot.Type"));
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
