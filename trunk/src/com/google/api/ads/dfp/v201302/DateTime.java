/**
 * DateTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201302;


/**
 * Represents a date combined with the time of day.
 */
public class DateTime  implements java.io.Serializable {
    private com.google.api.ads.dfp.v201302.Date date;

    private java.lang.Integer hour;

    private java.lang.Integer minute;

    private java.lang.Integer second;

    private java.lang.String timeZoneID;

    public DateTime() {
    }

    public DateTime(
           com.google.api.ads.dfp.v201302.Date date,
           java.lang.Integer hour,
           java.lang.Integer minute,
           java.lang.Integer second,
           java.lang.String timeZoneID) {
           this.date = date;
           this.hour = hour;
           this.minute = minute;
           this.second = second;
           this.timeZoneID = timeZoneID;
    }


    /**
     * Gets the date value for this DateTime.
     * 
     * @return date
     */
    public com.google.api.ads.dfp.v201302.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this DateTime.
     * 
     * @param date
     */
    public void setDate(com.google.api.ads.dfp.v201302.Date date) {
        this.date = date;
    }


    /**
     * Gets the hour value for this DateTime.
     * 
     * @return hour
     */
    public java.lang.Integer getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this DateTime.
     * 
     * @param hour
     */
    public void setHour(java.lang.Integer hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this DateTime.
     * 
     * @return minute
     */
    public java.lang.Integer getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this DateTime.
     * 
     * @param minute
     */
    public void setMinute(java.lang.Integer minute) {
        this.minute = minute;
    }


    /**
     * Gets the second value for this DateTime.
     * 
     * @return second
     */
    public java.lang.Integer getSecond() {
        return second;
    }


    /**
     * Sets the second value for this DateTime.
     * 
     * @param second
     */
    public void setSecond(java.lang.Integer second) {
        this.second = second;
    }


    /**
     * Gets the timeZoneID value for this DateTime.
     * 
     * @return timeZoneID
     */
    public java.lang.String getTimeZoneID() {
        return timeZoneID;
    }


    /**
     * Sets the timeZoneID value for this DateTime.
     * 
     * @param timeZoneID
     */
    public void setTimeZoneID(java.lang.String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateTime)) return false;
        DateTime other = (DateTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute()))) &&
            ((this.second==null && other.getSecond()==null) || 
             (this.second!=null &&
              this.second.equals(other.getSecond()))) &&
            ((this.timeZoneID==null && other.getTimeZoneID()==null) || 
             (this.timeZoneID!=null &&
              this.timeZoneID.equals(other.getTimeZoneID())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        if (getSecond() != null) {
            _hashCode += getSecond().hashCode();
        }
        if (getTimeZoneID() != null) {
            _hashCode += getTimeZoneID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "DateTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "timeZoneID"));
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
