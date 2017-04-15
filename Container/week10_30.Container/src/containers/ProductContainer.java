/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Kern Elder
 */
public class ProductContainer extends Container {
    private String name;

    public ProductContainer(String productName, double tilavuus) {
        super(tilavuus);
        this.name = productName;
    }   
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    } 

    
    @Override
    public String toString() {
        return this.name + ": " + super.toString();
    }
}
