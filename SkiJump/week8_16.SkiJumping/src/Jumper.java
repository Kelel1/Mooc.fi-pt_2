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

public class Jumper {
    private String name;
    private int points;
    private ArrayList<Integer> lengths;
    
    public Jumper() {
        this.name = "";
        this.points = 0;
        this.lengths = new ArrayList<Integer>();
    }
    
    // Return name of contestants
    public String getName() {
        return this.name;
    }
    
    //Return points of contestants
    public int getPoints() {
        return this.points;
    }
    
    // Assigns names to contestants
    public void addName(String playerName) {
        this.name = playerName;
    }
    
    // Adds total points of each player
    public int addPoints(int newPoints) {
        return this.points += newPoints;
    }
    
    // Adds player jump lengths to ArrayList 
    public void addJumpLen(int points) {
        this.lengths.add(points);
    }
    
    // Prints out all jump lenghts for players at the end of sim.
    public String printLengths() {
        String len = "";
        int count = 0;
        for(Integer length : this.lengths) {
            count += 1;
            if(count != this.lengths.size()) {
                len += length + " m, ";
            } else {
                len += length + " m ";
            }           
        }
        return(len);         
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)"; 
    }
}
