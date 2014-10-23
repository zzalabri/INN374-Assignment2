package n9244255sales;

import n9244255sales.data.CarModel;
import n9244255sales.data.Customer;
import n9244255sales.data.WorkOrder;
import n9244255sales.insurance.Insurance;
import n9244255sales.warehouse.IWarehouseService;
import n9244255sales.warehouse.WarehouseService;

/**
 * The cost center is a part of the sales department. It calculates costs and
 * prices for the maintenance of cars by requesting the work amount from the
 * garage, the costs of the necessary parts from the warehouse and the discount
 * from the insurance.
 *
 * @author Manuel Brauer
 */
public class CostCenter {

    public static int getQuote(WorkOrder wo) {
        Customer cust = CentralDataStore.customers.get(wo.getPlateNumber());
        CarModel model = new CarModel(cust.getModel());
        // TODO: request warehouse costs
        int warehouseCosts = 0;
        WarehouseService warehouse = new WarehouseService();
        IWarehouseService proxy = warehouse.getBasicHttpBindingIWarehouseService();
        warehouseCosts += proxy.getCost("10000")*model.getAmount("10000");// = 0
        warehouseCosts += proxy.getCost("20000")*model.getAmount("20000");
        warehouseCosts += proxy.getCost("30000")*model.getAmount("30000");
        // TODO: request garage costs
        int garageCosts = 25;

        int totalCosts = warehouseCosts + garageCosts;

        // TODO: request plan
        Insurance ins= new Insurance();
        int discount = ins.getBasicHttpBindingIinsurance().getDiscount(wo.getPlateNumber());
        

        int quote = new Float(totalCosts * (100.0- 1.0*discount)/100).intValue();

        return quote;
    }
}
