/**
 * ProposalLineItemAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * Represents the actions that can be performed on {@link ProposalLineItem}
 * objects.
 */
public abstract class ProposalLineItemAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of ProposalLineItemAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String proposalLineItemActionType;

    public ProposalLineItemAction() {
    }

    public ProposalLineItemAction(
           java.lang.String proposalLineItemActionType) {
           this.proposalLineItemActionType = proposalLineItemActionType;
    }


    /**
     * Gets the proposalLineItemActionType value for this ProposalLineItemAction.
     * 
     * @return proposalLineItemActionType   * Indicates that this instance is a subtype of ProposalLineItemAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getProposalLineItemActionType() {
        return proposalLineItemActionType;
    }


    /**
     * Sets the proposalLineItemActionType value for this ProposalLineItemAction.
     * 
     * @param proposalLineItemActionType   * Indicates that this instance is a subtype of ProposalLineItemAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setProposalLineItemActionType(java.lang.String proposalLineItemActionType) {
        this.proposalLineItemActionType = proposalLineItemActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItemAction)) return false;
        ProposalLineItemAction other = (ProposalLineItemAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.proposalLineItemActionType==null && other.getProposalLineItemActionType()==null) || 
             (this.proposalLineItemActionType!=null &&
              this.proposalLineItemActionType.equals(other.getProposalLineItemActionType())));
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
        if (getProposalLineItemActionType() != null) {
            _hashCode += getProposalLineItemActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalLineItemActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemAction.Type"));
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
