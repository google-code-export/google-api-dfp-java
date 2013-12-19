/**
 * RuleBasedFirstPartyAudienceSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * A {@link RuleBasedFirstPartyAudienceSegment} is a {@link FirstPartyAudienceSegment}
 * owned by the
 *             publisher network. It contains a rule.
 */
public class RuleBasedFirstPartyAudienceSegment  extends com.google.api.ads.dfp.v201311.RuleBasedFirstPartyAudienceSegmentSummary  implements java.io.Serializable {
    /* Specifies the rule of the segment which determines user's eligibility
     * criteria to be part of
     *                     the segment. This attribute is required. */
    private com.google.api.ads.dfp.v201311.FirstPartyAudienceSegmentRule rule;

    public RuleBasedFirstPartyAudienceSegment() {
    }

    public RuleBasedFirstPartyAudienceSegment(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.v201311.AudienceSegmentStatus status,
           java.lang.Long size,
           com.google.api.ads.dfp.v201311.AudienceSegmentDataProvider dataProvider,
           com.google.api.ads.dfp.v201311.AudienceSegmentAudienceSegmentType type,
           java.lang.String audienceSegmentType,
           java.lang.Integer pageViews,
           java.lang.Integer recencyDays,
           java.lang.Integer membershipExpirationDays,
           com.google.api.ads.dfp.v201311.FirstPartyAudienceSegmentRule rule) {
        super(
            id,
            name,
            description,
            status,
            size,
            dataProvider,
            type,
            audienceSegmentType,
            pageViews,
            recencyDays,
            membershipExpirationDays);
        this.rule = rule;
    }


    /**
     * Gets the rule value for this RuleBasedFirstPartyAudienceSegment.
     * 
     * @return rule   * Specifies the rule of the segment which determines user's eligibility
     * criteria to be part of
     *                     the segment. This attribute is required.
     */
    public com.google.api.ads.dfp.v201311.FirstPartyAudienceSegmentRule getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this RuleBasedFirstPartyAudienceSegment.
     * 
     * @param rule   * Specifies the rule of the segment which determines user's eligibility
     * criteria to be part of
     *                     the segment. This attribute is required.
     */
    public void setRule(com.google.api.ads.dfp.v201311.FirstPartyAudienceSegmentRule rule) {
        this.rule = rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleBasedFirstPartyAudienceSegment)) return false;
        RuleBasedFirstPartyAudienceSegment other = (RuleBasedFirstPartyAudienceSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule())));
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
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleBasedFirstPartyAudienceSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "RuleBasedFirstPartyAudienceSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "FirstPartyAudienceSegmentRule"));
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
