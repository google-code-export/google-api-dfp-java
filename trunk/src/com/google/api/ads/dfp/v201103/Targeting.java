/**
 * Targeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201103;


/**
 * Contains targeting criteria for {@link LineItem} objects. See
 *             {@link LineItem#targeting}.
 */
public class Targeting  implements java.io.Serializable {
    /* Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.v201103.GeoTargeting geoTargeting;

    /* Specifies what inventory is targeted by the {@link LineItem}.
     * This
     *                 attribute is required. */
    private com.google.api.ads.dfp.v201103.InventoryTargeting inventoryTargeting;

    /* Specifies the days of the week and times that are targeted
     * by the
     *                 {@link LineItem}. This attribute is optional. */
    private com.google.api.ads.dfp.v201103.DayPartTargeting dayPartTargeting;

    /* Specifies the collection of custom criteria that is targeted
     * by the
     *                 {@link LineItem}.
     *                 <p>
     *                 Once the {@link LineItem} is updated or modified with
     * custom targeting, the
     *                 server may return a normalized, but equivalent representation
     * of the custom
     *                 targeting expression.
     *                 <p>
     *                 {@code customTargeting} will have up to three levels
     * of expressions
     *                 including itself.
     *                 </p>
     *                 <p>
     *                 The top level {@code CustomCriteriaSet} i.e. the {@code
     * customTargeting}
     *                 object can only contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of
     *                 all its children.
     *                 </p>
     *                 <p>
     *                 The second level of {@code CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If
     *                 a {@link CustomCriteria} is placed on this level,
     * the server will wrap it
     *                 in a {@link CustomCriteriaSet}.
     *                 </p>
     *                 <p>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects,
     *                 namely {@link PredefinedCustomCriteria} and {@link
     * FreeFormCustomCriteria}.
     *                 </p>
     *                 <p>
     *                 The resulting custom targeting tree would be of the
     * form:
     *                 </p>
     *                 <br/>
     *                 <img src="http://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/> */
    private com.google.api.ads.dfp.v201103.CustomCriteriaSet customTargeting;

    private com.google.api.ads.dfp.v201103.UserDomainTargeting userDomainTargeting;

    public Targeting() {
    }

    public Targeting(
           com.google.api.ads.dfp.v201103.GeoTargeting geoTargeting,
           com.google.api.ads.dfp.v201103.InventoryTargeting inventoryTargeting,
           com.google.api.ads.dfp.v201103.DayPartTargeting dayPartTargeting,
           com.google.api.ads.dfp.v201103.CustomCriteriaSet customTargeting,
           com.google.api.ads.dfp.v201103.UserDomainTargeting userDomainTargeting) {
           this.geoTargeting = geoTargeting;
           this.inventoryTargeting = inventoryTargeting;
           this.dayPartTargeting = dayPartTargeting;
           this.customTargeting = customTargeting;
           this.userDomainTargeting = userDomainTargeting;
    }


    /**
     * Gets the geoTargeting value for this Targeting.
     * 
     * @return geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.v201103.GeoTargeting getGeoTargeting() {
        return geoTargeting;
    }


    /**
     * Sets the geoTargeting value for this Targeting.
     * 
     * @param geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional.
     */
    public void setGeoTargeting(com.google.api.ads.dfp.v201103.GeoTargeting geoTargeting) {
        this.geoTargeting = geoTargeting;
    }


