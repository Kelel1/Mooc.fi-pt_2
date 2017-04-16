/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kern Elder
 */
public class MaxWeightBox extends Box {
    
    private int maxWeight;
    private List<Thing> toAdd;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.toAdd = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for(Thing things: this.toAdd) {
            totalWeight += things.getWeight();
        }
        if((totalWeight + thing.getWeight()) <= this.maxWeight) {
            this.toAdd.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.toAdd.contains(thing)) {
            return true;
        } 
        return false;               
    }
    
}
