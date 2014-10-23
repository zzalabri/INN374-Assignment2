/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n9244255sales.data;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manuel Brauer
 */
public class WorkOrder {
    private String id;
    @XmlElement(name="state")
    private State state;
    private int quote;
    private int delay;
    private Date date;
    
    private String plateNumber;
    @XmlTransient
    private String suppliersOffer;

    public WorkOrder(String id, String plateNumber) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.state = State.Quote;
    }

    public void setId(String id){
        if (this.id == null){
            this.id = id;
        }
    }
    public String getId() {
        return id;
    }

    public int getQuote() {
        return quote;
    }

    public int getDelay() {
        if (State.Quote.equals(state)) {
            return -1;
        }
        return delay;
    }

    public Date getAppointment() {
        if (!(State.Appointment.equals(state))) {
            return null;
        }
        return date;
    }

    public State getState() {
        return state;
    }

    public void setDelay(int i) {
        if (State.Quote.equals(state) && delay < 0 && i >= 0) {
            delay = i;
            state = State.Delay;
        }
    }

    public void setAppointment(Date date) {
        if (this.date == null && date != null) {
            this.date= date;
            state = State.Appointment;
        }
    }
    
    public void setQuote(int i) {
        quote = i;
    }
    
    public String getSuppliersOffer(){
        return suppliersOffer;
    }

    public void setPlateNumber(String plateNumber){
        if (this.plateNumber == null){
            this.plateNumber = plateNumber;
        }
    }
    public String getPlateNumber() {
        return plateNumber;
    }

}
