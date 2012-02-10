/**
 * VideoPositionTargetingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;

public class VideoPositionTargetingType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoPositionTargetingType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PREROLL = "PREROLL";
    public static final java.lang.String _MIDROLL = "MIDROLL";
    public static final java.lang.String _POSTROLL = "POSTROLL";
    public static final java.lang.String _BUMPER = "BUMPER";
    public static final java.lang.String _PREROLL_BUMPER = "PREROLL_BUMPER";
    public static final java.lang.String _MIDROLL_BUMPER = "MIDROLL_BUMPER";
    public static final java.lang.String _POSTROLL_BUMPER = "POSTROLL_BUMPER";
    public static final VideoPositionTargetingType PREROLL = new VideoPositionTargetingType(_PREROLL);
    public static final VideoPositionTargetingType MIDROLL = new VideoPositionTargetingType(_MIDROLL);
    public static final VideoPositionTargetingType POSTROLL = new VideoPositionTargetingType(_POSTROLL);
    public static final VideoPositionTargetingType BUMPER = new VideoPositionTargetingType(_BUMPER);
    public static final VideoPositionTargetingType PREROLL_BUMPER = new VideoPositionTargetingType(_PREROLL_BUMPER);
    public static final VideoPositionTargetingType MIDROLL_BUMPER = new VideoPositionTargetingType(_MIDROLL_BUMPER);
    public static final VideoPositionTargetingType POSTROLL_BUMPER = new VideoPositionTargetingType(_POSTROLL_BUMPER);
    public java.lang.String getValue() { return _value_;}
    public static VideoPositionTargetingType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoPositionTargetingType enumeration = (VideoPositionTargetingType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoPositionTargetingType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoPositionTargetingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "VideoPositionTargetingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
