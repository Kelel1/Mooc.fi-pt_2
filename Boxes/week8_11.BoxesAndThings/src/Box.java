/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.ArrayList;

public class Box implements ToBeStored{
    private double boxWeight;
    private ArrayList<ToBeStored> stored;
    private double weightLimit;
    
    // Receives max weight in kilograms
    public Box(double maxWeight){
        this.boxWeight = maxWeight;
        this.stored = new ArrayList();
        this.weightLimit = 0;
    }
    
    @Override
    public double weight(){
        double weight = 0;        
        for(ToBeStored item : this.stored){
            weight += item.weight();
        }
        return weight;
    }
    
    public void add(ToBeStored item){        
        if(this.weightLimit  + item.weight() < this.boxWeight){            
            stored.add(item);   
            this.weightLimit += item.weight();
        }
              
    }  
    
    public void size(){
        System.out.println(stored.size());
    }
    
    @Override
    public String toString(){        
        return("Box: " + stored.size() + " things, " + "total weight " + weight() + " kg");
    }
    
}
