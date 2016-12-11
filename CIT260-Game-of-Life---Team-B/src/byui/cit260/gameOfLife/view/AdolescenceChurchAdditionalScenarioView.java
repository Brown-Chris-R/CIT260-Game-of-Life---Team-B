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
public class AdolescenceChurchAdditionalScenarioView extends View {
    public AdolescenceChurchAdditionalScenarioView() {
    super("\n"
        + "\n------------------ Adolescence Church Additional Scenario ------------------"
        + "\nYou want to serve a mission, but you have done some things that "
        + "\nhave bothered you when you think about them. What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Submit your mission papers. If you really shouldn’t serve a "
        + "\n   mission, the Lord will cause your mission papers to be rejected."
        + "\nB) Talk to a friend and ask them if they think you should serve a mission."
        + "\nC) Talk to your Bishop about the things that are bothering you. Ask "
        + "\n   him to help you work toward serving a mission."
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
                choicePoints = sc.scoreAdolescenceChurchAdditionalChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
    
}
