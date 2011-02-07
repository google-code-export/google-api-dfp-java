/**
 * Creative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201101;


/**
 * A {@code Creative} represents the media for the ad being served.
 */
public abstract class Creative  implements java.io.Serializable {
    /* The ID of the advertiser that owns the creative. This attribute
     * is
     *                 required. */
    private java.lang.Long advertiserId;

    /* Uniquely identifies the {@code Creative}. This value is read-only
     * and is
     *                 assigned by Google when the creative is created. This
     * attribute is required
     *                 for updates. */
    private java.lang.Long id;

    /* The name of the creative. This attribute is required and has
     * a maximum
     *                 length of 255 characters. */
    private java.lang.String name;

    /* The {@link Size} of the creative. This attribute is required. */
    private com.google.api.ads.dfp.v201101.Size size;

    /* The URL of the creative for previewing the media. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * is created. */
    private java.lang.String previewUrl;

    /* This field indicates the subtype of Creative of this instance.
     * It is ignored
     *                 on input, and instead xsi:type should be specified. */
    private java.lang.String creativeType;

    public Creative() {
    }

    public Creative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201101.Size size,
           java.lang.String previewUrl,
           java.lang.String creativeType) {
           this.advertiserId = advertiserId;
           this.id = id;
           this.name = name;
           this.size = size;
           this.previewUrl = previewUrl;
           this.creativeType = creativeType;
    }


    /**
     * Gets the advertiserId value for this Creative.
     * 
     * @return advertiserId   * The ID of the advertiser that owns the creative. This attribute
     * is
     *                 required.
     */
    public java.lang.Long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this Creative.
     * 
     * @param advertiserId   * The ID of the advertiser that owns the creative. This attribute
     * is
     *                 required.
     */
    public void setAdvertiserId(java.lang.Long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the id value for this Creative.
     * 
     * @return id   * Uniquely identifies the {@code Creative}. This value is read-only
     * and is
     *                 assigned by Google when the creative is created. This
     * attribute is required
     *                 for updates.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Creative.
     * 
     * @param id   * Uniquely identifies the {@code Creative}. This value is read-only
     * and is
     *                 assigned by Google when the creative is created. This
     * attribute is required
     *                 for updates.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Creative.
     * 
     * @return name   * The name of the creative. This attribute is required and has
     * a maximum
     *                 length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Creative.
     * 
     * @param name   * The name of the creative. This attribute is required and has
     * a maximum
     *                 length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this Creative.
     * 
     * @return size   * The {@link Size} of the creative. This attribute is required.
     */
    public com.google.api.ads.dfp.v201101.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this Creative.
     * 
     * @param size   * The {@link Size} of the creative. This attribute is required.
     */
    public void setSize(com.google.api.ads.dfp.v201101.Size size) {
        this.size = size;
    }


    /**
     * Gets the previewUrl value for this Creative.
     * 
     * @return previewUrl   * The URL of the creative for previewing the media. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * is created.
     */
    public java.lang.String getPreviewUrl() {
        return previewUrl;
    }


    /**
     * Sets the previewUrl value for this Creative.
     * 
     * @param previewUrl   * The URL of the creative for previewing the media. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * is created.
     */
    public void setPreviewUrl(java.lang.String previewUrl) {
        this.previewUrl = previewUrl;
    }


    /**
     * Gets the creativeType value for this Creative.
     * 
     * @return creativeType   * This field indicates the subtype of Creative of this instance.
     * It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public java.lang.String getCreativeType() {
        return creativeType;
    }


    /**
     * Sets the creativeType value for this Creative.
     * 
     * @param creativeType   * This field indicates the subtype of Creative of this instance.
     * It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public void setCreativeType(java.lang.String creativeType) {
        this.creativeType = creativeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Creative)) return false;
        Creative other = (Creative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advertiserId==null && other.getAdvertiserId()==null) || 
             (this.advertiserId!=null &&
              this.advertiserId.equals(other.getAdvertiserId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.previewUrl==null && other.getPreviewUrl()==null) || 
             (this.previewUrl!=null &&
              this.previewUrl.equals(other.getPreviewUrl()))) &&
            ((this.creativeType==null && other.getCreativeType()==null) || 
             (this.creativeType!=null &&
              this.creativeType.equals(other.getCreativeType())));
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
        if (getAdvertiserId() != null) {
            _hashCode += getAdvertiserId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getPreviewUrl() != null) {
            _hashCode += getPreviewUrl().hashCode();
        }
        if (getCreativeType() != null) {
            _hashCode += getCreativeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Creative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "Creative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "previewUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "Creative.Type"));
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
