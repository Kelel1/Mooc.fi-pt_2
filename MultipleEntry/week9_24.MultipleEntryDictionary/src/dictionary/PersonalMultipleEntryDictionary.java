/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Kern Elder
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Set<String> list;
    private Map<String, Set<String>> dictionary;   
    
    
    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
        
    }

    @Override
    public void add(String word, String entry) {         
       
        if(!this.dictionary.containsKey(word)) {          
            this.dictionary.put(word, this.list = new HashSet<String>());
            list.add(entry);
        } else {
            list.add(entry);
        }        

    }

    @Override
    public Set<String> translate(String word) {        
        
        for(String toTranslate: dictionary.keySet()) {
            if(this.dictionary.containsKey(word)) {
                list = dictionary.get(word);
            } else {                
                return null;
            }
        }        
        return list;
    }

    @Override
    public void remove(String word) { 
        dictionary.put(word, list = null);
        this.dictionary.remove(word);
        
    }
    
}
