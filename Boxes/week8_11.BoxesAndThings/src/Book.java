/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class Book implements ToBeStored {
    private String author;
    private String bookName;
    private double bookWeight;
    
    public Book(String writer, String name, double weight){
        this.author = writer;
        this.bookName = name;
        this.bookWeight = weight;
    }
    @Override
    public double weight(){
        return this.bookWeight;
    }
    
    @Override
    public String toString(){
        return(this.author + ": " + this.bookName);
    }
    
}
