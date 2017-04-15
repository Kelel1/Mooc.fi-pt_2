/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Kern Elder
 */
public class Farm implements Alive {
    
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;   
        this.cows = new LinkedList<Cow>();        
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void manageCows() {        
        this.barn.takeCareOf(this.cows);        
    }
    
    public String getHerd() {
        String herd = "Animals: " + "\n";
        if(this.cows.isEmpty()) {
            System.out.println("No cows. ");
        } else {            
            for(Cow moo: this.cows) {
                herd += "        " + moo.toString() + "\n";
            }
        }
        return herd;
    }
    
    public void addCow(Cow cows) {
        this.cows.add(cows);
    }
    
    public String toString() {
        return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + this.barn.getBulkTank()
        + "\n" +  this.getHerd(); 
    }
    
    public void installMilkingRobot(MilkingRobot roboto) {  
        MilkingRobot roboMilk = new MilkingRobot();
        this.barn.installMilkingRobot(roboMilk);
    }
    
    @Override
    public void liveHour() {
        for(Cow moo: this.cows) {
            moo.liveHour();
        }
    }
    
}
