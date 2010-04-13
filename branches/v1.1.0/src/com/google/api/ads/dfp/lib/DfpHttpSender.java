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

package com.google.api.ads.dfp.lib;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.HTTPSender;

/**
 * {@code DfpHttpSender} acts as a custom HTTP transport layer which
 * allows for access to the {@code MessageContext} before it is processed.
 * This class is intended to be referenced in the Axis engine as described
 * by {@link DfpServiceFactory}.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class DfpHttpSender extends HTTPSender {
  /**
   * Default constructor.
   */
  public DfpHttpSender() {}

  /**
   * See {@link org.apache.axis.transport.http.HTTPSender#invoke(org.apache.axis.MessageContext)}.
   *
   * The message is also recorded through the
   * {@link ServiceAccountantManager#recordMessage(MessageContext)} method.
   *
   * @param msgContext the message context to invoke through
   *     {@link HTTPSender} and to record via the
   *     {@link ServiceAccountantManager}
   */
  @Override
  public void invoke(MessageContext msgContext) throws AxisFault {
    super.invoke(msgContext);
    ServiceAccountantManager.getInstance().recordMessage(msgContext);
  }
}
