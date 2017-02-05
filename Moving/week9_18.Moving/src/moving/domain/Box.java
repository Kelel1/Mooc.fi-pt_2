/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Kern Elder
 */
import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private List<Thing> container;
    private int maxCapacity;
    
    public Box(int maximumCapacity) {
        this.container = new ArrayList<Thing>();   
        this.maxCapacity = maximumCapacity;
    }
    
    public boolean addThing(Thing thing) {
        int volume = 0;
        for(Thing item: this.container){
            volume += item.getVolume();
        } if(thing.getVolume() + volume <= this.maxCapacity) {
            this.container.add(thing);
            return true;
        } 
        return false;   
        
    }

    @Override
    public int getVolume() {
       int totalVolume = 0;
       for(Thing things: container) {
           totalVolume += things.getVolume();
       }
       return totalVolume;
    }
    
    @Override
    public String toString() {
        for(Thing item: this.container) {
            return item.toString();
        }
        return null;
    }
}
