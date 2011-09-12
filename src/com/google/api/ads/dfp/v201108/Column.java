/**
 * Column.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201108;

public class Column implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Column(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_SERVER_IMPRESSIONS = "AD_SERVER_IMPRESSIONS";
    public static final java.lang.String _AD_SERVER_CLICKS = "AD_SERVER_CLICKS";
    public static final java.lang.String _AD_SERVER_CTR = "AD_SERVER_CTR";
    public static final java.lang.String _AD_SERVER_REVENUE = "AD_SERVER_REVENUE";
    public static final java.lang.String _AD_SERVER_AVERAGE_ECPM = "AD_SERVER_AVERAGE_ECPM";
    public static final java.lang.String _AD_SERVER_PERCENT_IMPRESSIONS = "AD_SERVER_PERCENT_IMPRESSIONS";
    public static final java.lang.String _AD_SERVER_PERCENT_CLICKS = "AD_SERVER_PERCENT_CLICKS";
    public static final java.lang.String _AD_SERVER_PERCENT_REVENUE = "AD_SERVER_PERCENT_REVENUE";
    public static final java.lang.String _AD_SERVER_DELIVERY_INDICATOR = "AD_SERVER_DELIVERY_INDICATOR";
    public static final java.lang.String _ADSENSE_IMPRESSIONS = "ADSENSE_IMPRESSIONS";
    public static final java.lang.String _ADSENSE_CLICKS = "ADSENSE_CLICKS";
    public static final java.lang.String _ADSENSE_CTR = "ADSENSE_CTR";
    public static final java.lang.String _ADSENSE_REVENUE = "ADSENSE_REVENUE";
    public static final java.lang.String _ADSENSE_AVERAGE_ECPM = "ADSENSE_AVERAGE_ECPM";
    public static final java.lang.String _ADSENSE_PERCENT_IMPRESSIONS = "ADSENSE_PERCENT_IMPRESSIONS";
    public static final java.lang.String _ADSENSE_PERCENT_CLICKS = "ADSENSE_PERCENT_CLICKS";
    public static final java.lang.String _ADSENSE_PERCENT_REVENUE = "ADSENSE_PERCENT_REVENUE";
    public static final java.lang.String _TOTAL_IMPRESSIONS = "TOTAL_IMPRESSIONS";
    public static final java.lang.String _TOTAL_CLICKS = "TOTAL_CLICKS";
    public static final java.lang.String _TOTAL_CTR = "TOTAL_CTR";
    public static final java.lang.String _TOTAL_REVENUE = "TOTAL_REVENUE";
    public static final java.lang.String _TOTAL_AVERAGE_ECPM = "TOTAL_AVERAGE_ECPM";
    public static final java.lang.String _TOTAL_UNFILLED_IMPRESSIONS = "TOTAL_UNFILLED_IMPRESSIONS";
    public static final java.lang.String _MERGED_AD_SERVER_DELIVERY_INDICATOR = "MERGED_AD_SERVER_DELIVERY_INDICATOR";
    public static final java.lang.String _MERGED_AD_SERVER_IMPRESSIONS = "MERGED_AD_SERVER_IMPRESSIONS";
    public static final java.lang.String _MERGED_AD_SERVER_CLICKS = "MERGED_AD_SERVER_CLICKS";
    public static final java.lang.String _MERGED_AD_SERVER_CTR = "MERGED_AD_SERVER_CTR";
    public static final java.lang.String _MERGED_AD_SERVER_REVENUE = "MERGED_AD_SERVER_REVENUE";
    public static final java.lang.String _MERGED_AD_SERVER_AVERAGE_ECPM = "MERGED_AD_SERVER_AVERAGE_ECPM";
    public static final java.lang.String _OPTIMIZATION_CONTROL_IMPRESSIONS = "OPTIMIZATION_CONTROL_IMPRESSIONS";
    public static final java.lang.String _OPTIMIZATION_CONTROL_CLICKS = "OPTIMIZATION_CONTROL_CLICKS";
    public static final java.lang.String _OPTIMIZATION_CONTROL_CTR = "OPTIMIZATION_CONTROL_CTR";
    public static final java.lang.String _OPTIMIZATION_OPTIMIZED_IMPRESSIONS = "OPTIMIZATION_OPTIMIZED_IMPRESSIONS";
    public static final java.lang.String _OPTIMIZATION_OPTIMIZED_CLICKS = "OPTIMIZATION_OPTIMIZED_CLICKS";
    public static final java.lang.String _OPTIMIZATION_OPTIMIZED_CTR = "OPTIMIZATION_OPTIMIZED_CTR";
    public static final java.lang.String _OPTIMIZATION_LIFT = "OPTIMIZATION_LIFT";
    public static final Column AD_SERVER_IMPRESSIONS = new Column(_AD_SERVER_IMPRESSIONS);
    public static final Column AD_SERVER_CLICKS = new Column(_AD_SERVER_CLICKS);
    public static final Column AD_SERVER_CTR = new Column(_AD_SERVER_CTR);
    public static final Column AD_SERVER_REVENUE = new Column(_AD_SERVER_REVENUE);
    public static final Column AD_SERVER_AVERAGE_ECPM = new Column(_AD_SERVER_AVERAGE_ECPM);
    public static final Column AD_SERVER_PERCENT_IMPRESSIONS = new Column(_AD_SERVER_PERCENT_IMPRESSIONS);
    public static final Column AD_SERVER_PERCENT_CLICKS = new Column(_AD_SERVER_PERCENT_CLICKS);
    public static final Column AD_SERVER_PERCENT_REVENUE = new Column(_AD_SERVER_PERCENT_REVENUE);
    public static final Column AD_SERVER_DELIVERY_INDICATOR = new Column(_AD_SERVER_DELIVERY_INDICATOR);
    public static final Column ADSENSE_IMPRESSIONS = new Column(_ADSENSE_IMPRESSIONS);
    public static final Column ADSENSE_CLICKS = new Column(_ADSENSE_CLICKS);
    public static final Column ADSENSE_CTR = new Column(_ADSENSE_CTR);
    public static final Column ADSENSE_REVENUE = new Column(_ADSENSE_REVENUE);
    public static final Column ADSENSE_AVERAGE_ECPM = new Column(_ADSENSE_AVERAGE_ECPM);
    public static final Column ADSENSE_PERCENT_IMPRESSIONS = new Column(_ADSENSE_PERCENT_IMPRESSIONS);
    public static final Column ADSENSE_PERCENT_CLICKS = new Column(_ADSENSE_PERCENT_CLICKS);
    public static final Column ADSENSE_PERCENT_REVENUE = new Column(_ADSENSE_PERCENT_REVENUE);
    public static final Column TOTAL_IMPRESSIONS = new Column(_TOTAL_IMPRESSIONS);
    public static final Column TOTAL_CLICKS = new Column(_TOTAL_CLICKS);
    public static final Column TOTAL_CTR = new Column(_TOTAL_CTR);
    public static final Column TOTAL_REVENUE = new Column(_TOTAL_REVENUE);
    public static final Column TOTAL_AVERAGE_ECPM = new Column(_TOTAL_AVERAGE_ECPM);
    public static final Column TOTAL_UNFILLED_IMPRESSIONS = new Column(_TOTAL_UNFILLED_IMPRESSIONS);
    public static final Column MERGED_AD_SERVER_DELIVERY_INDICATOR = new Column(_MERGED_AD_SERVER_DELIVERY_INDICATOR);
    public static final Column MERGED_AD_SERVER_IMPRESSIONS = new Column(_MERGED_AD_SERVER_IMPRESSIONS);
    public static final Column MERGED_AD_SERVER_CLICKS = new Column(_MERGED_AD_SERVER_CLICKS);
    public static final Column MERGED_AD_SERVER_CTR = new Column(_MERGED_AD_SERVER_CTR);
    public static final Column MERGED_AD_SERVER_REVENUE = new Column(_MERGED_AD_SERVER_REVENUE);
    public static final Column MERGED_AD_SERVER_AVERAGE_ECPM = new Column(_MERGED_AD_SERVER_AVERAGE_ECPM);
    public static final Column OPTIMIZATION_CONTROL_IMPRESSIONS = new Column(_OPTIMIZATION_CONTROL_IMPRESSIONS);
    public static final Column OPTIMIZATION_CONTROL_CLICKS = new Column(_OPTIMIZATION_CONTROL_CLICKS);
    public static final Column OPTIMIZATION_CONTROL_CTR = new Column(_OPTIMIZATION_CONTROL_CTR);
    public static final Column OPTIMIZATION_OPTIMIZED_IMPRESSIONS = new Column(_OPTIMIZATION_OPTIMIZED_IMPRESSIONS);
    public static final Column OPTIMIZATION_OPTIMIZED_CLICKS = new Column(_OPTIMIZATION_OPTIMIZED_CLICKS);
    public static final Column OPTIMIZATION_OPTIMIZED_CTR = new Column(_OPTIMIZATION_OPTIMIZED_CTR);
    public static final Column OPTIMIZATION_LIFT = new Column(_OPTIMIZATION_LIFT);
    public java.lang.String getValue() { return _value_;}
    public static Column fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Column enumeration = (Column)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Column fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Column.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201108", "Column"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
