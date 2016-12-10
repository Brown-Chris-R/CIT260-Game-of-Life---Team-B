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
public class AdolescenceMenuView extends View {
        public AdolescenceMenuView() {
                   super("\n"
                  + "\n----------------------------------------"
                  + "\n| Adolescence Menu                       |"
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
            case "S": // Adolescence School Menu
                this.displayAdolescenceSchoolScenario();
                break;
            case "C": // Adolescence Church Menu
                this.displayAdolescenceChurchMenu();
                break;
            case "H": // Adolescence Home Menu
                this.displayAdolescenceHomeMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAdolescenceSchoolScenario() {
        AdolescenceSchoolScenarioView school = new AdolescenceSchoolScenarioView();
        school.display();
    }

    private void displayAdolescenceChurchMenu() {
        AdolescenceChurchMenuView churchMenu = new AdolescenceChurchMenuView();
        churchMenu.display();
    }

    private void displayAdolescenceHomeMenu() {
        AdolescenceHomeMenuView homeMenu = new AdolescenceHomeMenuView();
        homeMenu.display();
    }

}
