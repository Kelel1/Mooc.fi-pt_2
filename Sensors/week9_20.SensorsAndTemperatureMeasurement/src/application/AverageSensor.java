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

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> list = new ArrayList<Integer>();
    
    
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
    }

    @Override
    public boolean isOn() {       
        for(Sensor sense : sensors) {
            if(!sense.isOn()) {
                return false;
            }
        }
        return true;
    }
    
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public void on() {
        for(Sensor sense : sensors) {
            sense.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sense : sensors) {
            sense.off();
        }
    }

    @Override
    public int measure() {        
        
        if(!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Average sensor is off or was not added");
        } else {
            int average = 0;
            for(Sensor sensor : this.sensors) {
                average += sensor.measure();
            }
                average /= this.sensors.size();
                list.add(average);
                return average;
            }        
    }
    
    public List<Integer> readings() {        
        
        return list;
    }
    
}
