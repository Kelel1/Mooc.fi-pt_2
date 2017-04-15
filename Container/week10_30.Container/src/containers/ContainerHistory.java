/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.math.RoundingMode;
/**
 *
 * @author Kern Elder
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        this.history.add(situation);
    }
    
    public void reset() {        
        this.history.clear();        
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    // Determine the max value in the history
    public double maxValue() {        
        double maxVal = this.history.get(0);
        for(double i : this.history) {
            if(this.history.isEmpty()) {
                maxVal = 0;
                return maxVal;
            } else if(this.history.size() == 1) {
                maxVal = this.history.get(0);
            } else if(i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }
    
    // Determine the min value in the history
    public double minValue() {
        double minVal = this.history.get(0);        
        for(double i : this.history) {           
             if(this.history.isEmpty()) {
                minVal = 0.0;
                return minVal;
            } else if(this.history.size() == 1) {
                minVal = this.history.get(0);
            } else if(i < minVal) {
                minVal = i;
            }
        }
        return minVal;
    }
    
    // Calculate the average of the values in history
    public double average() {
        double value = 0.0;
        double averageVal = 0.0;
        
        for(int i = 0; i < this.history.size(); i++) {
            value += this.history.get(i);
            averageVal = (value / this.history.size());
            if(this.history.isEmpty()) {
                averageVal = 0;
            }
        }
        return averageVal;
    }
    
    //returns the absolute value of the single greatest fluctuation 
    //in the arrayList history
    
    public double greatestFluctuation() {
        double fluctuation = 0.0;
       
        
        if(this.history.isEmpty() || this.history.size() == 1) {
            fluctuation = 0.0;
        } 
        List<Double> valueChange = new ArrayList<Double>();
        for(int i = 0; i < this.history.size() - 1; i++) {
            double flux = Math.abs(this.history.get(i + 1) - this.history.get(i));
            valueChange.add(flux);
            
            for(double val : valueChange) {
            if(fluctuation < val) {
                fluctuation = val;
            }
        }
            
        }
        
        
        return fluctuation;
    }
    
    public double variance() {
        double var = 0.0;
        
        if(this.history.isEmpty() || this.history.size() == 1) {
            var = 0.0;
        }
        for (double numb: this.history) {
            var += Math.pow(numb - average(),2.0);
        }// write code here
        return (var)/(this.history.size()-1);
    }
        
    
}
