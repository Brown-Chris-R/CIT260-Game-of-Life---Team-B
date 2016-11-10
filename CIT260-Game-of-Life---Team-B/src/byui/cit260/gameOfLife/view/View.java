/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import java.util.Scanner;

/**
 *
 * @author cbrown
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }
    /**
     * displays the main menu view
     */
    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get the players menu choice
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game

            // do the requested action and display the next view
            done = this.doAction(value);
        
        } while (!done);
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // set flag to not valid
        String selection = null; // value to be returned

        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** You must enter a value *** Try again");
                continue;
            }
            break; // end the loop    
        }
        return selection; // return the selection
    }
}
