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

package com.google.api.ads.dfp.lib;

/**
 * Represents CAPTCHA information retruned by the client login API.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class CaptchaInformation {
  private final String captchaUrl;
  private final String captchaToken;
  private final String url;

  /**
   * @param captchaUrl the CAPTCHA url
   * @param captchaToken the CAPTCHA token
   * @param url the url
   */
  public CaptchaInformation(String captchaUrl, String captchaToken, String url) {
    this.captchaUrl = captchaUrl;
    this.captchaToken = captchaToken;
    this.url = url;
  }

  /**
   * Gets the CAPTCHA url used to get the CAPTCHA image.
   *
   * @return the captchaUrl
   */
  public String getCaptchaUrl() {
    return captchaUrl;
  }

  /**
   * Gets the CAPTCHA token used in the next client login API request.
   *
   * @return the captchaToken
   */
  public String getCaptchaToken() {
    return captchaToken;
  }

  /**
   * Gets the URL to unlock an account.
   *
   * @return the URL
   */
  public String getUrl() {
    return url;
  }
}
