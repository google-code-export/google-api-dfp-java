/**
 * Team.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;


/**
 * A {@code Team} defines a grouping of users and what entities they
 * have access
 *             to. Users are added to teams with {@link UserTeamAssociation}
 * objects.
 */
public class Team  implements java.io.Serializable {
    /* The unique ID of the {@code Team}. This value is readonly and
     * is assigned
     *                 by Google. */
    private java.lang.Long id;

    /* The name of the {@code Team}. This value is required to create
     * a team and
     *                 has a maximum length of 106 characters. */
    private java.lang.String name;

    /* The description of the {@code Team}. This value is optional
     * and has a
     *                 maximum length of 255 characters. */
    private java.lang.String description;

    /* The list of {@link User#id user IDs} on the team. */
    private long[] userIds;

    public Team() {
    }

    public Team(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           long[] userIds) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.userIds = userIds;
    }


    /**
     * Gets the id value for this Team.
     * 
     * @return id   * The unique ID of the {@code Team}. This value is readonly and
     * is assigned
     *                 by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Team.
     * 
     * @param id   * The unique ID of the {@code Team}. This value is readonly and
     * is assigned
     *                 by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Team.
     * 
     * @return name   * The name of the {@code Team}. This value is required to create
     * a team and
     *                 has a maximum length of 106 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Team.
     * 
     * @param name   * The name of the {@code Team}. This value is required to create
     * a team and
     *                 has a maximum length of 106 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Team.
     * 
     * @return description   * The description of the {@code Team}. This value is optional
     * and has a
     *                 maximum length of 255 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Team.
     * 
     * @param description   * The description of the {@code Team}. This value is optional
     * and has a
     *                 maximum length of 255 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the userIds value for this Team.
     * 
     * @return userIds   * The list of {@link User#id user IDs} on the team.
     */
    public long[] getUserIds() {
        return userIds;
    }


    /**
     * Sets the userIds value for this Team.
     * 
     * @param userIds   * The list of {@link User#id user IDs} on the team.
     */
    public void setUserIds(long[] userIds) {
        this.userIds = userIds;
    }

    public long getUserIds(int i) {
        return this.userIds[i];
    }

    public void setUserIds(int i, long _value) {
        this.userIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Team)) return false;
        Team other = (Team) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.userIds==null && other.getUserIds()==null) || 
             (this.userIds!=null &&
              java.util.Arrays.equals(this.userIds, other.getUserIds())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getUserIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserIds(), i);
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
        new org.apache.axis.description.TypeDesc(Team.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "Team"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "userIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
