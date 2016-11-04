/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import java.util.Scanner;

/**
 *
 * @author RMLOY_000
 */
class AdulthoodStartView {

    
 private String menu;
    public AdulthoodStartView() {
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n| Adulthood Menu                       |"
                  + "\n----------------------------------------"
                  + "\nM - Mission"
                  + "\nW - Work"
                  + "\nU - University"
                  + "\nF - Family"
                  + "\nQ - Quit"
                  + "\n----------------------------------------";
    }
    /**
     * displays the main menu view
     */
    void displayAdulthoodStartView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get the players menu choice
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the MENU

            // do the requested action and display the next view
            done = this.doAction(menuOption);
        
        } while (!done);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // set flag to not valid
        String value = null; // value to be returned

        while (!valid) {// loop
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); //trim off leading
            
            if (value.length() < 1) {//value is blank
                System.out.println("\n*** Invalid value *** Try again");
                continue;
            }
            break; // end the loop    
        }
        return value; // return the value
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "M": // Adulthood Mission Scenario
                this.displayAdulthoodMissionMenu();
                break;
            case "W": // Adulthood Work Menu
                this.displayAdulthoodWorkMenu();
                break;
            case "U": // Adulthood University Menu
                this.displayAdulthoodUniversityScenario();
                break;
            case "F": // Adulthood Family Menu
                this.displayAdulthoodFamilyScenario();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAdulthoodMissionMenu() {
        System.out.println("\n*** displayAdulthoodMissionMenu() function called ***");
    }

    private void displayAdulthoodWorkMenu() {
        System.out.println("\n*** displayAdulthoodWorkMenu() function called ***");
    }

    private void displayAdulthoodUniversityScenario() {
        System.out.println("\n*** displayAdulthoodUniversityScenario() function called ***");
    }
     private void displayAdulthoodFamilyScenario() {
        System.out.println("\n*** displayAdulthoodFamilyScenario() function called ***");
    }

   
    
}
