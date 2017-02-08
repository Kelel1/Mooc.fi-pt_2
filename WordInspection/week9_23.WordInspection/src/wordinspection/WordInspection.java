/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author Kern Elder
 */
import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class WordInspection {
    private File file;
    private Scanner reader;
    private int count;
    private List<String> collections;
    
    public WordInspection(File file) {
        this.file = file;
        
    }
    
    public int wordCount() throws Exception {
        this.reader = new Scanner(this.file, "UTF-8");
        this.count = 0;
        while(reader.hasNextLine()) {
            this.count += 1;
            reader.nextLine();
        }
        return this.count;
    }
    
    public List<String> wordsContainingZ() throws Exception {
        this.collections = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNext()) {
            String line = reader.nextLine();
            if(line.contains("z")) {
                collections.add(line);
            }
        }
        return collections;
    }
    
    public List<String> wordsEndingInL()throws Exception {
        this.collections = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNext()) {
            String line = reader.nextLine();
            if(line.endsWith("l")) {
                collections.add(line);
            }
        }
        return collections;
    }
    
    public List<String> palindromes() throws Exception {
        this.collections = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");
        
        
        while(reader.hasNext()) {
            String line = reader.nextLine();
            String palindrome = "";
            for(int x = 1; x <= line.length(); x++) {
                char letter = line.charAt(line.length()  - x);
                palindrome += letter;            
            }            
            if(line.equals(palindrome)) {
                collections.add(line);
            }
            
        }
        return collections;
    }
    
    public List<String> wordsWhichContainAllVowels()throws Exception {
        this.collections = new ArrayList<String>();
        this.reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNext()) {
            String line = reader.nextLine();
            
            if (line.contains("a") && line.contains("e") && line.contains("i") && line.contains("o") && line.contains("u")
                    && line.contains("y") && line.contains("ä") && line.contains("ö")) {
                collections.add(line);
            }
                    
        }
        return collections;
    }
}
