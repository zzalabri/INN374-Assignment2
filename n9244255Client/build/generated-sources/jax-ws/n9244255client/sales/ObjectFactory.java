
package n9244255client.sales;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the n9244255client.sales package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RejectResponse_QNAME = new QName("http://n9244255sales/", "rejectResponse");
    private final static QName _AcceptQuoteResponse_QNAME = new QName("http://n9244255sales/", "acceptQuoteResponse");
    private final static QName _Request_QNAME = new QName("http://n9244255sales/", "request");
    private final static QName _AcceptDelay_QNAME = new QName("http://n9244255sales/", "acceptDelay");
    private final static QName _RequestResponse_QNAME = new QName("http://n9244255sales/", "requestResponse");
    private final static QName _AcceptDelayResponse_QNAME = new QName("http://n9244255sales/", "acceptDelayResponse");
    private final static QName _AcceptQuote_QNAME = new QName("http://n9244255sales/", "acceptQuote");
    private final static QName _Reject_QNAME = new QName("http://n9244255sales/", "reject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: n9244255client.sales
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcceptDelay }
     * 
     */
    public AcceptDelay createAcceptDelay() {
        return new AcceptDelay();
    }

    /**
     * Create an instance of {@link RequestResponse }
     * 
     */
    public RequestResponse createRequestResponse() {
        return new RequestResponse();
    }

    /**
     * Create an instance of {@link AcceptDelayResponse }
     * 
     */
    public AcceptDelayResponse createAcceptDelayResponse() {
        return new AcceptDelayResponse();
    }

    /**
     * Create an instance of {@link Reject }
     * 
     */
    public Reject createReject() {
        return new Reject();
    }

    /**
     * Create an instance of {@link AcceptQuote }
     * 
     */
    public AcceptQuote createAcceptQuote() {
        return new AcceptQuote();
    }

    /**
     * Create an instance of {@link AcceptQuoteResponse }
     * 
     */
    public AcceptQuoteResponse createAcceptQuoteResponse() {
        return new AcceptQuoteResponse();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link RejectResponse }
     * 
     */
    public RejectResponse createRejectResponse() {
        return new RejectResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link WorkOrder }
     * 
     */
    public WorkOrder createWorkOrder() {
        return new WorkOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "rejectResponse")
    public JAXBElement<RejectResponse> createRejectResponse(RejectResponse value) {
        return new JAXBElement<RejectResponse>(_RejectResponse_QNAME, RejectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "acceptQuoteResponse")
    public JAXBElement<AcceptQuoteResponse> createAcceptQuoteResponse(AcceptQuoteResponse value) {
        return new JAXBElement<AcceptQuoteResponse>(_AcceptQuoteResponse_QNAME, AcceptQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptDelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "acceptDelay")
    public JAXBElement<AcceptDelay> createAcceptDelay(AcceptDelay value) {
        return new JAXBElement<AcceptDelay>(_AcceptDelay_QNAME, AcceptDelay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "requestResponse")
    public JAXBElement<RequestResponse> createRequestResponse(RequestResponse value) {
        return new JAXBElement<RequestResponse>(_RequestResponse_QNAME, RequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptDelayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "acceptDelayResponse")
    public JAXBElement<AcceptDelayResponse> createAcceptDelayResponse(AcceptDelayResponse value) {
        return new JAXBElement<AcceptDelayResponse>(_AcceptDelayResponse_QNAME, AcceptDelayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "acceptQuote")
    public JAXBElement<AcceptQuote> createAcceptQuote(AcceptQuote value) {
        return new JAXBElement<AcceptQuote>(_AcceptQuote_QNAME, AcceptQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://n9244255sales/", name = "reject")
    public JAXBElement<Reject> createReject(Reject value) {
        return new JAXBElement<Reject>(_Reject_QNAME, Reject.class, null, value);
    }

}
