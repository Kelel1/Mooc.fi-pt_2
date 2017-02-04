/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.Comparator;

// Use Comparator to sort players by points
public class SortJumperByPoints implements Comparator<Jumper> {

    @Override
    public int compare(Jumper j1, Jumper j2) {
        if(j1.getPoints() > j2.getPoints()) {
            return 1;
        } else if(j2.getPoints() > j1.getPoints()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
    
    
    
}
