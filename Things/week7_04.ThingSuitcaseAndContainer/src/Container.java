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

public class Container { 
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int limit;
    
    public Container(int weightLimit){
        this.maxWeight = weightLimit;
        this.suitcases = new ArrayList<Suitcase>();
        this.limit = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
       if(suitcases.size() < 1 && suitcase.totalWeight() <= maxWeight){
            suitcases.add(suitcase);
            limit += suitcase.totalWeight() ;
        } else if(suitcase.totalWeight() + limit <= maxWeight){
            suitcases.add(suitcase);
            limit += suitcase.totalWeight() ;
        }  
    }
    
    public String toString(){
        return(suitcases.size() + " suitcases" + " (" + limit + " kg)");
    }
    
    public void printThings(){
        for(Suitcase packedItems : suitcases){
            packedItems.printThings();
        }
    }
    
    
}
