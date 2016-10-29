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
class MainMenuView {
    private String menu;
    public MainMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n| Main Menu                            |"
                  + "\n----------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n----------------------------------------";
    }
    /**
     * displays the main menu view
     */
    void displayMainMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get the players menu choice
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game

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
            case "N": // create and start new game
                this.startNewGame();
                break;
            case "G": // get and start saved game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpManu();
                break;
            case "S": // create and start new game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(CIT260GameOfLifeTeamB.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpManu() {
        System.out.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
    
}
