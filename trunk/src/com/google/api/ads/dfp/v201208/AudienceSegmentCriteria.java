/**
 * AudienceSegmentCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;


/**
 * An {@link AudienceSegmentCriteria} object is used to target {@link
 * AudienceSegment} objects.
 */
public class AudienceSegmentCriteria  extends com.google.api.ads.dfp.v201208.CustomCriteriaLeaf  implements java.io.Serializable {
    /* The comparison operator. This attribute is required. */
    private com.google.api.ads.dfp.v201208.AudienceSegmentCriteriaComparisonOperator operator;

    /* The ids of {@link AudienceSegment} objects used to target audience
     * segments. This attribute is
     *                     required. */
    private long[] audienceSegmentIds;

    public AudienceSegmentCriteria() {
    }

    public AudienceSegmentCriteria(
           java.lang.String customCriteriaNodeType,
           com.google.api.ads.dfp.v201208.AudienceSegmentCriteriaComparisonOperator operator,
           long[] audienceSegmentIds) {
        super(
            customCriteriaNodeType);
        this.operator = operator;
        this.audienceSegmentIds = audienceSegmentIds;
    }


    /**
     * Gets the operator value for this AudienceSegmentCriteria.
     * 
     * @return operator   * The comparison operator. This attribute is required.
     */
    public com.google.api.ads.dfp.v201208.AudienceSegmentCriteriaComparisonOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this AudienceSegmentCriteria.
     * 
     * @param operator   * The comparison operator. This attribute is required.
     */
    public void setOperator(com.google.api.ads.dfp.v201208.AudienceSegmentCriteriaComparisonOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the audienceSegmentIds value for this AudienceSegmentCriteria.
     * 
     * @return audienceSegmentIds   * The ids of {@link AudienceSegment} objects used to target audience
     * segments. This attribute is
     *                     required.
     */
    public long[] getAudienceSegmentIds() {
        return audienceSegmentIds;
    }


    /**
     * Sets the audienceSegmentIds value for this AudienceSegmentCriteria.
     * 
     * @param audienceSegmentIds   * The ids of {@link AudienceSegment} objects used to target audience
     * segments. This attribute is
     *                     required.
     */
    public void setAudienceSegmentIds(long[] audienceSegmentIds) {
        this.audienceSegmentIds = audienceSegmentIds;
    }

    public long getAudienceSegmentIds(int i) {
        return this.audienceSegmentIds[i];
    }

    public void setAudienceSegmentIds(int i, long _value) {
        this.audienceSegmentIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceSegmentCriteria)) return false;
        AudienceSegmentCriteria other = (AudienceSegmentCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.audienceSegmentIds==null && other.getAudienceSegmentIds()==null) || 
             (this.audienceSegmentIds!=null &&
              java.util.Arrays.equals(this.audienceSegmentIds, other.getAudienceSegmentIds())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getAudienceSegmentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudienceSegmentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceSegmentIds(), i);
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
        new org.apache.axis.description.TypeDesc(AudienceSegmentCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "AudienceSegmentCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "AudienceSegmentCriteria.ComparisonOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceSegmentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "audienceSegmentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
