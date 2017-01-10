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

public class MilitaryService implements NationalService {
    
    private int serviceDays;
    
    public MilitaryService(int daysLeft){
        this.serviceDays = daysLeft;
    }
    
    public int getDaysLeft(){        
        return this.serviceDays;
    }
    
    public void work(){ 
        int days;
        if(this.serviceDays > 0){
            days = this.serviceDays -= 1;
            System.out.println(days);
        }
        
    }
}
