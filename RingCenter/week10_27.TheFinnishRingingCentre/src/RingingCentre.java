/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {
    private Map<Bird, List<String>> birdCenter = new HashMap<Bird, List<String>>();
    
    
    
    public void observe(Bird bird, String place) {
        if(!this.birdCenter.containsKey(bird)) {
           this.birdCenter.put(bird, new ArrayList<String>()); 
        }        
        this.birdCenter.get(bird).add(place);   
    }
    
    public void observations(Bird bird) {
        int count = 0;
        if(this.birdCenter.get(bird)== null) {
            System.out.println(bird.toString() +  " observations: " + count) ;
        }
        else if(this.birdCenter.get(bird).size() > 0) {
            count += this.birdCenter.get(bird).size();
            System.out.println(bird.toString()+  " observations: " + count);
            for(String place: this.birdCenter.get(bird)) {
                System.out.println(place);
            }
            this.birdCenter.get(bird);            
            
        }
    }
}
