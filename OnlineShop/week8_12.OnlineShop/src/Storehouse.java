/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Storehouse {    
    private Map<String, Integer> storehouse;
    private Map<String, Integer> inventory;  
    
    public Storehouse(){       
       this.storehouse = new HashMap<String, Integer>();
       this.inventory = new HashMap<String, Integer>();      
    }
    
    // Adds products, price, inventory
    public void addProduct(String product, int price, int stock){        
        storehouse.put(product, price);   
        inventory.put(product, stock);        
    }
            
            
    // Returns price of product        
    public int price(String product) {
        if(storehouse.containsKey(product)){
            return storehouse.get(product);
        }
        return -99;       
    }
    
    //Returns the stock of the parameter product
    
    public int stock(String product) {        
        if(inventory.containsKey(product)){
            return inventory.get(product);
        }
        return 0;
    }
    
    /* Reduces the the stock of the parameter by 1, and returns true if the 
     * Obejct was available, false otherwise, stock cannot be negative.    
    */
    
    public boolean take(String product) {
        if(inventory.containsKey(product) && inventory.get(product) > 0){
            int inStock = inventory.get(product) - 1;
            inventory.put(product, inStock);
            return true;
        } else {
            return false;
        }
    }
    
    
    // Returns a name set of the products contained in the storehouse
    public Set<String> products() {
        Set<String> keys = inventory.keySet();
        return keys;       
    }
        
}
    

        


