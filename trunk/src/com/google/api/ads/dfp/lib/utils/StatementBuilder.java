// Copyright 2010 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.utils;

import com.google.api.ads.dfp.v201004.DoubleParam;
import com.google.api.ads.dfp.v201004.LongParam;
import com.google.api.ads.dfp.v201004.Param;
import com.google.api.ads.dfp.v201004.Statement;
import com.google.api.ads.dfp.v201004.StringParam;
import com.google.api.ads.dfp.v201004.String_ParamMapEntry;

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
 * statementBuilder.putParam("id", 1234L).putParam("type", "Type");
 * Statement statement = statementBuilder.toStatement();
 * </pre>
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class StatementBuilder {
  private String query;
  private Map<String, Param> paramMap;

  /**
   * Constructs a statement builder with a query and parameter map that can
   * be added to.
   *
   * @param query the query
   * @param paramMap a map of of key to {@link Param}
   */
  public StatementBuilder(String query, Map<String, Param> paramMap) {
    this.query = query;
    this.paramMap = paramMap;
  }

  /**
   * Constructs a statement builder with a query and an empty parameter map.
   *
   * @param query the query
   */
  public StatementBuilder(String query) {
    this(query, new HashMap<String, Param>());
  }

  /**
   * Adds a parameter to the statement in the form of a {@link LongParam}.
   *
   * @param key the parameter key
   * @param value the paramenter {@code Long} value
   * @return a reference to this object
   */
  public StatementBuilder putParam(String key, Long value) {
    return putParam(key, createParam(value));
  }

  /**
   * Adds a parameter to the statement in the form of a {@link StringParam}.
   *
   * @param key the parameter key
   * @param value the paramenter {@code String} value
   * @return a reference to this object
   */
  public StatementBuilder putParam(String key, String value) {
    return putParam(key, createParam(value));
  }

  /**
   * Adds a parameter to the statement in the form of a {@link DoubleParam}.
   *
   * @param key the parameter key
   * @param value the paramenter {@code Double} value
   * @return a reference to this object
   */
  public StatementBuilder putParam(String key, Double value) {
    return putParam(key, createParam(value));
  }

  /**
   * Adds a parameter to the statement in the form of a {@link Param}.
   *
   * @param key the parameter key
   * @param value the paramenter
   * @return a reference to this object
   */
  public StatementBuilder putParam(String key, Param value) {
    paramMap.put(key, value);
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
   * Creates a {@link Param} for each mapping of key to {@code Object} and
   * adds it to the statement builder. If the {@code Object} cannot be converted
   * into a {@code Param}, an {@code IllegalArgumentException} is thrown.
   *
   * @param params the mappings of key to {@code Object}
   * @return a reference to this object
   * @throws IllegalArgumentException if any of the entries in the
   *     {@code params} have values which cannot be converted into a valid
   *     {@code Param}
   */
  public StatementBuilder putAll(Map<String, Object> params) throws IllegalArgumentException {
    for (Entry<String, Object> param : params.entrySet()) {
      putParam(param.getKey(), createParam(param.getValue()));
    }
    return this;
  }

  /**
   * Creates a {@link Param} from the value i.e. a {@link StringParam} for a
   * value of type {@code String}. If the value is a {@code Param},
   * the value is returned. If the value is {@code null}, an empty
   * {@link StringParam} is returned.
   *
   * @param value the value to the parameter to convert
   * @return the constructed parameter of the appropriate type
   */
  public static Param createParam(Object value) {
    if (value instanceof Param) {
      return (Param) value;
    } else if (value == null) {
      return new StringParam(null, null);
    } else {
      if (value instanceof Double) {
        return new DoubleParam(null, (Double) value);
      } else if (value instanceof String) {
        return new StringParam(null, (String) value);
      } else if (value instanceof Long) {
        return new LongParam(null, (Long) value);
      } else {
        throw new IllegalArgumentException("Unexpected param type ["
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
        MapUtils.toArray(paramMap, new String_ParamMapEntry[] {}));
  }
}
