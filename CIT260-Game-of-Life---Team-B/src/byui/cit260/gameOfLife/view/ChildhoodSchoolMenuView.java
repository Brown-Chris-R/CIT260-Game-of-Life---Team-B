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
public class ChildhoodSchoolMenuView extends View {
    public ChildhoodSchoolMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Childhood School Menu                       |"
                  + "\n----------------------------------------"
                  + "\nC - Cafeteria "
                  + "\nG - Gym"
                  + "\nP - Playground"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "C": // Childhood School Cafeteria Scenario
                this.displayChildhoodSchoolCafeteriaScenario();
                break;
            case "G": // Childhood School Gymn Scenario 
                this.displayChildhoodSchoolGymScenario();
                break;
            case "P": // Childhood School Playground Scenario
                this.displayChildhoodSchoolPlaygroundScenario();
                break;
          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayChildhoodSchoolCafeteriaScenario() {
        ChildhoodSchoolCafeteriaScenarioView schoolCafeteria = new ChildhoodSchoolCafeteriaScenarioView();
        schoolCafeteria.display();
    }

    private void displayChildhoodSchoolGymScenario() {
        this.console.println("\n*** displayChildhoodSchoolGymScenario() function called ***");
    }

    private void displayChildhoodSchoolPlaygroundScenario() {
        this.console.println("\n*** displayChildhoodSchoolPlaygroundScenario() function called ***");
    }
    
}
