package sales;

import sales.data.Customer;
import sales.data.WorkOrder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.UUID;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.jws.WebParam;

/**
 * Sales is the main interface for customer who want to maintain their car. It
 * represents the communication office of the sales department.
 *
 * @author Manuel Brauer
 */
@WebService(serviceName = "Sales")
@Stateless()
public class Sales {

    public Sales() {
        if (CentralDataStore.workorders == null) {
            CentralDataStore.workorders = new HashMap<String, WorkOrder>();
        }
        if (CentralDataStore.customers == null) {
            CentralDataStore.customers = new HashMap<String, Customer>();
        }
    }

    /**
     * Web service operation. This is the initial request for maintenance where
     * the customer will receive a quote.
     *
     * @param customer
     * @return workorder as quote including customer data and price
     */
    @WebMethod(operationName = "request")
    public WorkOrder request(@WebParam(name = "customer") Customer customer) {
        // TODO: store customer in database
        CentralDataStore.customers.put(customer.toString(), customer);
        WorkOrder wo = new WorkOrder(UUID.randomUUID().toString(), customer.getPlateNumber());
        CostCenter.getQuote(wo);
        int plan = 2;
        int standardMaintenance = 10;
        wo.setQuote(standardMaintenance / plan);
        // TODO: store offer in database
        CentralDataStore.workorders.put(wo.getId(), wo);
        return wo;
    }

    /**
     * Web service operation. Second step of the work flow. After the customer
     * accepted the quote a delay time will be calculated based on the necessary
     * resources.
     *
     * @param id - identifier of the quote
     * @return workorder as offer including the quote and a delay time
     */
    @WebMethod(operationName = "acceptQuote")
    public WorkOrder acceptQuote(@WebParam(name = "id") String id) {
        WorkOrder result = CentralDataStore.workorders.get(id);
        boolean allParts = false;
        // TODO: request warehouse
        if (!allParts) {
            // TODO: request supplier
            int delay = 14;
            String offer = UUID.randomUUID().toString();
            result.setDelay(delay, offer);
            return result;
        } else {
            Calendar cal = GregorianCalendar.getInstance();
            cal.roll(Calendar.DATE, result.getDelay());
            Date appointment = cal.getTime();
            // TODO: request garage
            result.setAppointment(appointment);
            return null;
        }
    }

    /**
     * Web service operation. The customer calls this method to end the planning
     * of the maintenance everytime.
     *
     * @param id - identifier of quote, offer or order.
     */
    @WebMethod(operationName = "reject")
    public void reject(@WebParam(name = "id") String id) {
        WorkOrder wo = CentralDataStore.workorders.get(id);
        if (wo == null) {
            return;
        }
        switch (wo.getState()) {
            case Appointment:
                // TODO release garage resources
                // TODO release locked parts in warehouse
                break;
            case Delay:
                // TODO reject supplier's quote
                // TODO release locked parts in warehouse
                break;
            case Quote:
            default:
                break;
        }
        CentralDataStore.workorders.remove(wo.getId());
    }
    /*    
     @WebMethod(operationName = "inStock")
     public void inStock(String id){
     Arrangement result = arrangements.get(id);
     Calendar cal = GregorianCalendar.getInstance();
     cal.roll(Calendar.DATE, result.getDelay());
     Date appointment = cal.getTime();
     // TODO: request garage
     result.setAppointment(appointment);
     return;
     }
     */

    /**
     * Web service operation. The customer accepts the delay time. Now
     * everything will be ordered and booked.
     *
     * @param id - identifier of the offer
     */
    @WebMethod(operationName = "acceptDelay")
    public void acceptDelay(@WebParam(name = "id") String id) {
        WorkOrder wo = CentralDataStore.workorders.get(id);
        String offer = wo.getSuppliersOffer();
        // TODO acceptOffer
        return;
    }
}
