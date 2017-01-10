/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    private Map<String, Purchase> cart;
    
    public ShoppingBasket(){
        this.cart = new HashMap<String, Purchase>();        
    }
    
    // Adds purchase to the shopping basket
    public void add(String product, int price) {
        Purchase buy = new Purchase(product, 1, price);
        if(cart.containsKey(product)) {
            cart.get(product).increaseAmount();
        } else {
            cart.put(product, buy);
        }
    }
            
    //Returns the shopping basket's total price
    public int price() {
        int total = 0;
        for(Purchase items : cart.values()){
            total += items.price();
        }
        return total;
    }
    
    //Prints out the Purchase objects contained in basket
    public void print() {
        for(Purchase item : cart.values()) {
            System.out.println(item);
        }
    }
}
