
package n9244255client.sales;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Sales", targetNamespace = "http://n9244255sales/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Sales {


    /**
     * 
     * @param customer
     * @return
     *     returns n9244255client.sales.WorkOrder
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "request", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.Request")
    @ResponseWrapper(localName = "requestResponse", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.RequestResponse")
    @Action(input = "http://n9244255sales/Sales/requestRequest", output = "http://n9244255sales/Sales/requestResponse")
    public WorkOrder request(
        @WebParam(name = "customer", targetNamespace = "")
        Customer customer);

    /**
     * 
     * @param id
     * @return
     *     returns n9244255client.sales.WorkOrder
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "acceptQuote", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.AcceptQuote")
    @ResponseWrapper(localName = "acceptQuoteResponse", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.AcceptQuoteResponse")
    @Action(input = "http://n9244255sales/Sales/acceptQuoteRequest", output = "http://n9244255sales/Sales/acceptQuoteResponse")
    public WorkOrder acceptQuote(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "reject", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.Reject")
    @ResponseWrapper(localName = "rejectResponse", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.RejectResponse")
    @Action(input = "http://n9244255sales/Sales/rejectRequest", output = "http://n9244255sales/Sales/rejectResponse")
    public void reject(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "acceptDelay", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.AcceptDelay")
    @ResponseWrapper(localName = "acceptDelayResponse", targetNamespace = "http://n9244255sales/", className = "n9244255client.sales.AcceptDelayResponse")
    @Action(input = "http://n9244255sales/Sales/acceptDelayRequest", output = "http://n9244255sales/Sales/acceptDelayResponse")
    public void acceptDelay(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}