/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class Purchase {
    
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    // Returns purchase price, by raising the unit amount by the unit price
    public int price() {
        return this.amount * this.unitPrice;
    }
    
    //Increases by one the purchase unit amount
    public void increaseAmount() {
        this.amount += 1;        
    }
    
    //Returns the purchase in a string form
    @Override
    public String toString() {
        return(this.product + ": " + this.amount);
    }
}
