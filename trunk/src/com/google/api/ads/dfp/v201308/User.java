/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * Represents a user of the system.
 *             <p>
 *             Users may be assigned at most one {@link Role} per network.
 * Each role
 *             provides a user with permissions to perform specific operations.
 * Without a
 *             role, they will not be able to perform any actions.
 *             </p>
 */
public class User  extends com.google.api.ads.dfp.v201308.UserRecord  implements java.io.Serializable {
    /* Specifies whether or not the {@code User} is active. An inactive
     * user
     *                     cannot log in to the system or perform any operations.
     * This attribute is
     *                     read-only. */
    private java.lang.Boolean isActive;

    /* Specifies whether or not the {@code User} wants to permit the
     * Publisher
     *                     Display Ads system to send email notifications
     * to his or her email address.
     *                     This attribute is optional and defaults to {@code
     * true}. */
    private java.lang.Boolean isEmailNotificationAllowed;

    /* An identifier for the {@code User} that is meaningful to the
     * publisher.
     *                     This attribute is optional and has a maximum length
     * of 255 characters. */
    private java.lang.String externalId;

    /* The long format timezone id (e.g. "America/Los_Angeles") used
     * in the orders and line items UI
     *                     for this {@code User}. Set this to {@code null}
     * to indicate that no such value is defined
     *                     for the {@code User} - UI then defaults to using
     * the Network's timezone.
     *                     
     *                     This setting only affects the UI for this user
     * and does not in
     *                     particular affect the timezone of any dates and
     * times returned in API responses. */
    private java.lang.String ordersUiLocalTimeZoneId;

    /* The values of the custom fields associated with this user. */
    private com.google.api.ads.dfp.v201308.BaseCustomFieldValue[] customFieldValues;

    public User() {
    }

    public User(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String email,
           java.lang.Long roleId,
           java.lang.String roleName,
           java.lang.String preferredLocale,
           java.lang.String userRecordType,
           java.lang.Boolean isActive,
           java.lang.Boolean isEmailNotificationAllowed,
           java.lang.String externalId,
           java.lang.String ordersUiLocalTimeZoneId,
           com.google.api.ads.dfp.v201308.BaseCustomFieldValue[] customFieldValues) {
        super(
            id,
            name,
            email,
            roleId,
            roleName,
            preferredLocale,
            userRecordType);
        this.isActive = isActive;
        this.isEmailNotificationAllowed = isEmailNotificationAllowed;
        this.externalId = externalId;
        this.ordersUiLocalTimeZoneId = ordersUiLocalTimeZoneId;
        this.customFieldValues = customFieldValues;
    }


    /**
     * Gets the isActive value for this User.
     * 
     * @return isActive   * Specifies whether or not the {@code User} is active. An inactive
     * user
     *                     cannot log in to the system or perform any operations.
     * This attribute is
     *                     read-only.
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this User.
     * 
     * @param isActive   * Specifies whether or not the {@code User} is active. An inactive
     * user
     *                     cannot log in to the system or perform any operations.
     * This attribute is
     *                     read-only.
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isEmailNotificationAllowed value for this User.
     * 
     * @return isEmailNotificationAllowed   * Specifies whether or not the {@code User} wants to permit the
     * Publisher
     *                     Display Ads system to send email notifications
     * to his or her email address.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public java.lang.Boolean getIsEmailNotificationAllowed() {
        return isEmailNotificationAllowed;
    }


    /**
     * Sets the isEmailNotificationAllowed value for this User.
     * 
     * @param isEmailNotificationAllowed   * Specifies whether or not the {@code User} wants to permit the
     * Publisher
     *                     Display Ads system to send email notifications
     * to his or her email address.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public void setIsEmailNotificationAllowed(java.lang.Boolean isEmailNotificationAllowed) {
        this.isEmailNotificationAllowed = isEmailNotificationAllowed;
    }


    /**
     * Gets the externalId value for this User.
     * 
     * @return externalId   * An identifier for the {@code User} that is meaningful to the
     * publisher.
     *                     This attribute is optional and has a maximum length
     * of 255 characters.
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this User.
     * 
     * @param externalId   * An identifier for the {@code User} that is meaningful to the
     * publisher.
     *                     This attribute is optional and has a maximum length
     * of 255 characters.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the ordersUiLocalTimeZoneId value for this User.
     * 
     * @return ordersUiLocalTimeZoneId   * The long format timezone id (e.g. "America/Los_Angeles") used
     * in the orders and line items UI
     *                     for this {@code User}. Set this to {@code null}
     * to indicate that no such value is defined
     *                     for the {@code User} - UI then defaults to using
     * the Network's timezone.
     *                     
     *                     This setting only affects the UI for this user
     * and does not in
     *                     particular affect the timezone of any dates and
     * times returned in API responses.
     */
    public java.lang.String getOrdersUiLocalTimeZoneId() {
        return ordersUiLocalTimeZoneId;
    }


    /**
     * Sets the ordersUiLocalTimeZoneId value for this User.
     * 
     * @param ordersUiLocalTimeZoneId   * The long format timezone id (e.g. "America/Los_Angeles") used
     * in the orders and line items UI
     *                     for this {@code User}. Set this to {@code null}
     * to indicate that no such value is defined
     *                     for the {@code User} - UI then defaults to using
     * the Network's timezone.
     *                     
     *                     This setting only affects the UI for this user
     * and does not in
     *                     particular affect the timezone of any dates and
     * times returned in API responses.
     */
    public void setOrdersUiLocalTimeZoneId(java.lang.String ordersUiLocalTimeZoneId) {
        this.ordersUiLocalTimeZoneId = ordersUiLocalTimeZoneId;
    }


    /**
     * Gets the customFieldValues value for this User.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this user.
     */
    public com.google.api.ads.dfp.v201308.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this User.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this user.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.v201308.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.v201308.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.v201308.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isEmailNotificationAllowed==null && other.getIsEmailNotificationAllowed()==null) || 
             (this.isEmailNotificationAllowed!=null &&
              this.isEmailNotificationAllowed.equals(other.getIsEmailNotificationAllowed()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.ordersUiLocalTimeZoneId==null && other.getOrdersUiLocalTimeZoneId()==null) || 
             (this.ordersUiLocalTimeZoneId!=null &&
              this.ordersUiLocalTimeZoneId.equals(other.getOrdersUiLocalTimeZoneId()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsEmailNotificationAllowed() != null) {
            _hashCode += getIsEmailNotificationAllowed().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getOrdersUiLocalTimeZoneId() != null) {
            _hashCode += getOrdersUiLocalTimeZoneId().hashCode();
        }
        if (getCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValues(), i);
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
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEmailNotificationAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "isEmailNotificationAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordersUiLocalTimeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ordersUiLocalTimeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "BaseCustomFieldValue"));
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
