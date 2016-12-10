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
public class ChildhoodSchoolPlaygroundScenarioView extends View {
    public ChildhoodSchoolPlaygroundScenarioView() {
        super("\n"
        + "\n------------------ Childhood School Playground Scenario ------------------"
        + "\nAt the playground you find a backpack that was left behind. You "
        + "\nopen the backpack and see a cellphone, money and an iPod. You have " 
        + "\nalways wanted those things. You look around and see that no one is " 
        + "\nlooking. What would you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) You take the things and leave the backpack."
        + "\nB) You take the backpack and return it to the lost and found."
        + "\nC) You leave the backpack and the things where you found them."
        + "\nD) You turn in the backpack and only take the money as a reward for "
        + "\n   turning in the most valuable things."
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
                choicePoints = sc.scoreChildhoodSchoolPlaygroundChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
}
