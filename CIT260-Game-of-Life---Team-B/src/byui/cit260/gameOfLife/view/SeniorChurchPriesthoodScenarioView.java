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
public class SeniorChurchPriesthoodScenarioView extends View {
    public SeniorChurchPriesthoodScenarioView() {
    super("\n"
        + "\n------------------ Senior Church Priesthood Scenario ------------------"
        + "\nYou are the Teachers Quorum president. It is Saturday, and you have "
        + "\nno specific plans for the day: What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Call up your High Priest Group Leader and ask him to assign the "
        + "\nfamilies to someone else. You know you can get 100% with your other families."
        + "\nB) Call up your High Priest Group Leader and ask him if he will visit "
        + "\n   those 3 families this month because you are not able to."
        + "\nC) Fast and Pray for those 3 families. Go and visit them with a "
        + "\n   prayer in your heart."
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
                choicePoints = sc.scoreSeniorChurchPriesthoodChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
