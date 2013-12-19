/**
 * ActivityGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Activities are organized within activity groups, which are sets
 * of activities that share the
 *             same configuration. You create and manage activities from
 * within activity groups.
 */
public class ActivityGroup  implements java.io.Serializable {
    /* The unique ID of the {@code ActivityGroup}. This attribute
     * is readonly and is assigned
     *                 by Google. */
    private java.lang.Integer id;

    /* The name of the {@code ActivityGroup}. This attribute is required
     * to create an activity group
     *                 and has a maximum length of 255 characters. */
    private java.lang.String name;

    /* The company ids whose ads will be included for conversion tracking
     * on the activities in this
     *                 group. Only clicks and impressions of ads from these
     * companies will lead to conversions on
     *                 the containing activities. This attribute is required
     * when creating an activity group.
     *                 
     *                 The company types allowed are: {@link Company.Type#ADVERTISER},
     * and
     *                 {@link Company.Type#AD_NETWORK}, and {@link Company.Type#HOUSE_ADVERTISER} */
    private long[] companyIds;

    /* DFP records view-through conversions for users who have previously
     * viewed a DFP ad within the
     *                 number of days that you set here (1 to 30 days), then
     * visits a webpage containing activity tags
     *                 from this activity group. To be counted, the ad needs
     * to belong to one of the companies
     *                 associated with the activity group. This attribute
     * is required to create an activity group. */
    private java.lang.Integer impressionsLookback;

    /* DFP records click-through conversions for users who have previously
     * clicked on a DFP ad within
     *                 the number of days that you set here (1 to 30 days),
     * then visits a webpage containing activity
     *                 tags from this activity group. To be counted, the
     * ad needs to belong to one of the companies
     *                 associated with the activity group. This attribute
     * is required to create an activity group. */
    private java.lang.Integer clicksLookback;

    /* The status of this activity group. This attribute is readonly. */
    private com.google.api.ads.dfp.v201311.ActivityGroupStatus status;

    public ActivityGroup() {
    }

    public ActivityGroup(
           java.lang.Integer id,
           java.lang.String name,
           long[] companyIds,
           java.lang.Integer impressionsLookback,
           java.lang.Integer clicksLookback,
           com.google.api.ads.dfp.v201311.ActivityGroupStatus status) {
           this.id = id;
           this.name = name;
           this.companyIds = companyIds;
           this.impressionsLookback = impressionsLookback;
           this.clicksLookback = clicksLookback;
           this.status = status;
    }


    /**
     * Gets the id value for this ActivityGroup.
     * 
     * @return id   * The unique ID of the {@code ActivityGroup}. This attribute
     * is readonly and is assigned
     *                 by Google.
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ActivityGroup.
     * 
     * @param id   * The unique ID of the {@code ActivityGroup}. This attribute
     * is readonly and is assigned
     *                 by Google.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ActivityGroup.
     * 
     * @return name   * The name of the {@code ActivityGroup}. This attribute is required
     * to create an activity group
     *                 and has a maximum length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ActivityGroup.
     * 
     * @param name   * The name of the {@code ActivityGroup}. This attribute is required
     * to create an activity group
     *                 and has a maximum length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the companyIds value for this ActivityGroup.
     * 
     * @return companyIds   * The company ids whose ads will be included for conversion tracking
     * on the activities in this
     *                 group. Only clicks and impressions of ads from these
     * companies will lead to conversions on
     *                 the containing activities. This attribute is required
     * when creating an activity group.
     *                 
     *                 The company types allowed are: {@link Company.Type#ADVERTISER},
     * and
     *                 {@link Company.Type#AD_NETWORK}, and {@link Company.Type#HOUSE_ADVERTISER}
     */
    public long[] getCompanyIds() {
        return companyIds;
    }


