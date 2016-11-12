/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

/**
 *
 * @author cbrown
 */
public class AdolescenceLocationMenuView extends View {
    public AdolescenceLocationMenuView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n| Adolescence Menu                            |"
                  + "\n----------------------------------------"
                  + "\nA - School"
                  + "\nB - Church"
                  + "\nC - Home"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
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
        AdolescenceSchoolScenarioView ssView = new AdolescenceSchoolScenarioView();
        ssView.display();
    }

    private void displayAdolescenceChurchMenu() {
        System.out.println("\n*** displayAdolescenceChurchMenu() function called ***");
    }

    private void displayAdolescenceHomeMenu() {
        System.out.println("\n*** displayAdolescenceHomeMenu() function called ***");
    }
    
}
