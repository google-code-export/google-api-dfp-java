/**
 * WorkflowApprovalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * A {@code WorkflowApprovalRequest} represents a workflow action
 * unit that requires user approval.
 */
public class WorkflowApprovalRequest  extends com.google.api.ads.dfp.v201311.WorkflowRequest  implements java.io.Serializable {
    /* The status of the {@code WorkflowApprovalRequest}. This attribute
     * is readonly. */
    private com.google.api.ads.dfp.v201311.WorkflowApprovalRequestStatus status;

    public WorkflowApprovalRequest() {
    }

    public WorkflowApprovalRequest(
           java.lang.Long id,
           java.lang.String workflowRuleName,
           java.lang.Long entityId,
           com.google.api.ads.dfp.v201311.WorkflowEntityType entityType,
           java.lang.String workflowRequestType,
           com.google.api.ads.dfp.v201311.WorkflowApprovalRequestStatus status) {
        super(
            id,
            workflowRuleName,
            entityId,
            entityType,
            workflowRequestType);
        this.status = status;
    }


    /**
     * Gets the status value for this WorkflowApprovalRequest.
     * 
     * @return status   * The status of the {@code WorkflowApprovalRequest}. This attribute
     * is readonly.
     */
    public com.google.api.ads.dfp.v201311.WorkflowApprovalRequestStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WorkflowApprovalRequest.
     * 
     * @param status   * The status of the {@code WorkflowApprovalRequest}. This attribute
     * is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.v201311.WorkflowApprovalRequestStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowApprovalRequest)) return false;
        WorkflowApprovalRequest other = (WorkflowApprovalRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowApprovalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowApprovalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowApprovalRequestStatus"));
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
