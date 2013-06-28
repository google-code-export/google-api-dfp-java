/**
 * UserRecordTeamAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * {@code UserRecordTeamAssociation} represents the association between
 * a
 *             {@link UserRecord} and a {@link Team}.
 */
public abstract class UserRecordTeamAssociation  implements java.io.Serializable {
    /* The {@link Team#id} of the team. */
    private java.lang.Long teamId;

    /* The overridden team access type. This field is {@code null}
     * if team access
     *                 type is not overridden. */
    private com.google.api.ads.dfp.v201306.TeamAccessType overriddenTeamAccessType;

    /* The default team access type {@link Team#teamAccessType}. This
     * field is
     *                 read-only and is populated by Google. */
    private com.google.api.ads.dfp.v201306.TeamAccessType defaultTeamAccessType;

    /* Indicates that this instance is a subtype of UserRecordTeamAssociation.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String userRecordTeamAssociationType;

    public UserRecordTeamAssociation() {
    }

    public UserRecordTeamAssociation(
           java.lang.Long teamId,
           com.google.api.ads.dfp.v201306.TeamAccessType overriddenTeamAccessType,
           com.google.api.ads.dfp.v201306.TeamAccessType defaultTeamAccessType,
           java.lang.String userRecordTeamAssociationType) {
           this.teamId = teamId;
           this.overriddenTeamAccessType = overriddenTeamAccessType;
           this.defaultTeamAccessType = defaultTeamAccessType;
           this.userRecordTeamAssociationType = userRecordTeamAssociationType;
    }


    /**
     * Gets the teamId value for this UserRecordTeamAssociation.
     * 
     * @return teamId   * The {@link Team#id} of the team.
     */
    public java.lang.Long getTeamId() {
        return teamId;
    }


    /**
     * Sets the teamId value for this UserRecordTeamAssociation.
     * 
     * @param teamId   * The {@link Team#id} of the team.
     */
    public void setTeamId(java.lang.Long teamId) {
        this.teamId = teamId;
    }


    /**
     * Gets the overriddenTeamAccessType value for this UserRecordTeamAssociation.
     * 
     * @return overriddenTeamAccessType   * The overridden team access type. This field is {@code null}
     * if team access
     *                 type is not overridden.
     */
    public com.google.api.ads.dfp.v201306.TeamAccessType getOverriddenTeamAccessType() {
        return overriddenTeamAccessType;
    }


    /**
     * Sets the overriddenTeamAccessType value for this UserRecordTeamAssociation.
     * 
     * @param overriddenTeamAccessType   * The overridden team access type. This field is {@code null}
     * if team access
     *                 type is not overridden.
     */
    public void setOverriddenTeamAccessType(com.google.api.ads.dfp.v201306.TeamAccessType overriddenTeamAccessType) {
        this.overriddenTeamAccessType = overriddenTeamAccessType;
    }


    /**
     * Gets the defaultTeamAccessType value for this UserRecordTeamAssociation.
     * 
     * @return defaultTeamAccessType   * The default team access type {@link Team#teamAccessType}. This
     * field is
     *                 read-only and is populated by Google.
     */
    public com.google.api.ads.dfp.v201306.TeamAccessType getDefaultTeamAccessType() {
        return defaultTeamAccessType;
    }


    /**
     * Sets the defaultTeamAccessType value for this UserRecordTeamAssociation.
     * 
     * @param defaultTeamAccessType   * The default team access type {@link Team#teamAccessType}. This
     * field is
     *                 read-only and is populated by Google.
     */
    public void setDefaultTeamAccessType(com.google.api.ads.dfp.v201306.TeamAccessType defaultTeamAccessType) {
        this.defaultTeamAccessType = defaultTeamAccessType;
    }


    /**
     * Gets the userRecordTeamAssociationType value for this UserRecordTeamAssociation.
     * 
     * @return userRecordTeamAssociationType   * Indicates that this instance is a subtype of UserRecordTeamAssociation.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getUserRecordTeamAssociationType() {
        return userRecordTeamAssociationType;
    }


    /**
     * Sets the userRecordTeamAssociationType value for this UserRecordTeamAssociation.
     * 
     * @param userRecordTeamAssociationType   * Indicates that this instance is a subtype of UserRecordTeamAssociation.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setUserRecordTeamAssociationType(java.lang.String userRecordTeamAssociationType) {
        this.userRecordTeamAssociationType = userRecordTeamAssociationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserRecordTeamAssociation)) return false;
        UserRecordTeamAssociation other = (UserRecordTeamAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teamId==null && other.getTeamId()==null) || 
             (this.teamId!=null &&
              this.teamId.equals(other.getTeamId()))) &&
            ((this.overriddenTeamAccessType==null && other.getOverriddenTeamAccessType()==null) || 
             (this.overriddenTeamAccessType!=null &&
              this.overriddenTeamAccessType.equals(other.getOverriddenTeamAccessType()))) &&
            ((this.defaultTeamAccessType==null && other.getDefaultTeamAccessType()==null) || 
             (this.defaultTeamAccessType!=null &&
              this.defaultTeamAccessType.equals(other.getDefaultTeamAccessType()))) &&
            ((this.userRecordTeamAssociationType==null && other.getUserRecordTeamAssociationType()==null) || 
             (this.userRecordTeamAssociationType!=null &&
              this.userRecordTeamAssociationType.equals(other.getUserRecordTeamAssociationType())));
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
        if (getTeamId() != null) {
            _hashCode += getTeamId().hashCode();
        }
        if (getOverriddenTeamAccessType() != null) {
            _hashCode += getOverriddenTeamAccessType().hashCode();
        }
        if (getDefaultTeamAccessType() != null) {
            _hashCode += getDefaultTeamAccessType().hashCode();
        }
        if (getUserRecordTeamAssociationType() != null) {
            _hashCode += getUserRecordTeamAssociationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserRecordTeamAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UserRecordTeamAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "teamId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overriddenTeamAccessType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "overriddenTeamAccessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TeamAccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTeamAccessType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "defaultTeamAccessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TeamAccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRecordTeamAssociationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UserRecordTeamAssociation.Type"));
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
