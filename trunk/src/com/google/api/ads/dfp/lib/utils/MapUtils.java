// Copyright 2010, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A utility class for managing maps as represented in the API.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public final class MapUtils {
  /**
   * This class is not meant to have instances.
   */
  private MapUtils() {
  }

  /**
   * Generates a map from an array an entries. Entries are defined in the API
   * as a class which consists of a {@code key} and {@code value} with a name
   * typically in the form of {@code Key_ValueMapEntry}, represnted here as
   * {@code T}. The generated map must have same type {@code K} as the {@code
   * key} within {@code Key_ValueMapEntry}. The same applies for {@code V} and
   * {@code value} within {@code Key_ValueMapEntry}.
   *
   * @param <K> the type of the entry key
   * @param <V> the type of the entry value
   * @param <T> the map entry type
   * @param entryArray the array of entries constituting a map as represented in
   *        the API
   * @return a map of type {@code K} and {@code V} representing the entry array
   * @throws IllegalArgumentException if {@code entryArray} is not compatible
   *         with {@code Map<K, V>} or if {@code entryArray == null}
   */
  @SuppressWarnings("unchecked")
  public static <K, V, T> Map<K, V> toMap(T[] entryArray) throws IllegalArgumentException {
    if (entryArray == null) {
      throw new IllegalArgumentException("entryArray cannot be null.");
    }
    Class clazz = entryArray.getClass().getComponentType();
    Method getKeyMethod;
    try {
      getKeyMethod = clazz.getMethod("getKey", new Class[] {});
    } catch (NoSuchMethodException e) {
      throw new IllegalArgumentException("The entry type [" + clazz.toString()
          + "] is not compatible because a getKey() method was not found.", e);
    }
    Method getValueMethod;
    try {
      getValueMethod = clazz.getMethod("getValue", new Class[] {});
    } catch (NoSuchMethodException e) {
      throw new IllegalArgumentException("The entry type [" + clazz.toString()
          + "] is not compatible because a getValue() method was not found.", e);
    }
    Map<K, V> result = new HashMap<K, V>();
    for (Object entry : entryArray) {
      try {
        Object key = null;
        try {
          key = getKeyMethod.invoke(entry);
        } catch (IllegalAccessException e) {
          throw new IllegalStateException("The entry type [" + entry.getClass().toString()
              + "] is not compatible because the getKey()" + " method could not be accessed.", e);
        }

        Object value = null;
        try {
          value = getValueMethod.invoke(entry);
        } catch (IllegalAccessException e) {
          throw new IllegalStateException("The entry type [" + entry.getClass().toString()
              + "] is not compatible because the getValue()" + " method could not be accessed.", e);
        }

        result.put((K) key, (V) value);
      } catch (InvocationTargetException e) {
        throw new IllegalStateException("Unexpected exception while creating map: "
            + e.getMessage(), e);
      }
    }
    return result;
  }

  /**
   * Generates an array of entries from a map. Entries are defined in the API as
   * a class which consists of a {@code key} and {@code value} with a name
   * typically in the form of {@code Key_ValueMapEntry}, represented here as
   * {@code T}. The generated array can be used in objects where {@code
   * Key_ValueMapEntry[]} is taken as a value. The input map must have same type
   * {@code K} as the {@code key} within {@code Key_ValueMapEntry}. The same
   * applies for {@code V} and {@code value} within {@code Key_ValueMapEntry}.
   *
   * @param <K> the type of the entry key
   * @param <V> the type of the entry value
   * @param <T> the map entry type
   * @param map a map of type {@code K} and {@code V} representing the entry
   *        array
   * @param a the array into which the entries of this map are to be stored, if
   *        it is big enough; otherwise, a new array of the same runtime type is
   *        allocated for this purpose
   * @return an array of all map entries contained within the map parameter
   */
  public static <K, V, T> T[] toArray(Map<K, V> map, T[] a) {
    Class<T> clazz = (Class<T>) a.getClass().getComponentType();
    if (clazz == null) {
      throw new IllegalStateException("Component type for array parameter not found.");
    }
    Method setKeyMethod;
    try {
      setKeyMethod = findMethod("setKey", clazz);
    } catch (NoSuchMethodException e) {
      throw new IllegalArgumentException("The entry type [" + clazz.toString()
          + "] is not compatible because a setKey() method was not found.", e);
    }
    Method setValueMethod;
    try {
      setValueMethod = findMethod("setValue", clazz);
    } catch (NoSuchMethodException e) {
      throw new IllegalArgumentException("The entry type [" + clazz.toString()
          + "] is not compatible because a setValue() method was not found.", e);
    }
    List<T> result = new ArrayList<T>();
    for (Entry<K, V> entry : map.entrySet()) {
      try {
        T newEntry = null;
        try {
          newEntry = clazz.newInstance();
        } catch (InstantiationException e) {
          throw new IllegalStateException(
              "Unexpected exception: could not create map entry of type " + clazz.toString(), e);
        } catch (IllegalAccessException e) {
          throw new IllegalStateException(
              "Unexpected exception: could not create map entry of type " + clazz.toString(), e);
        }

        try {
          setKeyMethod.invoke(newEntry, entry.getKey());
        } catch (IllegalArgumentException e) {
          throw new IllegalArgumentException("The entry type [" + newEntry.getClass().toString()
              + "] is not compatible because the setKey() method could not take a type ["
              + entry.getKey().getClass() + "]", e);
        } catch (IllegalAccessException e) {
          throw new IllegalArgumentException("The entry type [" + newEntry.getClass().toString()
              + "] is not compatible because a setKey() method could not be accessed.", e);
        }

        try {
          setValueMethod.invoke(newEntry, entry.getValue());
        } catch (IllegalArgumentException e) {
          throw new IllegalArgumentException("The entry type [" + newEntry.getClass().toString()
              + "] is not compatible because the setValue() method could not take a type "
              + entry.getValue().getClass(), e);
        } catch (IllegalAccessException e) {
          throw new IllegalArgumentException("The entry type [" + newEntry.getClass().toString()
              + "] is not compatible because the setValue() method could not be accessed.",
              e);
        }

        result.add(newEntry);
      } catch (InvocationTargetException e) {
        new IllegalStateException("Unexpected exception while creating array: "
            + e.getMessage(), e);
      }
    }
    return result.toArray(a);
  }

  /**
   * Finds the first instance of a method with {@code methodName}.
   *
   * @param <T> the map entry type
   * @param methodName the name of the method
   * @param clazz the class of the map entry
   * @return a method that can be invoked to set the value
   * @throws NoSuchMethodException if no method could be found
   */
  private static <T> Method findMethod(String methodName, Class<T> clazz)
      throws NoSuchMethodException {
    for (Method method : clazz.getMethods()) {
      if (method.getName().equals(methodName)) {
        return method;
      }
    }
    throw new NoSuchMethodException("A " + methodName + "() method in type [" + clazz.toString()
        + "] could not be found");
  }
}
