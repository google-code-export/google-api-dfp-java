// Copyright 2013, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.lib.utils.v201306;

import com.google.api.ads.dfp.v201306.ColumnType;
import com.google.api.ads.dfp.v201306.ResultSet;
import com.google.api.ads.dfp.v201306.Row;
import com.google.api.ads.dfp.v201306.Value;

import au.com.bytecode.opencsv.CSVWriter;

import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * A utility class for handling PQL objects.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public final class PqlUtils {
  /**
   * {@code PqlUtils} is meant to be used statically.
   */
  private PqlUtils() {
  }

  /**
   * Gets the underlying value of the {@link Value} object.
   *
   * @param value the {@code Value} object to get the value from
   * @return the underlying value
   * @throws IllegalArgumentException if {@code value == null}
   * @throws IllegalAccessException if the value field cannot be accessed
   */
  public static Object getValue(Value value) throws IllegalAccessException {
    if (value == null) {
      throw new IllegalArgumentException("Value object cannot be null.");
    }
    Field[] fields = value.getClass().getDeclaredFields();
    for (Field field : fields) {
      if (field.getName().equals("value")) {
        field.setAccessible(true);
        return field.get(value);
      }
    }
    throw new IllegalArgumentException("No value field found in value object.");
  }

  /**
   * Gets the result set as list of string arrays, which can be transformed to
   * a CSV using {@link CSVWriter}.
   *
   * @param resultSet the result set to convert to a CSV compatible format
   * @return a list of string arrays representing the result set
   */
  public static List<String[]> resultSetToStringArrayList(ResultSet resultSet) {
    List<String[]> stringArrayList = new ArrayList<String[]>();
    stringArrayList.add(getColumnLabels(resultSet));
    if (resultSet.getRows() != null) {
      for (Row row : resultSet.getRows()) {
        try {
          stringArrayList.add(getRowStringValues(row));
        } catch (IllegalArgumentException e) {
          throw new IllegalStateException("Cannot convert result set to string array list", e);
        } catch (IllegalAccessException e) {
          throw new IllegalStateException("Cannot convert result set to string array list", e);
        }
      }
    }
    return stringArrayList;
  }

  /**
   * Gets the result set as a table represenation in the form of:
   *
   * <pre>
   * +-------+-------+-------+
   * |column1|column2|column3|
   * +-------+-------+-------+
   * |value1 |value2 |value3 |
   * +-------+-------+-------+
   * |value1 |value2 |value3 |
   * +-------+-------+-------+
   * </pre>
   *
   * @param resultSet the result set to display as a string
   * @return the string represenation of result set as a table
   * @throws IllegalAccessException if the values of the result set cannot be
   *     accessed
   */
  public static String resultSetToString(ResultSet resultSet) throws IllegalAccessException {
    StringBuilder resultSetStringBuilder = new StringBuilder();
    List<String[]> resultSetStringArrayList = resultSetToStringArrayList(resultSet);
    List<Integer> maxColumnSizes = getMaxColumnSizes(resultSetStringArrayList);
    String rowTemplate = createRowTemplate(maxColumnSizes);
    String rowSeparator = createRowSeperator(maxColumnSizes);

    resultSetStringBuilder.append(rowSeparator);
    for (int i = 0; i < resultSetStringArrayList.size(); i++) {
      resultSetStringBuilder.append(
          String.format(rowTemplate, (Object[]) resultSetStringArrayList.get(i))).append(
          rowSeparator);
    }
    return resultSetStringBuilder.toString();
  }

  /**
   * Creates the row template given the maximum size for each column
   *
   * @param maxColumnSizes the maximum size for each column
   * @return the row template to format row data into
   */
  private static String createRowTemplate(List<Integer> maxColumnSizes) {
    List<String> columnFormatSpecifiers = new ArrayList<String>();
    for (int maxColumnSize : maxColumnSizes) {
      columnFormatSpecifiers.add("%-" + maxColumnSize + "s");
    }
    return new StringBuilder("| ").append(StringUtils.join(columnFormatSpecifiers, " | ")).append(
        " |\n").toString();
  }

  /**
   * Creates the row seperator given the maximum size for each column
   *
   * @param maxColumnSizes the maximum size for each column
   * @return the row seperator
   */
  private static String createRowSeperator(List<Integer> maxColumnSizes) {
    StringBuilder rowSeperator = new StringBuilder("+");
    for (int maxColumnSize : maxColumnSizes) {
        rowSeperator.append(StringUtils.repeat("-", maxColumnSize + 2)).append("+");
    }
    return rowSeperator.append("\n").toString();
  }

  /**
   * Gets a list of the maximum size for each column.
   *
   * @param resultSet the result set to process
   * @return a list of the maximum size for each column
   */
  private static List<Integer> getMaxColumnSizes(List<String[]> resultSet) {
    List<Integer> maxColumnSizes = new ArrayList<Integer>();
    for (int i = 0; i < resultSet.get(0).length; i++) {
      int maxColumnSize = -1;
      for (int j = 0; j < resultSet.size(); j++) {
        if (resultSet.get(j)[i].length() > maxColumnSize) {
          maxColumnSize = resultSet.get(j)[i].length();
        }
      }
      maxColumnSizes.add(maxColumnSize);

    }
    return maxColumnSizes;
  }

  /**
   * Gets the column labels for the result set.
   *
   * @param resultSet the result set to get the column labels for
   * @return the string array of column labels
   */
  public static String[] getColumnLabels(ResultSet resultSet) {
    List<String> columnLabels = new ArrayList<String>();
    for (ColumnType column : resultSet.getColumnTypes()) {
      columnLabels.add(column.getLabelName());
    }
    return columnLabels.toArray(new String[] {});
  }

  /**
   * Gets the row values for a row of the result set in the form of an object
   * array.
   *
   * @param row the row to get the values for
   * @return the object array of the row values
   * @throws IllegalArgumentException if the value could not be extracted from
   *     the row value
   * @throws IllegalAccessException if the row value could not be accessed
   */
  public static Object[] getRowValues(Row row)
      throws IllegalArgumentException, IllegalAccessException {
    List<Object> rowValues = new ArrayList<Object>();
    for (Value value : row.getValues()) {
      rowValues.add(getValue(value));
    }
    return rowValues.toArray(new Object[] {});
  }

  /**
   * Gets the row values for a row of the result set in a the form of a string
   * array. {@code null} values are interperted as empty strings.
   *
   * @param row the row to get the values for
   * @return the string array of the row values
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   * @throws IllegalArgumentException if the value could not be extracted from
   *     the row value
   * @throws IllegalAccessException if the row value could not be accessed
   */
  public static String[] getRowStringValues(Row row)
      throws IllegalArgumentException, IllegalAccessException {
    Object[] rowValues = getRowValues(row);
    List<String> rowStringValues = new ArrayList<String>();
    for (Object obj : rowValues) {
      if (obj != null) {
        rowStringValues.add(obj.toString());
      } else {
        rowStringValues.add("");
      }
    }
    return rowStringValues.toArray(new String[] {});
  }
}
