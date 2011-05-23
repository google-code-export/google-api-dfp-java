/**
 * LineItemCreativeAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201104;


/**
 * A {@code LineItemCreativeAssociation} associates a {@link Creative}
 * with a
 *             {@link LineItem} so that the creative can be served in
 * ad units targeted by
 *             the line item.
 */
public class LineItemCreativeAssociation  implements java.io.Serializable {
    /* The ID of the {@link LineItem} to which the {@link Creative}
     * should be
     *                 associated. This attribute is required. */
    private java.lang.Long lineItemId;

    /* The ID of the {@link Creative} being associated with a {@link
     * LineItem}.
     *                 This attribute is required. */
    private java.lang.Long creativeId;

    /* The weight of the {@link Creative}. This value is only used
     * if the line
     *                 item's {@code creativeRotationType} is set to
     *                 {@link CreativeRotationType#MANUAL}. This attribute
     * is optional and
     *                 defaults to 10. */
    private java.lang.Double manualCreativeRotationWeight;

    /* Overrides the value set for {@link LineItem#startDateTime}.
     * This value is
     *                 optional and is only valid for DFP premium networks. */
    private com.google.api.ads.dfp.v201104.DateTime startDateTime;

    /* Specifies whether to start serving to the
     *                 {@code LineItemCreativeAssociation} right away, in
     * an hour, etc. This
     *                 attribute is optional and defaults to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}. */
    private com.google.api.ads.dfp.v201104.StartDateTimeType startDateTimeType;

    /* Overrides {@link LineItem#endDateTime}. This value is optional
     * and is only
     *                 valid for DFP premium networks. */
    private com.google.api.ads.dfp.v201104.DateTime endDateTime;

    /* Overrides the value set for
     *                 {@link HasDestinationUrlCreative#destinationUrl}.
     * This value is optional
     *                 and is only valid for DFP premium networks. */
    private java.lang.String destinationUrl;

    /* Overrides the value set for {@link Creative#size}, which allows
     * the
     *                 creative to be served to ad units that would otherwise
     * not be compatible
     *                 for its actual size. This value is optional. */
    private com.google.api.ads.dfp.v201104.Size[] sizes;

    /* The status of the association. This attribute is read-only. */
    private com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStatus status;

    /* Contains trafficking statistics for the association. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for the association yet. */
    private com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStats stats;

    public LineItemCreativeAssociation() {
    }

    public LineItemCreativeAssociation(
           java.lang.Long lineItemId,
           java.lang.Long creativeId,
           java.lang.Double manualCreativeRotationWeight,
           com.google.api.ads.dfp.v201104.DateTime startDateTime,
           com.google.api.ads.dfp.v201104.StartDateTimeType startDateTimeType,
           com.google.api.ads.dfp.v201104.DateTime endDateTime,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.v201104.Size[] sizes,
           com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStatus status,
           com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStats stats) {
           this.lineItemId = lineItemId;
           this.creativeId = creativeId;
           this.manualCreativeRotationWeight = manualCreativeRotationWeight;
           this.startDateTime = startDateTime;
           this.startDateTimeType = startDateTimeType;
           this.endDateTime = endDateTime;
           this.destinationUrl = destinationUrl;
           this.sizes = sizes;
           this.status = status;
           this.stats = stats;
    }


