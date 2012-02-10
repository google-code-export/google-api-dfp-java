/**
 * Statement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201201;


/**
 * Captures the {@code WHERE}, {@code ORDER BY} and {@code LIMIT}
 * clauses of a
 *             PQL query. Statements are typically used to retrieve objects
 * of a predefined
 *             domain type, which makes SELECT clause unnecessary.
 *             <p>
 *             An example query text might be {@code "WHERE status =
 * 'ACTIVE' ORDER BY id
 *             LIMIT 30"}.
 *             </p>
 *             <p>
 *             Statements also support bind variables. These are substitutes
 * for literals
 *             and can be thought of as input parameters to a PQL query.
 * </p>
 *             <p>
 *             An example of such a query might be {@code "WHERE id =
 * :idValue"}.
 *             </p>
 *             If using an API version newer than V201010, the value
 * for the variable
 *             idValue must then be set with an object of type {@link
 * Value} and is one of
 *             {@link NumberValue}, {@link TextValue} or {@link BooleanValue}.
 * <p>
 *             If using an API version older than or equal to V201010,
 * the value for the
 *             variable idValue must then be set with an object of type
 * {@link Param} and is
 *             one of {@link DoubleParam}, {@link LongParam} or {@link
 * StringParam}.
 *             </p>
 */
public class Statement  implements java.io.Serializable {
    /* Holds the query in PQL syntax. The syntax is:<br>
     *                 <code>[WHERE <condition> {[AND | OR] <condition> ...}]</code><br>
     * <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *                 <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET
     * <offset>}]</code><br>
     *                 <p>
     *                 <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><condition> := <property> IS NULL</code><br>
     *                 <code><bind variable> := :<name></code><br>
     *                 </p> */
    private java.lang.String query;

    /* Holds keys and values for bind variables and their values.
     * The key is the
     *                 name of the bind variable. The value is the literal
     * value of the variable.
     *                 <p>
     *                 In the example {@code "WHERE status = :bindStatus
     * ORDER BY id LIMIT 30"},
     *                 the bind variable, represented by {@code :bindStatus}
     * is named {@code
     *                 bindStatus}, which would also be the parameter map
     * key. The bind variable's
     *                 value would be represented by a parameter map value
     * of type
     *                 {@link TextValue}. The final result, for example,
     * would be an entry of
     *                 {@code "bindStatus" => StringParam("ACTIVE")}.
     *                 </p> */
    private com.google.api.ads.dfp.v201201.String_ValueMapEntry[] values;

    public Statement() {
    }

    public Statement(
           java.lang.String query,
           com.google.api.ads.dfp.v201201.String_ValueMapEntry[] values) {
           this.query = query;
           this.values = values;
    }


    /**
     * Gets the query value for this Statement.
     * 
     * @return query   * Holds the query in PQL syntax. The syntax is:<br>
     *                 <code>[WHERE <condition> {[AND | OR] <condition> ...}]</code><br>
     * <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *                 <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET
     * <offset>}]</code><br>
     *                 <p>
     *                 <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><condition> := <property> IS NULL</code><br>
     *                 <code><bind variable> := :<name></code><br>
     *                 </p>
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this Statement.
     * 
     * @param query   * Holds the query in PQL syntax. The syntax is:<br>
     *                 <code>[WHERE <condition> {[AND | OR] <condition> ...}]</code><br>
     * <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *                 <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET
     * <offset>}]</code><br>
     *                 <p>
     *                 <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><condition> := <property> IS NULL</code><br>
     *                 <code><bind variable> := :<name></code><br>
     *                 </p>
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the values value for this Statement.
     * 
     * @return values   * Holds keys and values for bind variables and their values.
     * The key is the
     *                 name of the bind variable. The value is the literal
     * value of the variable.
     *                 <p>
     *                 In the example {@code "WHERE status = :bindStatus
     * ORDER BY id LIMIT 30"},
     *                 the bind variable, represented by {@code :bindStatus}
     * is named {@code
     *                 bindStatus}, which would also be the parameter map
     * key. The bind variable's
     *                 value would be represented by a parameter map value
     * of type
     *                 {@link TextValue}. The final result, for example,
     * would be an entry of
     *                 {@code "bindStatus" => StringParam("ACTIVE")}.
     *                 </p>
     */
    public com.google.api.ads.dfp.v201201.String_ValueMapEntry[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this Statement.
     * 
     * @param values   * Holds keys and values for bind variables and their values.
     * The key is the
     *                 name of the bind variable. The value is the literal
     * value of the variable.
     *                 <p>
     *                 In the example {@code "WHERE status = :bindStatus
     * ORDER BY id LIMIT 30"},
     *                 the bind variable, represented by {@code :bindStatus}
     * is named {@code
     *                 bindStatus}, which would also be the parameter map
     * key. The bind variable's
     *                 value would be represented by a parameter map value
     * of type
     *                 {@link TextValue}. The final result, for example,
     * would be an entry of
     *                 {@code "bindStatus" => StringParam("ACTIVE")}.
     *                 </p>
     */
    public void setValues(com.google.api.ads.dfp.v201201.String_ValueMapEntry[] values) {
        this.values = values;
    }

    public com.google.api.ads.dfp.v201201.String_ValueMapEntry getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, com.google.api.ads.dfp.v201201.String_ValueMapEntry _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Statement)) return false;
        Statement other = (Statement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(Statement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "Statement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201201", "String_ValueMapEntry"));
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
