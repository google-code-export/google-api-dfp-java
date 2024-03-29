/**
 * UserRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;


/**
 * The {@code UserRecord} represents the base class from which a {@code
 * User} is
 *             derived.
 */
public class UserRecord  implements java.io.Serializable {
    /* The unique ID of the {@code User}. This attribute is readonly
     * and is
     *                 assigned by Google. */
    private java.lang.Long id;

    /* The name of the {@code User}. It has a maximum length of 128
     * characters. */
    private java.lang.String name;

    /* The email or login of the {@code User}. In order to create
     * a new user, you must
     *                 already have a <a
     *                 href="https://www.google.com/accounts/ManageAccount">Google
     * Account</a>. */
    private java.lang.String email;

    /* The unique role ID of the {@code User}. Roles that are created
     * by Google
     *                 will have negative IDs. */
    private java.lang.Long roleId;

    /* The name of the role assigned to the {@code User}. This attribute
     * is
     *                 readonly. */
    private java.lang.String roleName;

    /* Determines the preferred language and format of data for the
     * {@code User}.
     *                 The structure of the locale string should be [ISO
     * language
     *                 code]_[ISO_country code]. This field is required. */
    private java.lang.String preferredLocale;

    /* Indicates that this instance is a subtype of UserRecord.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String userRecordType;

    public UserRecord() {
    }

    public UserRecord(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String email,
           java.lang.Long roleId,
           java.lang.String roleName,
           java.lang.String preferredLocale,
           java.lang.String userRecordType) {
           this.id = id;
           this.name = name;
           this.email = email;
           this.roleId = roleId;
           this.roleName = roleName;
           this.preferredLocale = preferredLocale;
           this.userRecordType = userRecordType;
    }


    /**
     * Gets the id value for this UserRecord.
     * 
     * @return id   * The unique ID of the {@code User}. This attribute is readonly
     * and is
     *                 assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this UserRecord.
     * 
     * @param id   * The unique ID of the {@code User}. This attribute is readonly
     * and is
     *                 assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this UserRecord.
     * 
     * @return name   * The name of the {@code User}. It has a maximum length of 128
     * characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserRecord.
     * 
     * @param name   * The name of the {@code User}. It has a maximum length of 128
     * characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the email value for this UserRecord.
     * 
     * @return email   * The email or login of the {@code User}. In order to create
     * a new user, you must
     *                 already have a <a
     *                 href="https://www.google.com/accounts/ManageAccount">Google
     * Account</a>.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserRecord.
     * 
     * @param email   * The email or login of the {@code User}. In order to create
     * a new user, you must
     *                 already have a <a
     *                 href="https://www.google.com/accounts/ManageAccount">Google
     * Account</a>.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the roleId value for this UserRecord.
     * 
     * @return roleId   * The unique role ID of the {@code User}. Roles that are created
     * by Google
     *                 will have negative IDs.
     */
    public java.lang.Long getRoleId() {
        return roleId;
    }


    /**
     * Sets the roleId value for this UserRecord.
     * 
     * @param roleId   * The unique role ID of the {@code User}. Roles that are created
     * by Google
     *                 will have negative IDs.
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }


    /**
     * Gets the roleName value for this UserRecord.
     * 
     * @return roleName   * The name of the role assigned to the {@code User}. This attribute
     * is
     *                 readonly.
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this UserRecord.
     * 
     * @param roleName   * The name of the role assigned to the {@code User}. This attribute
     * is
     *                 readonly.
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }


    /**
     * Gets the preferredLocale value for this UserRecord.
     * 
     * @return preferredLocale   * Determines the preferred language and format of data for the
     * {@code User}.
     *                 The structure of the locale string should be [ISO
     * language
     *                 code]_[ISO_country code]. This field is required.
     */
    public java.lang.String getPreferredLocale() {
        return preferredLocale;
    }


    /**
     * Sets the preferredLocale value for this UserRecord.
     * 
     * @param preferredLocale   * Determines the preferred language and format of data for the
     * {@code User}.
     *                 The structure of the locale string should be [ISO
     * language
     *                 code]_[ISO_country code]. This field is required.
     */
    public void setPreferredLocale(java.lang.String preferredLocale) {
        this.preferredLocale = preferredLocale;
    }


    /**
     * Gets the userRecordType value for this UserRecord.
     * 
     * @return userRecordType   * Indicates that this instance is a subtype of UserRecord.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getUserRecordType() {
        return userRecordType;
    }


    /**
     * Sets the userRecordType value for this UserRecord.
     * 
     * @param userRecordType   * Indicates that this instance is a subtype of UserRecord.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setUserRecordType(java.lang.String userRecordType) {
        this.userRecordType = userRecordType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserRecord)) return false;
        UserRecord other = (UserRecord) obj;
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
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.roleId==null && other.getRoleId()==null) || 
             (this.roleId!=null &&
              this.roleId.equals(other.getRoleId()))) &&
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName()))) &&
            ((this.preferredLocale==null && other.getPreferredLocale()==null) || 
             (this.preferredLocale!=null &&
              this.preferredLocale.equals(other.getPreferredLocale()))) &&
            ((this.userRecordType==null && other.getUserRecordType()==null) || 
             (this.userRecordType!=null &&
              this.userRecordType.equals(other.getUserRecordType())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getRoleId() != null) {
            _hashCode += getRoleId().hashCode();
        }
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        if (getPreferredLocale() != null) {
            _hashCode += getPreferredLocale().hashCode();
        }
        if (getUserRecordType() != null) {
            _hashCode += getUserRecordType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "UserRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "roleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "roleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "preferredLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRecordType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "UserRecord.Type"));
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
