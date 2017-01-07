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
public class Calculator {
    private Reader reader;
    private int count;
public Calculator(){
    this.reader = new Reader();
    this.count = 0;
}

public void start() {
        
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                this.count+=1;
                sum();
            } else if (command.equals("difference")) {
                this.count+=1;
                difference();
            } else if (command.equals("product")) {
                this.count+=1;
                product();
            }
        }

        statistics();
    }


private void sum(){
    System.out.println("value1: ");
    int valueOne = reader.readInteger();
    System.out.println("value2: ");
    int valueTwo = reader.readInteger(); 
    
    System.out.print("sum of the values ");
    System.out.println(valueOne + valueTwo);  
    
}

private void difference(){
    System.out.println("value1: ");
    int valueOne = reader.readInteger();
    System.out.println("value2: ");
    int valueTwo = reader.readInteger(); 
    
    System.out.print("difference of the values ");
    System.out.println(valueOne - valueTwo);
    
}

private void product(){
    System.out.println("value1: ");
    int valueOne = reader.readInteger();
    System.out.println("value2: ");
    int valueTwo = reader.readInteger();
    
    System.out.print("product of the values ");
    System.out.println( valueOne * valueTwo);
}

private void statistics(){   
    System.out.print("Calculations done ");
    System.out.println(count);
}

}
