/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
 
import java.util.Set;
import java.util.HashSet;

 
 
 
/**
 *
 * @author
 */
public class PersonalDuplicateRemover implements DuplicateRemover {   
    private Set<String> uniqueString;
    private int duplicate;
   
    public PersonalDuplicateRemover() {       
        this.uniqueString = new HashSet<String>();
        this.duplicate = 0;
    }
    
   
 
    @Override
    public void add(String characterString) {
        if(!this.uniqueString.contains(characterString)) {
        this.uniqueString.add(characterString);           
        } else {
            this.duplicate += 1;
        }
    }
 
    @Override
    public int getNumberOfDetectedDuplicates() {        
        
        return duplicate;        
    }
   
 
    @Override
    public Set<String> getUniqueCharacterStrings() {           
        
        return uniqueString;
    }
 
    @Override
    public void empty() {        
        this.uniqueString.clear(); 
        this.duplicate = 0;
    }
                   
               
   
}