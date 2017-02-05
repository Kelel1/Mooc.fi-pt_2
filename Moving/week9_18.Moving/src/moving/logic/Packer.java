/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author Kern Elder
 */
import java.util.List;
import java.util.ArrayList;
import moving.domain.Item;
import moving.domain.Thing;
import moving.domain.Box;

public class Packer {
    private int boxesVolume;
    private List<Box> boxes;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();       
    }
    
    public List<Box> packThings(List<Thing> things) {
        
        for(Thing item:things) {
            Box toPack = new Box(this.boxesVolume);
            toPack.addThing(item);
            this.boxes.add(toPack);
        }        
        return this.boxes;
    }
        
}



