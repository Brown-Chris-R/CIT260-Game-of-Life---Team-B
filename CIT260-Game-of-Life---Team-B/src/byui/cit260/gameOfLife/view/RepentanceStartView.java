/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.RepentanceControl;
import java.util.Scanner;

/**
 *
 * @author RMLOY_000
 */
class RepentanceStartView {
    private String assessment;
    public  RepentanceStartView() {
        this.assessment=
                "\n==========================================================="
                + "\nYour are about to take a self-assessment about repantance"
                + "\nfor the response key 1    = never,   2    =   sometimes, "
                + "\n 3 = often 4 = almost always, 5 = always"
                + "Or enter 'Q' to return Game Menu"
                + "\n========================================================="
                ;
}

    void displayRepentanceStartView() {
              boolean done = false; // set flag to not done
        do {
            // prompt for and get the players menu choice
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // Return to previous menu

            // do the requested action and display the next view
            done = this.doAction(menuOption);
        
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // set flag to not valid

        while (!valid) {
            System.out.println("\n" + this.assessment);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end the loop    
        }
        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {
        System.out.println("***RepentanceControl () function called***");
        return true;
    }
}