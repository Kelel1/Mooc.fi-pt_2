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
import java.util.HashMap;

public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap();
    }
    
    /* Adds the parameter owner of the car which corresonds to the parameter registration plate
       method returns true if the car had no owner; if the car had an owner 
       already, the method returns false and it doesn't do anything
    */   
    /* Important: Searching hasmaps is somewhat counterintuitive, if you are searching by the value, 
       you must use the containskey method, which is then translated to the desired value
       to be searched.
    */
    public boolean add(RegistrationPlate plate, String owner){        
        if(owners.containsKey(plate)){
            return false;
        }
        this.owners.put(plate, owner);        
        return true;
    }
    
    /*returns the car owner which corresponds to the parameter register number
     *returning null if car is not registered
     */    
    public String get(RegistrationPlate plate){       
        if(this.owners.containsKey(plate)){
            return this.owners.get(plate);
        } else {
            return null;
        }
        
    }
    
    /*deletes the info connected to the parameter regeistration plate
     *returns true if info was deleted, false if there was no info. connected to 
     *the parameter in the register
     */    
    public boolean delete(RegistrationPlate plate){
        if(this.owners.containsKey(plate)){
            owners.remove(plate);
        } else if(!this.owners.containsKey(plate)){
            return false;
        }
        return true;
    }
    
    // prints all registration plates stored
    public void printRegistrationPlates(){
        for(RegistrationPlate tags : this.owners.keySet()){
            System.out.println(tags);
        }
    }
    
    /* prints all car owners stored, each owner's name printed only once even with 
     * multiple cars
     */
    public void printOwners(){
        ArrayList<String> ownersList = new ArrayList();
        for(RegistrationPlate tags1 : this.owners.keySet()){
            if(!ownersList.contains(owners.get(tags1))){
                ownersList.add(owners.get(tags1));
            }            
        }
        for(String name: ownersList){
            System.out.println(name);
        }
        
        
    }
    
}
