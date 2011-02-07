// Copyright 2011 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.lib.utils.v201101;

import com.google.api.ads.dfp.lib.utils.MapUtils;
import com.google.api.ads.dfp.v201101.BooleanValue;
import com.google.api.ads.dfp.v201101.NumberValue;
import com.google.api.ads.dfp.v201101.Statement;
import com.google.api.ads.dfp.v201101.String_ValueMapEntry;
import com.google.api.ads.dfp.v201101.TextValue;
import com.google.api.ads.dfp.v201101.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * {@code StatementBuilder} allows for statements to be constructed in parts.
 * <p>
 * Typical usage is:
 * <pre>
 * StatementBuilder statementBuilder
 *     = new StatementBuilder("WHERE id = :id AND type = :type");
 * statementBuilder.putValue("id", 1234L).putValue("type", "Type");
 * Statement statement = statementBuilder.toStatement();
 * </pre>
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class StatementBuilder {
  private String query;
  private Map<String, Value> valueMap;

  /**
   * Constructs a statement builder with a query and value map that can
   * be added to.
   *
   * @param query the query
   * @param valueMap a map of of key to {@link Value}
   */
  public StatementBuilder(String query, Map<String, Value> valueMap) {
    this.query = query;
    this.valueMap = valueMap;
  }

  /**
   * Constructs a statement builder with a query and an empty value map.
   *
   * @param query the query
   */
  public StatementBuilder(String query) {
    this(query, new HashMap<String, Value>());
  }

  /**
   * Adds a value to the statement in the form of a {@link NumberValue}.
   *
   * @param key the value key
   * @param value the {@code Long} value
   * @return a reference to this object
   */
  public StatementBuilder putValue(String key, Long value) {
    return putValue(key, createValue(value));
  }

  /**
   * Adds a value to the statement in the form of a {@link TextValue}.
   *
   * @param key the value key
   * @param value the {@code String} value
   * @return a reference to this object
   */
  public StatementBuilder putValue(String key, String value) {
    return putValue(key, createValue(value));
  }

  /**
   * Adds a value to the statement in the form of a {@link NumberValue}.
   *
   * @param key the value key
   * @param value the {@code Double} value
   * @return a reference to this object
   */
  public StatementBuilder putValue(String key, Double value) {
    return putValue(key, createValue(value));
  }

  /**
   * Adds a value to the statement in the form of a {@link NumberValue}.
   *
   * @param key the value key
   * @param value the {@code Integer} value
   * @return a reference to this object
   */
  public StatementBuilder putValue(String key, Integer value) {
    return putValue(key, value.longValue());
  }

  /**
   * Adds a value to the statement in the form of a {@link BooleanValue}.
   *
   * @param key the value key
   * @param value the {@code Boolean} value
   * @return a reference to this object
   */
  public StatementBuilder putValue(String key, Boolean value) {
    return putValue(key, createValue(value));
  }

  /**
   * Adds a value to the statement in the form of a {@link Value}.
   *
   * @param key the value key
   * @param value the value
   * @return a reference to this object
   */
  public StatementBuilder putValue(String key, Value value) {
    valueMap.put(key, value);
    return this;
  }

  /**
   * Sets the statement query
   * @param query the statement query
   */
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * Creates a {@link Value} for each mapping of key to {@code Object} and
   * adds it to the statement builder. If the {@code Object} cannot be converted
   * into a {@code Value}, an {@code IllegalArgumentException} is thrown.
   *
   * @param values the mappings of key to {@code Object}
   * @return a reference to this object
   * @throws IllegalArgumentException if any of the entries in the
   *     {@code values} have values which cannot be converted into a valid
   *     {@code Value}
   */
  public StatementBuilder putAll(Map<String, Object> values) throws IllegalArgumentException {
    for (Entry<String, Object> Value : values.entrySet()) {
      putValue(Value.getKey(), createValue(Value.getValue()));
    }
    return this;
  }

  /**
   * Creates a {@link Value} from the value i.e. a {@link TextValue} for a
   * value of type {@code String}. If the value is a {@code Value},
   * the value is returned. If the value is {@code null}, an empty
   * {@link TextValue} is returned.
   *
   * @param value the value to convert
   * @return the constructed value of the appropriate type
   */
  public static Value createValue(Object value) {
    if (value instanceof Value) {
      return (Value) value;
    } else if (value == null) {
      return new TextValue(null, null);
    } else {
      if (value instanceof Boolean) {
        return new BooleanValue(null, (Boolean) value);
      } else if (value instanceof Double) {
        return new NumberValue(null, value.toString());
      } else if (value instanceof String) {
        return new TextValue(null, (String) value);
      } else if (value instanceof Long) {
        return new NumberValue(null, value.toString());
      } else {
        throw new IllegalArgumentException("Unexpected Value type ["
            + value.getClass() + "]");
      }
    }
  }

  /**
   * Gets the {@link Statement} representing the state of this statement
   * builder.
   *
   * @return the {@link Statement}
   */
  public Statement toStatement() {
    return new Statement(query,
        MapUtils.toArray(valueMap, new String_ValueMapEntry[] {}));
  }
}
