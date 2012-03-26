// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.utils.v201201;

import com.google.api.ads.dfp.v201201.Date;
import com.google.api.ads.dfp.v201201.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * A utility class for handling {@link Date} objects.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public final class DateUtils {
  public static final String DATE_FORMAT = "yyyy-MM-dd";


  /**
   * {@code DateUtils} is meant to be used statically.
   */
  private DateUtils() {}

  /**
   * Creates a {@link Date} object from a string representation in the form
   * of {@code yyyy-MM-dd} (e.g. 2011-01-01).
   *
   * @param dateString the string representation of the {@code Date}
   * @return a {@code Date} object created from the string
   * @throws ParseException if the string could not be parsed
   */
  public static Date fromString(String dateString) throws ParseException {
    return fromDate(new SimpleDateFormat(DATE_FORMAT).parse(dateString));
  }

  /**
   * Creates a {@link Date} object from a Java {@code Date} object already set
   * to the publisher's timezone.
   *
   * @param date the {@code java.util.Date} object to transform into a
   *     {@code Date}
   * @return a {@code Date} object representing {@code date}
   */
  public static Date fromDate(java.util.Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);

    Date dfpDate = new Date();
    dfpDate.setYear(calendar.get(Calendar.YEAR));
    dfpDate.setMonth(calendar.get(Calendar.MONTH) + 1);
    dfpDate.setDay(calendar.get(Calendar.DAY_OF_MONTH));

    return dfpDate;
  }

  /**
   * Gets a {@link Date} object representing midnight of the present date.
   *
   * @return a {@code Date} object representing the present date
   */
  public static Date today(String timeZoneId) {
    return DateTimeUtils.today(timeZoneId).getDate();
  }

  /**
   * Gets a Java {@code Date} object from a {@link Date} object. The
   * timezone of the {@code Date} object is used when creating the new
   * date object.
   *
   * @param date the DFP {@code Date} object to convert to a Java {@code Date}
   * @param timeZoneId the timezone of the date
   * @return the DFP {@code Date} object as a Java {@code Date} in the timezone
   */
  public static java.util.Date toDate(Date date, String timeZoneId) {
    return DateTimeUtils.toDate(new DateTime(date, 0, 0, 0, timeZoneId));
  }

  /**
   * Gets a string representation of the {@link Date} object in the form
   * of {@code yyyy-mm-dd} (e.g. 2011-01-01)
   *
   * @param date the {@code DateTime} object used to create the string
   * @param timeZoneId the timezone of the date
   * @return a string representation of the {@link Date} object
   */
  public static String toString(Date date, String timeZoneId) {
    DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    dateFormat.setTimeZone(TimeZone.getTimeZone(timeZoneId));
    return dateFormat.format(toDate(date, timeZoneId));
  }
}
