/**
 * LineItemTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * Represents the template that populates the fields of a new line
 * item being
 *             created.
 */
public class LineItemTemplate  implements java.io.Serializable {
    /* Uniquely identifies the {@code LineItemTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a template
     * is created. */
    private java.lang.Long id;

    /* The name of the {@code LineItemTemplate}. This attribute is
     * required. */
    private java.lang.String name;

    /* Whether or not the {@code LineItemTemplate} represents the
     * default choices
     *                 for creating a {@code LineItem}. Only one default
     * {@code LineItemTemplate}
     *                 is allowed per {@code Network}. This attribute is
     * readonly. */
    private java.lang.Boolean isDefault;

    /* The default {@link LineItem#name name} of a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 127 characters. */
    private java.lang.String lineItemName;

    /* The default {@link LineItem#targetPlatform target platform}
     * for a new
     *                 {@code LineItem}. This attribute is required. */
    private com.google.api.ads.dfp.v201306.TargetPlatform targetPlatform;

    /* The default value for the
     *                 {@link LineItem#enabledForSameAdvertiserException}
     * field of a new
     *                 {@code LineItem}. This attribute is required. */
    private java.lang.Boolean enabledForSameAdvertiserException;

    /* The default {@link LineItem#notes notes} for a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* The default {@link LineItem#lineItemType type} of a new {@code
     * LineItem}.
     *                 This attribute is required. */
    private com.google.api.ads.dfp.v201306.LineItemType lineItemType;

    /* The default time of the {@link LineItem#startDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.v201306.DateTime startTime;

    /* The default time of the {@link LineItem#endDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.v201306.DateTime endTime;

    /* The default {@link LineItem#deliveryRateType delivery strategy}
     * for a new
     *                 {@code LineItem}. This attribute is required. */
    private com.google.api.ads.dfp.v201306.DeliveryRateType deliveryRateType;

    /* The default {@link LineItem#roadblockingType roadblocking strategy}
     * for a
     *                 new {@code LineItem}. This attribute is required. */
    private com.google.api.ads.dfp.v201306.RoadblockingType roadblockingType;

    /* The default {@link LineItem#creativeRotationType creative rotation
     * strategy}
     *                 for a new {@code LineItem}. This attribute is required. */
    private com.google.api.ads.dfp.v201306.CreativeRotationType creativeRotationType;

    public LineItemTemplate() {
    }

    public LineItemTemplate(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Boolean isDefault,
           java.lang.String lineItemName,
           com.google.api.ads.dfp.v201306.TargetPlatform targetPlatform,
           java.lang.Boolean enabledForSameAdvertiserException,
           java.lang.String notes,
           com.google.api.ads.dfp.v201306.LineItemType lineItemType,
           com.google.api.ads.dfp.v201306.DateTime startTime,
           com.google.api.ads.dfp.v201306.DateTime endTime,
           com.google.api.ads.dfp.v201306.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.v201306.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.v201306.CreativeRotationType creativeRotationType) {
           this.id = id;
           this.name = name;
           this.isDefault = isDefault;
           this.lineItemName = lineItemName;
           this.targetPlatform = targetPlatform;
           this.enabledForSameAdvertiserException = enabledForSameAdvertiserException;
           this.notes = notes;
           this.lineItemType = lineItemType;
           this.startTime = startTime;
           this.endTime = endTime;
           this.deliveryRateType = deliveryRateType;
           this.roadblockingType = roadblockingType;
           this.creativeRotationType = creativeRotationType;
    }


    /**
     * Gets the id value for this LineItemTemplate.
     * 
     * @return id   * Uniquely identifies the {@code LineItemTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a template
     * is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LineItemTemplate.
     * 
     * @param id   * Uniquely identifies the {@code LineItemTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a template
     * is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LineItemTemplate.
     * 
     * @return name   * The name of the {@code LineItemTemplate}. This attribute is
     * required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LineItemTemplate.
     * 
     * @param name   * The name of the {@code LineItemTemplate}. This attribute is
     * required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isDefault value for this LineItemTemplate.
     * 
     * @return isDefault   * Whether or not the {@code LineItemTemplate} represents the
     * default choices
     *                 for creating a {@code LineItem}. Only one default
     * {@code LineItemTemplate}
     *                 is allowed per {@code Network}. This attribute is
     * readonly.
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this LineItemTemplate.
     * 
     * @param isDefault   * Whether or not the {@code LineItemTemplate} represents the
     * default choices
     *                 for creating a {@code LineItem}. Only one default
     * {@code LineItemTemplate}
     *                 is allowed per {@code Network}. This attribute is
     * readonly.
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the lineItemName value for this LineItemTemplate.
     * 
     * @return lineItemName   * The default {@link LineItem#name name} of a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 127 characters.
     */
    public java.lang.String getLineItemName() {
        return lineItemName;
    }


    /**
     * Sets the lineItemName value for this LineItemTemplate.
     * 
     * @param lineItemName   * The default {@link LineItem#name name} of a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 127 characters.
     */
    public void setLineItemName(java.lang.String lineItemName) {
        this.lineItemName = lineItemName;
    }


    /**
     * Gets the targetPlatform value for this LineItemTemplate.
     * 
     * @return targetPlatform   * The default {@link LineItem#targetPlatform target platform}
     * for a new
     *                 {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.dfp.v201306.TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }


    /**
     * Sets the targetPlatform value for this LineItemTemplate.
     * 
     * @param targetPlatform   * The default {@link LineItem#targetPlatform target platform}
     * for a new
     *                 {@code LineItem}. This attribute is required.
     */
    public void setTargetPlatform(com.google.api.ads.dfp.v201306.TargetPlatform targetPlatform) {
        this.targetPlatform = targetPlatform;
    }


