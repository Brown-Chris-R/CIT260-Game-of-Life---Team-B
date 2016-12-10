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
public class ChildhoodSchoolGymScenarioView extends View {
    public ChildhoodSchoolGymScenarioView() {
        super("\n"
        + "\n------------------ Childhood School Gym Scenario ------------------"
        + "\nYou are in the gymn with all the other students playing. You notice "
        + "\nsome boys are bullying a little boy because of the way he is " 
        + "\ndressed. What would you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Join the rest of the kids and make fun of him."
        + "\nB) Ignore the situation and pretend nothing happened."
        + "\nC) Walk over to the group and tell them to stop bullying the boy."
        + "\nD) Tell an adult about the situation."
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
                choicePoints = sc.scoreChildhoodSchoolGymChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
