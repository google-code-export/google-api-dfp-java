/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201004;


/**
 * An {@code Order} represents a grouping of individual {@link LineItem}
 * objects, each of which fulfill an ad request from a particular advertiser.
 */
public class Order  implements java.io.Serializable {
    /* The unique ID of the {@code Order}. This value is readonly
     * and is assigned
     *                 by Google. */
    private java.lang.Long id;

    /* The name of the {@code Order}. This value is required to create
     * an order
     *                 and has a maximum length of 128 characters. */
    private java.lang.String name;

    /* The date and time at which the {@code Order} and its associated
     * line items
     *                 are eligible to begin serving. This attribute is readonly
     * and is derived
     *                 from the line item of the order which has the earliest
     * {@link LineItem#startDateTime}. */
    private com.google.api.ads.dfp.v201004.DateTime startDateTime;

    /* The date and time at which the {@code Order} and its associated
     * line items
     *                 stop being served. This attribute is readonly and
     * is derived from the line
     *                 item of the order which has the latest {@link LineItem#endDateTime}. */
    private com.google.api.ads.dfp.v201004.DateTime endDateTime;

    /* Specifies whether or not the {@code Order} has an unlimited
     * end date. This
     *                 attribute is readonly and is {@code true} if any of
     * the order's line items
     *                 has {@link LineItem#unlimitedEndDateTime} set to {@code
     * true}. */
    private java.lang.Boolean unlimitedEndDateTime;

    /* The status of the {@code Order}. This attribute is read-only. */
    private com.google.api.ads.dfp.v201004.OrderStatus status;

    /* The archival status of the {@code Order}. This attribute is
     * readonly. */
    private java.lang.Boolean isArchived;

    /* Provides any additional notes that may annotate the {@code
     * Order}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* An identifier for the {@code Order} that is meaningful to the
     * publisher.
     *                 This attribute is optional and has a maximum length
     * of 63 characters. */
    private java.lang.String externalId;

    /* The ISO currency code for the currency used by the {@code Order}.
     * This
     *                 value is optional and defaults to "USD". */
    private java.lang.String currencyCode;

    /* The unique ID of the {@link Company}, which is of type
     *                 {@link Company.Type#ADVERTISER}, to which this order
     * belongs. This
     *                 attribute is required. */
    private java.lang.Long advertiserId;

    /* The unique ID of the {@link User} who created the {@code Order}
     * on behalf
     *                 of the advertiser. This value is readonly and is assigned
     * by Google. */
    private java.lang.Long creatorId;

    /* The unique ID of the {@link User} responsible for trafficking
     * the {@code
     *                 Order}. This value is required for creating an order. */
    private java.lang.Long traffickerId;

    /* The unique ID of the {@link User} responsible for the sales
     * of the {@code
     *                 Order}. This value is optional. */
    private java.lang.Long salespersonId;

    /* Total impressions delivered for all line items of this {@code
     * Order}. This
     *                 value is read-only and is assigned by Google. */
    private java.lang.Long totalImpressionsDelivered;

    /* Total clicks delivered for all line items of this {@code Order}.
     * This value
     *                 is read-only and is assigned by Google. */
    private java.lang.Long totalClicksDelivered;

    /* Total budget for all line items of this {@code Order}. This
     * value is a
     *                 readonly field assigned by Google and is calculated
     * from the associated
     *                 {@link LineItem#costPerUnit} values. */
    private com.google.api.ads.dfp.v201004.Money totalBudget;

    public Order() {
    }

