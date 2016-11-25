/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byucit260.gameOfLife.exceptions.RepentanceControlException;
import byui.cit260.gameOfLife.control.RepentanceControl;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RMLOY_000
 */
public class RepentanceStartView extends View {
    
    public  RepentanceStartView() {
        
        super("\n==========================================================="
                + "\nYour are about to take a self-assessment about repantance"
                + "\nfor the response key 1    = never,   2    =   sometimes, "
                + "\n 3 = often 4 = almost always, 5 = always"
                + "Or enter 'Q' to return Game Menu"
                + "\n========================================================="
        );
}
   
    
         @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        if  ("Y".equals(choice)) {
            
                this.test();
            
                 
        }
        return false;
    }

    private void test() {
        System.out.println("\n*** SelfAssessment() function called ***\"");
    }

   
}