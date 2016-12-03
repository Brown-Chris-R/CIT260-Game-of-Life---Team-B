/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author cbrown
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = CIT260GameOfLifeTeamB.getInFile();
    protected final PrintWriter console = CIT260GameOfLifeTeamB.getOutFile();
    
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
        boolean valid = false; // set flag to not valid
        String selection = null; // value to be returned

        while (!valid) {
            this.console.println("\n" + this.displayMessage);
            
            try {
                selection = this.keyboard.readLine(); // get next line typed on keyboard
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            selection = selection.trim();
            
            if (selection.length() < 1) {
                this.console.println("\n*** You must enter a value *** Try again");
                continue;
            }
            break; // end the loop    
        }
        return selection; // return the selection
    }
}