    /**
     * Gets the inventoryTargeting value for this Targeting.
     * 
     * @return inventoryTargeting   * Specifies what inventory is targeted by the {@link LineItem}.
     * This
     *                 attribute is required.
     */
    public com.google.api.ads.dfp.v201103.InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }


    /**
     * Sets the inventoryTargeting value for this Targeting.
     * 
     * @param inventoryTargeting   * Specifies what inventory is targeted by the {@link LineItem}.
     * This
     *                 attribute is required.
     */
    public void setInventoryTargeting(com.google.api.ads.dfp.v201103.InventoryTargeting inventoryTargeting) {
        this.inventoryTargeting = inventoryTargeting;
    }


    /**
     * Gets the dayPartTargeting value for this Targeting.
     * 
     * @return dayPartTargeting   * Specifies the days of the week and times that are targeted
     * by the
     *                 {@link LineItem}. This attribute is optional.
     */
    public com.google.api.ads.dfp.v201103.DayPartTargeting getDayPartTargeting() {
        return dayPartTargeting;
    }


    /**
     * Sets the dayPartTargeting value for this Targeting.
     * 
     * @param dayPartTargeting   * Specifies the days of the week and times that are targeted
     * by the
     *                 {@link LineItem}. This attribute is optional.
     */
    public void setDayPartTargeting(com.google.api.ads.dfp.v201103.DayPartTargeting dayPartTargeting) {
        this.dayPartTargeting = dayPartTargeting;
    }


    /**
     * Gets the customTargeting value for this Targeting.
     * 
     * @return customTargeting   * Specifies the collection of custom criteria that is targeted
     * by the
     *                 {@link LineItem}.
     *                 <p>
     *                 Once the {@link LineItem} is updated or modified with
     * custom targeting, the
     *                 server may return a normalized, but equivalent representation
     * of the custom
     *                 targeting expression.
     *                 <p>
     *                 {@code customTargeting} will have up to three levels
     * of expressions
     *                 including itself.
     *                 </p>
     *                 <p>
     *                 The top level {@code CustomCriteriaSet} i.e. the {@code
     * customTargeting}
     *                 object can only contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of
     *                 all its children.
     *                 </p>
     *                 <p>
     *                 The second level of {@code CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If
     *                 a {@link CustomCriteria} is placed on this level,
     * the server will wrap it
     *                 in a {@link CustomCriteriaSet}.
     *                 </p>
     *                 <p>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects,
     *                 namely {@link PredefinedCustomCriteria} and {@link
     * FreeFormCustomCriteria}.
     *                 </p>
     *                 <p>
     *                 The resulting custom targeting tree would be of the
     * form:
     *                 </p>
     *                 <br/>
     *                 <img src="http://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/>
     */
    public com.google.api.ads.dfp.v201103.CustomCriteriaSet getCustomTargeting() {
        return customTargeting;
    }


    /**
     * Sets the customTargeting value for this Targeting.
     * 
     * @param customTargeting   * Specifies the collection of custom criteria that is targeted
     * by the
     *                 {@link LineItem}.
     *                 <p>
     *                 Once the {@link LineItem} is updated or modified with
     * custom targeting, the
     *                 server may return a normalized, but equivalent representation
     * of the custom
     *                 targeting expression.
     *                 <p>
     *                 {@code customTargeting} will have up to three levels
     * of expressions
     *                 including itself.
     *                 </p>
     *                 <p>
     *                 The top level {@code CustomCriteriaSet} i.e. the {@code
     * customTargeting}
     *                 object can only contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of
     *                 all its children.
     *                 </p>
     *                 <p>
     *                 The second level of {@code CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If
     *                 a {@link CustomCriteria} is placed on this level,
     * the server will wrap it
     *                 in a {@link CustomCriteriaSet}.
     *                 </p>
     *                 <p>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects,
     *                 namely {@link PredefinedCustomCriteria} and {@link
     * FreeFormCustomCriteria}.
     *                 </p>
     *                 <p>
     *                 The resulting custom targeting tree would be of the
     * form:
     *                 </p>
     *                 <br/>
     *                 <img src="http://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/>
     */
    public void setCustomTargeting(com.google.api.ads.dfp.v201103.CustomCriteriaSet customTargeting) {
        this.customTargeting = customTargeting;
    }


    /**
     * Gets the userDomainTargeting value for this Targeting.
     * 
     * @return userDomainTargeting
     */
    public com.google.api.ads.dfp.v201103.UserDomainTargeting getUserDomainTargeting() {
        return userDomainTargeting;
    }


    /**
     * Sets the userDomainTargeting value for this Targeting.
     * 
     * @param userDomainTargeting
     */
    public void setUserDomainTargeting(com.google.api.ads.dfp.v201103.UserDomainTargeting userDomainTargeting) {
        this.userDomainTargeting = userDomainTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Targeting)) return false;
        Targeting other = (Targeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoTargeting==null && other.getGeoTargeting()==null) || 
             (this.geoTargeting!=null &&
              this.geoTargeting.equals(other.getGeoTargeting()))) &&
            ((this.inventoryTargeting==null && other.getInventoryTargeting()==null) || 
             (this.inventoryTargeting!=null &&
              this.inventoryTargeting.equals(other.getInventoryTargeting()))) &&
            ((this.dayPartTargeting==null && other.getDayPartTargeting()==null) || 
             (this.dayPartTargeting!=null &&
              this.dayPartTargeting.equals(other.getDayPartTargeting()))) &&
            ((this.customTargeting==null && other.getCustomTargeting()==null) || 
             (this.customTargeting!=null &&
              this.customTargeting.equals(other.getCustomTargeting()))) &&
            ((this.userDomainTargeting==null && other.getUserDomainTargeting()==null) || 
             (this.userDomainTargeting!=null &&
              this.userDomainTargeting.equals(other.getUserDomainTargeting())));
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
        if (getGeoTargeting() != null) {
            _hashCode += getGeoTargeting().hashCode();
        }
        if (getInventoryTargeting() != null) {
            _hashCode += getInventoryTargeting().hashCode();
        }
        if (getDayPartTargeting() != null) {
            _hashCode += getDayPartTargeting().hashCode();
        }
        if (getCustomTargeting() != null) {
            _hashCode += getCustomTargeting().hashCode();
        }
        if (getUserDomainTargeting() != null) {
            _hashCode += getUserDomainTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Targeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "Targeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "geoTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "inventoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "InventoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayPartTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "dayPartTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "DayPartTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "customTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "CustomCriteriaSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDomainTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "userDomainTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201103", "UserDomainTargeting"));
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
