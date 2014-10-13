package sales;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 * The resource planner books every necessary resource for maintenance including
 * work staff and parts. It belongs to the sales department.
 *
 * @author Manuel Brauer
 */
@WebService(serviceName = "ResourcePlanner")
@Stateless()
public class ResourcePlanner {

    /**
     * Web service operation. Used by the warehouse to inform about the completed
     * supply for this offer. Now the garage will be informed to book a service
     * bay and a mechanic.
     *
     * @param offerId - identifier of the related offer
     */
    @WebMethod(operationName = "inStock")
    public void inStock(@WebParam(name = "offerId") String offerId) {
        // TODO: inform garage
    }

    /**
     * The warehouse counts its available parts based on the requested car
     * model. Every unavailable piece will be ordered from a supplier.
     *
     * @return delay time in days
     */
    public static int prepareStock(String model) {
        // TODO: check for stock in warehouse
        // TODO: request for quote at supplier
        return 0;
    }
}
