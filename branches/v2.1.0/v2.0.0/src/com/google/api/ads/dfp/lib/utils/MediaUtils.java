// Copyright 2010, Google Inc. All Rights Reserved.
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

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

/**
 * A utility class for retrieving data from any file which may be an asset
 * for a creative, such as an image, video, or SWF file.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public abstract class MediaUtils {
  /**
   * Private constructor.
   */
  private MediaUtils() {}

  /**
   * Gets the asset data {@code byte[]} located in {@code fileName} or
   * {@code null} if the media could not be loaded.
   *
   * @param fileName the media file to load
   * @return the asset data {@code byte[]} located in {@code fileName}
   * @throws IOException if there is an problem loading the media data
   */
  public static byte[] getAssetDataFromFile(String fileName) throws IOException {
    BufferedInputStream inputStream = null;
    ByteArrayOutputStream outputStream = null;
    try {
      File imageFile = new File(fileName);
      inputStream = new BufferedInputStream(new FileInputStream(imageFile));
      outputStream = new ByteArrayOutputStream();

      int i = 0;
      while ((i = inputStream.read()) != -1) {
        outputStream.write(i);
      }
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }

      if (outputStream != null) {
        outputStream.close();
      }
    }

    return (outputStream != null) ? outputStream.toByteArray() : null;
  }

  /**
   * Gets the asset data {@code byte[]} located at {@code url} or
   * {@code null} if the asset could not be loaded.
   *
   * @param url the asset URL to load
   * @return the asset data {@code byte[]} located at {@code url}
   * @throws IOException if there is an problem loading the media data
   */
  public static byte[] getAssetDataFromUrl(String url) throws IOException {
    BufferedInputStream inputStream = null;
    ByteArrayOutputStream outputStream = null;
    try {
      URL imageUrl = new URL(url);
      inputStream = new BufferedInputStream(imageUrl.openStream());
      outputStream = new ByteArrayOutputStream();

      int i = 0;
      while ((i = inputStream.read()) != -1) {
        outputStream.write(i);
      }
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }

      if (outputStream != null) {
        outputStream.close();
      }
    }

    return (outputStream != null) ? outputStream.toByteArray() : null;
  }
}
