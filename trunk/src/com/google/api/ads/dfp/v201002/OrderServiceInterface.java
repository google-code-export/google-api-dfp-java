/**
 * OrderServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;

public interface OrderServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Order}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Order#advertiserId}</li>
     *         <li>{@link Order#name}</li>
     *         <li>{@link Order#traffickerId}</li>
     *         </ul>
     *         
     *         
     * @param order the order to create
     *         
     * @return the order with its ID filled in
     */
    public com.google.api.ads.dfp.v201002.Order createOrder(com.google.api.ads.dfp.v201002.Order order) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Creates new {@link Order} objects.
     *         
     *         
     * @param orders the orders to create
     *         
     * @return the created orders with their IDs filled in
     */
    public com.google.api.ads.dfp.v201002.Order[] createOrders(com.google.api.ads.dfp.v201002.Order[] orders) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Returns the {@link Order} uniquely identified by the given
     * ID.
     *         
     *         
     * @param orderId the ID of the order, which must already exist
     *         
     * @return the {@code Order} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201002.Order getOrder(java.lang.Long orderId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Gets an {@link OrderPage} of {@link Order} objects that satisfy
     * the given
     *         {@link Filter}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * values</th>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Order#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link Order#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Order#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Order#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code salespersonId}</td>
     *         <td>{@link Order#salespersonId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link Order#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Order#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code traffickerId}</td>
     *         <td>{@link Order#traffickerId}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over orders
     *         
     * @return the orders that match the given filter
     */
    public com.google.api.ads.dfp.v201002.OrderPage getOrdersByFilter(com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Performs actions on {@link Order} objects that match the given
     * {@link Filter}.
     *         
     *         
     * @param orderAction the action to perform
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over orders
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.v201002.UpdateResult performOrderAction(com.google.api.ads.dfp.v201002.OrderAction orderAction, com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link Order}.
     *         
     *         
     * @param order the order to update
     *         
     * @return the updated order
     */
    public com.google.api.ads.dfp.v201002.Order updateOrder(com.google.api.ads.dfp.v201002.Order order) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link Order} objects.
     *         
     *         
     * @param orders the orders to update
     *         
     * @return the updated orders
     */
    public com.google.api.ads.dfp.v201002.Order[] updateOrders(com.google.api.ads.dfp.v201002.Order[] orders) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;
}
