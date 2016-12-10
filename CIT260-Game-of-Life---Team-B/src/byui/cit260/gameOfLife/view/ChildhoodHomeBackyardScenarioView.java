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
public class ChildhoodHomeBackyardScenarioView extends View {
    public ChildhoodHomeBackyardScenarioView() {
    super("\n"
        + "\n------------------ Childhood Home Backyard Scenario ------------------"
        + "\nYou are practicing baseball in your backyard and hit the ball into "
        + "\nthe neigbors window, breaking it. What do you do?"    
        + "\n-------------------------------------------------------------------------"
        + "\nA) Run into the house and pretend like you are doing homework."
        + "\nB) Run into the house and tell your Mom or Dad what happened."
        + "\nC) Walk over to the neighbor's house and tell them what happened."
        + "\n<) Previous Menu"
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
                choicePoints = sc.scoreChildhoodHomeBackyardChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
