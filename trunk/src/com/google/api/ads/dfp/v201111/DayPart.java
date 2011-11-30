/**
 * DayPart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201111;


/**
 * {@code DayPart} represents a time-period within a day of the week
 * which is
 *             targeted by a {@link LineItem}.
 */
public class DayPart  implements java.io.Serializable {
    /* Day of the week the target applies to. This field is required. */
    private com.google.api.ads.dfp.v201111.DayOfWeek dayOfWeek;

    /* Represents the start time of the targeted period. */
    private com.google.api.ads.dfp.v201111.TimeOfDay startTime;

    /* Represents the end time of the targeted period. */
    private com.google.api.ads.dfp.v201111.TimeOfDay endTime;

    public DayPart() {
    }

    public DayPart(
           com.google.api.ads.dfp.v201111.DayOfWeek dayOfWeek,
           com.google.api.ads.dfp.v201111.TimeOfDay startTime,
           com.google.api.ads.dfp.v201111.TimeOfDay endTime) {
           this.dayOfWeek = dayOfWeek;
           this.startTime = startTime;
           this.endTime = endTime;
    }


    /**
     * Gets the dayOfWeek value for this DayPart.
     * 
     * @return dayOfWeek   * Day of the week the target applies to. This field is required.
     */
    public com.google.api.ads.dfp.v201111.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this DayPart.
     * 
     * @param dayOfWeek   * Day of the week the target applies to. This field is required.
     */
    public void setDayOfWeek(com.google.api.ads.dfp.v201111.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the startTime value for this DayPart.
     * 
     * @return startTime   * Represents the start time of the targeted period.
     */
    public com.google.api.ads.dfp.v201111.TimeOfDay getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this DayPart.
     * 
     * @param startTime   * Represents the start time of the targeted period.
     */
    public void setStartTime(com.google.api.ads.dfp.v201111.TimeOfDay startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this DayPart.
     * 
     * @return endTime   * Represents the end time of the targeted period.
     */
    public com.google.api.ads.dfp.v201111.TimeOfDay getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this DayPart.
     * 
     * @param endTime   * Represents the end time of the targeted period.
     */
    public void setEndTime(com.google.api.ads.dfp.v201111.TimeOfDay endTime) {
        this.endTime = endTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DayPart)) return false;
        DayPart other = (DayPart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime())));
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
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DayPart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "DayPart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "DayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "TimeOfDay"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201111", "TimeOfDay"));
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
