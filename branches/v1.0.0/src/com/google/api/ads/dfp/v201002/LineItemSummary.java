/**
 * LineItemSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;


/**
 * The {@code LineItemSummary} represents the base class from which
 * a {@code
 *             LineItem} is derived.
 */
public class LineItemSummary  implements java.io.Serializable {
    /* The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required. */
    private java.lang.Long orderId;

    /* Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created. */
    private java.lang.Long id;

    /* The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 127 characters. */
    private java.lang.String name;

    /* The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future. */
    private com.google.api.ads.dfp.v201002.DateTime startDateTime;

    /* Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link LineItemSummary.StartType#USE_START_DATE_TIME}. */
    private com.google.api.ads.dfp.v201002.LineItemSummaryStartType startType;

    /* The date and time on which the {@code LineItem} stops serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. */
    private com.google.api.ads.dfp.v201002.DateTime endDateTime;

    /* Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. */
    private java.lang.Boolean unlimitedEndDateTime;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.v201002.CreativeRotationType creativeRotationType;

    /* The strategy for delivering ads over the course of the line
     * item's
     *                 duration. This attribute is optional and defaults
     * to
     *                 {@link DeliveryRateType#EVENLY}. */
    private com.google.api.ads.dfp.v201002.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}. */
    private com.google.api.ads.dfp.v201002.RoadblockingType roadblockingType;

    /* The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional. */
    private com.google.api.ads.dfp.v201002.FrequencyCap[] frequencyCaps;

    /* Indicates the priority of a {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.v201002.LineItemType lineItemType;

    /* The unit with which the goal or cap of the {@code LineItem}
     * is defined. If
     *                 this attribute is not explicitly set, Google derives
     * this attribute from
     *                 {@link LineItem#costType}. If {@link LineItem#costType}
     * is {@link
     *                 CostType#CPC}, then {@link UnitType#CLICKS} is assumed,
     * otherwise {@link
     *                 UnitType#IMPRESSIONS} is assumed. */
    private com.google.api.ads.dfp.v201002.UnitType unitType;

    /* The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. The following
     * durations are allowed
     *                 for each line item type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>{@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>{@link Duration#DAILY},
     *                 {@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 </table> */
    private com.google.api.ads.dfp.v201002.LineItemSummaryDuration duration;

    /* The total number of impressions or clicks that will be reserved
     * for the
     *                 {@code LineItem}. If the line item is of type
     *                 {@link LineItemType#SPONSORSHIP}, then it represents
     * the percentage of
     *                 available impressions reserved. This attribute is
     * required. */
    private java.lang.Long unitsBought;

    /* The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}. */
    private com.google.api.ads.dfp.v201002.Money costPerUnit;

    /* An amount to help the adserver rank inventory. {@link
     *                 LineItemSummary#valueCostPerUnit} artificially raises
     * the value of
     *                 inventory over the {@link LineItemSummary#costPerUnit}
     * but avoids raising
     *                 the actual {@link LineItemSummary#costPerUnit}. This
     * attribute is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0. */
    private com.google.api.ads.dfp.v201002.Money valueCostPerUnit;

    /* The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required. */
    private com.google.api.ads.dfp.v201002.CostType costType;

    /* The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}. */
    private com.google.api.ads.dfp.v201002.LineItemDiscountType discountType;

    /* The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported. */
    private java.lang.Double discount;

    /* All sizes of creatives that the {@code LineItem} contains or
     * might contain
     *                 in the future. This attribute is required. */
    private com.google.api.ads.dfp.v201002.Size[] creativeSizes;

    /* The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. The default value is false. */
    private java.lang.Boolean allowOverbook;

    /* The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. */
    private com.google.api.ads.dfp.v201002.Money budget;

    /* The status of the {@code LineItem}. This attribute is readonly. */
    private com.google.api.ads.dfp.v201002.ComputedStatus status;

    /* Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google. */
    private com.google.api.ads.dfp.v201002.LineItemInventoryStatus inventoryStatus;

    /* This field indicates the subtype of LineItemSummary of this
     * instance.  It is ignored
     *                 on input, and instead xsi:type should be specified. */
    private java.lang.String lineItemSummaryType;

    public LineItemSummary() {
    }

    public LineItemSummary(
           java.lang.Long orderId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201002.DateTime startDateTime,
           com.google.api.ads.dfp.v201002.LineItemSummaryStartType startType,
           com.google.api.ads.dfp.v201002.DateTime endDateTime,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.v201002.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.v201002.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.v201002.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.v201002.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.v201002.LineItemType lineItemType,
           com.google.api.ads.dfp.v201002.UnitType unitType,
           com.google.api.ads.dfp.v201002.LineItemSummaryDuration duration,
           java.lang.Long unitsBought,
           com.google.api.ads.dfp.v201002.Money costPerUnit,
           com.google.api.ads.dfp.v201002.Money valueCostPerUnit,
           com.google.api.ads.dfp.v201002.CostType costType,
           com.google.api.ads.dfp.v201002.LineItemDiscountType discountType,
           java.lang.Double discount,
           com.google.api.ads.dfp.v201002.Size[] creativeSizes,
           java.lang.Boolean allowOverbook,
           com.google.api.ads.dfp.v201002.Money budget,
           com.google.api.ads.dfp.v201002.ComputedStatus status,
           com.google.api.ads.dfp.v201002.LineItemInventoryStatus inventoryStatus,
           java.lang.String lineItemSummaryType) {
           this.orderId = orderId;
           this.id = id;
           this.name = name;
           this.startDateTime = startDateTime;
           this.startType = startType;
           this.endDateTime = endDateTime;
           this.unlimitedEndDateTime = unlimitedEndDateTime;
           this.creativeRotationType = creativeRotationType;
           this.deliveryRateType = deliveryRateType;
           this.roadblockingType = roadblockingType;
           this.frequencyCaps = frequencyCaps;
           this.lineItemType = lineItemType;
           this.unitType = unitType;
           this.duration = duration;
           this.unitsBought = unitsBought;
           this.costPerUnit = costPerUnit;
           this.valueCostPerUnit = valueCostPerUnit;
           this.costType = costType;
           this.discountType = discountType;
           this.discount = discount;
           this.creativeSizes = creativeSizes;
           this.allowOverbook = allowOverbook;
           this.budget = budget;
           this.status = status;
           this.inventoryStatus = inventoryStatus;
           this.lineItemSummaryType = lineItemSummaryType;
    }


    /**
     * Gets the orderId value for this LineItemSummary.
     * 
     * @return orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this LineItemSummary.
     * 
     * @param orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the id value for this LineItemSummary.
     * 
     * @return id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LineItemSummary.
     * 
     * @param id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LineItemSummary.
     * 
     * @return name   * The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 127 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LineItemSummary.
     * 
     * @param name   * The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 127 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDateTime value for this LineItemSummary.
     * 
     * @return startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future.
     */
    public com.google.api.ads.dfp.v201002.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this LineItemSummary.
     * 
     * @param startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future.
     */
    public void setStartDateTime(com.google.api.ads.dfp.v201002.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startType value for this LineItemSummary.
     * 
     * @return startType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link LineItemSummary.StartType#USE_START_DATE_TIME}.
     */
    public com.google.api.ads.dfp.v201002.LineItemSummaryStartType getStartType() {
        return startType;
    }


    /**
     * Sets the startType value for this LineItemSummary.
     * 
     * @param startType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link LineItemSummary.StartType#USE_START_DATE_TIME}.
     */
    public void setStartType(com.google.api.ads.dfp.v201002.LineItemSummaryStartType startType) {
        this.startType = startType;
    }


    /**
     * Gets the endDateTime value for this LineItemSummary.
     * 
     * @return endDateTime   * The date and time on which the {@code LineItem} stops serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}.
     */
    public com.google.api.ads.dfp.v201002.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this LineItemSummary.
     * 
     * @param endDateTime   * The date and time on which the {@code LineItem} stops serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}.
     */
    public void setEndDateTime(com.google.api.ads.dfp.v201002.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @return unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false.
     */
    public java.lang.Boolean getUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }


    /**
     * Sets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @param unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false.
     */
    public void setUnlimitedEndDateTime(java.lang.Boolean unlimitedEndDateTime) {
        this.unlimitedEndDateTime = unlimitedEndDateTime;
    }


    /**
     * Gets the creativeRotationType value for this LineItemSummary.
     * 
     * @return creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.v201002.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this LineItemSummary.
     * 
     * @param creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required.
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.v201002.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }


    /**
     * Gets the deliveryRateType value for this LineItemSummary.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's
     *                 duration. This attribute is optional and defaults
     * to
     *                 {@link DeliveryRateType#EVENLY}.
     */
    public com.google.api.ads.dfp.v201002.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this LineItemSummary.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's
     *                 duration. This attribute is optional and defaults
     * to
     *                 {@link DeliveryRateType#EVENLY}.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.v201002.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the roadblockingType value for this LineItemSummary.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}.
     */
    public com.google.api.ads.dfp.v201002.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this LineItemSummary.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.v201002.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the frequencyCaps value for this LineItemSummary.
     * 
     * @return frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
     */
    public com.google.api.ads.dfp.v201002.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this LineItemSummary.
     * 
     * @param frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
     */
    public void setFrequencyCaps(com.google.api.ads.dfp.v201002.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.v201002.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.v201002.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the lineItemType value for this LineItemSummary.
     * 
     * @return lineItemType   * Indicates the priority of a {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.v201002.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this LineItemSummary.
     * 
     * @param lineItemType   * Indicates the priority of a {@code LineItem}. This attribute
     * is required.
     */
    public void setLineItemType(com.google.api.ads.dfp.v201002.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the unitType value for this LineItemSummary.
     * 
     * @return unitType   * The unit with which the goal or cap of the {@code LineItem}
     * is defined. If
     *                 this attribute is not explicitly set, Google derives
     * this attribute from
     *                 {@link LineItem#costType}. If {@link LineItem#costType}
     * is {@link
     *                 CostType#CPC}, then {@link UnitType#CLICKS} is assumed,
     * otherwise {@link
     *                 UnitType#IMPRESSIONS} is assumed.
     */
    public com.google.api.ads.dfp.v201002.UnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this LineItemSummary.
     * 
     * @param unitType   * The unit with which the goal or cap of the {@code LineItem}
     * is defined. If
     *                 this attribute is not explicitly set, Google derives
     * this attribute from
     *                 {@link LineItem#costType}. If {@link LineItem#costType}
     * is {@link
     *                 CostType#CPC}, then {@link UnitType#CLICKS} is assumed,
     * otherwise {@link
     *                 UnitType#IMPRESSIONS} is assumed.
     */
    public void setUnitType(com.google.api.ads.dfp.v201002.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the duration value for this LineItemSummary.
     * 
     * @return duration   * The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. The following
     * durations are allowed
     *                 for each line item type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>{@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>{@link Duration#DAILY},
     *                 {@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 </table>
     */
    public com.google.api.ads.dfp.v201002.LineItemSummaryDuration getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this LineItemSummary.
     * 
     * @param duration   * The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. The following
     * durations are allowed
     *                 for each line item type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>{@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>{@link Duration#DAILY},
     *                 {@link Duration#LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>{@link Duration#DAILY}</td>
     *                 </tr>
     *                 </table>
     */
    public void setDuration(com.google.api.ads.dfp.v201002.LineItemSummaryDuration duration) {
        this.duration = duration;
    }


    /**
     * Gets the unitsBought value for this LineItemSummary.
     * 
     * @return unitsBought   * The total number of impressions or clicks that will be reserved
     * for the
     *                 {@code LineItem}. If the line item is of type
     *                 {@link LineItemType#SPONSORSHIP}, then it represents
     * the percentage of
     *                 available impressions reserved. This attribute is
     * required.
     */
    public java.lang.Long getUnitsBought() {
        return unitsBought;
    }


    /**
     * Sets the unitsBought value for this LineItemSummary.
     * 
     * @param unitsBought   * The total number of impressions or clicks that will be reserved
     * for the
     *                 {@code LineItem}. If the line item is of type
     *                 {@link LineItemType#SPONSORSHIP}, then it represents
     * the percentage of
     *                 available impressions reserved. This attribute is
     * required.
     */
    public void setUnitsBought(java.lang.Long unitsBought) {
        this.unitsBought = unitsBought;
    }


    /**
     * Gets the costPerUnit value for this LineItemSummary.
     * 
     * @return costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}.
     */
    public com.google.api.ads.dfp.v201002.Money getCostPerUnit() {
        return costPerUnit;
    }


    /**
     * Sets the costPerUnit value for this LineItemSummary.
     * 
     * @param costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}.
     */
    public void setCostPerUnit(com.google.api.ads.dfp.v201002.Money costPerUnit) {
        this.costPerUnit = costPerUnit;
    }


    /**
     * Gets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @return valueCostPerUnit   * An amount to help the adserver rank inventory. {@link
     *                 LineItemSummary#valueCostPerUnit} artificially raises
     * the value of
     *                 inventory over the {@link LineItemSummary#costPerUnit}
     * but avoids raising
     *                 the actual {@link LineItemSummary#costPerUnit}. This
     * attribute is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0.
     */
    public com.google.api.ads.dfp.v201002.Money getValueCostPerUnit() {
        return valueCostPerUnit;
    }


    /**
     * Sets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @param valueCostPerUnit   * An amount to help the adserver rank inventory. {@link
     *                 LineItemSummary#valueCostPerUnit} artificially raises
     * the value of
     *                 inventory over the {@link LineItemSummary#costPerUnit}
     * but avoids raising
     *                 the actual {@link LineItemSummary#costPerUnit}. This
     * attribute is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0.
     */
    public void setValueCostPerUnit(com.google.api.ads.dfp.v201002.Money valueCostPerUnit) {
        this.valueCostPerUnit = valueCostPerUnit;
    }


    /**
     * Gets the costType value for this LineItemSummary.
     * 
     * @return costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public com.google.api.ads.dfp.v201002.CostType getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this LineItemSummary.
     * 
     * @param costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public void setCostType(com.google.api.ads.dfp.v201002.CostType costType) {
        this.costType = costType;
    }


    /**
     * Gets the discountType value for this LineItemSummary.
     * 
     * @return discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}.
     */
    public com.google.api.ads.dfp.v201002.LineItemDiscountType getDiscountType() {
        return discountType;
    }


    /**
     * Sets the discountType value for this LineItemSummary.
     * 
     * @param discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}.
     */
    public void setDiscountType(com.google.api.ads.dfp.v201002.LineItemDiscountType discountType) {
        this.discountType = discountType;
    }


    /**
     * Gets the discount value for this LineItemSummary.
     * 
     * @return discount   * The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported.
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this LineItemSummary.
     * 
     * @param discount   * The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported.
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the creativeSizes value for this LineItemSummary.
     * 
     * @return creativeSizes   * All sizes of creatives that the {@code LineItem} contains or
     * might contain
     *                 in the future. This attribute is required.
     */
    public com.google.api.ads.dfp.v201002.Size[] getCreativeSizes() {
        return creativeSizes;
    }


    /**
     * Sets the creativeSizes value for this LineItemSummary.
     * 
     * @param creativeSizes   * All sizes of creatives that the {@code LineItem} contains or
     * might contain
     *                 in the future. This attribute is required.
     */
    public void setCreativeSizes(com.google.api.ads.dfp.v201002.Size[] creativeSizes) {
        this.creativeSizes = creativeSizes;
    }

    public com.google.api.ads.dfp.v201002.Size getCreativeSizes(int i) {
        return this.creativeSizes[i];
    }

    public void setCreativeSizes(int i, com.google.api.ads.dfp.v201002.Size _value) {
        this.creativeSizes[i] = _value;
    }


    /**
     * Gets the allowOverbook value for this LineItemSummary.
     * 
     * @return allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. The default value is false.
     */
    public java.lang.Boolean getAllowOverbook() {
        return allowOverbook;
    }


    /**
     * Sets the allowOverbook value for this LineItemSummary.
     * 
     * @param allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. The default value is false.
     */
    public void setAllowOverbook(java.lang.Boolean allowOverbook) {
        this.allowOverbook = allowOverbook;
    }


    /**
     * Gets the budget value for this LineItemSummary.
     * 
     * @return budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google.
     */
    public com.google.api.ads.dfp.v201002.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this LineItemSummary.
     * 
     * @param budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google.
     */
    public void setBudget(com.google.api.ads.dfp.v201002.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the status value for this LineItemSummary.
     * 
     * @return status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public com.google.api.ads.dfp.v201002.ComputedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItemSummary.
     * 
     * @param status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.v201002.ComputedStatus status) {
        this.status = status;
    }


    /**
     * Gets the inventoryStatus value for this LineItemSummary.
     * 
     * @return inventoryStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public com.google.api.ads.dfp.v201002.LineItemInventoryStatus getInventoryStatus() {
        return inventoryStatus;
    }


    /**
     * Sets the inventoryStatus value for this LineItemSummary.
     * 
     * @param inventoryStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public void setInventoryStatus(com.google.api.ads.dfp.v201002.LineItemInventoryStatus inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }


    /**
     * Gets the lineItemSummaryType value for this LineItemSummary.
     * 
     * @return lineItemSummaryType   * This field indicates the subtype of LineItemSummary of this
     * instance.  It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public java.lang.String getLineItemSummaryType() {
        return lineItemSummaryType;
    }


    /**
     * Sets the lineItemSummaryType value for this LineItemSummary.
     * 
     * @param lineItemSummaryType   * This field indicates the subtype of LineItemSummary of this
     * instance.  It is ignored
     *                 on input, and instead xsi:type should be specified.
     */
    public void setLineItemSummaryType(java.lang.String lineItemSummaryType) {
        this.lineItemSummaryType = lineItemSummaryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemSummary)) return false;
        LineItemSummary other = (LineItemSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startType==null && other.getStartType()==null) || 
             (this.startType!=null &&
              this.startType.equals(other.getStartType()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.unlimitedEndDateTime==null && other.getUnlimitedEndDateTime()==null) || 
             (this.unlimitedEndDateTime!=null &&
              this.unlimitedEndDateTime.equals(other.getUnlimitedEndDateTime()))) &&
            ((this.creativeRotationType==null && other.getCreativeRotationType()==null) || 
             (this.creativeRotationType!=null &&
              this.creativeRotationType.equals(other.getCreativeRotationType()))) &&
            ((this.deliveryRateType==null && other.getDeliveryRateType()==null) || 
             (this.deliveryRateType!=null &&
              this.deliveryRateType.equals(other.getDeliveryRateType()))) &&
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
            ((this.frequencyCaps==null && other.getFrequencyCaps()==null) || 
             (this.frequencyCaps!=null &&
              java.util.Arrays.equals(this.frequencyCaps, other.getFrequencyCaps()))) &&
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.unitsBought==null && other.getUnitsBought()==null) || 
             (this.unitsBought!=null &&
              this.unitsBought.equals(other.getUnitsBought()))) &&
            ((this.costPerUnit==null && other.getCostPerUnit()==null) || 
             (this.costPerUnit!=null &&
              this.costPerUnit.equals(other.getCostPerUnit()))) &&
            ((this.valueCostPerUnit==null && other.getValueCostPerUnit()==null) || 
             (this.valueCostPerUnit!=null &&
              this.valueCostPerUnit.equals(other.getValueCostPerUnit()))) &&
            ((this.costType==null && other.getCostType()==null) || 
             (this.costType!=null &&
              this.costType.equals(other.getCostType()))) &&
            ((this.discountType==null && other.getDiscountType()==null) || 
             (this.discountType!=null &&
              this.discountType.equals(other.getDiscountType()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.creativeSizes==null && other.getCreativeSizes()==null) || 
             (this.creativeSizes!=null &&
              java.util.Arrays.equals(this.creativeSizes, other.getCreativeSizes()))) &&
            ((this.allowOverbook==null && other.getAllowOverbook()==null) || 
             (this.allowOverbook!=null &&
              this.allowOverbook.equals(other.getAllowOverbook()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.inventoryStatus==null && other.getInventoryStatus()==null) || 
             (this.inventoryStatus!=null &&
              this.inventoryStatus.equals(other.getInventoryStatus()))) &&
            ((this.lineItemSummaryType==null && other.getLineItemSummaryType()==null) || 
             (this.lineItemSummaryType!=null &&
              this.lineItemSummaryType.equals(other.getLineItemSummaryType())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartType() != null) {
            _hashCode += getStartType().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getUnlimitedEndDateTime() != null) {
            _hashCode += getUnlimitedEndDateTime().hashCode();
        }
        if (getCreativeRotationType() != null) {
            _hashCode += getCreativeRotationType().hashCode();
        }
        if (getDeliveryRateType() != null) {
            _hashCode += getDeliveryRateType().hashCode();
        }
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
        }
        if (getFrequencyCaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequencyCaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequencyCaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getUnitsBought() != null) {
            _hashCode += getUnitsBought().hashCode();
        }
        if (getCostPerUnit() != null) {
            _hashCode += getCostPerUnit().hashCode();
        }
        if (getValueCostPerUnit() != null) {
            _hashCode += getValueCostPerUnit().hashCode();
        }
        if (getCostType() != null) {
            _hashCode += getCostType().hashCode();
        }
        if (getDiscountType() != null) {
            _hashCode += getDiscountType().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getCreativeSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeSizes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowOverbook() != null) {
            _hashCode += getAllowOverbook().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getInventoryStatus() != null) {
            _hashCode += getInventoryStatus().hashCode();
        }
        if (getLineItemSummaryType() != null) {
            _hashCode += getLineItemSummaryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "LineItemSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "startType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "LineItemSummary.StartType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "unlimitedEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "UnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "LineItemSummary.Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "unitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueCostPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "valueCostPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "costType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "CostType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "discountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "LineItemDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "creativeSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverbook");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "allowOverbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "inventoryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "LineItemInventoryStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemSummaryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "LineItemSummary.Type"));
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
