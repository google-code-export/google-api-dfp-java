/**
 * AuthenticationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201104;

public class AuthenticationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthenticationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AMBIGUOUS_SOAP_REQUEST_HEADER = "AMBIGUOUS_SOAP_REQUEST_HEADER";
    public static final java.lang.String _INVALID_EMAIL = "INVALID_EMAIL";
    public static final java.lang.String _INVALID_OAUTH_SIGNATURE = "INVALID_OAUTH_SIGNATURE";
    public static final java.lang.String _MISSING_SOAP_REQUEST_HEADER = "MISSING_SOAP_REQUEST_HEADER";
    public static final java.lang.String _NOT_WHITELISTED_FOR_API_ACCESS = "NOT_WHITELISTED_FOR_API_ACCESS";
    public static final java.lang.String _NO_NETWORKS_TO_ACCESS = "NO_NETWORKS_TO_ACCESS";
    public static final java.lang.String _NETWORK_NOT_FOUND = "NETWORK_NOT_FOUND";
    public static final java.lang.String _NETWORK_CODE_REQUIRED = "NETWORK_CODE_REQUIRED";
    public static final java.lang.String _CONNECTION_ERROR = "CONNECTION_ERROR";
    public static final AuthenticationErrorReason AMBIGUOUS_SOAP_REQUEST_HEADER = new AuthenticationErrorReason(_AMBIGUOUS_SOAP_REQUEST_HEADER);
    public static final AuthenticationErrorReason INVALID_EMAIL = new AuthenticationErrorReason(_INVALID_EMAIL);
    public static final AuthenticationErrorReason INVALID_OAUTH_SIGNATURE = new AuthenticationErrorReason(_INVALID_OAUTH_SIGNATURE);
    public static final AuthenticationErrorReason MISSING_SOAP_REQUEST_HEADER = new AuthenticationErrorReason(_MISSING_SOAP_REQUEST_HEADER);
    public static final AuthenticationErrorReason NOT_WHITELISTED_FOR_API_ACCESS = new AuthenticationErrorReason(_NOT_WHITELISTED_FOR_API_ACCESS);
    public static final AuthenticationErrorReason NO_NETWORKS_TO_ACCESS = new AuthenticationErrorReason(_NO_NETWORKS_TO_ACCESS);
    public static final AuthenticationErrorReason NETWORK_NOT_FOUND = new AuthenticationErrorReason(_NETWORK_NOT_FOUND);
    public static final AuthenticationErrorReason NETWORK_CODE_REQUIRED = new AuthenticationErrorReason(_NETWORK_CODE_REQUIRED);
    public static final AuthenticationErrorReason CONNECTION_ERROR = new AuthenticationErrorReason(_CONNECTION_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static AuthenticationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuthenticationErrorReason enumeration = (AuthenticationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuthenticationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuthenticationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201104", "AuthenticationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
