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

import com.google.api.ads.dfp.lib.DfpServiceLogger;

import org.apache.axis.utils.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * A utility class for processing and handling SOAP XML.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public final class XmlUtils {
  /** The charset for the report XML. */
  private static final Charset REPORT_XML_CHARSET = Charset.forName("UTF-8");

  private static final String[] SENSITIVE_HEADER_TAGS = {"authToken"};

  /**
   * {@code XmlUtils} is meant to be used statically.
   */
  private XmlUtils() {}

  /**
   * Pretty print the XML string given to this method.
   *
   * @param xml A UTF-8 encoded XML String to be pretty printed
   * @return the original XML if it's a malformed document,
   *     pretty printed XML otherwise
   * @throws IOException if I/O exception occurs
   * @throws SAXException if the document has SAX decoding problems
   * @throws ParserConfigurationException if construction problems occur
   * @throws IllegalArgumentException if {@code xml == null}
   */
  public static String prettyPrint(String xml)
      throws ParserConfigurationException, SAXException, IOException {
    if (xml == null) {
      throw new IllegalArgumentException("XML cannot be null.");
    }

    try {
      StreamResult result = new StreamResult(new StringWriter());

      TransformerFactory factory = TransformerFactory.newInstance();
      factory.setAttribute("indent-number", new Integer(2));

      Transformer transformer = factory.newTransformer();
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.transform(new DOMSource(getXmlDocument(xml)), result);

      return result.getWriter().toString();
    } catch (TransformerConfigurationException e) {
      DfpServiceLogger.DFP_API_LIB_LOG.error("Error pretty printing XML.", e);
    } catch (TransformerFactoryConfigurationError e) {
      DfpServiceLogger.DFP_API_LIB_LOG.error("Error pretty printing XML.", e);
    } catch (TransformerException e) {
      DfpServiceLogger.DFP_API_LIB_LOG.error("Error pretty printing XML.", e);
    }
    return xml;
  }

  /**
   * Gets the XML document given its string encoding.
   *
   * @param xml the string encoding of the XML
   * @return an XML document
   * @throws IOException if I/O exception occurs
   * @throws SAXException if the document has SAX decoding problems
   * @throws ParserConfigurationException if construction problems occur
   * @throws IllegalArgumentException if {@code xml == null}
   */
  public static Document getXmlDocument(String xml)
      throws ParserConfigurationException, SAXException, IOException {
    if (xml == null) {
      throw new IllegalArgumentException("XML cannot be null.");
    }

    return XMLUtils.newDocument(
        new ByteArrayInputStream(xml.getBytes(REPORT_XML_CHARSET.displayName())));
  }

  /**
   * Gets a sanitized soap XML request stripped of sensitive headers
   * defined in {@code SENSITIVE_HEADER_TAGS}.
   *
   * @param xml the XML to sanitize
   * @param headerNode the {@code Node} header from {@code xml}
   * @return a {@code String} representation of the XML with sensitive values
   *     removed
   */
  public static String getSanitizedSoapXml(String xml, Node headerNode) {
    Map<String, String> dirtyXmlMap = createTagToDirtyXmlMap(headerNode);
    Map<String, String> cleanXmlMap = createTagToCleanXmlMap(dirtyXmlMap);
    return sanitizeXml(new StringBuilder(xml), dirtyXmlMap, cleanXmlMap);
  }

  /**
   * Sanitizes the XML represented by {@code xml} by replacing dirty header XML
   * snippets in the {@code dirtyXmlMap} map with clean header XML snippets from
   * the {@code cleanXmlMap} map.
   *
   * @param xml the XML to sanitize
   * @param dirtyXmlMap a map of tag name to dirty XML header
   * @param cleanXmlMap a map of tag name to clean XML header
   * @return a sanitized copy of the XML with all sensitive tags masked
   */
  private static String sanitizeXml(StringBuilder xml,
      Map<String, String> dirtyXmlMap, Map<String, String> cleanXmlMap) {
    for (Entry<String, String> cleanXml : cleanXmlMap.entrySet()) {
      String dirtyXml = dirtyXmlMap.get(cleanXml.getKey());
      String endTag = cleanXml.getKey() + ">";
      int startIndex = xml.indexOf(dirtyXml.split(" ")[0]);
      int endIndex = xml.lastIndexOf(endTag) + endTag.length();
      xml = xml.replace(startIndex, endIndex, cleanXml.getValue());
    }
    return xml.toString();
  }

  /**
   * Creates a map of tag name to clean header XML by running a substitution
   * regex on each entry of tag to dirty header XML.
   *
   * @param dirtyXmlMap a map of tag name to dirty header XML
   * @return a map of tag name to clean header XML
   */
  private static Map<String, String> createTagToCleanXmlMap(Map<String, String> dirtyXmlMap) {
    Map<String, String> cleanXmlMap = new HashMap<String, String>();
    for (Entry<String, String> sensitiveXml : dirtyXmlMap.entrySet()) {
      Pattern p = Pattern.compile(
          "(^<.*" + sensitiveXml.getKey() + ".*>)(.*)(</.*" + sensitiveXml.getKey() + ">$)",
          Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
      Matcher m = p.matcher(sensitiveXml.getValue());
      if (m.matches()) {
        cleanXmlMap.put(sensitiveXml.getKey(), m.replaceFirst("$1******$3"));
      }
    }
    return cleanXmlMap;
  }

  /**
   * Creates a map of tag name to dirty header XML from the SOAP header node.
   *
   * @param headerNode the header node to extract all XML from
   * @return a map of tag name to dirty header XML
   */
  private static Map<String, String> createTagToDirtyXmlMap(Node headerNode) {
    Map<String, String> dirtyXmlMap = new HashMap<String, String>();
    for (int i = 0; i < headerNode.getChildNodes().getLength(); i++) {
      Node headerChildNode = headerNode.getChildNodes().item(i);
      if (Arrays.asList(SENSITIVE_HEADER_TAGS).contains(headerChildNode.getLocalName())) {
        dirtyXmlMap.put(headerChildNode.getLocalName(), headerChildNode.toString());
      }
    }
    return dirtyXmlMap;
  }

  /**
   * Extracts the actual header node. This should be updated with each
   * API update that changes the header object, such as "ResponseHeader".
   *
   * @param soapHeader the soap header
   * @return the {@code Node} that contains elements such as "responseTime"
   */
  public static Node extractResponseHeaderNode(Node soapHeader) {
    if (soapHeader.getFirstChild() != null
        && soapHeader.getFirstChild().getLocalName().equals("ResponseHeader")) {
      return soapHeader.getFirstChild();
    } else {
      return soapHeader;
    }
  }

  /**
   * Extracts the actual header node. This should be updated with each
   * API update that changes the header object, such as "RequestHeader".
   *
   * @param soapHeader the soap header
   * @return the {@code Node} that contains elements such as "email" and
   *     "clientEmail"
   */
  public static Node extractRequestHeaderNode(Node soapHeader) {
    if (soapHeader != null && soapHeader.getFirstChild() != null
        && soapHeader.getFirstChild().getLocalName().equals("RequestHeader")) {
      return soapHeader.getFirstChild();
    } else {
      return soapHeader;
    }
  }

  /**
   * Extracts a {@code Map} of header tag to value from the header node.
   *
   * @param headerNode the header node
   * @return a {@code Map} of header tag to value from the header node.
   */
  public static Map<String, String> extractHeaderMap(Node headerNode) {
    Map<String, String> headerMap = new HashMap<String, String>();
    for (int i = 0; i < headerNode.getChildNodes().getLength(); i++) {
      Node headerChildNode = headerNode.getChildNodes().item(i);
      headerMap.put(headerChildNode.getLocalName(), headerChildNode.getFirstChild().getNodeValue());
    }
    return headerMap;
  }
}
