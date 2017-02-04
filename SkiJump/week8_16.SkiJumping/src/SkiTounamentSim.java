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
import java.util.Collections;
import java.util.List;

public class SkiTounamentSim {
    private List<Jumper> jumpers = new ArrayList<Jumper>();   
    
    public void start(Scanner reader) {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        
        // Enter contestant names
        while(true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();            
            Jumper contestant = new Jumper();
            contestant.addName(name);
           
            
            if(contestant.getName().length() > 0) {              
                  jumpers.add(contestant);
            } else {
                break;
            }            
            
        }
        
    }
    // Begins Tournament Interface
    public void startTournament(Scanner reader){
        
        int round = 0;
        spaces();
        System.out.println("The tournament begins!");
        spaces();
        
        while(true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String toJump = reader.nextLine();
            SkiRounds rounds = new SkiRounds();
            
            
            
            if(toJump.equals("jump")) {
                round += 1;                
                spaces();
                System.out.println("Round " + round);
                spaces();
                System.out.println("Jumping order:");
                sort();
                printOrder();
                System.out.println("");
                System.out.println("Results of round " + round);
                
                
                for(Jumper player: jumpers) {
                    System.out.println("  " + player.getName());
                    rounds.jumpLength();
                    System.out.println("    " + "length: " + rounds.getLength());                    
                    System.out.println("    " + "judge votes: " + rounds.judgeScores());
                    rounds.modifyScoreList();                  
                    player.addJumpLen(rounds.getLength());                    
                    player.addPoints(rounds.sumScores());
                    rounds.clearArrayList();
                    
                }               
                    
                
            } else {
                int count =0;
                spaces();
                System.out.println("Thanks!");
                System.out.println("");
                System.out.println("Tournament results:");
                System.out.println("Position    Name");
                sort();
                Collections.reverse(jumpers);    
                for(Jumper player: jumpers) {
                    count += 1;
                    System.out.println(count + "           " + player.toString() + "\n" + "            " + "jump lengths: " + player.printLengths());                    
                    
                }
                break;
            }
            
        }
    }   
    
    // Helper function that prints newlines
    public void spaces() {
        System.out.println("");
        System.out.println("");
    }
    
    // Helper function to print the order of the players by points
    public void printOrder() {
        int count = 0;
        for(Jumper skier : jumpers) {
            count += 1;
            System.out.println("  " + count + ". " + skier);           
        }
        System.out.println("");        
    }    
    
    //Sorts players in arrylist by points
    public void sort() {
        Collections.sort(jumpers, new SortJumperByPoints());        
    }  
    
    
}
