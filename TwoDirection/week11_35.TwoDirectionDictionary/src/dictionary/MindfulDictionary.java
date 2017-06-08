/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author Kern Elder
 */
public class MindfulDictionary {
    
    private Map dictionary;
    private Map dictionary_2;
    private String file;
    
    public MindfulDictionary() {
        this.dictionary =  new HashMap<String, String>();
        this.dictionary_2 =  new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) {
        this.dictionary =  new HashMap<String, String>();
        this.dictionary_2 =  new HashMap<String, String>();
        this.file = file;
    }
    
    // which loads a file whose name is given as parameter in the 
    // dictionary constructor
    public boolean load()  {
        File toOpen = new File(this.file);
        
            Scanner reader = null;
            
            try {
                reader = new Scanner(toOpen);
            } catch (Exception e) {
                return false;
            }        
        
            while ( reader.hasNextLine() ) {
                String line = reader.nextLine();
                String[] parts = line.split(":");                
                this.dictionary.put(parts[0], parts[1]);
                this.dictionary_2.put(parts[1], parts[0]);
            }            
            reader.close();
            return true;         
    }
    
    
    // adds a word to the dictionary. Each word has only one translation; if 
    // the same word is added twice, nothing happens
    public void add(String word, String translation) {
        
        if(!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
        }
        if(!this.dictionary_2.containsKey(translation)) {
            this.dictionary_2.put(translation, word);
        }
    }
    
    // returns the word translation; if the word isn't recognised, it 
    // returns null
    public String translate(String word) {
        if(this.dictionary.containsKey(word)) {
            return this.dictionary.get(word).toString();
        } else if (this.dictionary_2.containsKey(word)) {
            return this.dictionary_2.get(word).toString();
        } else {
            return null;
        }
        
    }
    
    // removes the given word and its translation from your dictionary
    public void remove(String word) {
        if(this.dictionary.containsKey(word) || this.dictionary.values().contains(word)) {
            this.dictionary.remove(word);
            this.dictionary.values().remove(word);
        }
        if(this.dictionary_2.containsKey(word) || this.dictionary_2.values().contains(word)) {
            this.dictionary_2.remove(word);
            this.dictionary_2.values().remove(word);
        }
    }    
    
    /* when the method is called, the dictionary contents are written into
     * the file whose name was given as parameter to the constructor. The 
     * method returns false if the file can't be saved; otherwise it returns true    
     */
    public boolean save() {
        
        FileWriter toSave = null;
        
        try {
            toSave = new FileWriter(this.file);
            for(Object key: this.dictionary.keySet()) {
            toSave.write(key + ":" + this.dictionary.get(key) + "\n");
        }
        toSave.close();
        } catch (Exception e) {
            return false;
        }       
        return true;
    }
}
