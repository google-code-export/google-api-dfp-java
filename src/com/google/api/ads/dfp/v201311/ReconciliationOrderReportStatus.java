/**
 * ReconciliationOrderReportStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;

public class ReconciliationOrderReportStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReconciliationOrderReportStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DRAFT = "DRAFT";
    public static final java.lang.String _RECONCILED = "RECONCILED";
    public static final java.lang.String _REVERTED = "REVERTED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ReconciliationOrderReportStatus DRAFT = new ReconciliationOrderReportStatus(_DRAFT);
    public static final ReconciliationOrderReportStatus RECONCILED = new ReconciliationOrderReportStatus(_RECONCILED);
    public static final ReconciliationOrderReportStatus REVERTED = new ReconciliationOrderReportStatus(_REVERTED);
    public static final ReconciliationOrderReportStatus UNKNOWN = new ReconciliationOrderReportStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ReconciliationOrderReportStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReconciliationOrderReportStatus enumeration = (ReconciliationOrderReportStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReconciliationOrderReportStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReconciliationOrderReportStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ReconciliationOrderReportStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
