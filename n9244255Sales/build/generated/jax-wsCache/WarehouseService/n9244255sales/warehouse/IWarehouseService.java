
package n9244255sales.warehouse;

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
@WebService(name = "IWarehouseService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IWarehouseService {


    /**
     * 
     * @param componentNo
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsExistComponentNo", action = "http://tempuri.org/IWarehouseService/IsExistComponentNo")
    @WebResult(name = "IsExistComponentNoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsExistComponentNo", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.IsExistComponentNo")
    @ResponseWrapper(localName = "IsExistComponentNoResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.IsExistComponentNoResponse")
    public Boolean isExistComponentNo(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo);

    /**
     * 
     * @param componentNo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetComponentName", action = "http://tempuri.org/IWarehouseService/GetComponentName")
    @WebResult(name = "GetComponentNameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetComponentName", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetComponentName")
    @ResponseWrapper(localName = "GetComponentNameResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetComponentNameResponse")
    public String getComponentName(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo);

    /**
     * 
     * @param componentNo
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "GetCost", action = "http://tempuri.org/IWarehouseService/GetCost")
    @WebResult(name = "GetCostResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCost", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetCost")
    @ResponseWrapper(localName = "GetCostResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetCostResponse")
    public Integer getCost(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo);

    /**
     * 
     * @param componentNo
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "GetAmount", action = "http://tempuri.org/IWarehouseService/GetAmount")
    @WebResult(name = "GetAmountResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAmount", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetAmount")
    @ResponseWrapper(localName = "GetAmountResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetAmountResponse")
    public Integer getAmount(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo);

    /**
     * 
     * @param componentNo
     * @return
     *     returns n9244255sales.warehouse.Warehouse
     */
    @WebMethod(operationName = "GetComponent", action = "http://tempuri.org/IWarehouseService/GetComponent")
    @WebResult(name = "GetComponentResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetComponent", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetComponent")
    @ResponseWrapper(localName = "GetComponentResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.GetComponentResponse")
    public Warehouse getComponent(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo);

    /**
     * 
     * @param exceptUsedAmount
     * @param componentNo
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "CheckAmount", action = "http://tempuri.org/IWarehouseService/CheckAmount")
    @WebResult(name = "CheckAmountResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CheckAmount", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.CheckAmount")
    @ResponseWrapper(localName = "CheckAmountResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.CheckAmountResponse")
    public Boolean checkAmount(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo,
        @WebParam(name = "exceptUsedAmount", targetNamespace = "http://tempuri.org/")
        Integer exceptUsedAmount);

    /**
     * 
     * @param exceptConsumedAmount
     * @param componentNo
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "ConsumedAmount", action = "http://tempuri.org/IWarehouseService/ConsumedAmount")
    @WebResult(name = "ConsumedAmountResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsumedAmount", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.ConsumedAmount")
    @ResponseWrapper(localName = "ConsumedAmountResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.ConsumedAmountResponse")
    public Boolean consumedAmount(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo,
        @WebParam(name = "exceptConsumedAmount", targetNamespace = "http://tempuri.org/")
        Integer exceptConsumedAmount);

    /**
     * 
     * @param updatedAmount
     * @param componentNo
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "UpdatedAmount", action = "http://tempuri.org/IWarehouseService/UpdatedAmount")
    @WebResult(name = "UpdatedAmountResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdatedAmount", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.UpdatedAmount")
    @ResponseWrapper(localName = "UpdatedAmountResponse", targetNamespace = "http://tempuri.org/", className = "n9244255sales.warehouse.UpdatedAmountResponse")
    public Boolean updatedAmount(
        @WebParam(name = "componentNo", targetNamespace = "http://tempuri.org/")
        String componentNo,
        @WebParam(name = "updatedAmount", targetNamespace = "http://tempuri.org/")
        Integer updatedAmount);

}