    /**
     * Gets the enabledForSameAdvertiserException value for this LineItemTemplate.
     * 
     * @return enabledForSameAdvertiserException   * The default value for the
     *                 {@link LineItem#enabledForSameAdvertiserException}
     * field of a new
     *                 {@code LineItem}. This attribute is required.
     */
    public java.lang.Boolean getEnabledForSameAdvertiserException() {
        return enabledForSameAdvertiserException;
    }


    /**
     * Sets the enabledForSameAdvertiserException value for this LineItemTemplate.
     * 
     * @param enabledForSameAdvertiserException   * The default value for the
     *                 {@link LineItem#enabledForSameAdvertiserException}
     * field of a new
     *                 {@code LineItem}. This attribute is required.
     */
    public void setEnabledForSameAdvertiserException(java.lang.Boolean enabledForSameAdvertiserException) {
        this.enabledForSameAdvertiserException = enabledForSameAdvertiserException;
    }


    /**
     * Gets the notes value for this LineItemTemplate.
     * 
     * @return notes   * The default {@link LineItem#notes notes} for a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this LineItemTemplate.
     * 
     * @param notes   * The default {@link LineItem#notes notes} for a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the lineItemType value for this LineItemTemplate.
     * 
     * @return lineItemType   * The default {@link LineItem#lineItemType type} of a new {@code
     * LineItem}.
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.v201306.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this LineItemTemplate.
     * 
     * @param lineItemType   * The default {@link LineItem#lineItemType type} of a new {@code
     * LineItem}.
     *                 This attribute is required.
     */
    public void setLineItemType(com.google.api.ads.dfp.v201306.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the startTime value for this LineItemTemplate.
     * 
     * @return startTime   * The default time of the {@link LineItem#startDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.v201306.DateTime getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this LineItemTemplate.
     * 
     * @param startTime   * The default time of the {@link LineItem#startDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is optional.
     */
    public void setStartTime(com.google.api.ads.dfp.v201306.DateTime startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this LineItemTemplate.
     * 
     * @return endTime   * The default time of the {@link LineItem#endDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.v201306.DateTime getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this LineItemTemplate.
     * 
     * @param endTime   * The default time of the {@link LineItem#endDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is optional.
     */
    public void setEndTime(com.google.api.ads.dfp.v201306.DateTime endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the deliveryRateType value for this LineItemTemplate.
     * 
     * @return deliveryRateType   * The default {@link LineItem#deliveryRateType delivery strategy}
     * for a new
     *                 {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.dfp.v201306.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this LineItemTemplate.
     * 
     * @param deliveryRateType   * The default {@link LineItem#deliveryRateType delivery strategy}
     * for a new
     *                 {@code LineItem}. This attribute is required.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.v201306.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the roadblockingType value for this LineItemTemplate.
     * 
     * @return roadblockingType   * The default {@link LineItem#roadblockingType roadblocking strategy}
     * for a
     *                 new {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.dfp.v201306.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this LineItemTemplate.
     * 
     * @param roadblockingType   * The default {@link LineItem#roadblockingType roadblocking strategy}
     * for a
     *                 new {@code LineItem}. This attribute is required.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.v201306.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the creativeRotationType value for this LineItemTemplate.
     * 
     * @return creativeRotationType   * The default {@link LineItem#creativeRotationType creative rotation
     * strategy}
     *                 for a new {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.dfp.v201306.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this LineItemTemplate.
     * 
     * @param creativeRotationType   * The default {@link LineItem#creativeRotationType creative rotation
     * strategy}
     *                 for a new {@code LineItem}. This attribute is required.
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.v201306.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemTemplate)) return false;
        LineItemTemplate other = (LineItemTemplate) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.lineItemName==null && other.getLineItemName()==null) || 
             (this.lineItemName!=null &&
              this.lineItemName.equals(other.getLineItemName()))) &&
            ((this.targetPlatform==null && other.getTargetPlatform()==null) || 
             (this.targetPlatform!=null &&
              this.targetPlatform.equals(other.getTargetPlatform()))) &&
            ((this.enabledForSameAdvertiserException==null && other.getEnabledForSameAdvertiserException()==null) || 
             (this.enabledForSameAdvertiserException!=null &&
              this.enabledForSameAdvertiserException.equals(other.getEnabledForSameAdvertiserException()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.deliveryRateType==null && other.getDeliveryRateType()==null) || 
             (this.deliveryRateType!=null &&
              this.deliveryRateType.equals(other.getDeliveryRateType()))) &&
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
            ((this.creativeRotationType==null && other.getCreativeRotationType()==null) || 
             (this.creativeRotationType!=null &&
              this.creativeRotationType.equals(other.getCreativeRotationType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getLineItemName() != null) {
            _hashCode += getLineItemName().hashCode();
        }
        if (getTargetPlatform() != null) {
            _hashCode += getTargetPlatform().hashCode();
        }
        if (getEnabledForSameAdvertiserException() != null) {
            _hashCode += getEnabledForSameAdvertiserException().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getDeliveryRateType() != null) {
            _hashCode += getDeliveryRateType().hashCode();
        }
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
        }
        if (getCreativeRotationType() != null) {
            _hashCode += getCreativeRotationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "lineItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "targetPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TargetPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledForSameAdvertiserException");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "enabledForSameAdvertiserException"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativeRotationType"));
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
