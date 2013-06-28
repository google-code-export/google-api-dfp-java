/**
 * ReconciliationOrderReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201306;

public interface ReconciliationOrderReportServiceInterface extends java.rmi.Remote {

    /**
     * Returns the {@link ReconciliationOrderReport} object uniquely
     * identified by given ID.
     *         
     *         
     * @param reconciliationOrderReportId the ID of the {@link ReconciliationOrderReport},
     * which must already exist.
     *         
     * @return the {@link ReconciliationOrderReport} uniquely identified
     * by given ID.
     */
    public com.google.api.ads.dfp.v201306.ReconciliationOrderReport getReconciliationOrderReport(java.lang.Long reconciliationOrderReportId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Gets an {@link ReconciliationOrderReportPage} of {@link ReconciliationOrderReport}
     * objects
     *         that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationOrderReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ReconciliationOrderReport#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code submissionDateTime}</td>
     *         <td>{@link ReconciliationOrderReport#submissionDateTime}</td>
     * </tr>
     *         <tr>
     *         <td>{@code submitterId}</td>
     *         <td>{@link ReconciliationOrderReport#submitterId}</td>
     *         </tr>
     *         </table>
     *         
     *         The {@code reconciliationReportId} field is required and can
     * only be combined with an
     *         {@code AND} to other conditions. Furthermore, the results
     * may only belong to
     *         one {@link ReconciliationReport}.
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of reconciliation order reports.
     *         
     * @return the reconciliation order reports that match the given filter.
     */
    public com.google.api.ads.dfp.v201306.ReconciliationOrderReportPage getReconciliationOrderReportsByStatement(com.google.api.ads.dfp.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;

    /**
     * Performs actions on the {@link ReconciliationOrderReport} objects
     * that match the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     * </tr>
     *         </table>
     *         
     *         The {@code reconciliationReportId} field and {@code orderId}
     * are required and can only be
     *         combined with an {@code AND}. Furthermore, the results may
     * only belong to one
     *         {@link ReconciliationReport}.
     *         Only orders to which the API user has access will be included.
     * 
     *         
     * @param reconciliationOrderReportAction the action to perform.
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of orders and
     *         one reconciliation report.
     *         
     * @return the result of the action performed.
     */
    public com.google.api.ads.dfp.v201306.UpdateResult performReconciliationOrderReportAction(com.google.api.ads.dfp.v201306.ReconciliationOrderReportAction reconciliationOrderReportAction, com.google.api.ads.dfp.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201306.ApiException;
}
