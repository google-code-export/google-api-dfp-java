/**
 * CreativePlaceholder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201108;


/**
 * A {@code CreativePlaceholder} describes a slot that a creative
 * is expected to
 *             fill. This is used primarily to help in forecasting, and
 * also to validate
 *             that the correct creatives are associated with the line
 * item. A
 *             {@code CreativePlaceholder} must contain a size, and it
 * can optionally
 *             contain companions. Companions are only valid if the line
 * item's environment
 *             type is {@link EnvironmentType#VIDEO_PLAYER}.
 */
public class CreativePlaceholder  implements java.io.Serializable {
    /* The dimensions that the creative is expected to have. This
     * attribute is
     *                 required. */
    private com.google.api.ads.dfp.v201108.Size size;

    /* The companions that the creative is expected to have. This
     * attribute can
     *                 only be set if the line item it belongs to has an
     *                 {@code environmentType} of {@link EnvironmentType#VIDEO_PLAYER}. */
    private com.google.api.ads.dfp.v201108.CreativePlaceholder[] companions;

    /* The ID of this placeholder. This field is generated by the
     * server and is read-only. */
    private java.lang.Long id;

    public CreativePlaceholder() {
    }

    public CreativePlaceholder(
           com.google.api.ads.dfp.v201108.Size size,
           com.google.api.ads.dfp.v201108.CreativePlaceholder[] companions,
           java.lang.Long id) {
           this.size = size;
           this.companions = companions;
           this.id = id;
    }


    /**
     * Gets the size value for this CreativePlaceholder.
     * 
     * @return size   * The dimensions that the creative is expected to have. This
     * attribute is
     *                 required.
     */
    public com.google.api.ads.dfp.v201108.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this CreativePlaceholder.
     * 
     * @param size   * The dimensions that the creative is expected to have. This
     * attribute is
     *                 required.
     */
    public void setSize(com.google.api.ads.dfp.v201108.Size size) {
        this.size = size;
    }


    /**
     * Gets the companions value for this CreativePlaceholder.
     * 
     * @return companions   * The companions that the creative is expected to have. This
     * attribute can
     *                 only be set if the line item it belongs to has an
     *                 {@code environmentType} of {@link EnvironmentType#VIDEO_PLAYER}.
     */
    public com.google.api.ads.dfp.v201108.CreativePlaceholder[] getCompanions() {
        return companions;
    }


    /**
     * Sets the companions value for this CreativePlaceholder.
     * 
     * @param companions   * The companions that the creative is expected to have. This
     * attribute can
     *                 only be set if the line item it belongs to has an
     *                 {@code environmentType} of {@link EnvironmentType#VIDEO_PLAYER}.
     */
    public void setCompanions(com.google.api.ads.dfp.v201108.CreativePlaceholder[] companions) {
        this.companions = companions;
    }

    public com.google.api.ads.dfp.v201108.CreativePlaceholder getCompanions(int i) {
        return this.companions[i];
    }

    public void setCompanions(int i, com.google.api.ads.dfp.v201108.CreativePlaceholder _value) {
        this.companions[i] = _value;
    }


    /**
     * Gets the id value for this CreativePlaceholder.
     * 
     * @return id   * The ID of this placeholder. This field is generated by the
     * server and is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CreativePlaceholder.
     * 
     * @param id   * The ID of this placeholder. This field is generated by the
     * server and is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativePlaceholder)) return false;
        CreativePlaceholder other = (CreativePlaceholder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.companions==null && other.getCompanions()==null) || 
             (this.companions!=null &&
              java.util.Arrays.equals(this.companions, other.getCompanions()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getCompanions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativePlaceholder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "CreativePlaceholder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "companions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "id"));
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
