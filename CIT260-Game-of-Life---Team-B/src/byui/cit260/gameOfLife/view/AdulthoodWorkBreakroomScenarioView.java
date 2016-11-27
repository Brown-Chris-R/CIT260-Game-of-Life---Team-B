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
public class AdulthoodWorkBreakroomScenarioView extends View {
    public AdulthoodWorkBreakroomScenarioView() {
    super("\n"
        + "\n------------------ Childhood School Cafeteria Scenario ------------------"
        + "\nYou are thirsty and go to the break room to get a snack from the vending "
        + "\nmachine. You put the required amount of money in for 1 snack. The machine "
        + "\ntakes your money, but spits out two snacks instead of just one."
        + "\nWhat do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Take the two snacks and enjoy your 'good fortune'."
        + "\nB) Report the problem to the office administrator and pay for your second "
        + "\n   snack."
        + "\nC) Tell your co-workers that the vending machine is giving two snacks for "
        + "\n   the price of one so that they can all get a 'good deal' on snacks."
        + "\nD) Leave the second snack sitting on a table in the break room so someone "
        + "\n   else can enjoy them for free."
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
                choicePoints = sc.scoreAdulthoodWorkBreakroomChoice(choice.charAt(0));
                System.out.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                System.out.println(se.getMessage());
            }
        }
        return false;
    }
    
    
}
