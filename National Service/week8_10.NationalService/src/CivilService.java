/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */

// First introdction to interfaces

public class CivilService implements NationalService{
    
    private int daysLeft;
    
    public CivilService(){        
        this.daysLeft = 362;        
        
    }
    
    public int getDaysLeft(){
        return this.daysLeft;
    }
    
    public void work(){
        int days;
        if(this.daysLeft > 0){
            days = this.daysLeft -= 1;
            System.out.println(days);
                    
        }
    }
}
