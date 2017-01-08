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


public class Flights {
    private ArrayList<Planes> plane;
    private String departure;
    private String destination;
   
    
    public Flights(){
        this.plane = new ArrayList();
        this.departure = "";
        this.destination = "";
        
    }
    
    public void addPlanes(Planes flyer){
        plane.add(flyer);
    }
    
    public boolean checkID(String id){
        for(Planes jet: plane){
            if(jet.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    
    public String returnPlane(String rtrnPlane){
        for(Planes jet1: plane){
            if(jet1.getId().equals(rtrnPlane)){
                return jet1.toString();
            }
        }
        return ("Plane entry not valid");
    }
   /* 
    public void addToTrip(Planes flyer1){
        trip.put(flyer1.toString(), "(" + this.departure + " - " + this.destination + ")");
    } */
   /* 
    public ArrayList<String> flightList(){
        ArrayList<String> list = new ArrayList();
        for(String key : this.trip.keySet()){
            list.add(key + " " + trip.get(key));
        }
        return list;
    }
    */
    public void setFlights(String goFrom, String goTo){
        this.departure = goFrom;
        this.destination = goTo;
    }
    
    public String printDeparture(){
        return this.departure;
    }
    
    public String printDestination(){
        return this.destination;
    }
    
    public void printPlanes(){
        for(Planes jet : plane){
             System.out.println(jet.toString());
        }
        
    }
    public String toString(){
        return ("(" + this.departure + "-" + this.destination + ")" + "\n");
    }
}
