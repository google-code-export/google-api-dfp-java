/**
 * LineItemTemplateServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;

public interface LineItemTemplateServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link LineItemTemplatePage} of {@link LineItemTemplate}
     * objects
     *         that satisfy the given {@link Statement#query}. The following
     * fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LineItemTemplate#id}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line item templates
     *         
     * @return the line item templates that match the given filter
     *         
     * @throws ApiException if a RuntimeException is thrown
     */
    public com.google.api.ads.dfp.v201311.LineItemTemplatePage getLineItemTemplatesByStatement(com.google.api.ads.dfp.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201311.ApiException;
}
