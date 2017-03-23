/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Kern Elder
 */
public class Organism implements Movable {
    private int x_coordinate;
    private int y_coordinate;
    
    public Organism(int x, int y) {
        this.x_coordinate = x;
        this.y_coordinate = y;
    }
    
    @Override
    public String toString() {
        return("x: " + this.x_coordinate + ";" + " y: " + this.y_coordinate);
    }   

    @Override
    public void move(int dx, int dy) {
        this.x_coordinate += dx;
        this.y_coordinate += dy;
    }
    
}
