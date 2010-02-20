/**
 * ApiError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;


/**
 * A service api error base class that provides error details.
 *             1) the OGNL field path is provided for parsers.
 *             2) the OGNL field path with debug comments easily helps
 * track causes.
 */
public abstract class ApiError  implements java.io.Serializable {
    /* The OGNL field path to identify cause of error. */
    private java.lang.String fieldPath;

    /* The data that caused the error. */
    private java.lang.String trigger;

    /* This field indicates the subtype of ApiError of this instance.
     * It is ignored
     *                 on input, and instead xsi:type should be specified. */
    private java.lang.String apiErrorType;

    public ApiError() {
    }

    public ApiError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String apiErrorType) {
           this.fieldPath = fieldPath;
           this.trigger = trigger;
           this.apiErrorType = apiErrorType;
    }


    /**
     * Gets the fieldPath value for this ApiError.
     * 
     * @return fieldPath   * The OGNL field path to identify cause of error.
     */
    public java.lang.String getFieldPath() {
        return fieldPath;
    }


    /**
     * Sets the fieldPath value for this ApiError.
     * 
     * @param fieldPath   * The OGNL field path to identify cause of error.
     */
    public void setFieldPath(java.lang.String fieldPath) {
        this.fieldPath = fieldPath;
    }


    /**
     * Gets the trigger value for this ApiError.
     * 
     * @return trigger   * The data that caused the error.
     */
    public java.lang.String getTrigger() {
        return trigger;
    }


    /**
     * Sets the trigger value for this ApiError.
     * 
     * @param trigger   * The data that caused the error.
     */
    public void setTrigger(java.lang.String trigger) {
        this.trigger = trigger;
    }


    /**
     * Gets the apiErrorType value for this ApiError.
     * 
     * @return apiErrorType   * This field indicates the subtype of ApiError of this instance.
     * It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public java.lang.String getApiErrorType() {
        return apiErrorType;
    }


    /**
     * Sets the apiErrorType value for this ApiError.
     * 
     * @param apiErrorType   * This field indicates the subtype of ApiError of this instance.
     * It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public void setApiErrorType(java.lang.String apiErrorType) {
        this.apiErrorType = apiErrorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiError)) return false;
        ApiError other = (ApiError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldPath==null && other.getFieldPath()==null) || 
             (this.fieldPath!=null &&
              this.fieldPath.equals(other.getFieldPath()))) &&
            ((this.trigger==null && other.getTrigger()==null) || 
             (this.trigger!=null &&
              this.trigger.equals(other.getTrigger()))) &&
            ((this.apiErrorType==null && other.getApiErrorType()==null) || 
             (this.apiErrorType!=null &&
              this.apiErrorType.equals(other.getApiErrorType())));
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
        if (getFieldPath() != null) {
            _hashCode += getFieldPath().hashCode();
        }
        if (getTrigger() != null) {
            _hashCode += getTrigger().hashCode();
        }
        if (getApiErrorType() != null) {
            _hashCode += getApiErrorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "ApiError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "fieldPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trigger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "trigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiErrorType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "ApiError.Type"));
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
