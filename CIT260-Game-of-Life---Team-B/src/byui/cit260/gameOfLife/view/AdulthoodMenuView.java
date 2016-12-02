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
public class AdulthoodMenuView extends View{
 
    public AdulthoodMenuView() {
                   super("\n"
                  + "\n----------------------------------------"
                  + "\n| Adulthood Menu                       |"
                  + "\n----------------------------------------"
                  + "\nM - Mission"
                  + "\nW - Work"
                  + "\nU - University"
                  + "\nF - Family"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
      


    @Override
    public boolean doAction(String choice) {
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAdulthoodMissionMenu() {
        this.console.println("\n*** displayAdulthoodMissionMenu() function called ***");
    }

    private void displayAdulthoodWorkMenu() {
        AdulthoodWorkMenuView workMenu = new AdulthoodWorkMenuView();
        workMenu.display();
    }

    private void displayAdulthoodUniversityScenario() {
        this.console.println("\n*** displayAdulthoodUniversityScenario() function called ***");
    }
     private void displayAdulthoodFamilyScenario() {
        this.console.println("\n*** displayAdulthoodFamilyScenario() function called ***");
    }

   
    
}
