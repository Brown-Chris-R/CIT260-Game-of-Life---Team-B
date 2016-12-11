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
 * @author RMLOY_000
 */
class AdulthoodWorkOfficeScenario extends View{
    public AdulthoodWorkOfficeScenario(){
        super("\n"
                + "\n----------------Adult Office Scenario --------------------"
                + "\n\nYou have been working very hard for several years, hoping"
                + "\nto get a promotion at your job. A recently hired employee"
                + "\nstarted working in a project you supervise.  He has helped"
                + "\n to bring significant revenue for the business, but he used"
                + "\n non-ethical practices and some form of bribery.  Now that"
                + "\n you know non-ethical practices and some form of bribery. "
                + "\n Now that you knowabout the unethical practices you need "
                + "\nto choose your attitudetowards this challenge:"
                + "\n\nA – Don’t say anything, because it could ruin your possibilities"
                + "\nfor a promotion, since you are the project manager for this new employee."
                + "\n\nB – Report the unethical practices to your supervisor"          
                + "\nregardless the consequences."
                + "\n\nC - Work with the new employee to remove any evidence of"
                + "\nbribery that could harm both of you. "
                + "\n\n< - These choices are too hard, let me try a different scenario");
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
                choicePoints = sc.scoreAdulthoodWorkOfficeChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
    }
    

