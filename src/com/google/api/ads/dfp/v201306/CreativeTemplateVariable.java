/**
 * CreativeTemplateVariable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * Represents a variable defined in a creative template.
 */
public abstract class CreativeTemplateVariable  implements java.io.Serializable {
    /* Label that is displayed to users when creating {@link TemplateCreative}
     * from the
     *                 {@link CreativeTemplate}. This attribute is required
     * and has a maximum
     *                 length of 127 characters. */
    private java.lang.String label;

    /* Unique name used to identify the variable. This attribute is
     * read-only and
     *                 is assigned by Google, by deriving from label, when
     * a creative template
     *                 variable is created. */
    private java.lang.String uniqueName;

    /* A descriptive help text that is displayed to users along with
     * the
     *                 label. This attribute is required and has a maximum
     * length of 255 characters. */
    private java.lang.String description;

    /* {@code true} if this variable is required to be filled in by
     * users when
     *                 creating {@link TemplateCreative} from the {@link
     * CreativeTemplate}. */
    private java.lang.Boolean isRequired;

    /* Indicates that this instance is a subtype of CreativeTemplateVariable.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String creativeTemplateVariableType;

    public CreativeTemplateVariable() {
    }

    public CreativeTemplateVariable(
           java.lang.String label,
           java.lang.String uniqueName,
           java.lang.String description,
           java.lang.Boolean isRequired,
           java.lang.String creativeTemplateVariableType) {
           this.label = label;
           this.uniqueName = uniqueName;
           this.description = description;
           this.isRequired = isRequired;
           this.creativeTemplateVariableType = creativeTemplateVariableType;
    }


    /**
     * Gets the label value for this CreativeTemplateVariable.
     * 
     * @return label   * Label that is displayed to users when creating {@link TemplateCreative}
     * from the
     *                 {@link CreativeTemplate}. This attribute is required
     * and has a maximum
     *                 length of 127 characters.
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CreativeTemplateVariable.
     * 
     * @param label   * Label that is displayed to users when creating {@link TemplateCreative}
     * from the
     *                 {@link CreativeTemplate}. This attribute is required
     * and has a maximum
     *                 length of 127 characters.
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the uniqueName value for this CreativeTemplateVariable.
     * 
     * @return uniqueName   * Unique name used to identify the variable. This attribute is
     * read-only and
     *                 is assigned by Google, by deriving from label, when
     * a creative template
     *                 variable is created.
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this CreativeTemplateVariable.
     * 
     * @param uniqueName   * Unique name used to identify the variable. This attribute is
     * read-only and
     *                 is assigned by Google, by deriving from label, when
     * a creative template
     *                 variable is created.
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the description value for this CreativeTemplateVariable.
     * 
     * @return description   * A descriptive help text that is displayed to users along with
     * the
     *                 label. This attribute is required and has a maximum
     * length of 255 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreativeTemplateVariable.
     * 
     * @param description   * A descriptive help text that is displayed to users along with
     * the
     *                 label. This attribute is required and has a maximum
     * length of 255 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isRequired value for this CreativeTemplateVariable.
     * 
     * @return isRequired   * {@code true} if this variable is required to be filled in by
     * users when
     *                 creating {@link TemplateCreative} from the {@link
     * CreativeTemplate}.
     */
    public java.lang.Boolean getIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this CreativeTemplateVariable.
     * 
     * @param isRequired   * {@code true} if this variable is required to be filled in by
     * users when
     *                 creating {@link TemplateCreative} from the {@link
     * CreativeTemplate}.
     */
    public void setIsRequired(java.lang.Boolean isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the creativeTemplateVariableType value for this CreativeTemplateVariable.
     * 
     * @return creativeTemplateVariableType   * Indicates that this instance is a subtype of CreativeTemplateVariable.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getCreativeTemplateVariableType() {
        return creativeTemplateVariableType;
    }


    /**
     * Sets the creativeTemplateVariableType value for this CreativeTemplateVariable.
     * 
     * @param creativeTemplateVariableType   * Indicates that this instance is a subtype of CreativeTemplateVariable.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setCreativeTemplateVariableType(java.lang.String creativeTemplateVariableType) {
        this.creativeTemplateVariableType = creativeTemplateVariableType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeTemplateVariable)) return false;
        CreativeTemplateVariable other = (CreativeTemplateVariable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isRequired==null && other.getIsRequired()==null) || 
             (this.isRequired!=null &&
              this.isRequired.equals(other.getIsRequired()))) &&
            ((this.creativeTemplateVariableType==null && other.getCreativeTemplateVariableType()==null) || 
             (this.creativeTemplateVariableType!=null &&
              this.creativeTemplateVariableType.equals(other.getCreativeTemplateVariableType())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsRequired() != null) {
            _hashCode += getIsRequired().hashCode();
        }
        if (getCreativeTemplateVariableType() != null) {
            _hashCode += getCreativeTemplateVariableType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeTemplateVariable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativeTemplateVariable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "uniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "isRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTemplateVariableType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativeTemplateVariable.Type"));
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
