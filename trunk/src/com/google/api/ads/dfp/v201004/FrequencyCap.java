/**
 * FrequencyCap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201004;


/**
 * Represents a limit on the number of times a single viewer can be
 * exposed to
 *             the same {@link LineItem} in a specified time period.
 */
public class FrequencyCap  implements java.io.Serializable {
    /* The maximum number of impressions than can be served to a user
     * within the
     *                 specified time period. */
    private java.lang.Integer maxImpressions;

    /* The time period in which at most {@link FrequencyCap#maxImpressions}
     * can be
     *                 served to the same user. */
    private com.google.api.ads.dfp.v201004.TimeUnit timeUnit;

    public FrequencyCap() {
    }

    public FrequencyCap(
           java.lang.Integer maxImpressions,
           com.google.api.ads.dfp.v201004.TimeUnit timeUnit) {
           this.maxImpressions = maxImpressions;
           this.timeUnit = timeUnit;
    }


    /**
     * Gets the maxImpressions value for this FrequencyCap.
     * 
     * @return maxImpressions   * The maximum number of impressions than can be served to a user
     * within the
     *                 specified time period.
     */
    public java.lang.Integer getMaxImpressions() {
        return maxImpressions;
    }


    /**
     * Sets the maxImpressions value for this FrequencyCap.
     * 
     * @param maxImpressions   * The maximum number of impressions than can be served to a user
     * within the
     *                 specified time period.
     */
    public void setMaxImpressions(java.lang.Integer maxImpressions) {
        this.maxImpressions = maxImpressions;
    }


    /**
     * Gets the timeUnit value for this FrequencyCap.
     * 
     * @return timeUnit   * The time period in which at most {@link FrequencyCap#maxImpressions}
     * can be
     *                 served to the same user.
     */
    public com.google.api.ads.dfp.v201004.TimeUnit getTimeUnit() {
        return timeUnit;
    }


    /**
     * Sets the timeUnit value for this FrequencyCap.
     * 
     * @param timeUnit   * The time period in which at most {@link FrequencyCap#maxImpressions}
     * can be
     *                 served to the same user.
     */
    public void setTimeUnit(com.google.api.ads.dfp.v201004.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FrequencyCap)) return false;
        FrequencyCap other = (FrequencyCap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxImpressions==null && other.getMaxImpressions()==null) || 
             (this.maxImpressions!=null &&
              this.maxImpressions.equals(other.getMaxImpressions()))) &&
            ((this.timeUnit==null && other.getTimeUnit()==null) || 
             (this.timeUnit!=null &&
              this.timeUnit.equals(other.getTimeUnit())));
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
        if (getMaxImpressions() != null) {
            _hashCode += getMaxImpressions().hashCode();
        }
        if (getTimeUnit() != null) {
            _hashCode += getTimeUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FrequencyCap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "FrequencyCap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "maxImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "timeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "TimeUnit"));
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