    /**
     * Sets the companyIds value for this ActivityGroup.
     * 
     * @param companyIds   * The company ids whose ads will be included for conversion tracking
     * on the activities in this
     *                 group. Only clicks and impressions of ads from these
     * companies will lead to conversions on
     *                 the containing activities. This attribute is required
     * when creating an activity group.
     *                 
     *                 The company types allowed are: {@link Company.Type#ADVERTISER},
     * and
     *                 {@link Company.Type#AD_NETWORK}, and {@link Company.Type#HOUSE_ADVERTISER}
     */
    public void setCompanyIds(long[] companyIds) {
        this.companyIds = companyIds;
    }

    public long getCompanyIds(int i) {
        return this.companyIds[i];
    }

    public void setCompanyIds(int i, long _value) {
        this.companyIds[i] = _value;
    }


    /**
     * Gets the impressionsLookback value for this ActivityGroup.
     * 
     * @return impressionsLookback   * DFP records view-through conversions for users who have previously
     * viewed a DFP ad within the
     *                 number of days that you set here (1 to 30 days), then
     * visits a webpage containing activity tags
     *                 from this activity group. To be counted, the ad needs
     * to belong to one of the companies
     *                 associated with the activity group. This attribute
     * is required to create an activity group.
     */
    public java.lang.Integer getImpressionsLookback() {
        return impressionsLookback;
    }


    /**
     * Sets the impressionsLookback value for this ActivityGroup.
     * 
     * @param impressionsLookback   * DFP records view-through conversions for users who have previously
     * viewed a DFP ad within the
     *                 number of days that you set here (1 to 30 days), then
     * visits a webpage containing activity tags
     *                 from this activity group. To be counted, the ad needs
     * to belong to one of the companies
     *                 associated with the activity group. This attribute
     * is required to create an activity group.
     */
    public void setImpressionsLookback(java.lang.Integer impressionsLookback) {
        this.impressionsLookback = impressionsLookback;
    }


    /**
     * Gets the clicksLookback value for this ActivityGroup.
     * 
     * @return clicksLookback   * DFP records click-through conversions for users who have previously
     * clicked on a DFP ad within
     *                 the number of days that you set here (1 to 30 days),
     * then visits a webpage containing activity
     *                 tags from this activity group. To be counted, the
     * ad needs to belong to one of the companies
     *                 associated with the activity group. This attribute
     * is required to create an activity group.
     */
    public java.lang.Integer getClicksLookback() {
        return clicksLookback;
    }


    /**
     * Sets the clicksLookback value for this ActivityGroup.
     * 
     * @param clicksLookback   * DFP records click-through conversions for users who have previously
     * clicked on a DFP ad within
     *                 the number of days that you set here (1 to 30 days),
     * then visits a webpage containing activity
     *                 tags from this activity group. To be counted, the
     * ad needs to belong to one of the companies
     *                 associated with the activity group. This attribute
     * is required to create an activity group.
     */
    public void setClicksLookback(java.lang.Integer clicksLookback) {
        this.clicksLookback = clicksLookback;
    }


    /**
     * Gets the status value for this ActivityGroup.
     * 
     * @return status   * The status of this activity group. This attribute is readonly.
     */
    public com.google.api.ads.dfp.v201311.ActivityGroupStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ActivityGroup.
     * 
     * @param status   * The status of this activity group. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.v201311.ActivityGroupStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivityGroup)) return false;
        ActivityGroup other = (ActivityGroup) obj;
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
            ((this.companyIds==null && other.getCompanyIds()==null) || 
             (this.companyIds!=null &&
              java.util.Arrays.equals(this.companyIds, other.getCompanyIds()))) &&
            ((this.impressionsLookback==null && other.getImpressionsLookback()==null) || 
             (this.impressionsLookback!=null &&
              this.impressionsLookback.equals(other.getImpressionsLookback()))) &&
            ((this.clicksLookback==null && other.getClicksLookback()==null) || 
             (this.clicksLookback!=null &&
              this.clicksLookback.equals(other.getClicksLookback()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getCompanyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanyIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImpressionsLookback() != null) {
            _hashCode += getImpressionsLookback().hashCode();
        }
        if (getClicksLookback() != null) {
            _hashCode += getClicksLookback().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ActivityGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "companyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionsLookback");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "impressionsLookback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicksLookback");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "clicksLookback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ActivityGroup.Status"));
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
