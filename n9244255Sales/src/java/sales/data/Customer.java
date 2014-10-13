/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sales.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ulme
 */
public class Customer {
    @XmlTransient
    private String id;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "address")
    private String address;
    @XmlElement(name = "phoneNumber")
    private String phoneNumber;
    
    private String plateNumber;
    
    private String model;
    
    private String color;
    
    public String getPlateNumber(){
        return plateNumber;
    }
    
    public void setPlateNumber(String plateNumber){
        if (plateNumber == null){
            this.plateNumber = plateNumber;
        }
    }
    
    public String toString(){
        return plateNumber;
    }
}
