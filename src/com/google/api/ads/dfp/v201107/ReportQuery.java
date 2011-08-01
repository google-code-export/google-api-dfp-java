/**
 * ReportQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201107;


/**
 * A {@code ReportQuery} object allows you to specify the selection
 * criteria for
 *             generating a report.
 */
public class ReportQuery  implements java.io.Serializable {
    /* The list of break-down types being requested in the report. */
    private com.google.api.ads.dfp.v201107.Dimension[] dimensions;

    /* The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. */
    private com.google.api.ads.dfp.v201107.Column[] columns;

    /* The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.dfp.v201107.Date startDate;

    /* The end date upto which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.dfp.v201107.Date endDate;

    /* The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {DateRangeType#CUSTOM_DATE}. If set to {DateRangeType#CUSTOM_DATE},
     * then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used. */
    private com.google.api.ads.dfp.v201107.DateRangeType dateRangeType;

    /* The restrictions that apply to {@link Dimension} objects. These
     * filters are
     *                 AND'ed together to produce the result. */
    private com.google.api.ads.dfp.v201107.DimensionFilter[] dimensionFilters;

    public ReportQuery() {
    }

    public ReportQuery(
           com.google.api.ads.dfp.v201107.Dimension[] dimensions,
           com.google.api.ads.dfp.v201107.Column[] columns,
           com.google.api.ads.dfp.v201107.Date startDate,
           com.google.api.ads.dfp.v201107.Date endDate,
           com.google.api.ads.dfp.v201107.DateRangeType dateRangeType,
           com.google.api.ads.dfp.v201107.DimensionFilter[] dimensionFilters) {
           this.dimensions = dimensions;
           this.columns = columns;
           this.startDate = startDate;
           this.endDate = endDate;
           this.dateRangeType = dateRangeType;
           this.dimensionFilters = dimensionFilters;
    }


    /**
     * Gets the dimensions value for this ReportQuery.
     * 
     * @return dimensions   * The list of break-down types being requested in the report.
     */
    public com.google.api.ads.dfp.v201107.Dimension[] getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this ReportQuery.
     * 
     * @param dimensions   * The list of break-down types being requested in the report.
     */
    public void setDimensions(com.google.api.ads.dfp.v201107.Dimension[] dimensions) {
        this.dimensions = dimensions;
    }

    public com.google.api.ads.dfp.v201107.Dimension getDimensions(int i) {
        return this.dimensions[i];
    }

    public void setDimensions(int i, com.google.api.ads.dfp.v201107.Dimension _value) {
        this.dimensions[i] = _value;
    }


    /**
     * Gets the columns value for this ReportQuery.
     * 
     * @return columns   * The list of trafficking statistics and revenue information
     * being requested
     *                 in the report.
     */
    public com.google.api.ads.dfp.v201107.Column[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this ReportQuery.
     * 
     * @param columns   * The list of trafficking statistics and revenue information
     * being requested
     *                 in the report.
     */
    public void setColumns(com.google.api.ads.dfp.v201107.Column[] columns) {
        this.columns = columns;
    }

    public com.google.api.ads.dfp.v201107.Column getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.google.api.ads.dfp.v201107.Column _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the startDate value for this ReportQuery.
     * 
     * @return startDate   * The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public com.google.api.ads.dfp.v201107.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ReportQuery.
     * 
     * @param startDate   * The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public void setStartDate(com.google.api.ads.dfp.v201107.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ReportQuery.
     * 
     * @return endDate   * The end date upto which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public com.google.api.ads.dfp.v201107.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ReportQuery.
     * 
     * @param endDate   * The end date upto which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public void setEndDate(com.google.api.ads.dfp.v201107.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the dateRangeType value for this ReportQuery.
     * 
     * @return dateRangeType   * The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {DateRangeType#CUSTOM_DATE}. If set to {DateRangeType#CUSTOM_DATE},
     * then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used.
     */
    public com.google.api.ads.dfp.v201107.DateRangeType getDateRangeType() {
        return dateRangeType;
    }


    /**
     * Sets the dateRangeType value for this ReportQuery.
     * 
     * @param dateRangeType   * The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {DateRangeType#CUSTOM_DATE}. If set to {DateRangeType#CUSTOM_DATE},
     * then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used.
     */
    public void setDateRangeType(com.google.api.ads.dfp.v201107.DateRangeType dateRangeType) {
        this.dateRangeType = dateRangeType;
    }


    /**
     * Gets the dimensionFilters value for this ReportQuery.
     * 
     * @return dimensionFilters   * The restrictions that apply to {@link Dimension} objects. These
     * filters are
     *                 AND'ed together to produce the result.
     */
    public com.google.api.ads.dfp.v201107.DimensionFilter[] getDimensionFilters() {
        return dimensionFilters;
    }


    /**
     * Sets the dimensionFilters value for this ReportQuery.
     * 
     * @param dimensionFilters   * The restrictions that apply to {@link Dimension} objects. These
     * filters are
     *                 AND'ed together to produce the result.
     */
    public void setDimensionFilters(com.google.api.ads.dfp.v201107.DimensionFilter[] dimensionFilters) {
        this.dimensionFilters = dimensionFilters;
    }

    public com.google.api.ads.dfp.v201107.DimensionFilter getDimensionFilters(int i) {
        return this.dimensionFilters[i];
    }

    public void setDimensionFilters(int i, com.google.api.ads.dfp.v201107.DimensionFilter _value) {
        this.dimensionFilters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportQuery)) return false;
        ReportQuery other = (ReportQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              java.util.Arrays.equals(this.dimensions, other.getDimensions()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.dateRangeType==null && other.getDateRangeType()==null) || 
             (this.dateRangeType!=null &&
              this.dateRangeType.equals(other.getDateRangeType()))) &&
            ((this.dimensionFilters==null && other.getDimensionFilters()==null) || 
             (this.dimensionFilters!=null &&
              java.util.Arrays.equals(this.dimensionFilters, other.getDimensionFilters())));
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
        if (getDimensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDateRangeType() != null) {
            _hashCode += getDateRangeType().hashCode();
        }
        if (getDimensionFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensionFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensionFilters(), i);
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
        new org.apache.axis.description.TypeDesc(ReportQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "ReportQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "Dimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "Column"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "dateRangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "DateRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "dimensionFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "DimensionFilter"));
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
