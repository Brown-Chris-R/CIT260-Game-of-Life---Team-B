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
public class ChildhoodHomeLivingRoomScenarioView extends View {
    public ChildhoodHomeLivingRoomScenarioView() {
    super("\n"
        + "\n------------------ Childhood Home Living Room Scenario ------------------"
        + "\n You have the Family: A Proclamation to the World haning on a wall in "
        + "\nyour home. When was the last time you read it?"    
        + "\n-------------------------------------------------------------------------"
        + "\nHappiness in family life is most likely to be achieved when founded "
        + "\nupon ___ _________ __ ___ ____ _____ ______. " 
        + "\nFill in the missing phrase."
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
                choicePoints = sc.scoreChildhoodHomeLivingRoomChoice(choice);
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
