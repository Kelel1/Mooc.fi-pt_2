/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TextUserInterface {
    private Scanner read;
    private Flights flight;
    private ArrayList<String> trip;

    public TextUserInterface(Scanner readInput, Flights destined){
        this.read = readInput;
        this.flight = destined;
        this.trip = new ArrayList();
    }

    public void startAirportPanel(){
        while(true){
            System.out.println("Airport panel");
            System.out.println("--------------------");
            menue();
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String entry = this.read.nextLine();

            if(entry.equals("1")){
                addAirplane();
            } else if(entry.equals("2")){
                addFlight();
            } else if(entry.equals("x")){
                break;
            } else {
                menue();
            }
        }
    }
    public void menue(){
        System.out.println("");
        System.out.println("Choose operation:");

    }

    public void startFlightPanel(){

        while(true){

            System.out.println("Flight service");
            System.out.println("------------");
            menue();
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String entry1 = this.read.nextLine();


                if(entry1.equals("1")){
                    flight.printPlanes();

                } else if(entry1.equals("2")){
                    for(String trips : trip){
                        System.out.println(trips);
                    }
                } else if(entry1.equals("3")){
                    System.out.println("Give plane ID: ");
                    String planeId = this.read.nextLine();
                    if(flight.checkID(planeId)){
                        System.out.println(flight.returnPlane(planeId));
                    }
                } else if(entry1.equals("x")){
                    break;
                } else {
                    menue();
                }

            }


    }

    //Adds flight to database
    public void addFlight(){

        System.out.println("Give plane ID: ");
        String id = this.read.nextLine();
        System.out.println("Give departure airport code: ");
        String from = this.read.nextLine();
        System.out.println("Give destination airport code: ");
        String to = this.read.nextLine();
        this.flight.setFlights(from, to);
        //this.trip.put(id, flight);
        
        trip.add(flight.returnPlane(id) + " " + flight.toString());
        
       

    }


    // Add planes to database
    public void addAirplane(){

        System.out.print("Give plane ID: ");
        String id = this.read.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(read.nextLine());
        Planes newPlane = new Planes();

        newPlane.setId(id);
        newPlane.setCapacity(capacity);
        flight.addPlanes(newPlane);
        
        System.out.println("");
    }


}
