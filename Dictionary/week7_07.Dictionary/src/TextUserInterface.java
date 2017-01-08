/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner toScan;
    private Dictionary tranlator;
   
    
    
    
    // TextUserInterface constructor 
    public TextUserInterface(Scanner Reader, Dictionary dictionary){
        this.toScan = Reader;
        this.tranlator = dictionary;
           
    }
    
   // Start the translator 
    public void start(){
        while(true){
            System.out.println("Statement");        
            String statement = this.toScan.nextLine();
            
            if(statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if(statement.equals("add")){
                add();
            }else if(statement.equals("translate")){
                translate();
            } else {
                System.out.println("Unknown Statement");
        }
       
    }
    
    }
    // add asks for the word pair from the user, adding them to dictionary
    
    public void add(){
        
        System.out.println("add word pair");
        String wrd1 = this.toScan.nextLine();        
        System.out.println("add word pair");
        String wrd2 = this.toScan.nextLine();
        this.tranlator.add(wrd1, wrd2);
        
    }
    // translate asks user for word and prints it translation
    public void translate(){        
        System.out.println("In Finnish: ");
        String finnish = this.toScan.nextLine();
        String translate = this.tranlator.translate(finnish);
        
        System.out.println("Translation: " + translate);
    }
    
}
