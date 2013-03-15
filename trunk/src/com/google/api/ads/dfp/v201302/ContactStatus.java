/**
 * ContactStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201302;

public class ContactStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ContactStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNINVITED = "UNINVITED";
    public static final java.lang.String _INVITE_PENDNG = "INVITE_PENDNG";
    public static final java.lang.String _INVITE_EXPIRED = "INVITE_EXPIRED";
    public static final java.lang.String _INVITE_CANCELED = "INVITE_CANCELED";
    public static final java.lang.String _USER_ACTIVE = "USER_ACTIVE";
    public static final java.lang.String _USER_DISABLED = "USER_DISABLED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ContactStatus UNINVITED = new ContactStatus(_UNINVITED);
    public static final ContactStatus INVITE_PENDNG = new ContactStatus(_INVITE_PENDNG);
    public static final ContactStatus INVITE_EXPIRED = new ContactStatus(_INVITE_EXPIRED);
    public static final ContactStatus INVITE_CANCELED = new ContactStatus(_INVITE_CANCELED);
    public static final ContactStatus USER_ACTIVE = new ContactStatus(_USER_ACTIVE);
    public static final ContactStatus USER_DISABLED = new ContactStatus(_USER_DISABLED);
    public static final ContactStatus UNKNOWN = new ContactStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ContactStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ContactStatus enumeration = (ContactStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ContactStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "Contact.Status"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
