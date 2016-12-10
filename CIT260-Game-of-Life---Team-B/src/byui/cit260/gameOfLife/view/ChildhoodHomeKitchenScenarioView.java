/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.ScoringControl;
import byui.cit260.gameOfLife.exceptions.ScoringControlException;

/**
 *
 * @author cbrown
 */
public class ChildhoodHomeKitchenScenarioView extends View {
    public ChildhoodHomeKitchenScenarioView() {
    super("\n"
        + "\n------------------ Childhood Home Kitchen Scenario ------------------"
        + "\n\"You have to make 24 cupcakes for a school activity. Your mother has "
        + "\nrecipe for a dozen cupcakes, as follows: "
        + "\nWhite Flour:    2 cups"
        + "\nSugar:          1 1/2 cups" 
        + "\nBaking Powder:  2 1/2 cups" 
        + "\nSalt:           1 tsp." 
        + "\nButter:         1/3 cup" 
        + "\nMilk:           2/3 cup" 
        + "\nVanilla:        1 tsp." 
        + "\nDark Cocoa:     1 cup"
        + "\nYou are mixing the recipe and find that you only have 1 stick of " 
        + " \nbutter. How much more butter will you need to make 24 cupcakes? " 
        + "\nEnter your answer with 3 decimals (0.xxx):"
        + "\n-------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        ScoringControl sc = null;
        int choicePoints;
        
        if (sc == null)
            sc = new ScoringControl();
        
        if (choice.equals("<")) {
            return true;
        } else {
            try {
                choicePoints = sc.scoreChildhoodHomeKitchenChoice(choice);
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
