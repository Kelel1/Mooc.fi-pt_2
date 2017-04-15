/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Collection;
import java.util.LinkedList;


/**
 *
 * @author Kern Elder
 */
public class Barn {
    private BulkTank tanker = new BulkTank();
    private MilkingRobot robo = new MilkingRobot();
    
    
    public Barn(BulkTank tank) {
        this.tanker = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.tanker;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot)  {
        this.robo = milkingRobot;
    }
    
    public void takeCareOf(Cow cow) {
        try {
            this.robo.setBulkTank(tanker);
            this.robo.milk(cow);
        } catch (Exception e) {
            System.out.println("No milking robot installed");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        for(Cow moo: cows) {
            try {
                this.robo.setBulkTank(tanker);
                this.robo.milk(moo);
            } catch (Exception e) {
                System.out.println("No milking robot installed");
            }
        }
    }
    
    public String toString() {
        return this.tanker.toString();
    }
}
