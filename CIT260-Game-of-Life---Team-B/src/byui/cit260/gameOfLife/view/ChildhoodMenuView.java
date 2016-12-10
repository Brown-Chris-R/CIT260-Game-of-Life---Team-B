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
public class ChildhoodMenuView extends View{
 
    public ChildhoodMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Childhood Menu                       |"
                  + "\n----------------------------------------"
                  + "\nS - School "
                  + "\nC - Church "
                  + "\nH - Home"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "S": // Childhood School Menu
                this.displayChildhoodSchoolMenu();
                break;
            case "C": // Childhood Church Menu
                this.displayChildhoodChurchMenu();
                break;
            case "H": // Childhood Home Menu
                this.displayChildhoodHomeMenu();
                break;
          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayChildhoodSchoolMenu() {
        ChildhoodSchoolMenuView schoolMenu = new ChildhoodSchoolMenuView();
        schoolMenu.display();
    }

    private void displayChildhoodChurchMenu() {
        ChildhoodChurchMenuView churchMenu = new ChildhoodChurchMenuView();
        churchMenu.display();
    }

    private void displayChildhoodHomeMenu() {
        ChildhoodHomeMenuView homeMenu = new ChildhoodHomeMenuView();
        homeMenu.display();
    }
    
}
