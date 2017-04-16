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
public class BlackHoleBox extends Box{
    
    private List<Thing> notHere;
    
    public BlackHoleBox() {
        this.notHere = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        this.notHere.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.notHere.contains(thing)) {
            return false;
        }
        return false;
    }
}
