/**
 * CreativeSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201206;


/**
 * A creative set is comprised of a master creative and its companion
 * creatives.
 */
public class CreativeSet  implements java.io.Serializable {
    /* Uniquely identifies the {@code CreativeSet}. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * set is created. */
    private java.lang.Long id;

    /* The name of the creative set. This attribute is required and
     * has a
     *                 maximum length of 255 characters. */
    private java.lang.String name;

    /* The ID of the master creative associated with this creative
     * set. This attribute is required. */
    private java.lang.Long masterCreativeId;

    /* The IDs of the companion creatives associated with this creative
     * set. This attribute is
     *                 required. */
    private long[] companionCreativeIds;

    public CreativeSet() {
    }

    public CreativeSet(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Long masterCreativeId,
           long[] companionCreativeIds) {
           this.id = id;
           this.name = name;
           this.masterCreativeId = masterCreativeId;
           this.companionCreativeIds = companionCreativeIds;
    }


    /**
     * Gets the id value for this CreativeSet.
     * 
     * @return id   * Uniquely identifies the {@code CreativeSet}. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * set is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CreativeSet.
     * 
     * @param id   * Uniquely identifies the {@code CreativeSet}. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * set is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this CreativeSet.
     * 
     * @return name   * The name of the creative set. This attribute is required and
     * has a
     *                 maximum length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreativeSet.
     * 
     * @param name   * The name of the creative set. This attribute is required and
     * has a
     *                 maximum length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the masterCreativeId value for this CreativeSet.
     * 
     * @return masterCreativeId   * The ID of the master creative associated with this creative
     * set. This attribute is required.
     */
    public java.lang.Long getMasterCreativeId() {
        return masterCreativeId;
    }


    /**
     * Sets the masterCreativeId value for this CreativeSet.
     * 
     * @param masterCreativeId   * The ID of the master creative associated with this creative
     * set. This attribute is required.
     */
    public void setMasterCreativeId(java.lang.Long masterCreativeId) {
        this.masterCreativeId = masterCreativeId;
    }


    /**
     * Gets the companionCreativeIds value for this CreativeSet.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives associated with this creative
     * set. This attribute is
     *                 required.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this CreativeSet.
     * 
     * @param companionCreativeIds   * The IDs of the companion creatives associated with this creative
     * set. This attribute is
     *                 required.
     */
    public void setCompanionCreativeIds(long[] companionCreativeIds) {
        this.companionCreativeIds = companionCreativeIds;
    }

    public long getCompanionCreativeIds(int i) {
        return this.companionCreativeIds[i];
    }

    public void setCompanionCreativeIds(int i, long _value) {
        this.companionCreativeIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeSet)) return false;
        CreativeSet other = (CreativeSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.masterCreativeId==null && other.getMasterCreativeId()==null) || 
             (this.masterCreativeId!=null &&
              this.masterCreativeId.equals(other.getMasterCreativeId()))) &&
            ((this.companionCreativeIds==null && other.getCompanionCreativeIds()==null) || 
             (this.companionCreativeIds!=null &&
              java.util.Arrays.equals(this.companionCreativeIds, other.getCompanionCreativeIds())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getMasterCreativeId() != null) {
            _hashCode += getMasterCreativeId().hashCode();
        }
        if (getCompanionCreativeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanionCreativeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanionCreativeIds(), i);
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
        new org.apache.axis.description.TypeDesc(CreativeSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "CreativeSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterCreativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "masterCreativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201206", "companionCreativeIds"));
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
