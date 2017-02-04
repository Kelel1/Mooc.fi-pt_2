/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kern Elder
 */

/* This class executes successive rounds for the ski athletes assigning points based on
 * a randomly generated length between 60 and 120, and randomly generated(judges scores) 
 * between 10 and 20, with the highest and lowest judged scored being excluded from 
 * the overall score of the athletes.
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SkiRounds {
    
    private ArrayList<Integer> scores; 
    private int jumpLength;
    private Random rand;
    
    public SkiRounds() {
    
       this.scores = new ArrayList<Integer>();
       this.jumpLength = 0;
       this.rand = new Random();
       
}

/* Uses random to generated jump lengths for athlete and assign jump length to score   
 * range(60 - 120 exclusive)
 */ 
public void jumpLength() {   
    this.jumpLength = 60 + rand.nextInt(120 - 61);    
}

/* Randomly generate five scores between 10 and 20(inclusive) and assign to ArrayList scores
 */
public ArrayList<Integer> judgeScores() {
    int score;     

    for(int i = 0; i < 5; i++) {
        score = 10 + rand.nextInt(20 - 11);
        this.scores.add(score);
        Collections.sort(scores);        
    }
    return this.scores;
}

// Empties ArrayList for each new Character's set of scores
public void clearArrayList(){
    scores.clear();
}

/* Removes the first and last scores from ArrayList, which are the lowest and
 * higest values, which are not included in the final contestant scores
 */
public void modifyScoreList() {
    scores.remove(0);
    scores.remove(3);
}

/* Adds the sum of the jump length and the three judge scores to the total
 * points of each ski contestant
 */
public int sumScores() {
    int totalPoints = 0;
    for(int i = 0; i < scores.size(); i++) {
        totalPoints += scores.get(i);
    }
    return totalPoints + getLength();
}

// Return jump length values
public int getLength() {
    return this.jumpLength;    
}

// Prints the ArrayList showing all scores
public String printScores() {
    return this.scores.toString();
}  

    
}
