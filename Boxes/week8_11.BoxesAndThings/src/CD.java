/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class CD implements ToBeStored {
    final private double weight = 0.1;
    private String recordArtist;
    private String cdTitle;
    private int cdYear;
    
    public CD(String artist, String title, int publishingYear){
        this.recordArtist = artist;
        this.cdTitle = title;
        this.cdYear = publishingYear;
    }
    
    @Override
    public double weight(){
        return this.weight; 
    }
    
    @Override
    public String toString(){
        return(this.recordArtist + ": " + this.cdTitle + " (" + this.cdYear + ")");
    }
    
    
    
}
