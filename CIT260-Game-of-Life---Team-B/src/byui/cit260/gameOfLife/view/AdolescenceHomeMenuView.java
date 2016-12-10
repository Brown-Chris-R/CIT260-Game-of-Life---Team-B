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
public class AdolescenceHomeMenuView extends View {
    public AdolescenceHomeMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Adolescence Homme Menu               |"
                  + "\n----------------------------------------"
                  + "\nY - Backyard"
                  + "\nB - Bedroom"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "Y": // Adolescence Home Backyard Scenario
                this.displayAdolescenceHomeBackyardScenario();
                break;
            case "B": // Adolescence Home Bedroom Scenario 
                this.displayAdolescenceHomeBedroomScenario();
                break;
          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAdolescenceHomeBackyardScenario() {
        AdolescenceHomeBackyardScenarioView homeBackyard = new AdolescenceHomeBackyardScenarioView();
        homeBackyard.display();
    }

    private void displayAdolescenceHomeBedroomScenario() {
        AdolescenceHomeBedroomScenarioView homeBedroom = new AdolescenceHomeBedroomScenarioView();
        homeBedroom.display();
    }

}
