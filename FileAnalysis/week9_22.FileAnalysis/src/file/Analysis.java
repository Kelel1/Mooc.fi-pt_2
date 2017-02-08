/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author Kern Elder
 */
import java.io.File;
import java.util.Scanner;

public class Analysis {
    
    private File file;
    private Scanner reader;
    
    public Analysis(File file) throws Exception {
        this.file = file;        
    }
    
    public int lines() throws Exception {  
        this.reader = new Scanner(file);
        int numLines = 0;
        while(reader.hasNextLine()) {
            reader.nextLine();
            numLines += 1; 
        }
        return numLines;
        
    }
    
    public int characters() throws Exception {
        this.reader = new Scanner(file);
        int totalChars = 0;
        while(reader.hasNextLine()) {
            String line = reader.nextLine(); 
            totalChars += line.length();
        }
        return totalChars + lines();
    }
}
