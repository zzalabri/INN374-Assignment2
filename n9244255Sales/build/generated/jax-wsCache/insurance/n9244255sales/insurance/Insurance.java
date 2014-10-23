
package n9244255sales.insurance;

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
@WebServiceClient(name = "insurance", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://fastapps04.qut.edu.au/n8964955/n8964955_InsuranceWS/insurance.svc?singleWsdl")
public class Insurance
    extends Service
{

    private final static URL INSURANCE_WSDL_LOCATION;
    private final static WebServiceException INSURANCE_EXCEPTION;
    private final static QName INSURANCE_QNAME = new QName("http://tempuri.org/", "insurance");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://fastapps04.qut.edu.au/n8964955/n8964955_InsuranceWS/insurance.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSURANCE_WSDL_LOCATION = url;
        INSURANCE_EXCEPTION = e;
    }

    public Insurance() {
        super(__getWsdlLocation(), INSURANCE_QNAME);
    }

    public Insurance(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSURANCE_QNAME, features);
    }

    public Insurance(URL wsdlLocation) {
        super(wsdlLocation, INSURANCE_QNAME);
    }

    public Insurance(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSURANCE_QNAME, features);
    }

    public Insurance(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Insurance(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Iinsurance
     */
    @WebEndpoint(name = "BasicHttpBinding_Iinsurance")
    public Iinsurance getBasicHttpBindingIinsurance() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_Iinsurance"), Iinsurance.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Iinsurance
     */
    @WebEndpoint(name = "BasicHttpBinding_Iinsurance")
    public Iinsurance getBasicHttpBindingIinsurance(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_Iinsurance"), Iinsurance.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSURANCE_EXCEPTION!= null) {
            throw INSURANCE_EXCEPTION;
        }
        return INSURANCE_WSDL_LOCATION;
    }

}
