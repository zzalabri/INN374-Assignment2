
package n9244255sales.supplier;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SupplierService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://fastapps04.qut.edu.au/n8911371/WebService/n8911371SupplierService/SupplierService.svc?wsdl")
public class SupplierService
    extends Service
{

    private final static URL SUPPLIERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUPPLIERSERVICE_EXCEPTION;
    private final static QName SUPPLIERSERVICE_QNAME = new QName("http://tempuri.org/", "SupplierService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://fastapps04.qut.edu.au/n8911371/WebService/n8911371SupplierService/SupplierService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUPPLIERSERVICE_WSDL_LOCATION = url;
        SUPPLIERSERVICE_EXCEPTION = e;
    }

    public SupplierService() {
        super(__getWsdlLocation(), SUPPLIERSERVICE_QNAME);
    }

    public SupplierService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUPPLIERSERVICE_QNAME, features);
    }

    public SupplierService(URL wsdlLocation) {
        super(wsdlLocation, SUPPLIERSERVICE_QNAME);
    }

    public SupplierService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUPPLIERSERVICE_QNAME, features);
    }

    public SupplierService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SupplierService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISupplierService
     */
    @WebEndpoint(name = "BasicHttpBinding_ISupplierService")
    public ISupplierService getBasicHttpBindingISupplierService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ISupplierService"), ISupplierService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISupplierService
     */
    @WebEndpoint(name = "BasicHttpBinding_ISupplierService")
    public ISupplierService getBasicHttpBindingISupplierService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ISupplierService"), ISupplierService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUPPLIERSERVICE_EXCEPTION!= null) {
            throw SUPPLIERSERVICE_EXCEPTION;
        }
        return SUPPLIERSERVICE_WSDL_LOCATION;
    }

}
