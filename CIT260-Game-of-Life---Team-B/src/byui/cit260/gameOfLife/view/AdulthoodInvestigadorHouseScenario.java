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
class AdulthoodInvestigadorHouseScenario extends View { 
   public AdulthoodInvestigadorHouseScenario(){
        super("\n"
            + "\n------------Adulthood Investigador's House Scenario----------------" 
            + "\nYou finish teaching your investigator, and the lesson went well."
            + "\nAs an example of a principle, you mentioned that you enjoyed playing  "
            + "\nvideo games before your mission. As you are setting  up the next appointment,"
            + "\nthe investigator invites you over to play some video games. "
            + "\n He has just purchased the latest version of your favorite game."
            + "\n What do you do?"
            + "\n" 
            + "\nA – Check your planner. You don’t have anything scheduled, and you are excited"
            + "\nto see what the latest updates to the game are. Accept the invitation."
            + "\n"
            + "\nB – It’s an activity with your investigator, so it must be OK, right? Accept "
            + "\nthe invitation."
            + "\n"
            + "\nC - Grit your teeth. Sing to yourself in your head “Happy are we, Happy are we."
            + "\n Tell your investigator that you have already scheduled other things at that time."        
            + "\nSing to yourself in your head “Happy are we, Happy are we."
            + "\n"
            + "\nD - Explain to your investigator that you want to spend your time blessing others,"
            + "\n but you know a member in the ward that would love to play the game with him and tell him"
            + "\n you will have the member contact him." 
            + "\n"    
            + "\n< - These choices are too hard, let me try a different scenario"    
                
);
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
                choicePoints = sc.scoreAdulthoodInvestigadorHouseChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
            }

