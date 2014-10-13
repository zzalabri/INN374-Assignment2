package sales;

import sales.data.WorkOrder;

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
        // TODO: request warehouse costs
        int warehouseCosts = 10;
        // TODO: request garage costs
        int garageCosts = 25;

        int totalCosts = warehouseCosts + garageCosts;

        // TODO: request plan
        double discount = 0.5;

        int quote = (new Double(totalCosts * discount)).intValue();

        return quote;
    }
}
