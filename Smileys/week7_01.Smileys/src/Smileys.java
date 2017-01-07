
public class Smileys {
    
    
    public Smileys(){        
        
    }
    
    //method to print smiley faces
    private static void printSmileys(){        
        System.out.print(":)");    

    }   
    
    private static void controlSmiles(String words){
        int a = words.length();
        int i = 0;
        if(a < 6){
            while(i <= a){
                printSmileys();
                i++;
            }            
        }else if(a >= 6){
            while(i < a){
                printSmileys();
                i++;
            }
        }
    }
        

    
    private static void printWithSmileys(String characterString){ 
        
        
          
        controlSmiles(characterString);
        
        System.out.println( "");        
        
        if(characterString.length() % 2 == 1){
            System.out.println(":) " + characterString + "  :)");
        } else{
            System.out.println( ":) " + characterString + " :)");          

        }
        
        controlSmiles(characterString);      
        
        System.out.println( "");
        
        
        
        
    }
        
 

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Matti");
         printWithSmileys("Arto");
         printWithSmileys("Mikael");
         printWithSmileys("Interface");
         printWithSmileys("87.");
         printWithSmileys("\\8)/");
         
    }

}
