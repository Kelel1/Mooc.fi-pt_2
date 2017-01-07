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

public class Suitcase {  
    private ArrayList<Thing> things;
    private int maxWeight;
    private int limit;
    
    
    public Suitcase(int weightLimit){
        this.maxWeight = weightLimit;
        this.things = new ArrayList<Thing>();
        this.limit = 0;
    }
    
    public void addThing(Thing thing){       
        if(things.size() < 1 && thing.getWeight() <= maxWeight){
            things.add(thing);
            limit += thing.getWeight();
        } else if(thing.getWeight() + limit <= maxWeight){
            things.add(thing);
            limit += thing.getWeight();
        }        
    }
    
    public String toString(){        
        if(things.isEmpty()){
            return ("empty" + " (" + limit + " kg)");
        } else if (things.size() == 1){
            return (things.size() + " thing" + " (" + limit + " kg)");
        } else {
            return (things.size() + " things" + " (" + limit + " kg)");
        }
              
    }
    
    public void printThings(){
        for(Thing item : things){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        int allWeight = 0;
        for(Thing item1 : things){
            allWeight += item1.getWeight();
        }
        return allWeight;
        
    }
    
    public Thing heaviestThing(){
        for(int i = 0; i <= things.size(); i++){
            for(int j = 1; j <= things.size(); j++){
                if(things.get(i).getWeight() > things.get(j).getWeight()){
                    return things.get(i);
                }else{
                    return things.get(j);
                }
            }
            
        }
        return null;
    }
        
}
    

