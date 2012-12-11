/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;


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
public class User  extends com.google.api.ads.dfp.v201211.UserRecord  implements java.io.Serializable {
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
           java.lang.String ordersUiLocalTimeZoneId) {
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
        this.ordersUiLocalTimeZoneId = ordersUiLocalTimeZoneId;
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
            ((this.ordersUiLocalTimeZoneId==null && other.getOrdersUiLocalTimeZoneId()==null) || 
             (this.ordersUiLocalTimeZoneId!=null &&
              this.ordersUiLocalTimeZoneId.equals(other.getOrdersUiLocalTimeZoneId())));
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
        if (getOrdersUiLocalTimeZoneId() != null) {
            _hashCode += getOrdersUiLocalTimeZoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEmailNotificationAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "isEmailNotificationAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordersUiLocalTimeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "ordersUiLocalTimeZoneId"));
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
