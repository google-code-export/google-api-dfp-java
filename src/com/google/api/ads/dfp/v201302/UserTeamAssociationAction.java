/**
 * UserTeamAssociationAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201302;


/**
 * Represents the actions that can be performed on {@link UserTeamAssociation}
 * objects.
 */
public abstract class UserTeamAssociationAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of UserTeamAssociationAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String userTeamAssociationActionType;

    public UserTeamAssociationAction() {
    }

    public UserTeamAssociationAction(
           java.lang.String userTeamAssociationActionType) {
           this.userTeamAssociationActionType = userTeamAssociationActionType;
    }


    /**
     * Gets the userTeamAssociationActionType value for this UserTeamAssociationAction.
     * 
     * @return userTeamAssociationActionType   * Indicates that this instance is a subtype of UserTeamAssociationAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getUserTeamAssociationActionType() {
        return userTeamAssociationActionType;
    }


    /**
     * Sets the userTeamAssociationActionType value for this UserTeamAssociationAction.
     * 
     * @param userTeamAssociationActionType   * Indicates that this instance is a subtype of UserTeamAssociationAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setUserTeamAssociationActionType(java.lang.String userTeamAssociationActionType) {
        this.userTeamAssociationActionType = userTeamAssociationActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTeamAssociationAction)) return false;
        UserTeamAssociationAction other = (UserTeamAssociationAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userTeamAssociationActionType==null && other.getUserTeamAssociationActionType()==null) || 
             (this.userTeamAssociationActionType!=null &&
              this.userTeamAssociationActionType.equals(other.getUserTeamAssociationActionType())));
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
        if (getUserTeamAssociationActionType() != null) {
            _hashCode += getUserTeamAssociationActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTeamAssociationAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "UserTeamAssociationAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTeamAssociationActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "UserTeamAssociationAction.Type"));
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
