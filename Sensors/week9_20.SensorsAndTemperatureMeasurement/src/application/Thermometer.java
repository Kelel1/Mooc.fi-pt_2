/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Kern Elder
 */

import java.util.Random;
public class Thermometer implements Sensor {    
    
    private boolean on;
    
    public Thermometer() {
        on = false;
    }

    @Override
    public boolean isOn() {                
       
       return on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {        
                
        if(isOn()) {  
            Random rand = new Random();
            int value = -30 + rand.nextInt(30 - (-29));
            return value;
        } else {
            throw new IllegalStateException("Thermometer is off");
        }
        
        
    }
    
}
