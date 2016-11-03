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
public class AdolescenceLocationMenuView {
    private String menu;
    public AdolescenceLocationMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n| Adolescence Menu                            |"
                  + "\n----------------------------------------"
                  + "\nA - School"
                  + "\nB - Church"
                  + "\nC - Home"
                  + "\nQ - Quit"
                  + "\n----------------------------------------";
    }
    /**
     * displays the main menu view
     */
    void displayAdolescenceLocationMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get the players menu choice
            String menuOption = getInput();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game

            // do the requested action and display the next view
            done = this.doAction(menuOption);
        
        } while (!done);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // set flag to not valid
        String selection = null; // value to be returned

        while (!valid) {
            System.out.println("\n" + this.menu);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            break; // end the loop    
        }
        return selection; // return the selection
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "A": // Adolescence School Scenario
                this.displayAdolescenceSchoolScenario();
                break;
            case "B": // Adolescence Church Menu
                this.displayAdolescenceChurchMenu();
                break;
            case "C": // Adolescence Home Menu
                this.displayAdolescenceHomeMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAdolescenceSchoolScenario() {
        System.out.println("\n*** displayAdolescenceSchoolScenario() function called ***");
    }

    private void displayAdolescenceChurchMenu() {
        System.out.println("\n*** displayAdolescenceChurchMenu() function called ***");
    }

    private void displayAdolescenceHomeMenu() {
        System.out.println("\n*** displayAdolescenceHomeMenu() function called ***");
    }
    
}
