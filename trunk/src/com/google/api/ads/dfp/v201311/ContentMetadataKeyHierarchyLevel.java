/**
 * ContentMetadataKeyHierarchyLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * A {@code ContentMetadataKeyHierarchyLevel} represents one level
 * in a
 *             {@link ContentMetadataKeyHierarchy}. The level consists
 * of a {@link CustomTargetingKey}
 *             and an integer that represents the level's position in
 * the hierarchy.
 */
public class ContentMetadataKeyHierarchyLevel  implements java.io.Serializable {
    /* The ID of the {@link CustomTargetingKey} associated with this
     * level of the hierarchy.
     *                 This attribute is readonly. */
    private java.lang.Long customTargetingKeyId;

    /* This content metadata key's position in the hierarchy. This
     * attribute is readonly and
     *                 can range from 1 to N, where N is the number of the
     * levels in the hierarchy. */
    private java.lang.Integer hierarchyLevel;

    public ContentMetadataKeyHierarchyLevel() {
    }

    public ContentMetadataKeyHierarchyLevel(
           java.lang.Long customTargetingKeyId,
           java.lang.Integer hierarchyLevel) {
           this.customTargetingKeyId = customTargetingKeyId;
           this.hierarchyLevel = hierarchyLevel;
    }


    /**
     * Gets the customTargetingKeyId value for this ContentMetadataKeyHierarchyLevel.
     * 
     * @return customTargetingKeyId   * The ID of the {@link CustomTargetingKey} associated with this
     * level of the hierarchy.
     *                 This attribute is readonly.
     */
    public java.lang.Long getCustomTargetingKeyId() {
        return customTargetingKeyId;
    }


    /**
     * Sets the customTargetingKeyId value for this ContentMetadataKeyHierarchyLevel.
     * 
     * @param customTargetingKeyId   * The ID of the {@link CustomTargetingKey} associated with this
     * level of the hierarchy.
     *                 This attribute is readonly.
     */
    public void setCustomTargetingKeyId(java.lang.Long customTargetingKeyId) {
        this.customTargetingKeyId = customTargetingKeyId;
    }


    /**
     * Gets the hierarchyLevel value for this ContentMetadataKeyHierarchyLevel.
     * 
     * @return hierarchyLevel   * This content metadata key's position in the hierarchy. This
     * attribute is readonly and
     *                 can range from 1 to N, where N is the number of the
     * levels in the hierarchy.
     */
    public java.lang.Integer getHierarchyLevel() {
        return hierarchyLevel;
    }


    /**
     * Sets the hierarchyLevel value for this ContentMetadataKeyHierarchyLevel.
     * 
     * @param hierarchyLevel   * This content metadata key's position in the hierarchy. This
     * attribute is readonly and
     *                 can range from 1 to N, where N is the number of the
     * levels in the hierarchy.
     */
    public void setHierarchyLevel(java.lang.Integer hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentMetadataKeyHierarchyLevel)) return false;
        ContentMetadataKeyHierarchyLevel other = (ContentMetadataKeyHierarchyLevel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customTargetingKeyId==null && other.getCustomTargetingKeyId()==null) || 
             (this.customTargetingKeyId!=null &&
              this.customTargetingKeyId.equals(other.getCustomTargetingKeyId()))) &&
            ((this.hierarchyLevel==null && other.getHierarchyLevel()==null) || 
             (this.hierarchyLevel!=null &&
              this.hierarchyLevel.equals(other.getHierarchyLevel())));
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
        if (getCustomTargetingKeyId() != null) {
            _hashCode += getCustomTargetingKeyId().hashCode();
        }
        if (getHierarchyLevel() != null) {
            _hashCode += getHierarchyLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentMetadataKeyHierarchyLevel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ContentMetadataKeyHierarchyLevel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "customTargetingKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "hierarchyLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
