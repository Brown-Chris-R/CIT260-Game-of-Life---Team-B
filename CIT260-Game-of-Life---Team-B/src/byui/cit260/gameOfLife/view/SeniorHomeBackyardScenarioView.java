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
public class SeniorHomeBackyardScenarioView extends View {
    public SeniorHomeBackyardScenarioView() {
    super("\n"
        + "\n------------------ Senior Home Backyard Scenario ------------------"
        + "\nYour wife is wanting to get the yard 'spruced up' after the long "
        + "\nwinter and needs your help. You had planned to enjoy your time "
        + "\nwatching some march madness games. What do you do?" 
        + "\n-------------------------------------------------------------------------"
        + "\nA) Help your wife for an hour, then go inside and watch your games."
        + "\nB) The yard will still be there next week, but march madness will "
        + "\n   not. Stay inside and cheer for your favorite team."
        + "\nC) Help your wife with all the yardwork and ask if she would like "
        + "\n   to sit down and watch a game with you."
        + "\nD) Go to Buffalo Wild Wings with a couple of your buddys and watch "
        + "\n   the games."    
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
                choicePoints = sc.scoreSeniorHomeBackyardChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
