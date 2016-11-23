/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.ScoringControl;

/**
 *
 * @author cbrown
 */
public class ChildhoodSchoolCafeteriaScenarioView extends View {
    public ChildhoodSchoolCafeteriaScenarioView() {
    super("\n"
        + "\n------------------ Childhood School Cafeteria Scenario ------------------"
        + "\nYou are at the cafeteria and you notice that a classmate is sitting at "
        + "\nthe table and didn’t bring his lunch. You have and extra some food left "
        + "\nfrom your lunch and some money in your pocket. What would you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Ignore your classmate and keep eating."
        + "\nB) Make fun of him."
        + "\nC) Give him your leftover lunch."
        + "\nD) Give him some money you have."
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
        
        if (choice.equals("A") || choice.equals("B") || choice.equals(("C"))
         || choice.equals("D")) {
            choicePoints = sc.scoreChildhoodSchoolCafeteriaChoice(choice.charAt(0));
            System.out.println("Points Awarded: " + choicePoints); // DEBUG
            return true;
        } else if (choice.equals("<")) {
            return true;
        } else {    
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
}
