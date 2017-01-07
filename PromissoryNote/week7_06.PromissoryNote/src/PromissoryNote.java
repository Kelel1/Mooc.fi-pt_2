/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loaned;    
    
    public PromissoryNote(){
        this.loaned = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        loaned.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.loaned.containsKey(whose)){
            return this.loaned.get(whose);
        }
        return 0;
    }
}
