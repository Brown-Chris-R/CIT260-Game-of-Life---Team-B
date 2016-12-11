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
public class SeniorChurchMenuView extends View {
    public SeniorChurchMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Senior Church Menu               |"
                  + "\n----------------------------------------"
                  + "\nS - Sacrament"
                  + "\nC - Sunday School"
                  + "\nP - Priesthood"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "S": // Senior Church Sacrament Scenario
                this.displaySeniorChurchSacramentScenario();
                break;
            case "C": // Senior Church SundaySchool Scenario
                this.displaySeniorChurchSundaySchoolScenario();
                break;
            case "P": // Senior Church Priesthood Scenario 
                this.displaySeniorChurchPriesthoodScenario();
                break;
          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displaySeniorChurchSacramentScenario() {
        SeniorChurchSacramentScenarioView churchSacrament = new SeniorChurchSacramentScenarioView();
        churchSacrament.display();
    }

    private void displaySeniorChurchPriesthoodScenario() {
        SeniorChurchPriesthoodScenarioView churchPriesthood = new SeniorChurchPriesthoodScenarioView();
        churchPriesthood.display();
    }

    private void displaySeniorChurchSundaySchoolScenario() {
        SeniorChurchSundaySchoolScenarioView churchSundaySchool = new SeniorChurchSundaySchoolScenarioView();
        churchSundaySchool.display();
    }
    
    
}
