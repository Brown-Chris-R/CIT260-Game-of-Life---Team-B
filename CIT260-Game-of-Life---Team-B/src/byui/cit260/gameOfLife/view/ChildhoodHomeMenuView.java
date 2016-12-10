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
public class ChildhoodHomeMenuView extends View {
    public ChildhoodHomeMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Childhood Homee Menu                       |"
                  + "\n----------------------------------------"
                  + "\nK - Kitchen "
                  + "\nL - Living Room"
                  + "\nY - Backyard"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "K": // Childhood Home Kitchen Scenario
                this.displayChildhoodHomeKitchenScenario();
                break;
            case "L": // Childhood Home Living Room Scenario 
                this.displayChildhoodHomeLivingRoomScenario();
                break;
            case "Y": // Childhood Home Backyard Scenario
                this.displayChildhoodHomeBackyardScenario();
                break;
          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayChildhoodHomeKitchenScenario() {
        ChildhoodHomeKitchenScenarioView homeKitchen = new ChildhoodHomeKitchenScenarioView();
        homeKitchen.display();
    }

    private void displayChildhoodHomeLivingRoomScenario() {
        ChildhoodHomeLivingRoomScenarioView homeLivingRoom = new ChildhoodHomeLivingRoomScenarioView();
        homeLivingRoom.display();
    }

    private void displayChildhoodHomeBackyardScenario() {
        ChildhoodHomeBackyardScenarioView homeBackyard = new ChildhoodHomeBackyardScenarioView();
        homeBackyard.display();
    }
    
}
