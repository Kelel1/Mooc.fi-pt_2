
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
         
        
        Scanner reader = new Scanner(System.in);
        Flights toFly = new Flights();
        
       
       
    TextUserInterface o = new TextUserInterface(reader, toFly);
   
       
    o.startAirportPanel();
    
    
    o.startFlightPanel();
    
   
    
}
}