    /**
     * Gets the lineItemId value for this LineItemCreativeAssociation.
     * 
     * @return lineItemId   * The ID of the {@link LineItem} to which the {@link Creative}
     * should be
     *                 associated. This attribute is required.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this LineItemCreativeAssociation.
     * 
     * @param lineItemId   * The ID of the {@link LineItem} to which the {@link Creative}
     * should be
     *                 associated. This attribute is required.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the creativeId value for this LineItemCreativeAssociation.
     * 
     * @return creativeId   * The ID of the {@link Creative} being associated with a {@link
     * LineItem}.
     *                 This attribute is required.
     */
    public java.lang.Long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this LineItemCreativeAssociation.
     * 
     * @param creativeId   * The ID of the {@link Creative} being associated with a {@link
     * LineItem}.
     *                 This attribute is required.
     */
    public void setCreativeId(java.lang.Long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the manualCreativeRotationWeight value for this LineItemCreativeAssociation.
     * 
     * @return manualCreativeRotationWeight   * The weight of the {@link Creative}. This value is only used
     * if the line
     *                 item's {@code creativeRotationType} is set to
     *                 {@link CreativeRotationType#MANUAL}. This attribute
     * is optional and
     *                 defaults to 10.
     */
    public java.lang.Double getManualCreativeRotationWeight() {
        return manualCreativeRotationWeight;
    }


    /**
     * Sets the manualCreativeRotationWeight value for this LineItemCreativeAssociation.
     * 
     * @param manualCreativeRotationWeight   * The weight of the {@link Creative}. This value is only used
     * if the line
     *                 item's {@code creativeRotationType} is set to
     *                 {@link CreativeRotationType#MANUAL}. This attribute
     * is optional and
     *                 defaults to 10.
     */
    public void setManualCreativeRotationWeight(java.lang.Double manualCreativeRotationWeight) {
        this.manualCreativeRotationWeight = manualCreativeRotationWeight;
    }


    /**
     * Gets the startDateTime value for this LineItemCreativeAssociation.
     * 
     * @return startDateTime   * Overrides the value set for {@link LineItem#startDateTime}.
     * This value is
     *                 optional and is only valid for DFP premium networks.
     */
    public com.google.api.ads.dfp.v201104.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this LineItemCreativeAssociation.
     * 
     * @param startDateTime   * Overrides the value set for {@link LineItem#startDateTime}.
     * This value is
     *                 optional and is only valid for DFP premium networks.
     */
    public void setStartDateTime(com.google.api.ads.dfp.v201104.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startDateTimeType value for this LineItemCreativeAssociation.
     * 
     * @return startDateTimeType   * Specifies whether to start serving to the
     *                 {@code LineItemCreativeAssociation} right away, in
     * an hour, etc. This
     *                 attribute is optional and defaults to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public com.google.api.ads.dfp.v201104.StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }


    /**
     * Sets the startDateTimeType value for this LineItemCreativeAssociation.
     * 
     * @param startDateTimeType   * Specifies whether to start serving to the
     *                 {@code LineItemCreativeAssociation} right away, in
     * an hour, etc. This
     *                 attribute is optional and defaults to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public void setStartDateTimeType(com.google.api.ads.dfp.v201104.StartDateTimeType startDateTimeType) {
        this.startDateTimeType = startDateTimeType;
    }


    /**
     * Gets the endDateTime value for this LineItemCreativeAssociation.
     * 
     * @return endDateTime   * Overrides {@link LineItem#endDateTime}. This value is optional
     * and is only
     *                 valid for DFP premium networks.
     */
    public com.google.api.ads.dfp.v201104.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this LineItemCreativeAssociation.
     * 
     * @param endDateTime   * Overrides {@link LineItem#endDateTime}. This value is optional
     * and is only
     *                 valid for DFP premium networks.
     */
    public void setEndDateTime(com.google.api.ads.dfp.v201104.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the destinationUrl value for this LineItemCreativeAssociation.
     * 
     * @return destinationUrl   * Overrides the value set for
     *                 {@link HasDestinationUrlCreative#destinationUrl}.
     * This value is optional
     *                 and is only valid for DFP premium networks.
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this LineItemCreativeAssociation.
     * 
     * @param destinationUrl   * Overrides the value set for
     *                 {@link HasDestinationUrlCreative#destinationUrl}.
     * This value is optional
     *                 and is only valid for DFP premium networks.
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the sizes value for this LineItemCreativeAssociation.
     * 
     * @return sizes   * Overrides the value set for {@link Creative#size}, which allows
     * the
     *                 creative to be served to ad units that would otherwise
     * not be compatible
     *                 for its actual size. This value is optional.
     */
    public com.google.api.ads.dfp.v201104.Size[] getSizes() {
        return sizes;
    }


    /**
     * Sets the sizes value for this LineItemCreativeAssociation.
     * 
     * @param sizes   * Overrides the value set for {@link Creative#size}, which allows
     * the
     *                 creative to be served to ad units that would otherwise
     * not be compatible
     *                 for its actual size. This value is optional.
     */
    public void setSizes(com.google.api.ads.dfp.v201104.Size[] sizes) {
        this.sizes = sizes;
    }

    public com.google.api.ads.dfp.v201104.Size getSizes(int i) {
        return this.sizes[i];
    }

    public void setSizes(int i, com.google.api.ads.dfp.v201104.Size _value) {
        this.sizes[i] = _value;
    }


    /**
     * Gets the status value for this LineItemCreativeAssociation.
     * 
     * @return status   * The status of the association. This attribute is read-only.
     */
    public com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItemCreativeAssociation.
     * 
     * @param status   * The status of the association. This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStatus status) {
        this.status = status;
    }


    /**
     * Gets the stats value for this LineItemCreativeAssociation.
     * 
     * @return stats   * Contains trafficking statistics for the association. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for the association yet.
     */
    public com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this LineItemCreativeAssociation.
     * 
     * @param stats   * Contains trafficking statistics for the association. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for the association yet.
     */
    public void setStats(com.google.api.ads.dfp.v201104.LineItemCreativeAssociationStats stats) {
        this.stats = stats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemCreativeAssociation)) return false;
        LineItemCreativeAssociation other = (LineItemCreativeAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemId==null && other.getLineItemId()==null) || 
             (this.lineItemId!=null &&
              this.lineItemId.equals(other.getLineItemId()))) &&
            ((this.creativeId==null && other.getCreativeId()==null) || 
             (this.creativeId!=null &&
              this.creativeId.equals(other.getCreativeId()))) &&
            ((this.manualCreativeRotationWeight==null && other.getManualCreativeRotationWeight()==null) || 
             (this.manualCreativeRotationWeight!=null &&
              this.manualCreativeRotationWeight.equals(other.getManualCreativeRotationWeight()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startDateTimeType==null && other.getStartDateTimeType()==null) || 
             (this.startDateTimeType!=null &&
              this.startDateTimeType.equals(other.getStartDateTimeType()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.sizes==null && other.getSizes()==null) || 
             (this.sizes!=null &&
              java.util.Arrays.equals(this.sizes, other.getSizes()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats())));
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
        if (getLineItemId() != null) {
            _hashCode += getLineItemId().hashCode();
        }
        if (getCreativeId() != null) {
            _hashCode += getCreativeId().hashCode();
        }
        if (getManualCreativeRotationWeight() != null) {
            _hashCode += getManualCreativeRotationWeight().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartDateTimeType() != null) {
            _hashCode += getStartDateTimeType().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSizes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemCreativeAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "LineItemCreativeAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCreativeRotationWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "manualCreativeRotationWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "startDateTimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "StartDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "sizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "LineItemCreativeAssociation.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "LineItemCreativeAssociationStats"));
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