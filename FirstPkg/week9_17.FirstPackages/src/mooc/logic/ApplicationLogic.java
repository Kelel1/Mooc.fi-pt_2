/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author Kern Elder
 */
public class ApplicationLogic {
    private UserInterface visualIf;
    
    public ApplicationLogic(UserInterface ui) {
        this.visualIf = ui;
    }
    
    
    public void execute(int howManyTimes) {
        for(int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            this.visualIf.update();
        }
    }
    
}
