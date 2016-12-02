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
public class SeniorMenuView extends View {
    
    public SeniorMenuView() {
               super( "\n"
                  + "\n----------------------------------------"
                  + "\n| Senior Menu                       |"
                  + "\n----------------------------------------"
                  + "\nC - Church "
                  + "\nH - Home"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "C": // Senior Church Menu
                this.displaySeniorChurchMenu();
                break;
            case "H": // Senior Home Menu
                this.displaySeniorHomeMenu();
                break;
          
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displaySeniorChurchMenu() {
        this.console.println("\n*** displaySeniorChurchMenu() function called ***");
    }

    private void displaySeniorHomeMenu() {
        this.console.println("\n*** displaySeniorHomeMenu() function called ***");
    }
    
}
