/**
 * UserTeamAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * {@code UserTeamAssociation} associates a {@link User} with a {@link
 * Team}
 *             to provide the user access to the entities that belong
 * to the team.
 */
public class UserTeamAssociation  extends com.google.api.ads.dfp.v201311.UserRecordTeamAssociation  implements java.io.Serializable {
    /* Refers to the {@link User#id}. */
    private java.lang.Long userId;

    public UserTeamAssociation() {
    }

    public UserTeamAssociation(
           java.lang.Long teamId,
           com.google.api.ads.dfp.v201311.TeamAccessType overriddenTeamAccessType,
           com.google.api.ads.dfp.v201311.TeamAccessType defaultTeamAccessType,
           java.lang.String userRecordTeamAssociationType,
           java.lang.Long userId) {
        super(
            teamId,
            overriddenTeamAccessType,
            defaultTeamAccessType,
            userRecordTeamAssociationType);
        this.userId = userId;
    }


    /**
     * Gets the userId value for this UserTeamAssociation.
     * 
     * @return userId   * Refers to the {@link User#id}.
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserTeamAssociation.
     * 
     * @param userId   * Refers to the {@link User#id}.
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTeamAssociation)) return false;
        UserTeamAssociation other = (UserTeamAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTeamAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "UserTeamAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "userId"));
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
