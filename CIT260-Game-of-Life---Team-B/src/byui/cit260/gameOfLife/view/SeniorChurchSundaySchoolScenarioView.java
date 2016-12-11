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
public class SeniorChurchSundaySchoolScenarioView extends View
{
    public SeniorChurchSundaySchoolScenarioView() {
    super("\n"
        + "\n------------------ Senior Church Sunday School Scenario ------------------"
        + "\nYou teach the 14-15 year olds. You wake up Sunday morning feeling "
        + "\nill. What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Call up your Sunday School President and let him know you won’t "
        + "\nbe able to be there."
        + "\nB) Call one of the other youth teachers and ask for your class to "
        + "\n   be able to combine with their class. Call up your Sunday School "
        + "\n   President and let him know what the new arrangement is."
        + "\nC) Go lay down and sleep. You have combined with other classes with "
        + "\n   little or no notice, now they can do the same for you."
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
                choicePoints = sc.scoreSeniorChurchSundaySchoolChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }

}
