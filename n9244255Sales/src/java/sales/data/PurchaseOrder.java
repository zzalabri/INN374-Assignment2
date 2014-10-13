/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sales.data;

/**
 * A purchase order is an order between the sales management and a supplier.
 * @author Ulme
 */
public class PurchaseOrder {
    private String id;
    private int price;
    private int delayTime;
    
    /**
     * Constructor.
     * @param id - an unique identifier
     */
    public PurchaseOrder(String id){
        this.id = id;
        this.price = 0;
        this.delayTime = 0;
    }
    
    /**
     * 
     * @return the identifier of this purchase order
     */
    public String getId(){
        return id;
    }
    
    /**
     * 
     * @return the price in 1 AUD steps
     */
    public int getPrice(){
        return price;
    }
    
    /**
     * Set the price offered by the supplier
     * @param price in 1 AUD steps
     */
    public void setPrice(int price){
        if (price >= 0){
            this.price = price;
        }
    }
    
    /**
     * 
     * @return the days the supplier needs to deliver the requested items.
     */
    public int getDelayTime(){
        return delayTime;
    }
    
    /**
     * set the days the supplier offered delivering the requested items.
     * @param delay in days
     */
    public void setDelayTime(int delay){
        if(delay >= 0){
            this.delayTime = delay;
        }
    }
}
