/**
 * UpdateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;


/**
 * Represents the result of performing an action on objects.
 */
public class UpdateResult  implements java.io.Serializable {
    /* The number of objects that were changed as a result of performing
     * the
     *                 action. */
    private java.lang.Integer numChanges;

    /* Indicates that this instance is a subtype of UpdateResult.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String updateResultType;

    public UpdateResult() {
    }

    public UpdateResult(
           java.lang.Integer numChanges,
           java.lang.String updateResultType) {
           this.numChanges = numChanges;
           this.updateResultType = updateResultType;
    }


    /**
     * Gets the numChanges value for this UpdateResult.
     * 
     * @return numChanges   * The number of objects that were changed as a result of performing
     * the
     *                 action.
     */
    public java.lang.Integer getNumChanges() {
        return numChanges;
    }


    /**
     * Sets the numChanges value for this UpdateResult.
     * 
     * @param numChanges   * The number of objects that were changed as a result of performing
     * the
     *                 action.
     */
    public void setNumChanges(java.lang.Integer numChanges) {
        this.numChanges = numChanges;
    }


    /**
     * Gets the updateResultType value for this UpdateResult.
     * 
     * @return updateResultType   * Indicates that this instance is a subtype of UpdateResult.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getUpdateResultType() {
        return updateResultType;
    }


    /**
     * Sets the updateResultType value for this UpdateResult.
     * 
     * @param updateResultType   * Indicates that this instance is a subtype of UpdateResult.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setUpdateResultType(java.lang.String updateResultType) {
        this.updateResultType = updateResultType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateResult)) return false;
        UpdateResult other = (UpdateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numChanges==null && other.getNumChanges()==null) || 
             (this.numChanges!=null &&
              this.numChanges.equals(other.getNumChanges()))) &&
            ((this.updateResultType==null && other.getUpdateResultType()==null) || 
             (this.updateResultType!=null &&
              this.updateResultType.equals(other.getUpdateResultType())));
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
        if (getNumChanges() != null) {
            _hashCode += getNumChanges().hashCode();
        }
        if (getUpdateResultType() != null) {
            _hashCode += getUpdateResultType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "UpdateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "numChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateResultType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "UpdateResult.Type"));
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
