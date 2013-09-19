/**
 * ThirdPartyAudienceSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * A {@link ThirdPartyAudienceSegment} is an {@link AudienceSegment}
 * owned by a data provider and
 *             licensed to the DFP publisher.
 */
public class ThirdPartyAudienceSegment  extends com.google.api.ads.dfp.v201308.AudienceSegment  implements java.io.Serializable {
    /* Specifies if the publisher has approved or rejected the segment. */
    private com.google.api.ads.dfp.v201308.ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus approvalStatus;

    /* Specifies CPM cost for the given segment. This attribute is
     * readonly and is assigned by the
     *                     data provider. */
    private com.google.api.ads.dfp.v201308.Money cost;

    /* Specifies the date and time at which this segment becomes available
     * for use. This attribute is
     *                     readonly and is assigned by the data provider. */
    private com.google.api.ads.dfp.v201308.DateTime startDateTime;

    /* Specifies the date and time at which this segment ceases to
     * be available for use. This
     *                     attribute is readonly and is assigned by the data
     * provider. */
    private com.google.api.ads.dfp.v201308.DateTime endDateTime;

    public ThirdPartyAudienceSegment() {
    }

    public ThirdPartyAudienceSegment(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.v201308.AudienceSegmentStatus status,
           java.lang.Long size,
           com.google.api.ads.dfp.v201308.AudienceSegmentDataProvider dataProvider,
           com.google.api.ads.dfp.v201308.AudienceSegmentAudienceSegmentType type,
           java.lang.String audienceSegmentType,
           com.google.api.ads.dfp.v201308.ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus approvalStatus,
           com.google.api.ads.dfp.v201308.Money cost,
           com.google.api.ads.dfp.v201308.DateTime startDateTime,
           com.google.api.ads.dfp.v201308.DateTime endDateTime) {
        super(
            id,
            name,
            description,
            status,
            size,
            dataProvider,
            type,
            audienceSegmentType);
        this.approvalStatus = approvalStatus;
        this.cost = cost;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the approvalStatus value for this ThirdPartyAudienceSegment.
     * 
     * @return approvalStatus   * Specifies if the publisher has approved or rejected the segment.
     */
    public com.google.api.ads.dfp.v201308.ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this ThirdPartyAudienceSegment.
     * 
     * @param approvalStatus   * Specifies if the publisher has approved or rejected the segment.
     */
    public void setApprovalStatus(com.google.api.ads.dfp.v201308.ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the cost value for this ThirdPartyAudienceSegment.
     * 
     * @return cost   * Specifies CPM cost for the given segment. This attribute is
     * readonly and is assigned by the
     *                     data provider.
     */
    public com.google.api.ads.dfp.v201308.Money getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ThirdPartyAudienceSegment.
     * 
     * @param cost   * Specifies CPM cost for the given segment. This attribute is
     * readonly and is assigned by the
     *                     data provider.
     */
    public void setCost(com.google.api.ads.dfp.v201308.Money cost) {
        this.cost = cost;
    }


    /**
     * Gets the startDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @return startDateTime   * Specifies the date and time at which this segment becomes available
     * for use. This attribute is
     *                     readonly and is assigned by the data provider.
     */
    public com.google.api.ads.dfp.v201308.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @param startDateTime   * Specifies the date and time at which this segment becomes available
     * for use. This attribute is
     *                     readonly and is assigned by the data provider.
     */
    public void setStartDateTime(com.google.api.ads.dfp.v201308.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @return endDateTime   * Specifies the date and time at which this segment ceases to
     * be available for use. This
     *                     attribute is readonly and is assigned by the data
     * provider.
     */
    public com.google.api.ads.dfp.v201308.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @param endDateTime   * Specifies the date and time at which this segment ceases to
     * be available for use. This
     *                     attribute is readonly and is assigned by the data
     * provider.
     */
    public void setEndDateTime(com.google.api.ads.dfp.v201308.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyAudienceSegment)) return false;
        ThirdPartyAudienceSegment other = (ThirdPartyAudienceSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime())));
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
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyAudienceSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ThirdPartyAudienceSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ThirdPartyAudienceSegment.AudienceSegmentApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DateTime"));
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
