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
public class ChildhoodChurchSundaySchoolScenarioView extends View
{
    public ChildhoodChurchSundaySchoolScenarioView() {
    super("\n"
        + "\n------------------ Childhood Church Sunday School Scenario ------------------"
        + "\nAnd it came to pass, that I, Nephi, said unto my father: _ ____ __ "
        + "\n___ __ the things the Lord has commanded, for I know that the Lord "
        + "\ngiveth no commandment unto the children of men, save he shall "
        + "\nprepare a way for them that they may accomplish the thing which "
        + "\nhe commandeth them."
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
                choicePoints = sc.scoreChildhoodChurchSundaySchoolChoice(choice);
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }

}
