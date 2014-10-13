package sales;

import sales.data.Customer;
import sales.data.PurchaseOrder;
import sales.data.WorkOrder;
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
