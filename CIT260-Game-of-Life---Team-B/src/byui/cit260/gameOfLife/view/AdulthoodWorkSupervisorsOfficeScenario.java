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
class AdulthoodWorkSupervisorsOfficeScenario extends View{
    public AdulthoodWorkSupervisorsOfficeScenario (){
        super("\n"
                + "\n------------Adulthood Supervisor’s Office----------------"
                + "\n"
                + "\nYou are reporting your status for the week to your supervisor."
                + "\nHe praises you for an accomplishment on your current project."
                + "\nThe accomplishment was actually achieved by one of your co-workers. "
                + "\n\nA – Say thank you. You almost never receive praise"
                + "\n\nS - Supervisor's Office from your supervisor for all the great"
                + "\nthings you do, so it’s overdue anyway."
                + "\n\nB – Ask your supervisor to make a note in his file so that “your”"
                + "\naccomplishment can be remembered at your annual performance review."
                + "\n\nC - Tell your supervisor about your co-worker and what a great "
                + "\njob they did.."
                + "\n\n< - These choices are too hard, let me try a different scenario");
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
                choicePoints = sc.scoreAdulthoodOfficeSupervisorChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
        
    }

    

