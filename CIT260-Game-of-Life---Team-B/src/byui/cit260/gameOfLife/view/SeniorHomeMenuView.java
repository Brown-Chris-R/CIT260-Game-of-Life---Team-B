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
public class SeniorHomeMenuView extends View {
    public SeniorHomeMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Senior Homme Menu               |"
                  + "\n----------------------------------------"
                  + "\nY - Backyard"
                  + "\nL - Living Room"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "Y": // Senior Home Backyard Scenario
                this.displaySeniorHomeBackyardScenario();
                break;
            case "L": // Senior Home Living Room Scenario 
                this.displaySeniorHomeLivingRoomScenario();
                break;
          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displaySeniorHomeBackyardScenario() {
        SeniorHomeBackyardScenarioView homeBackyard = new SeniorHomeBackyardScenarioView();
        homeBackyard.display();
    }

    private void displaySeniorHomeLivingRoomScenario() {
        SeniorHomeLivingRoomScenarioView homeLivingRoom = new SeniorHomeLivingRoomScenarioView();
        homeLivingRoom.display();
    }

}
