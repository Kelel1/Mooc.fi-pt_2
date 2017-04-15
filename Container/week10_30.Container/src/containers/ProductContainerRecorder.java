/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author
 */
public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory record;    

    public ProductContainerRecorder(String productName, double tilavuus, double initialVolume) {
        super(productName, tilavuus); 
        super.addToTheContainer(initialVolume);
        this.record = new ContainerHistory();
        this.record.add(initialVolume);
        
    }
    
    public String history() {
        return this.record.toString();
    }   

    @Override
    public void addToTheContainer(double amount) {        
        super.addToTheContainer(amount);               
        this.record.add(super.getVolume());        
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.record.toString());
        System.out.println("Greatest product amount: " + record.maxValue());
        System.out.println("Smallest product amount: " + record.minValue());
        System.out.println("Average: " + record.average());
        System.out.println("Greatest change: " + record.greatestFluctuation());
        System.out.println("Variance: " + record.variance());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {      
        this.record.add(super.getVolume() - amount);
        return super.takeFromTheContainer(amount);
        
    }  
    
    
}
