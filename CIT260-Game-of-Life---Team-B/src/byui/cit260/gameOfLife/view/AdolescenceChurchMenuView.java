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
public class AdolescenceChurchMenuView extends View {
    public AdolescenceChurchMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Adolescence Church Menu               |"
                  + "\n----------------------------------------"
                  + "\nS - Sacrament"
                  + "\nP - Priesthood"
                  + "\nA - Additional"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "S": // Adolescence Church Sacrament Scenario
                this.displayAdolescenceChurchSacramentScenario();
                break;
            case "P": // Adolescence Church Priesthood Scenario 
                this.displayAdolescenceChurchPriesthoodScenario();
                break;
            case "A": // Adolescence Church Additional Scenario
                this.displayAdolescenceChurchAdditionalScenario();
                break;
          
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAdolescenceChurchSacramentScenario() {
        AdolescenceChurchSacramentScenarioView schoolSacrament = new AdolescenceChurchSacramentScenarioView();
        schoolSacrament.display();
    }

    private void displayAdolescenceChurchPriesthoodScenario() {
        System.out.println("\n*** displayAdolescenceChurchPriesthoodScenario() function called ***");
    }

    private void displayAdolescenceChurchAdditionalScenario() {
        System.out.println("\n*** displayAdolescenceChurchAdditionalScenario() function called ***");
    }
    
    
}
