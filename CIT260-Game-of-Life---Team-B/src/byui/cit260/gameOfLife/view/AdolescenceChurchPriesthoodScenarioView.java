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
public class AdolescenceChurchPriesthoodScenarioView extends View {
    public AdolescenceChurchPriesthoodScenarioView() {
    super("\n"
        + "\n------------------ Adolescence Church Priesthood Scenario ------------------"
        + "\nYou are the Teachers Quorum president. It is Saturday, and you have "
        + "\nno specific plans for the day: What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Call up your advisor and arrange to go visit several less-active "
        + "\nmembers of your Quorum."
        + "\nB) Mow your lawn and do some chores around your home."
        + "\nC) Hang out with your best friends."
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
                choicePoints = sc.scoreAdolescenceChurchPriesthoodChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
