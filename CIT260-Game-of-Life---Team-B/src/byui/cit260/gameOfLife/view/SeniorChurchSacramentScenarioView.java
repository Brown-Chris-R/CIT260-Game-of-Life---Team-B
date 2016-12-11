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
public class SeniorChurchSacramentScenarioView extends View {
    public SeniorChurchSacramentScenarioView() {
    super("\n"
        + "\n------------------ Senior Church Sacrament Scenario ------------------"
        + "\nYou are running behind schedule. You arrive at church just as the "
        + "\nsacrament hymn is being sung. You aren’t sure if walking into the "
        + "\nchapel will be distracting for others. What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Sit in the foyer quietly and hope the sacrament will get passed "
        + "\n   to you."
        + "\nB) Walk in to the chapel and sing while you are walking to your seat."
        + "\nC) Sit in the foyer and visit with others that are also in the foyer."
        + "\n<) Previous Menu"
        + "\n-------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        ScoringControl sc = null;
        int choicePoints = 0;
        
        if (sc == null)
            sc = new ScoringControl();
        
        if (choice.equals("<")) {
            return true;
        } else {
            try {
                choicePoints = sc.scoreSeniorChurchSacramentChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
