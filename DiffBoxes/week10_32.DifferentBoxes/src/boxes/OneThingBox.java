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
public class OneThingBox extends Box {
    
    private List<Thing> addThing;
    
    public OneThingBox() {
        this.addThing = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(this.addThing.size() == 0) {
            this.addThing.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.addThing.contains(thing)) {
            return true;
        }
        return false;
    }
    
}
