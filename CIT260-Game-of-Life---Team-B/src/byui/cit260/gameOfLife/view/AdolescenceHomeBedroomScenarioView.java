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
public class AdolescenceHomeBedroomScenarioView extends View {
    public AdolescenceHomeBedroomScenarioView() {
    super("\n"
        + "\n------------------ Adolescence Home Bedroom Scenario ------------------"
        + "\nYou are in your bedroom and you would like to invite more the presence "
        + "\nof the spirit in your room. You have some posters that were given to "
        + "\nyou and sign by your favorite rock band. What things can you do to "
        + "\nmake your room a place for the Holy Spirit to dwell?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Put images of the temple and Jesus on your bedroom walls."
        + "\nmembers of your Quorum."
        + "\nB) Clean your room and remove your poster to replace them with gospel "
        + "\nimages."
        + "\nC) Leave it how it is since you like it better like it is."
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
                choicePoints = sc.scoreAdolescenceHomeBedroomChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
