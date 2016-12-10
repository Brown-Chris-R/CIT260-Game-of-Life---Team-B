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
public class ChildhoodChurchBishopsOfficeScenarioView extends View {
    public ChildhoodChurchBishopsOfficeScenarioView() {
    super("\n"
        + "\n------------------ Childhood Church Sunday School Scenario ------------------"
        + "\nYou are at the bishop’s office for your interview before getting "
        + "\nbaptized. You are in the middle of you interview when he asked you "
        + "\nabout for behavior at home. You know you have been saying bad words "
        + "\nat home and at school. You don't want to upset the bishop if you "
        + "\ntell him about your conduct. What will you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Pretend like nothing happened and just keep answering the questions "
        + "\nto make everyone happy." 
        + "\nB - Tell the bishop about the way you speak at home and school."
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
                choicePoints = sc.scoreChildhoodChurchBishopsOfficeChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}
