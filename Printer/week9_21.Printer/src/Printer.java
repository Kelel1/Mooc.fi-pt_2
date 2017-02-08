/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.io.File;
import java.util.Scanner;


public class Printer {    
    private Scanner reader;
    private File files;
    
    
    public Printer(String fileName)throws Exception {
        this.files = new File(fileName);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        
        this.reader = new Scanner(this.files); 
        while(reader.hasNextLine()) {
            
            String words = reader.nextLine();
            
            if(words.contains(word)) {
               System.out.println(words);                
            }
        }
     
    }
    
    
}
    
