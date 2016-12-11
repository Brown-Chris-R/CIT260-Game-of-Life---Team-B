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
public class SeniorHomeLivingRoomScenarioView extends View {
    public SeniorHomeLivingRoomScenarioView() {
    super("\n"
        + "\n------------------ Senior Home Living Room Scenario ------------------"
        + "\nYour daughter and her family are visiting. One of your grandchildren "
        + "\nask you to play a game with them. You had planned on reading a book. "
        + "\nWhat do you do?"    
        + "\n-------------------------------------------------------------------------"
        + "\nA) Tell your grandchild to pick out the game and play it with them "
        + "\n   for an hour."
        + "\nB) Tell your grandchild that you will play if you can pick the game."
        + "\nC) Tell your grandchild that you love them, but will play with them "
        + "\n   later."
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
                choicePoints = sc.scoreSeniorHomeLivingRoomChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
