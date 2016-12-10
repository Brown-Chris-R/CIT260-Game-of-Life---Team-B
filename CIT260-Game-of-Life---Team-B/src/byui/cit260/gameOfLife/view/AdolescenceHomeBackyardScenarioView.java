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
public class AdolescenceHomeBackyardScenarioView extends View {
    public AdolescenceHomeBackyardScenarioView() {
    super("\n"
        + "\n------------------ Adolescence Church Priesthood Scenario ------------------"
        + "\nYour little brother borrowed your favorite hat and lost it when a " 
        + "\nbig wind gust blew it away: What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Take your little brother’s favorite toy and hide it, hoping that "
        + "\nyou will get satisfaction when he realizes it is gone."
        + "\nB) Report your little brother to your Mom and demand that your little "
        + "\nbrother be made to buy you an exact copy of your hat."
        + "\nC) Tell your Mom and Dad about what happened and ask for ideas for "
        + "\nFamily Home Evening to teach about respecting others."
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
                choicePoints = sc.scoreAdolescenceHomeBackyardChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
