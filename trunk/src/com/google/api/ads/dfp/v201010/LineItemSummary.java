/**
 * LineItemSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201010;


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

    /* The name of the {@link Order}. This value is read-only. */
    private java.lang.String orderName;

    /* The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future. */
    private com.google.api.ads.dfp.v201010.DateTime startDateTime;

    /* Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link LineItemSummary.StartType#USE_START_DATE_TIME}. */
    private com.google.api.ads.dfp.v201010.LineItemSummaryStartType startType;

    /* The date and time on which the {@code LineItem} stops serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. */
    private com.google.api.ads.dfp.v201010.DateTime endDateTime;

    /* Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}. */
    private java.lang.Boolean unlimitedEndDateTime;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.v201010.CreativeRotationType creativeRotationType;

    /* The strategy for delivering ads over the course of the line
     * item's
     *                 duration. This attribute is optional and defaults
     * to
     *                 {@link DeliveryRateType#EVENLY}. */
    private com.google.api.ads.dfp.v201010.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}. */
    private com.google.api.ads.dfp.v201010.RoadblockingType roadblockingType;

    /* The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional. */
    private com.google.api.ads.dfp.v201010.FrequencyCap[] frequencyCaps;

    /* Indicates the priority of a {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.v201010.LineItemType lineItemType;

    /* The unit with which the goal or cap of the {@code LineItem}
     * is defined. If
     *                 this attribute is not explicitly set, Google derives
     * this attribute from
     *                 {@link LineItem#costType}. If {@link LineItem#costType}
     * is {@link
     *                 CostType#CPC}, then {@link UnitType#CLICKS} is assumed,
     * otherwise {@link
     *                 UnitType#IMPRESSIONS} is assumed. */
    private com.google.api.ads.dfp.v201010.UnitType unitType;

    /* The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. For each line
     * item type, the
     *                 following are the valid and default values:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th> <th scope="col">Default duration value</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP SPONSORSHIP}</td>
     * <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK NETWORK}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK BULK}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY PRICE_PRIORITY}</td>
     * <td>{@link Duration#DAILY DAILY},
     *                 {@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE HOUSE}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 </table> */
    private com.google.api.ads.dfp.v201010.LineItemSummaryDuration duration;

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
    private com.google.api.ads.dfp.v201010.Money costPerUnit;

    /* An amount to help the adserver rank inventory. {@link
     *                 LineItemSummary#valueCostPerUnit} artificially raises
     * the value of
     *                 inventory over the {@link LineItemSummary#costPerUnit}
     * but avoids raising
     *                 the actual {@link LineItemSummary#costPerUnit}. This
     * attribute is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0. */
    private com.google.api.ads.dfp.v201010.Money valueCostPerUnit;

    /* The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required. */
    private com.google.api.ads.dfp.v201010.CostType costType;

    /* The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}. */
    private com.google.api.ads.dfp.v201010.LineItemDiscountType discountType;

    /* The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported. */
    private java.lang.Double discount;

    /* The set of sizes the {@code LineItem} contains or might contain
     * in the future. This attribute is required. */
    private com.google.api.ads.dfp.v201010.Size[] creativeSizes;

    /* The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. The default value is false. */
    private java.lang.Boolean allowOverbook;

    /* Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet. */
    private com.google.api.ads.dfp.v201010.Stats stats;

    /* Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol> */
    private com.google.api.ads.dfp.v201010.DeliveryIndicator deliveryIndicator;

    /* Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItemSummary#deliveryIndicator} should be
     * used to its track
     *                 progress in this case.</li> */
    private com.google.api.ads.dfp.v201010.DeliveryData deliveryData;

    /* The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. */
    private com.google.api.ads.dfp.v201010.Money budget;

    /* The status of the {@code LineItem}. This attribute is readonly. */
    private com.google.api.ads.dfp.v201010.ComputedStatus status;

    /* Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google. */
    private com.google.api.ads.dfp.v201010.LineItemSummaryReservationStatus reservationStatus;

    /* The archival status of the {@code Order}. This attribute is
     * readonly. */
    private java.lang.Boolean isArchived;

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
           java.lang.String orderName,
           com.google.api.ads.dfp.v201010.DateTime startDateTime,
           com.google.api.ads.dfp.v201010.LineItemSummaryStartType startType,
           com.google.api.ads.dfp.v201010.DateTime endDateTime,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.v201010.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.v201010.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.v201010.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.v201010.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.v201010.LineItemType lineItemType,
           com.google.api.ads.dfp.v201010.UnitType unitType,
           com.google.api.ads.dfp.v201010.LineItemSummaryDuration duration,
           java.lang.Long unitsBought,
           com.google.api.ads.dfp.v201010.Money costPerUnit,
           com.google.api.ads.dfp.v201010.Money valueCostPerUnit,
           com.google.api.ads.dfp.v201010.CostType costType,
           com.google.api.ads.dfp.v201010.LineItemDiscountType discountType,
           java.lang.Double discount,
           com.google.api.ads.dfp.v201010.Size[] creativeSizes,
           java.lang.Boolean allowOverbook,
           com.google.api.ads.dfp.v201010.Stats stats,
           com.google.api.ads.dfp.v201010.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.v201010.DeliveryData deliveryData,
           com.google.api.ads.dfp.v201010.Money budget,
           com.google.api.ads.dfp.v201010.ComputedStatus status,
           com.google.api.ads.dfp.v201010.LineItemSummaryReservationStatus reservationStatus,
           java.lang.Boolean isArchived,
           java.lang.String lineItemSummaryType) {
           this.orderId = orderId;
           this.id = id;
           this.name = name;
           this.orderName = orderName;
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
           this.stats = stats;
           this.deliveryIndicator = deliveryIndicator;
           this.deliveryData = deliveryData;
           this.budget = budget;
           this.status = status;
           this.reservationStatus = reservationStatus;
           this.isArchived = isArchived;
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
     * Gets the orderName value for this LineItemSummary.
     * 
     * @return orderName   * The name of the {@link Order}. This value is read-only.
     */
    public java.lang.String getOrderName() {
        return orderName;
    }


    /**
     * Sets the orderName value for this LineItemSummary.
     * 
     * @param orderName   * The name of the {@link Order}. This value is read-only.
     */
    public void setOrderName(java.lang.String orderName) {
        this.orderName = orderName;
    }


    /**
     * Gets the startDateTime value for this LineItemSummary.
     * 
     * @return startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future.
     */
    public com.google.api.ads.dfp.v201010.DateTime getStartDateTime() {
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
    public void setStartDateTime(com.google.api.ads.dfp.v201010.DateTime startDateTime) {
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
    public com.google.api.ads.dfp.v201010.LineItemSummaryStartType getStartType() {
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
    public void setStartType(com.google.api.ads.dfp.v201010.LineItemSummaryStartType startType) {
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
    public com.google.api.ads.dfp.v201010.DateTime getEndDateTime() {
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
    public void setEndDateTime(com.google.api.ads.dfp.v201010.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @return unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}.
     */
    public java.lang.Boolean getUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }


    /**
     * Sets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @param unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}.
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
    public com.google.api.ads.dfp.v201010.CreativeRotationType getCreativeRotationType() {
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
    public void setCreativeRotationType(com.google.api.ads.dfp.v201010.CreativeRotationType creativeRotationType) {
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
    public com.google.api.ads.dfp.v201010.DeliveryRateType getDeliveryRateType() {
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
    public void setDeliveryRateType(com.google.api.ads.dfp.v201010.DeliveryRateType deliveryRateType) {
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
    public com.google.api.ads.dfp.v201010.RoadblockingType getRoadblockingType() {
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
    public void setRoadblockingType(com.google.api.ads.dfp.v201010.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the frequencyCaps value for this LineItemSummary.
     * 
     * @return frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
     */
    public com.google.api.ads.dfp.v201010.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this LineItemSummary.
     * 
     * @param frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
     */
    public void setFrequencyCaps(com.google.api.ads.dfp.v201010.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.v201010.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.v201010.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the lineItemType value for this LineItemSummary.
     * 
     * @return lineItemType   * Indicates the priority of a {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.v201010.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this LineItemSummary.
     * 
     * @param lineItemType   * Indicates the priority of a {@code LineItem}. This attribute
     * is required.
     */
    public void setLineItemType(com.google.api.ads.dfp.v201010.LineItemType lineItemType) {
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
    public com.google.api.ads.dfp.v201010.UnitType getUnitType() {
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
    public void setUnitType(com.google.api.ads.dfp.v201010.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the duration value for this LineItemSummary.
     * 
     * @return duration   * The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. For each line
     * item type, the
     *                 following are the valid and default values:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th> <th scope="col">Default duration value</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP SPONSORSHIP}</td>
     * <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK NETWORK}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK BULK}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY PRICE_PRIORITY}</td>
     * <td>{@link Duration#DAILY DAILY},
     *                 {@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE HOUSE}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 </table>
     */
    public com.google.api.ads.dfp.v201010.LineItemSummaryDuration getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this LineItemSummary.
     * 
     * @param duration   * The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. For each line
     * item type, the
     *                 following are the valid and default values:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th> <th scope="col">Default duration value</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP SPONSORSHIP}</td>
     * <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK NETWORK}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK BULK}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY PRICE_PRIORITY}</td>
     * <td>{@link Duration#DAILY DAILY},
     *                 {@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE HOUSE}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 </table>
     */
    public void setDuration(com.google.api.ads.dfp.v201010.LineItemSummaryDuration duration) {
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
    public com.google.api.ads.dfp.v201010.Money getCostPerUnit() {
        return costPerUnit;
    }


    /**
     * Sets the costPerUnit value for this LineItemSummary.
     * 
     * @param costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}.
     */
    public void setCostPerUnit(com.google.api.ads.dfp.v201010.Money costPerUnit) {
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
    public com.google.api.ads.dfp.v201010.Money getValueCostPerUnit() {
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
    public void setValueCostPerUnit(com.google.api.ads.dfp.v201010.Money valueCostPerUnit) {
        this.valueCostPerUnit = valueCostPerUnit;
    }


    /**
     * Gets the costType value for this LineItemSummary.
     * 
     * @return costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public com.google.api.ads.dfp.v201010.CostType getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this LineItemSummary.
     * 
     * @param costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public void setCostType(com.google.api.ads.dfp.v201010.CostType costType) {
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
    public com.google.api.ads.dfp.v201010.LineItemDiscountType getDiscountType() {
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
    public void setDiscountType(com.google.api.ads.dfp.v201010.LineItemDiscountType discountType) {
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
     * @return creativeSizes   * The set of sizes the {@code LineItem} contains or might contain
     * in the future. This attribute is required.
     */
    public com.google.api.ads.dfp.v201010.Size[] getCreativeSizes() {
        return creativeSizes;
    }


    /**
     * Sets the creativeSizes value for this LineItemSummary.
     * 
     * @param creativeSizes   * The set of sizes the {@code LineItem} contains or might contain
     * in the future. This attribute is required.
     */
    public void setCreativeSizes(com.google.api.ads.dfp.v201010.Size[] creativeSizes) {
        this.creativeSizes = creativeSizes;
    }

    public com.google.api.ads.dfp.v201010.Size getCreativeSizes(int i) {
        return this.creativeSizes[i];
    }

    public void setCreativeSizes(int i, com.google.api.ads.dfp.v201010.Size _value) {
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
     * Gets the stats value for this LineItemSummary.
     * 
     * @return stats   * Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet.
     */
    public com.google.api.ads.dfp.v201010.Stats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this LineItemSummary.
     * 
     * @param stats   * Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet.
     */
    public void setStats(com.google.api.ads.dfp.v201010.Stats stats) {
        this.stats = stats;
    }


    /**
     * Gets the deliveryIndicator value for this LineItemSummary.
     * 
     * @return deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public com.google.api.ads.dfp.v201010.DeliveryIndicator getDeliveryIndicator() {
        return deliveryIndicator;
    }


    /**
     * Sets the deliveryIndicator value for this LineItemSummary.
     * 
     * @param deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public void setDeliveryIndicator(com.google.api.ads.dfp.v201010.DeliveryIndicator deliveryIndicator) {
        this.deliveryIndicator = deliveryIndicator;
    }


    /**
     * Gets the deliveryData value for this LineItemSummary.
     * 
     * @return deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItemSummary#deliveryIndicator} should be
     * used to its track
     *                 progress in this case.</li>
     */
    public com.google.api.ads.dfp.v201010.DeliveryData getDeliveryData() {
        return deliveryData;
    }


    /**
     * Sets the deliveryData value for this LineItemSummary.
     * 
     * @param deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItemSummary#deliveryIndicator} should be
     * used to its track
     *                 progress in this case.</li>
     */
    public void setDeliveryData(com.google.api.ads.dfp.v201010.DeliveryData deliveryData) {
        this.deliveryData = deliveryData;
    }


    /**
     * Gets the budget value for this LineItemSummary.
     * 
     * @return budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google.
     */
    public com.google.api.ads.dfp.v201010.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this LineItemSummary.
     * 
     * @param budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google.
     */
    public void setBudget(com.google.api.ads.dfp.v201010.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the status value for this LineItemSummary.
     * 
     * @return status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public com.google.api.ads.dfp.v201010.ComputedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItemSummary.
     * 
     * @param status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.v201010.ComputedStatus status) {
        this.status = status;
    }


    /**
     * Gets the reservationStatus value for this LineItemSummary.
     * 
     * @return reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public com.google.api.ads.dfp.v201010.LineItemSummaryReservationStatus getReservationStatus() {
        return reservationStatus;
    }


    /**
     * Sets the reservationStatus value for this LineItemSummary.
     * 
     * @param reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public void setReservationStatus(com.google.api.ads.dfp.v201010.LineItemSummaryReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }


    /**
     * Gets the isArchived value for this LineItemSummary.
     * 
     * @return isArchived   * The archival status of the {@code Order}. This attribute is
     * readonly.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this LineItemSummary.
     * 
     * @param isArchived   * The archival status of the {@code Order}. This attribute is
     * readonly.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
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
            ((this.orderName==null && other.getOrderName()==null) || 
             (this.orderName!=null &&
              this.orderName.equals(other.getOrderName()))) &&
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
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.deliveryIndicator==null && other.getDeliveryIndicator()==null) || 
             (this.deliveryIndicator!=null &&
              this.deliveryIndicator.equals(other.getDeliveryIndicator()))) &&
            ((this.deliveryData==null && other.getDeliveryData()==null) || 
             (this.deliveryData!=null &&
              this.deliveryData.equals(other.getDeliveryData()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.reservationStatus==null && other.getReservationStatus()==null) || 
             (this.reservationStatus!=null &&
              this.reservationStatus.equals(other.getReservationStatus()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
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
        if (getOrderName() != null) {
            _hashCode += getOrderName().hashCode();
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
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getDeliveryIndicator() != null) {
            _hashCode += getDeliveryIndicator().hashCode();
        }
        if (getDeliveryData() != null) {
            _hashCode += getDeliveryData().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getReservationStatus() != null) {
            _hashCode += getReservationStatus().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "LineItemSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "orderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "startType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "LineItemSummary.StartType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "unlimitedEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "UnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "LineItemSummary.Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "unitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueCostPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "valueCostPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "costType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "CostType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "discountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "LineItemDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "creativeSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverbook");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "allowOverbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "Stats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "deliveryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "DeliveryIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "deliveryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "DeliveryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "reservationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "LineItemSummary.ReservationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemSummaryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201010", "LineItemSummary.Type"));
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
