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
public class ChildhoodChurchMenuView extends View {
    public ChildhoodChurchMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Childhood Church Menu                       |"
                  + "\n----------------------------------------"
                  + "\nS - Sunday School "
                  + "\nP - Primary"
                  + "\nB - Bishop's Office"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "S": // Childhood Church Sunday School Scenario
                this.displayChildhoodChurchSundaySchoolScenario();
                break;
            case "P": // Childhood Church Primary Scenario 
                this.displayChildhoodChurchPrimaryScenario();
                break;
            case "B": // Childhood Church Bishop's Office Scenario
                this.displayChildhoodChurchBishopsOfficeScenario();
                break;
          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayChildhoodChurchSundaySchoolScenario() {
        ChildhoodChurchSundaySchoolScenarioView churchSundaySchool = new ChildhoodChurchSundaySchoolScenarioView();
        churchSundaySchool.display();
    }

    private void displayChildhoodChurchPrimaryScenario() {
        ChildhoodChurchPrimaryScenarioView churchPrimary = new ChildhoodChurchPrimaryScenarioView();
        churchPrimary.display();
    }

    private void displayChildhoodChurchBishopsOfficeScenario() {
        ChildhoodChurchBishopsOfficeScenarioView churchBishopsOffice = new ChildhoodChurchBishopsOfficeScenarioView();
        churchBishopsOffice.display();
    }
    
}