    public Order(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.v201004.DateTime startDateTime,
           com.google.api.ads.dfp.v201004.DateTime endDateTime,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.v201004.OrderStatus status,
           java.lang.Boolean isArchived,
           java.lang.String notes,
           java.lang.String externalId,
           java.lang.String currencyCode,
           java.lang.Long advertiserId,
           java.lang.Long creatorId,
           java.lang.Long traffickerId,
           java.lang.Long salespersonId,
           java.lang.Long totalImpressionsDelivered,
           java.lang.Long totalClicksDelivered,
           com.google.api.ads.dfp.v201004.Money totalBudget) {
           this.id = id;
           this.name = name;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.unlimitedEndDateTime = unlimitedEndDateTime;
           this.status = status;
           this.isArchived = isArchived;
           this.notes = notes;
           this.externalId = externalId;
           this.currencyCode = currencyCode;
           this.advertiserId = advertiserId;
           this.creatorId = creatorId;
           this.traffickerId = traffickerId;
           this.salespersonId = salespersonId;
           this.totalImpressionsDelivered = totalImpressionsDelivered;
           this.totalClicksDelivered = totalClicksDelivered;
           this.totalBudget = totalBudget;
    }


    /**
     * Gets the id value for this Order.
     * 
     * @return id   * The unique ID of the {@code Order}. This value is readonly
     * and is assigned
     *                 by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Order.
     * 
     * @param id   * The unique ID of the {@code Order}. This value is readonly
     * and is assigned
     *                 by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Order.
     * 
     * @return name   * The name of the {@code Order}. This value is required to create
     * an order
     *                 and has a maximum length of 128 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Order.
     * 
     * @param name   * The name of the {@code Order}. This value is required to create
     * an order
     *                 and has a maximum length of 128 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDateTime value for this Order.
     * 
     * @return startDateTime   * The date and time at which the {@code Order} and its associated
     * line items
     *                 are eligible to begin serving. This attribute is readonly
     * and is derived
     *                 from the line item of the order which has the earliest
     * {@link LineItem#startDateTime}.
     */
    public com.google.api.ads.dfp.v201004.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Order.
     * 
     * @param startDateTime   * The date and time at which the {@code Order} and its associated
     * line items
     *                 are eligible to begin serving. This attribute is readonly
     * and is derived
     *                 from the line item of the order which has the earliest
     * {@link LineItem#startDateTime}.
     */
    public void setStartDateTime(com.google.api.ads.dfp.v201004.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this Order.
     * 
     * @return endDateTime   * The date and time at which the {@code Order} and its associated
     * line items
     *                 stop being served. This attribute is readonly and
     * is derived from the line
     *                 item of the order which has the latest {@link LineItem#endDateTime}.
     */
    public com.google.api.ads.dfp.v201004.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Order.
     * 
     * @param endDateTime   * The date and time at which the {@code Order} and its associated
     * line items
     *                 stop being served. This attribute is readonly and
     * is derived from the line
     *                 item of the order which has the latest {@link LineItem#endDateTime}.
     */
    public void setEndDateTime(com.google.api.ads.dfp.v201004.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the unlimitedEndDateTime value for this Order.
     * 
     * @return unlimitedEndDateTime   * Specifies whether or not the {@code Order} has an unlimited
     * end date. This
     *                 attribute is readonly and is {@code true} if any of
     * the order's line items
     *                 has {@link LineItem#unlimitedEndDateTime} set to {@code
     * true}.
     */
    public java.lang.Boolean getUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }


    /**
     * Sets the unlimitedEndDateTime value for this Order.
     * 
     * @param unlimitedEndDateTime   * Specifies whether or not the {@code Order} has an unlimited
     * end date. This
     *                 attribute is readonly and is {@code true} if any of
     * the order's line items
     *                 has {@link LineItem#unlimitedEndDateTime} set to {@code
     * true}.
     */
    public void setUnlimitedEndDateTime(java.lang.Boolean unlimitedEndDateTime) {
        this.unlimitedEndDateTime = unlimitedEndDateTime;
    }


    /**
     * Gets the status value for this Order.
     * 
     * @return status   * The status of the {@code Order}. This attribute is read-only.
     */
    public com.google.api.ads.dfp.v201004.OrderStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Order.
     * 
     * @param status   * The status of the {@code Order}. This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.v201004.OrderStatus status) {
        this.status = status;
    }


    /**
     * Gets the isArchived value for this Order.
     * 
     * @return isArchived   * The archival status of the {@code Order}. This attribute is
     * readonly.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this Order.
     * 
     * @param isArchived   * The archival status of the {@code Order}. This attribute is
     * readonly.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the notes value for this Order.
     * 
     * @return notes   * Provides any additional notes that may annotate the {@code
     * Order}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Order.
     * 
     * @param notes   * Provides any additional notes that may annotate the {@code
     * Order}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the externalId value for this Order.
     * 
     * @return externalId   * An identifier for the {@code Order} that is meaningful to the
     * publisher.
     *                 This attribute is optional and has a maximum length
     * of 63 characters.
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Order.
     * 
     * @param externalId   * An identifier for the {@code Order} that is meaningful to the
     * publisher.
     *                 This attribute is optional and has a maximum length
     * of 63 characters.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the currencyCode value for this Order.
     * 
     * @return currencyCode   * The ISO currency code for the currency used by the {@code Order}.
     * This
     *                 value is optional and defaults to "USD".
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Order.
     * 
     * @param currencyCode   * The ISO currency code for the currency used by the {@code Order}.
     * This
     *                 value is optional and defaults to "USD".
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the advertiserId value for this Order.
     * 
     * @return advertiserId   * The unique ID of the {@link Company}, which is of type
     *                 {@link Company.Type#ADVERTISER}, to which this order
     * belongs. This
     *                 attribute is required.
     */
    public java.lang.Long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this Order.
     * 
     * @param advertiserId   * The unique ID of the {@link Company}, which is of type
     *                 {@link Company.Type#ADVERTISER}, to which this order
     * belongs. This
     *                 attribute is required.
     */
    public void setAdvertiserId(java.lang.Long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the creatorId value for this Order.
     * 
     * @return creatorId   * The unique ID of the {@link User} who created the {@code Order}
     * on behalf
     *                 of the advertiser. This value is readonly and is assigned
     * by Google.
     */
    public java.lang.Long getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this Order.
     * 
     * @param creatorId   * The unique ID of the {@link User} who created the {@code Order}
     * on behalf
     *                 of the advertiser. This value is readonly and is assigned
     * by Google.
     */
    public void setCreatorId(java.lang.Long creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the traffickerId value for this Order.
     * 
     * @return traffickerId   * The unique ID of the {@link User} responsible for trafficking
     * the {@code
     *                 Order}. This value is required for creating an order.
     */
    public java.lang.Long getTraffickerId() {
        return traffickerId;
    }


    /**
     * Sets the traffickerId value for this Order.
     * 
     * @param traffickerId   * The unique ID of the {@link User} responsible for trafficking
     * the {@code
     *                 Order}. This value is required for creating an order.
     */
    public void setTraffickerId(java.lang.Long traffickerId) {
        this.traffickerId = traffickerId;
    }


    /**
     * Gets the salespersonId value for this Order.
     * 
     * @return salespersonId   * The unique ID of the {@link User} responsible for the sales
     * of the {@code
     *                 Order}. This value is optional.
     */
    public java.lang.Long getSalespersonId() {
        return salespersonId;
    }


    /**
     * Sets the salespersonId value for this Order.
     * 
     * @param salespersonId   * The unique ID of the {@link User} responsible for the sales
     * of the {@code
     *                 Order}. This value is optional.
     */
    public void setSalespersonId(java.lang.Long salespersonId) {
        this.salespersonId = salespersonId;
    }


    /**
     * Gets the totalImpressionsDelivered value for this Order.
     * 
     * @return totalImpressionsDelivered   * Total impressions delivered for all line items of this {@code
     * Order}. This
     *                 value is read-only and is assigned by Google.
     */
    public java.lang.Long getTotalImpressionsDelivered() {
        return totalImpressionsDelivered;
    }


    /**
     * Sets the totalImpressionsDelivered value for this Order.
     * 
     * @param totalImpressionsDelivered   * Total impressions delivered for all line items of this {@code
     * Order}. This
     *                 value is read-only and is assigned by Google.
     */
    public void setTotalImpressionsDelivered(java.lang.Long totalImpressionsDelivered) {
        this.totalImpressionsDelivered = totalImpressionsDelivered;
    }


    /**
     * Gets the totalClicksDelivered value for this Order.
     * 
     * @return totalClicksDelivered   * Total clicks delivered for all line items of this {@code Order}.
     * This value
     *                 is read-only and is assigned by Google.
     */
    public java.lang.Long getTotalClicksDelivered() {
        return totalClicksDelivered;
    }


    /**
     * Sets the totalClicksDelivered value for this Order.
     * 
     * @param totalClicksDelivered   * Total clicks delivered for all line items of this {@code Order}.
     * This value
     *                 is read-only and is assigned by Google.
     */
    public void setTotalClicksDelivered(java.lang.Long totalClicksDelivered) {
        this.totalClicksDelivered = totalClicksDelivered;
    }


    /**
     * Gets the totalBudget value for this Order.
     * 
     * @return totalBudget   * Total budget for all line items of this {@code Order}. This
     * value is a
     *                 readonly field assigned by Google and is calculated
     * from the associated
     *                 {@link LineItem#costPerUnit} values.
     */
    public com.google.api.ads.dfp.v201004.Money getTotalBudget() {
        return totalBudget;
    }


    /**
     * Sets the totalBudget value for this Order.
     * 
     * @param totalBudget   * Total budget for all line items of this {@code Order}. This
     * value is a
     *                 readonly field assigned by Google and is calculated
     * from the associated
     *                 {@link LineItem#costPerUnit} values.
     */
    public void setTotalBudget(com.google.api.ads.dfp.v201004.Money totalBudget) {
        this.totalBudget = totalBudget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.unlimitedEndDateTime==null && other.getUnlimitedEndDateTime()==null) || 
             (this.unlimitedEndDateTime!=null &&
              this.unlimitedEndDateTime.equals(other.getUnlimitedEndDateTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.advertiserId==null && other.getAdvertiserId()==null) || 
             (this.advertiserId!=null &&
              this.advertiserId.equals(other.getAdvertiserId()))) &&
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
            ((this.traffickerId==null && other.getTraffickerId()==null) || 
             (this.traffickerId!=null &&
              this.traffickerId.equals(other.getTraffickerId()))) &&
            ((this.salespersonId==null && other.getSalespersonId()==null) || 
             (this.salespersonId!=null &&
              this.salespersonId.equals(other.getSalespersonId()))) &&
            ((this.totalImpressionsDelivered==null && other.getTotalImpressionsDelivered()==null) || 
             (this.totalImpressionsDelivered!=null &&
              this.totalImpressionsDelivered.equals(other.getTotalImpressionsDelivered()))) &&
            ((this.totalClicksDelivered==null && other.getTotalClicksDelivered()==null) || 
             (this.totalClicksDelivered!=null &&
              this.totalClicksDelivered.equals(other.getTotalClicksDelivered()))) &&
            ((this.totalBudget==null && other.getTotalBudget()==null) || 
             (this.totalBudget!=null &&
              this.totalBudget.equals(other.getTotalBudget())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getUnlimitedEndDateTime() != null) {
            _hashCode += getUnlimitedEndDateTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getAdvertiserId() != null) {
            _hashCode += getAdvertiserId().hashCode();
        }
        if (getCreatorId() != null) {
            _hashCode += getCreatorId().hashCode();
        }
        if (getTraffickerId() != null) {
            _hashCode += getTraffickerId().hashCode();
        }
        if (getSalespersonId() != null) {
            _hashCode += getSalespersonId().hashCode();
        }
        if (getTotalImpressionsDelivered() != null) {
            _hashCode += getTotalImpressionsDelivered().hashCode();
        }
        if (getTotalClicksDelivered() != null) {
            _hashCode += getTotalClicksDelivered().hashCode();
        }
        if (getTotalBudget() != null) {
            _hashCode += getTotalBudget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "Order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "unlimitedEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "OrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "creatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffickerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "traffickerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salespersonId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "salespersonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalImpressionsDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "totalImpressionsDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalClicksDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "totalClicksDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "totalBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201004", "Money"));
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
