/**
 * LineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * {@code LineItem} is an advertiser's commitment to purchase a specific
 * number
 *             of ad impressions, clicks, or time.
 */
public class LineItem  extends com.google.api.ads.dfp.v201306.LineItemSummary  implements java.io.Serializable {
    /* Contains the targeting criteria for the ad campaign. This attribute
     * is
     *                     required. */
    private com.google.api.ads.dfp.v201306.Targeting targeting;

    public LineItem() {
    }

    public LineItem(
           java.lang.Long orderId,
           java.lang.Long id,
           java.lang.String name,
           java.lang.String externalId,
           java.lang.String orderName,
           com.google.api.ads.dfp.v201306.DateTime startDateTime,
           com.google.api.ads.dfp.v201306.StartDateTimeType startDateTimeType,
           com.google.api.ads.dfp.v201306.DateTime endDateTime,
           java.lang.Integer autoExtensionDays,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.v201306.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.v201306.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.v201306.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.v201306.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.v201306.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.dfp.v201306.UnitType unitType,
           com.google.api.ads.dfp.v201306.LineItemSummaryDuration duration,
           java.lang.Long unitsBought,
           com.google.api.ads.dfp.v201306.Money costPerUnit,
           com.google.api.ads.dfp.v201306.Money valueCostPerUnit,
           com.google.api.ads.dfp.v201306.CostType costType,
           com.google.api.ads.dfp.v201306.LineItemDiscountType discountType,
           java.lang.Double discount,
           java.lang.Long contractedUnitsBought,
           com.google.api.ads.dfp.v201306.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.v201306.TargetPlatform targetPlatform,
           com.google.api.ads.dfp.v201306.EnvironmentType environmentType,
           com.google.api.ads.dfp.v201306.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.v201306.CreativePersistenceType creativePersistenceType,
           java.lang.Boolean allowOverbook,
           java.lang.Boolean skipInventoryCheck,
           java.lang.Boolean reserveAtCreation,
           com.google.api.ads.dfp.v201306.Stats stats,
           com.google.api.ads.dfp.v201306.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.v201306.DeliveryData deliveryData,
           com.google.api.ads.dfp.v201306.Money budget,
           com.google.api.ads.dfp.v201306.ComputedStatus status,
           com.google.api.ads.dfp.v201306.LineItemSummaryReservationStatus reservationStatus,
           java.lang.Boolean isArchived,
           java.lang.String webPropertyCode,
           com.google.api.ads.dfp.v201306.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.v201306.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Boolean disableSameAdvertiserCompetitiveExclusion,
           java.lang.String lastModifiedByApp,
           java.lang.String notes,
           com.google.api.ads.dfp.v201306.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.v201306.DateTime creationDateTime,
           com.google.api.ads.dfp.v201306.BaseCustomFieldValue[] customFieldValues,
           java.lang.Boolean isMissingCreatives,
           java.lang.String lineItemSummaryType,
           com.google.api.ads.dfp.v201306.Targeting targeting) {
        super(
            orderId,
            id,
            name,
            externalId,
            orderName,
            startDateTime,
            startDateTimeType,
            endDateTime,
            autoExtensionDays,
            unlimitedEndDateTime,
            creativeRotationType,
            deliveryRateType,
            roadblockingType,
            frequencyCaps,
            lineItemType,
            priority,
            unitType,
            duration,
            unitsBought,
            costPerUnit,
            valueCostPerUnit,
            costType,
            discountType,
            discount,
            contractedUnitsBought,
            creativePlaceholders,
            targetPlatform,
            environmentType,
            companionDeliveryOption,
            creativePersistenceType,
            allowOverbook,
            skipInventoryCheck,
            reserveAtCreation,
            stats,
            deliveryIndicator,
            deliveryData,
            budget,
            status,
            reservationStatus,
            isArchived,
            webPropertyCode,
            appliedLabels,
            effectiveAppliedLabels,
            disableSameAdvertiserCompetitiveExclusion,
            lastModifiedByApp,
            notes,
            lastModifiedDateTime,
            creationDateTime,
            customFieldValues,
            isMissingCreatives,
            lineItemSummaryType);
        this.targeting = targeting;
    }


    /**
     * Gets the targeting value for this LineItem.
     * 
     * @return targeting   * Contains the targeting criteria for the ad campaign. This attribute
     * is
     *                     required.
     */
    public com.google.api.ads.dfp.v201306.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this LineItem.
     * 
     * @param targeting   * Contains the targeting criteria for the ad campaign. This attribute
     * is
     *                     required.
     */
    public void setTargeting(com.google.api.ads.dfp.v201306.Targeting targeting) {
        this.targeting = targeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItem)) return false;
        LineItem other = (LineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting())));
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
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Targeting"));
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
