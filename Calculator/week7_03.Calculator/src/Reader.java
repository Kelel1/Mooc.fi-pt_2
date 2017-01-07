import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
public class Reader {
    private Scanner entry = new Scanner(System.in); 
    
public Reader(){
  //this.toScan = entry;
           
}
    
public String readString(){
    String command = entry.nextLine();
    return command;
    
}

public int readInteger(){
    int digit = Integer.parseInt(entry.nextLine());
    return digit;
}
    
}
