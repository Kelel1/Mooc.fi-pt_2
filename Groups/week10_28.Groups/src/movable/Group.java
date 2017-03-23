/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Kern Elder
 */
public class Group implements Movable{
    private List<Movable> groups = new ArrayList<Movable>();
    

    @Override
    public void move(int dx, int dy) {
        for(Movable animal: this.groups) {
            animal.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){   
       String allOrganisms = "";
       for(Movable organism: this.groups) {
           allOrganisms += organism + "\n";
       }

       return allOrganisms;
    }
    
    public void addToGroup(Movable movable) {
        groups.add(movable);
    }
    
}
