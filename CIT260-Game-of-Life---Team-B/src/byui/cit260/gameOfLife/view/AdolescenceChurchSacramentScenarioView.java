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
public class AdolescenceChurchSacramentScenarioView extends View {
    public AdolescenceChurchSacramentScenarioView() {
    super("\n"
        + "\n------------------ Adolescence Church Sacrament Scenario ------------------"
        + "\nYou are at sacrament meeting and notice a text message on your phone from "
        + "\nyour best friend. You try to ignore it but notice another text message. "
        + "\nYou are eager to see what they have to say. You promised yourself you "
        + "\nwouldn’t use your phone at church. What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Turn your phone off until you get home."
        + "\nB) Read the text message without anyone noticing."
        + "\nC) Continue to ignore the text message."
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
                choicePoints = sc.scoreAdolescenceChurchSacramentChoice(choice.charAt(0));
                System.out.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                System.out.println(se.getMessage());
            }
        }
        return false;
    }
    
}
