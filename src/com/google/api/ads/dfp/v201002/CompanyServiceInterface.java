/**
 * CompanyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;

public interface CompanyServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Company} objects.
     *         
     *         
     * @param companies the companies to create
     *         
     * @return the created companies with their IDs filled in
     */
    public com.google.api.ads.dfp.v201002.Company[] createCompanies(com.google.api.ads.dfp.v201002.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Creates a new {@link Company}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Company#name}</li>
     *         <li>{@link Company#type}</li>
     *         </ul>
     *         
     *         
     * @param company the company to create
     *         
     * @return the new company with its ID filled in
     */
    public com.google.api.ads.dfp.v201002.Company createCompany(com.google.api.ads.dfp.v201002.Company company) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Gets a {@link CompanyPage} of {@link Company} objects that
     * satisfy the
     *         given {@link Filter}. The following fields are supported for
     * filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * values</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Company#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Company#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Company#type}</td>
     *         </tr>
     *         </table>
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over companies
     *         
     * @return the companies that match the given filter
     */
    public com.google.api.ads.dfp.v201002.CompanyPage getCompaniesByFilter(com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Returns the {@link Company} uniquely identified by the given
     * ID.
     *         
     *         
     * @param companyId ID of the company, which must already exist
     *         
     * @return the {@code Company} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201002.Company getCompany(java.lang.Long companyId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link Company} objects.
     *         
     *         
     * @param companies the companies to update
     *         
     * @return the updated companies
     */
    public com.google.api.ads.dfp.v201002.Company[] updateCompanies(com.google.api.ads.dfp.v201002.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link Company}.
     *         
     *         
     * @param company the company to update
     *         
     * @return the updated company
     */
    public com.google.api.ads.dfp.v201002.Company updateCompany(com.google.api.ads.dfp.v201002.Company company) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;
}
