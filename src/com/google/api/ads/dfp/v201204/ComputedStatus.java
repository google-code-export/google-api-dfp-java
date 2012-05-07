/**
 * ComputedStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201204;

public class ComputedStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ComputedStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DELIVERING = "DELIVERING";
    public static final java.lang.String _READY = "READY";
    public static final java.lang.String _PAUSED = "PAUSED";
    public static final java.lang.String _NEEDS_CREATIVES = "NEEDS_CREATIVES";
    public static final java.lang.String _PAUSED_INVENTORY_RELEASED = "PAUSED_INVENTORY_RELEASED";
    public static final java.lang.String _PENDING_APPROVAL = "PENDING_APPROVAL";
    public static final java.lang.String _COMPLETED = "COMPLETED";
    public static final java.lang.String _DISAPPROVED = "DISAPPROVED";
    public static final java.lang.String _DRAFT = "DRAFT";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final ComputedStatus DELIVERING = new ComputedStatus(_DELIVERING);
    public static final ComputedStatus READY = new ComputedStatus(_READY);
    public static final ComputedStatus PAUSED = new ComputedStatus(_PAUSED);
    public static final ComputedStatus NEEDS_CREATIVES = new ComputedStatus(_NEEDS_CREATIVES);
    public static final ComputedStatus PAUSED_INVENTORY_RELEASED = new ComputedStatus(_PAUSED_INVENTORY_RELEASED);
    public static final ComputedStatus PENDING_APPROVAL = new ComputedStatus(_PENDING_APPROVAL);
    public static final ComputedStatus COMPLETED = new ComputedStatus(_COMPLETED);
    public static final ComputedStatus DISAPPROVED = new ComputedStatus(_DISAPPROVED);
    public static final ComputedStatus DRAFT = new ComputedStatus(_DRAFT);
    public static final ComputedStatus CANCELED = new ComputedStatus(_CANCELED);
    public java.lang.String getValue() { return _value_;}
    public static ComputedStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ComputedStatus enumeration = (ComputedStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ComputedStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ComputedStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201204", "ComputedStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
