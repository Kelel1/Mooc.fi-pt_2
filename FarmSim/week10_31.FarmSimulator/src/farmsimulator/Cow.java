/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Random;

/**
 *
 * @author Kern Elder
 */
public class Cow implements Milkable, Alive {
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private String name;
    private double udder;
    private double capacity;
    
    public Cow() {        
        this.name = NAMES[0 + new Random().nextInt(NAMES.length)];        
        this.udder = 0.0;   
        this.capacity = 15 + new Random().nextInt(26);
    }
    
    public Cow(String name) {
       this.name = name;
       this.udder = 0.0;
       this.capacity  = 15 + new Random().nextInt(26);
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {        
        return this.capacity;
    }
    
    public double getAmount() {
        return this.udder;
    }
    
    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.udder) + "/" + this.capacity;
    }

    @Override
    public double milk() {
        double total = this.udder;        
        this.udder = 0.0;
        return total;
    }
        

    @Override
    public void liveHour() {
        Random value = new Random();
        double min = 0.7;
        double max = 2;            
        double rangeValues = Math.ceil(min + (max - min) * value.nextDouble()); 
        
        if(this.udder + rangeValues  <= this.capacity) {            
           this.udder += rangeValues; 
        }  
    }
}
