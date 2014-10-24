
package n9244255client.sales;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "n9244255Sales", targetNamespace = "http://n9244255sales/", wsdlLocation = "http://fastws.qut.edu.au:8080/n9244255Sales/Sales?wsdl")
public class N9244255Sales
    extends Service
{

    private final static URL N9244255SALES_WSDL_LOCATION;
    private final static WebServiceException N9244255SALES_EXCEPTION;
    private final static QName N9244255SALES_QNAME = new QName("http://n9244255sales/", "n9244255Sales");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://fastws.qut.edu.au:8080/n9244255Sales/Sales?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        N9244255SALES_WSDL_LOCATION = url;
        N9244255SALES_EXCEPTION = e;
    }

    public N9244255Sales() {
        super(__getWsdlLocation(), N9244255SALES_QNAME);
    }

    public N9244255Sales(WebServiceFeature... features) {
        super(__getWsdlLocation(), N9244255SALES_QNAME, features);
    }

    public N9244255Sales(URL wsdlLocation) {
        super(wsdlLocation, N9244255SALES_QNAME);
    }

    public N9244255Sales(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, N9244255SALES_QNAME, features);
    }

    public N9244255Sales(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public N9244255Sales(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Sales
     */
    @WebEndpoint(name = "SalesPort")
    public Sales getSalesPort() {
        return super.getPort(new QName("http://n9244255sales/", "SalesPort"), Sales.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sales
     */
    @WebEndpoint(name = "SalesPort")
    public Sales getSalesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://n9244255sales/", "SalesPort"), Sales.class, features);
    }

    private static URL __getWsdlLocation() {
        if (N9244255SALES_EXCEPTION!= null) {
            throw N9244255SALES_EXCEPTION;
        }
        return N9244255SALES_WSDL_LOCATION;
    }

}