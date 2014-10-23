/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package n9244255sales.data;

/**
 *
 * @author Ulme
 */
public class CarModel {
    private int amount100;
    private int amount200;
    private int amount300;
    public CarModel(String model){
        if (model == null || "".equals(model)){
            setAmount(0,0,0);
            return;
        }
        if ("Audi A3".equals(model)){
            setAmount(0,5,2);
            return;
        }
        if ("Hyundai i30".equals(model)){
            setAmount(1,2,2);
            return;
        }
        if ("VW Phaeton".equals(model)){
            setAmount(0,10,2);
            return;
        }
        setAmount(1,20,2);
    }
    
    private void setAmount(int a, int b, int c){
        amount100 = a;
        amount200 = b;
        amount300 = c;
    }
    
    public int getAmount(String componentNo){
        if (componentNo == null || "".equals(componentNo)){
            return 0;
        }
        if ("10000".equals(componentNo)){
            return amount100;
        }
        if ("20000".equals(componentNo)){
            return amount200;
        }
        if ("30000".equals(componentNo)){
            return amount300;
        }
        return 0;
    }
}
