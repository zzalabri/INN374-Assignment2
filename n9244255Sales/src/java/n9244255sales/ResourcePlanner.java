package n9244255sales;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import n9244255sales.data.CarModel;
import n9244255sales.data.WorkOrder;
import n9244255sales.garage.N8964955GarageWS;
import n9244255sales.supplier.SupplierService;
import n9244255sales.warehouse.WarehouseService;

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
     * Web service operation. Used by the warehouse to inform about the
     * completed supply for this offer. Now the garage will be informed to book
     * a service bay and a mechanic.
     *
     * @param offerId - identifier of the related offer
     */
    @WebMethod(operationName = "inStock")
    public void inStock(@WebParam(name = "offerId") String offerId) {
        WorkOrder wo = CentralDataStore.workorders.get(offerId);
        N8964955GarageWS garage = new N8964955GarageWS();
        garage.getBasicHttpBindingIn8964955GarageWS().setAppointment(wo.getPlateNumber());
        String result = garage.getBasicHttpBindingIn8964955GarageWS().getAppointment(wo.getPlateNumber());
    }

    /**
     * The warehouse counts its available parts based on the requested car
     * model. Every unavailable piece will be ordered from a supplier.
     *
     * @return delay time in days
     */
    public static int prepareStock(String carmodel) {
        CarModel model = new CarModel(carmodel);
        HashMap<String, Integer> amounts = new HashMap<String, Integer>();
        amounts.put("10000", 0);
        amounts.put("20000", 0);
        amounts.put("30000", 0);
        WarehouseService warehouse = new WarehouseService();
        SupplierService supplier = new SupplierService();
        int delay = 0;
        String longestCompNo = null;
        for (String compNo : amounts.keySet()) {
            int amount = warehouse.getBasicHttpBindingIWarehouseService().getAmount(compNo);
            int difference = model.getAmount(compNo) - amount;
            if (difference > 0) {
                amounts.put(compNo, difference);
                int compDelay = supplier.getBasicHttpBindingISupplierService().getDelayDay(compNo);
                if (compDelay > delay) {
                    delay = compDelay;
                    longestCompNo = compNo;
                }
            }
        }
        return delay;
    }
}
