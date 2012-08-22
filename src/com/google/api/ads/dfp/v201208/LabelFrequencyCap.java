/**
 * LabelFrequencyCap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201208;


/**
 * A {@code LabelFrequencyCap} assigns a frequency cap to a label.
 * The
 *             frequency cap will limit the cumulative number of impressions
 * of any ad
 *             units with this label that may be shown to a particular
 * user over a time
 *             unit.
 */
public class LabelFrequencyCap  implements java.io.Serializable {
    /* The frequency cap to be applied with this label. */
    private com.google.api.ads.dfp.v201208.FrequencyCap frequencyCap;

    /* ID of the label being capped on the {@link AdUnit}. */
    private java.lang.Long labelId;

    public LabelFrequencyCap() {
    }

    public LabelFrequencyCap(
           com.google.api.ads.dfp.v201208.FrequencyCap frequencyCap,
           java.lang.Long labelId) {
           this.frequencyCap = frequencyCap;
           this.labelId = labelId;
    }


    /**
     * Gets the frequencyCap value for this LabelFrequencyCap.
     * 
     * @return frequencyCap   * The frequency cap to be applied with this label.
     */
    public com.google.api.ads.dfp.v201208.FrequencyCap getFrequencyCap() {
        return frequencyCap;
    }


    /**
     * Sets the frequencyCap value for this LabelFrequencyCap.
     * 
     * @param frequencyCap   * The frequency cap to be applied with this label.
     */
    public void setFrequencyCap(com.google.api.ads.dfp.v201208.FrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
    }


    /**
     * Gets the labelId value for this LabelFrequencyCap.
     * 
     * @return labelId   * ID of the label being capped on the {@link AdUnit}.
     */
    public java.lang.Long getLabelId() {
        return labelId;
    }


    /**
     * Sets the labelId value for this LabelFrequencyCap.
     * 
     * @param labelId   * ID of the label being capped on the {@link AdUnit}.
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabelFrequencyCap)) return false;
        LabelFrequencyCap other = (LabelFrequencyCap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.frequencyCap==null && other.getFrequencyCap()==null) || 
             (this.frequencyCap!=null &&
              this.frequencyCap.equals(other.getFrequencyCap()))) &&
            ((this.labelId==null && other.getLabelId()==null) || 
             (this.labelId!=null &&
              this.labelId.equals(other.getLabelId())));
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
        if (getFrequencyCap() != null) {
            _hashCode += getFrequencyCap().hashCode();
        }
        if (getLabelId() != null) {
            _hashCode += getLabelId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabelFrequencyCap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "LabelFrequencyCap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "frequencyCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "labelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
