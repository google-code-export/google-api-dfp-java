/**
 * InventoryTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201108;


/**
 * Contains criteria for targeting Inventory.
 */
public class InventoryTargeting  implements java.io.Serializable {
    /* The ids of ad units being targeted by the {@link LineItem}.
     * The line item
     *                 must target at least one ad unit or placement. */
    private java.lang.String[] targetedAdUnitIds;

    /* The ids of ad units being excluded from targeting by the {@link
     * LineItem}. */
    private java.lang.String[] excludedAdUnitIds;

    /* The ids of placements being targeted by the {@link LineItem}.
     * The line item
     *                 must target at least one ad unit or placement. */
    private long[] targetedPlacementIds;

    public InventoryTargeting() {
    }

    public InventoryTargeting(
           java.lang.String[] targetedAdUnitIds,
           java.lang.String[] excludedAdUnitIds,
           long[] targetedPlacementIds) {
           this.targetedAdUnitIds = targetedAdUnitIds;
           this.excludedAdUnitIds = excludedAdUnitIds;
           this.targetedPlacementIds = targetedPlacementIds;
    }


    /**
     * Gets the targetedAdUnitIds value for this InventoryTargeting.
     * 
     * @return targetedAdUnitIds   * The ids of ad units being targeted by the {@link LineItem}.
     * The line item
     *                 must target at least one ad unit or placement.
     */
    public java.lang.String[] getTargetedAdUnitIds() {
        return targetedAdUnitIds;
    }


    /**
     * Sets the targetedAdUnitIds value for this InventoryTargeting.
     * 
     * @param targetedAdUnitIds   * The ids of ad units being targeted by the {@link LineItem}.
     * The line item
     *                 must target at least one ad unit or placement.
     */
    public void setTargetedAdUnitIds(java.lang.String[] targetedAdUnitIds) {
        this.targetedAdUnitIds = targetedAdUnitIds;
    }

    public java.lang.String getTargetedAdUnitIds(int i) {
        return this.targetedAdUnitIds[i];
    }

    public void setTargetedAdUnitIds(int i, java.lang.String _value) {
        this.targetedAdUnitIds[i] = _value;
    }


    /**
     * Gets the excludedAdUnitIds value for this InventoryTargeting.
     * 
     * @return excludedAdUnitIds   * The ids of ad units being excluded from targeting by the {@link
     * LineItem}.
     */
    public java.lang.String[] getExcludedAdUnitIds() {
        return excludedAdUnitIds;
    }


    /**
     * Sets the excludedAdUnitIds value for this InventoryTargeting.
     * 
     * @param excludedAdUnitIds   * The ids of ad units being excluded from targeting by the {@link
     * LineItem}.
     */
    public void setExcludedAdUnitIds(java.lang.String[] excludedAdUnitIds) {
        this.excludedAdUnitIds = excludedAdUnitIds;
    }

    public java.lang.String getExcludedAdUnitIds(int i) {
        return this.excludedAdUnitIds[i];
    }

    public void setExcludedAdUnitIds(int i, java.lang.String _value) {
        this.excludedAdUnitIds[i] = _value;
    }


    /**
     * Gets the targetedPlacementIds value for this InventoryTargeting.
     * 
     * @return targetedPlacementIds   * The ids of placements being targeted by the {@link LineItem}.
     * The line item
     *                 must target at least one ad unit or placement.
     */
    public long[] getTargetedPlacementIds() {
        return targetedPlacementIds;
    }


    /**
     * Sets the targetedPlacementIds value for this InventoryTargeting.
     * 
     * @param targetedPlacementIds   * The ids of placements being targeted by the {@link LineItem}.
     * The line item
     *                 must target at least one ad unit or placement.
     */
    public void setTargetedPlacementIds(long[] targetedPlacementIds) {
        this.targetedPlacementIds = targetedPlacementIds;
    }

    public long getTargetedPlacementIds(int i) {
        return this.targetedPlacementIds[i];
    }

    public void setTargetedPlacementIds(int i, long _value) {
        this.targetedPlacementIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryTargeting)) return false;
        InventoryTargeting other = (InventoryTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedAdUnitIds==null && other.getTargetedAdUnitIds()==null) || 
             (this.targetedAdUnitIds!=null &&
              java.util.Arrays.equals(this.targetedAdUnitIds, other.getTargetedAdUnitIds()))) &&
            ((this.excludedAdUnitIds==null && other.getExcludedAdUnitIds()==null) || 
             (this.excludedAdUnitIds!=null &&
              java.util.Arrays.equals(this.excludedAdUnitIds, other.getExcludedAdUnitIds()))) &&
            ((this.targetedPlacementIds==null && other.getTargetedPlacementIds()==null) || 
             (this.targetedPlacementIds!=null &&
              java.util.Arrays.equals(this.targetedPlacementIds, other.getTargetedPlacementIds())));
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
        if (getTargetedAdUnitIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedAdUnitIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedAdUnitIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedAdUnitIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedAdUnitIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedAdUnitIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetedPlacementIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedPlacementIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedPlacementIds(), i);
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
        new org.apache.axis.description.TypeDesc(InventoryTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "InventoryTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedAdUnitIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "targetedAdUnitIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedAdUnitIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "excludedAdUnitIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedPlacementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "targetedPlacementIds"));
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
