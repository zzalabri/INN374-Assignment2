
package n9244255sales.insurance;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Iinsurance", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Iinsurance {


    /**
     * 
     * @param plateNo
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsInsured", action = "http://tempuri.org/Iinsurance/IsInsured")
    @WebResult(name = "IsInsuredResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsInsured", targetNamespace = "http://tempuri.org/", className = "n9244255sales.insurance.IsInsured")
    @ResponseWrapper(localName = "IsInsuredResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.insurance.IsInsuredResponse")
    public Boolean isInsured(
        @WebParam(name = "plateNo", targetNamespace = "http://tempuri.org/")
        String plateNo);

    /**
     * 
     * @param plateNo
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "GetDiscount", action = "http://tempuri.org/Iinsurance/GetDiscount")
    @WebResult(name = "GetDiscountResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDiscount", targetNamespace = "http://tempuri.org/", className = "n9244255sales.insurance.GetDiscount")
    @ResponseWrapper(localName = "GetDiscountResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.insurance.GetDiscountResponse")
    public Integer getDiscount(
        @WebParam(name = "plateNo", targetNamespace = "http://tempuri.org/")
        String plateNo);

}
