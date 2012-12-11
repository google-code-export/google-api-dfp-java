/**
 * SiteTargetingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;


/**
 * Contains information required for AdWords advertisers to place
 * their ads.
 */
public class SiteTargetingInfo  implements java.io.Serializable {
    /* Description of the {@code Placement} visible to AdWords advertisers.
     * This
     *                 field is required if {@link Placement#isAdSenseTargetingEnabled}
     * is true
     *                 and has a maximum length of 65535 characters. */
    private java.lang.String targetingDescription;

    /* The name of the site targeted which is visible to AdWords advertisers.
     * This
     *                 field is required if {@link Placement#isAdSenseTargetingEnabled}
     * is true
     *                 and has a maximum of 70 characters. */
    private java.lang.String targetingSiteName;

    /* A description of the location of the {@code Placement} on the
     * web page,
     *                 visible to AdWords users. This field is optional and
     * has a maximum length
     *                 of 50 characters. */
    private java.lang.String targetingAdLocation;

    /* Indicates that this instance is a subtype of SiteTargetingInfo.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String siteTargetingInfoType;

    public SiteTargetingInfo() {
    }

    public SiteTargetingInfo(
           java.lang.String targetingDescription,
           java.lang.String targetingSiteName,
           java.lang.String targetingAdLocation,
           java.lang.String siteTargetingInfoType) {
           this.targetingDescription = targetingDescription;
           this.targetingSiteName = targetingSiteName;
           this.targetingAdLocation = targetingAdLocation;
           this.siteTargetingInfoType = siteTargetingInfoType;
    }


    /**
     * Gets the targetingDescription value for this SiteTargetingInfo.
     * 
     * @return targetingDescription   * Description of the {@code Placement} visible to AdWords advertisers.
     * This
     *                 field is required if {@link Placement#isAdSenseTargetingEnabled}
     * is true
     *                 and has a maximum length of 65535 characters.
     */
    public java.lang.String getTargetingDescription() {
        return targetingDescription;
    }


    /**
     * Sets the targetingDescription value for this SiteTargetingInfo.
     * 
     * @param targetingDescription   * Description of the {@code Placement} visible to AdWords advertisers.
     * This
     *                 field is required if {@link Placement#isAdSenseTargetingEnabled}
     * is true
     *                 and has a maximum length of 65535 characters.
     */
    public void setTargetingDescription(java.lang.String targetingDescription) {
        this.targetingDescription = targetingDescription;
    }


    /**
     * Gets the targetingSiteName value for this SiteTargetingInfo.
     * 
     * @return targetingSiteName   * The name of the site targeted which is visible to AdWords advertisers.
     * This
     *                 field is required if {@link Placement#isAdSenseTargetingEnabled}
     * is true
     *                 and has a maximum of 70 characters.
     */
    public java.lang.String getTargetingSiteName() {
        return targetingSiteName;
    }


    /**
     * Sets the targetingSiteName value for this SiteTargetingInfo.
     * 
     * @param targetingSiteName   * The name of the site targeted which is visible to AdWords advertisers.
     * This
     *                 field is required if {@link Placement#isAdSenseTargetingEnabled}
     * is true
     *                 and has a maximum of 70 characters.
     */
    public void setTargetingSiteName(java.lang.String targetingSiteName) {
        this.targetingSiteName = targetingSiteName;
    }


    /**
     * Gets the targetingAdLocation value for this SiteTargetingInfo.
     * 
     * @return targetingAdLocation   * A description of the location of the {@code Placement} on the
     * web page,
     *                 visible to AdWords users. This field is optional and
     * has a maximum length
     *                 of 50 characters.
     */
    public java.lang.String getTargetingAdLocation() {
        return targetingAdLocation;
    }


    /**
     * Sets the targetingAdLocation value for this SiteTargetingInfo.
     * 
     * @param targetingAdLocation   * A description of the location of the {@code Placement} on the
     * web page,
     *                 visible to AdWords users. This field is optional and
     * has a maximum length
     *                 of 50 characters.
     */
    public void setTargetingAdLocation(java.lang.String targetingAdLocation) {
        this.targetingAdLocation = targetingAdLocation;
    }


    /**
     * Gets the siteTargetingInfoType value for this SiteTargetingInfo.
     * 
     * @return siteTargetingInfoType   * Indicates that this instance is a subtype of SiteTargetingInfo.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getSiteTargetingInfoType() {
        return siteTargetingInfoType;
    }


    /**
     * Sets the siteTargetingInfoType value for this SiteTargetingInfo.
     * 
     * @param siteTargetingInfoType   * Indicates that this instance is a subtype of SiteTargetingInfo.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setSiteTargetingInfoType(java.lang.String siteTargetingInfoType) {
        this.siteTargetingInfoType = siteTargetingInfoType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteTargetingInfo)) return false;
        SiteTargetingInfo other = (SiteTargetingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingDescription==null && other.getTargetingDescription()==null) || 
             (this.targetingDescription!=null &&
              this.targetingDescription.equals(other.getTargetingDescription()))) &&
            ((this.targetingSiteName==null && other.getTargetingSiteName()==null) || 
             (this.targetingSiteName!=null &&
              this.targetingSiteName.equals(other.getTargetingSiteName()))) &&
            ((this.targetingAdLocation==null && other.getTargetingAdLocation()==null) || 
             (this.targetingAdLocation!=null &&
              this.targetingAdLocation.equals(other.getTargetingAdLocation()))) &&
            ((this.siteTargetingInfoType==null && other.getSiteTargetingInfoType()==null) || 
             (this.siteTargetingInfoType!=null &&
              this.siteTargetingInfoType.equals(other.getSiteTargetingInfoType())));
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
        if (getTargetingDescription() != null) {
            _hashCode += getTargetingDescription().hashCode();
        }
        if (getTargetingSiteName() != null) {
            _hashCode += getTargetingSiteName().hashCode();
        }
        if (getTargetingAdLocation() != null) {
            _hashCode += getTargetingAdLocation().hashCode();
        }
        if (getSiteTargetingInfoType() != null) {
            _hashCode += getSiteTargetingInfoType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteTargetingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "SiteTargetingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "targetingDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingSiteName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "targetingSiteName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingAdLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "targetingAdLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteTargetingInfoType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "SiteTargetingInfo.Type"));
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
