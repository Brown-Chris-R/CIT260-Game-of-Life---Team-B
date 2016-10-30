/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.GameControl;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.util.Scanner;

/**
 *
 * @author cbrown
 */
public class HelpMenuView {
    private String menu;
    public HelpMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n| Help Menu                            |"
                  + "\n----------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nA - About the game"
                  + "\nV - View Game/Player"
                  + "\nQ - Quit"
                  + "\n----------------------------------------";
    }
    /**
     * displays the help menu view
     */
    void displayHelpMenuView() {

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
            System.out.println("\n" + this.menu);
            
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "G": // create and start new game
                this.displayGameGoal();
                break;
            case "A": // get and start saved game
                this.displayAboutGame();
                break;
            case "V": // display the help menu
                this.displayGamePlayer();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayGameGoal() {
        System.out.println("\n*** displayGameGoal function called ***");
    }

    private void displayAboutGame() {
        System.out.println("\nGemeOfLife Version: " + CIT260GameOfLifeTeamB.getGameVersion());
    }

    private void displayGamePlayer() {
        System.out.println("\n*** displayGamePlayer function called ***");
    }
    
    
}
