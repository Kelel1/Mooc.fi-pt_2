/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;    
    
    public Hand() {
        this.hand = new ArrayList<Card>();
        
    }
    
    // Adds a card to the hand
    public void add(Card card) {
        hand.add(card);
    }    
            
    // Prints the cards in the hand
    public void print() {
        for(Card play : hand) {
            System.out.println(play.toString());
        }
    }
    
    // Sorts the cards in hand
    public void sort() {
        Collections.sort(hand);        
    }

    
    
    
    @Override
    public int compareTo(Hand otherHand) {       
         
        int points1 = 0;
        int  points2= 0;
        
        for(Card play : otherHand.hand) {
            points1 += play.getValue();
        }
        for(Card play2 : this.hand) {
            points2 += play2.getValue();
        }
            
        if(points1 == points2) {
                return 0;
        } else if (points1 > points2) {
            return -1;
        } else {
            return 1;
        }
        
        
    
    }
    
    
    //Sorts cards in hand against suit
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suits = new SortAgainstSuitAndValue();
        
        Collections.sort(hand, suits);
    }
    
    
}
        
    
