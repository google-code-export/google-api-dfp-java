/**
 * LineItemCreativeAssociationStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;


/**
 * Contains statistics such as impressions, clicks delivered and cost
 * for {@link LineItemCreativeAssociation} objects.
 */
public class LineItemCreativeAssociationStats  implements java.io.Serializable {
    /* A {@link Stats} object that holds delivered impressions and
     * clicks
     *                 statistics. */
    private com.google.api.ads.dfp.v201306.Stats stats;

    /* A map containing {@link Stats} objects for each creative belonging
     * to
     *                 a creative set, {@code null} for non creative set
     * associations. */
    private com.google.api.ads.dfp.v201306.Long_StatsMapEntry[] creativeSetStats;

    /* The revenue generated thus far by the creative from its association
     * with
     *                 the particular line item in the publisher's currency. */
    private com.google.api.ads.dfp.v201306.Money costInOrderCurrency;

    public LineItemCreativeAssociationStats() {
    }

    public LineItemCreativeAssociationStats(
           com.google.api.ads.dfp.v201306.Stats stats,
           com.google.api.ads.dfp.v201306.Long_StatsMapEntry[] creativeSetStats,
           com.google.api.ads.dfp.v201306.Money costInOrderCurrency) {
           this.stats = stats;
           this.creativeSetStats = creativeSetStats;
           this.costInOrderCurrency = costInOrderCurrency;
    }


    /**
     * Gets the stats value for this LineItemCreativeAssociationStats.
     * 
     * @return stats   * A {@link Stats} object that holds delivered impressions and
     * clicks
     *                 statistics.
     */
    public com.google.api.ads.dfp.v201306.Stats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this LineItemCreativeAssociationStats.
     * 
     * @param stats   * A {@link Stats} object that holds delivered impressions and
     * clicks
     *                 statistics.
     */
    public void setStats(com.google.api.ads.dfp.v201306.Stats stats) {
        this.stats = stats;
    }


    /**
     * Gets the creativeSetStats value for this LineItemCreativeAssociationStats.
     * 
     * @return creativeSetStats   * A map containing {@link Stats} objects for each creative belonging
     * to
     *                 a creative set, {@code null} for non creative set
     * associations.
     */
    public com.google.api.ads.dfp.v201306.Long_StatsMapEntry[] getCreativeSetStats() {
        return creativeSetStats;
    }


    /**
     * Sets the creativeSetStats value for this LineItemCreativeAssociationStats.
     * 
     * @param creativeSetStats   * A map containing {@link Stats} objects for each creative belonging
     * to
     *                 a creative set, {@code null} for non creative set
     * associations.
     */
    public void setCreativeSetStats(com.google.api.ads.dfp.v201306.Long_StatsMapEntry[] creativeSetStats) {
        this.creativeSetStats = creativeSetStats;
    }

    public com.google.api.ads.dfp.v201306.Long_StatsMapEntry getCreativeSetStats(int i) {
        return this.creativeSetStats[i];
    }

    public void setCreativeSetStats(int i, com.google.api.ads.dfp.v201306.Long_StatsMapEntry _value) {
        this.creativeSetStats[i] = _value;
    }


    /**
     * Gets the costInOrderCurrency value for this LineItemCreativeAssociationStats.
     * 
     * @return costInOrderCurrency   * The revenue generated thus far by the creative from its association
     * with
     *                 the particular line item in the publisher's currency.
     */
    public com.google.api.ads.dfp.v201306.Money getCostInOrderCurrency() {
        return costInOrderCurrency;
    }


    /**
     * Sets the costInOrderCurrency value for this LineItemCreativeAssociationStats.
     * 
     * @param costInOrderCurrency   * The revenue generated thus far by the creative from its association
     * with
     *                 the particular line item in the publisher's currency.
     */
    public void setCostInOrderCurrency(com.google.api.ads.dfp.v201306.Money costInOrderCurrency) {
        this.costInOrderCurrency = costInOrderCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemCreativeAssociationStats)) return false;
        LineItemCreativeAssociationStats other = (LineItemCreativeAssociationStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.creativeSetStats==null && other.getCreativeSetStats()==null) || 
             (this.creativeSetStats!=null &&
              java.util.Arrays.equals(this.creativeSetStats, other.getCreativeSetStats()))) &&
            ((this.costInOrderCurrency==null && other.getCostInOrderCurrency()==null) || 
             (this.costInOrderCurrency!=null &&
              this.costInOrderCurrency.equals(other.getCostInOrderCurrency())));
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
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getCreativeSetStats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeSetStats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeSetStats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostInOrderCurrency() != null) {
            _hashCode += getCostInOrderCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemCreativeAssociationStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemCreativeAssociationStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Stats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeSetStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creativeSetStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Long_StatsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costInOrderCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "costInOrderCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money"));
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
