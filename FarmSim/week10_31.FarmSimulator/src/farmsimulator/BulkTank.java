/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.math.BigDecimal;

/**
 *
 * @author Kern Elder
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getVolume() {
        return this.volume;
    }
    
    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount) {
        if(this.volume + amount < this.capacity) {
            this.volume += amount;
        } else if(this.volume + amount > this.capacity) {
            this.volume = this.capacity;

        }
    }
    
    public double getFromTank(double amount) {
        double remove = 0;
        if(this.volume >= amount) {
            remove = this.volume -= amount;            
        } else if(this.volume < amount) {            
            this.volume = 0;
            remove = this.volume;
        }   
        return remove;
    }
    
   
    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(this.capacity) ;
    }
}
