package n9244255sales;

import n9244255sales.data.Customer;
import n9244255sales.data.PurchaseOrder;
import n9244255sales.data.WorkOrder;
import java.util.HashMap;

/**
 * This class allows in-memory storage of currently used objects.
 * @author Manuel Brauer
 */
public class CentralDataStore {
    public static HashMap<String, WorkOrder> workorders = new HashMap<String, WorkOrder>();
    public static HashMap<String, Customer> customers = new HashMap<String, Customer>();
    public static HashMap<String, PurchaseOrder> purchaseorders = new HashMap<String, PurchaseOrder>();
    
}
