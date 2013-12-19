/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * A {@link Location} represents a geographical entity that can be
 * targeted. If
 *             a location type is not available because of the API version
 * you are using,
 *             the location will be represented as just the base class,
 * otherwise it will be
 *             sub-classed correctly.
 */
public class Location  implements java.io.Serializable {
    /* Uniquely identifies each {@code Location}. */
    private java.lang.Long id;

    /* The location type for this geographical entity (ex. Country,
     * City, State, County, etc.) */
    private java.lang.String type;

    /* The nearest location parent's ID for this geographical entity. */
    private java.lang.Integer canonicalParentId;

    /* The localized name of the geographical entity. */
    private java.lang.String displayName;

    /* Indicates that this instance is a subtype of Location.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String locationType;

    public Location() {
    }

    public Location(
           java.lang.Long id,
           java.lang.String type,
           java.lang.Integer canonicalParentId,
           java.lang.String displayName,
           java.lang.String locationType) {
           this.id = id;
           this.type = type;
           this.canonicalParentId = canonicalParentId;
           this.displayName = displayName;
           this.locationType = locationType;
    }


    /**
     * Gets the id value for this Location.
     * 
     * @return id   * Uniquely identifies each {@code Location}.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Location.
     * 
     * @param id   * Uniquely identifies each {@code Location}.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the type value for this Location.
     * 
     * @return type   * The location type for this geographical entity (ex. Country,
     * City, State, County, etc.)
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Location.
     * 
     * @param type   * The location type for this geographical entity (ex. Country,
     * City, State, County, etc.)
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the canonicalParentId value for this Location.
     * 
     * @return canonicalParentId   * The nearest location parent's ID for this geographical entity.
     */
    public java.lang.Integer getCanonicalParentId() {
        return canonicalParentId;
    }


    /**
     * Sets the canonicalParentId value for this Location.
     * 
     * @param canonicalParentId   * The nearest location parent's ID for this geographical entity.
     */
    public void setCanonicalParentId(java.lang.Integer canonicalParentId) {
        this.canonicalParentId = canonicalParentId;
    }


    /**
     * Gets the displayName value for this Location.
     * 
     * @return displayName   * The localized name of the geographical entity.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this Location.
     * 
     * @param displayName   * The localized name of the geographical entity.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the locationType value for this Location.
     * 
     * @return locationType   * Indicates that this instance is a subtype of Location.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getLocationType() {
        return locationType;
    }


    /**
     * Sets the locationType value for this Location.
     * 
     * @param locationType   * Indicates that this instance is a subtype of Location.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setLocationType(java.lang.String locationType) {
        this.locationType = locationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.canonicalParentId==null && other.getCanonicalParentId()==null) || 
             (this.canonicalParentId!=null &&
              this.canonicalParentId.equals(other.getCanonicalParentId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.locationType==null && other.getLocationType()==null) || 
             (this.locationType!=null &&
              this.locationType.equals(other.getLocationType())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCanonicalParentId() != null) {
            _hashCode += getCanonicalParentId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getLocationType() != null) {
            _hashCode += getLocationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canonicalParentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "canonicalParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Location.Type"));
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
