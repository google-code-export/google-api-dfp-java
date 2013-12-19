/**
 * FirstPartyAudienceSegmentRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Rule of a {@link FirstPartyAudienceSegment} that defines user's
 * eligibility criteria to be part
 *             of a segment.
 */
public class FirstPartyAudienceSegmentRule  implements java.io.Serializable {
    /* Specifies the inventory (i.e. ad units and placements) that
     * are part of the rule of a
     *                 {@link FirstPartyAudienceSegment}. This attribute
     * is required. */
    private com.google.api.ads.dfp.v201311.InventoryTargeting inventoryRule;

    /* Specifies the collection of custom criteria that are part of
     * the rule of a
     *                 {@link FirstPartyAudienceSegment}.
     *                 
     *                 <p>
     *                 Once the {@link FirstPartyAudienceSegment} is updated
     * or modified with custom criteria, the
     *                 server may return a normalized, but equivalent representation
     * of the custom criteria rule.
     *                 </p>
     *                 
     *                 <ul>
     *                 {@code customCriteriaRule} will have up to three levels
     * including itself.
     *                 <li>
     *                 The top level {@link CustomCriteriaSet} i.e. the {@code
     * customTargeting} object can only
     *                 contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of all its children.
     *                 <li>
     *                 The second level of {@link CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If a
     *                 {@link CustomCriteria} is placed on this level, the
     * server will wrap it in a
     *                 {@link CustomCriteriaSet}.
     *                 <li>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects.
     *                 </ul>
     *                 
     *                 <p>
     *                 The resulting custom criteria rule would be of the
     * form: <br>
     *                 <img
     *                 src="http://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/>
     * </p> */
    private com.google.api.ads.dfp.v201311.CustomCriteriaSet customCriteriaRule;

    public FirstPartyAudienceSegmentRule() {
    }

    public FirstPartyAudienceSegmentRule(
           com.google.api.ads.dfp.v201311.InventoryTargeting inventoryRule,
           com.google.api.ads.dfp.v201311.CustomCriteriaSet customCriteriaRule) {
           this.inventoryRule = inventoryRule;
           this.customCriteriaRule = customCriteriaRule;
    }


    /**
     * Gets the inventoryRule value for this FirstPartyAudienceSegmentRule.
     * 
     * @return inventoryRule   * Specifies the inventory (i.e. ad units and placements) that
     * are part of the rule of a
     *                 {@link FirstPartyAudienceSegment}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.v201311.InventoryTargeting getInventoryRule() {
        return inventoryRule;
    }


    /**
     * Sets the inventoryRule value for this FirstPartyAudienceSegmentRule.
     * 
     * @param inventoryRule   * Specifies the inventory (i.e. ad units and placements) that
     * are part of the rule of a
     *                 {@link FirstPartyAudienceSegment}. This attribute
     * is required.
     */
    public void setInventoryRule(com.google.api.ads.dfp.v201311.InventoryTargeting inventoryRule) {
        this.inventoryRule = inventoryRule;
    }


    /**
     * Gets the customCriteriaRule value for this FirstPartyAudienceSegmentRule.
     * 
     * @return customCriteriaRule   * Specifies the collection of custom criteria that are part of
     * the rule of a
     *                 {@link FirstPartyAudienceSegment}.
     *                 
     *                 <p>
     *                 Once the {@link FirstPartyAudienceSegment} is updated
     * or modified with custom criteria, the
     *                 server may return a normalized, but equivalent representation
     * of the custom criteria rule.
     *                 </p>
     *                 
     *                 <ul>
     *                 {@code customCriteriaRule} will have up to three levels
     * including itself.
     *                 <li>
     *                 The top level {@link CustomCriteriaSet} i.e. the {@code
     * customTargeting} object can only
     *                 contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of all its children.
     *                 <li>
     *                 The second level of {@link CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If a
     *                 {@link CustomCriteria} is placed on this level, the
     * server will wrap it in a
     *                 {@link CustomCriteriaSet}.
     *                 <li>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects.
     *                 </ul>
     *                 
     *                 <p>
     *                 The resulting custom criteria rule would be of the
     * form: <br>
     *                 <img
     *                 src="http://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/>
     * </p>
     */
    public com.google.api.ads.dfp.v201311.CustomCriteriaSet getCustomCriteriaRule() {
        return customCriteriaRule;
    }


    /**
     * Sets the customCriteriaRule value for this FirstPartyAudienceSegmentRule.
     * 
     * @param customCriteriaRule   * Specifies the collection of custom criteria that are part of
     * the rule of a
     *                 {@link FirstPartyAudienceSegment}.
     *                 
     *                 <p>
     *                 Once the {@link FirstPartyAudienceSegment} is updated
     * or modified with custom criteria, the
     *                 server may return a normalized, but equivalent representation
     * of the custom criteria rule.
     *                 </p>
     *                 
     *                 <ul>
     *                 {@code customCriteriaRule} will have up to three levels
     * including itself.
     *                 <li>
     *                 The top level {@link CustomCriteriaSet} i.e. the {@code
     * customTargeting} object can only
     *                 contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of all its children.
     *                 <li>
     *                 The second level of {@link CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If a
     *                 {@link CustomCriteria} is placed on this level, the
     * server will wrap it in a
     *                 {@link CustomCriteriaSet}.
     *                 <li>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects.
     *                 </ul>
     *                 
     *                 <p>
     *                 The resulting custom criteria rule would be of the
     * form: <br>
     *                 <img
     *                 src="http://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/>
     * </p>
     */
    public void setCustomCriteriaRule(com.google.api.ads.dfp.v201311.CustomCriteriaSet customCriteriaRule) {
        this.customCriteriaRule = customCriteriaRule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirstPartyAudienceSegmentRule)) return false;
        FirstPartyAudienceSegmentRule other = (FirstPartyAudienceSegmentRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inventoryRule==null && other.getInventoryRule()==null) || 
             (this.inventoryRule!=null &&
              this.inventoryRule.equals(other.getInventoryRule()))) &&
            ((this.customCriteriaRule==null && other.getCustomCriteriaRule()==null) || 
             (this.customCriteriaRule!=null &&
              this.customCriteriaRule.equals(other.getCustomCriteriaRule())));
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
        if (getInventoryRule() != null) {
            _hashCode += getInventoryRule().hashCode();
        }
        if (getCustomCriteriaRule() != null) {
            _hashCode += getCustomCriteriaRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirstPartyAudienceSegmentRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "FirstPartyAudienceSegmentRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryRule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "inventoryRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "InventoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customCriteriaRule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "customCriteriaRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CustomCriteriaSet"));
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
