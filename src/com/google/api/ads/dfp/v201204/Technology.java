/**
 * Technology.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201204;


/**
 * Represents a technology entity that can be targeted.
 */
public class Technology  implements java.io.Serializable {
    /* The unique ID of the {@code Technology}. This value is required
     * for
     *                 all forms of {@code TechnologyTargeting}. */
    private java.lang.Long id;

    /* The name of the technology being targeting. This value is read-only
     * and is
     *                 assigned by Google. */
    private java.lang.String name;

    /* Indicates that this instance is a subtype of Technology.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String technologyType;

    public Technology() {
    }

    public Technology(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String technologyType) {
           this.id = id;
           this.name = name;
           this.technologyType = technologyType;
    }


    /**
     * Gets the id value for this Technology.
     * 
     * @return id   * The unique ID of the {@code Technology}. This value is required
     * for
     *                 all forms of {@code TechnologyTargeting}.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Technology.
     * 
     * @param id   * The unique ID of the {@code Technology}. This value is required
     * for
     *                 all forms of {@code TechnologyTargeting}.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Technology.
     * 
     * @return name   * The name of the technology being targeting. This value is read-only
     * and is
     *                 assigned by Google.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Technology.
     * 
     * @param name   * The name of the technology being targeting. This value is read-only
     * and is
     *                 assigned by Google.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the technologyType value for this Technology.
     * 
     * @return technologyType   * Indicates that this instance is a subtype of Technology.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getTechnologyType() {
        return technologyType;
    }


    /**
     * Sets the technologyType value for this Technology.
     * 
     * @param technologyType   * Indicates that this instance is a subtype of Technology.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setTechnologyType(java.lang.String technologyType) {
        this.technologyType = technologyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Technology)) return false;
        Technology other = (Technology) obj;
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
            ((this.technologyType==null && other.getTechnologyType()==null) || 
             (this.technologyType!=null &&
              this.technologyType.equals(other.getTechnologyType())));
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
        if (getTechnologyType() != null) {
            _hashCode += getTechnologyType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Technology.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "Technology"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technologyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "Technology.Type"));
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
