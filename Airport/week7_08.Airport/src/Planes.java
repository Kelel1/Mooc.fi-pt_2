/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */


public class Planes {
    
    private String id;
    private int capacity;    
    
    public Planes(){
        this.id = "";
        this.capacity = 0;
    }
    
    public void setId(String identity){
        this.id = identity;
    }
    public void setCapacity(int size){
        this.capacity = size;
    }

    
    public String toString(){
        return(this.id +" (" + this.capacity + " ppl)");
    }
    
    public String getId(){
        return(this.id);
    }
}
