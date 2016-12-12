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
class AdulthoodMembershouseScenario extends View {

    public AdulthoodMembershouseScenario() {
         super("\n"
              + "\n----------------Member's house Scenario---------------"
              + "\nYou finish dinner in members home.Dinner was really filling,"
              + "\nand they invite you to stay a while and relax on the couch."
              + "\nWhat do you do?"
              + "\n"
              + "\nA)-Check your planner. You don’t have anything scheduled, and"
              + "\nTheir 17 year old daughter is really cute.Accept the invitation."
              + "\n"
              + "\nB)-You know the mission rules. Rebuke them for trying to tempt"
              + "\n   you and leave while saying “Get thee behind me!. "
              + "\nC)-Accept the invitation by asking if it would be OK for you" 
              + "\n   and your companion to share a message with Grit your teeth." 
              + "\n   Sing to yourself in your head “Happy are we, Happy are we”." 
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
                choicePoints = sc.scoreAdulthoodMemberHouseChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    }
    

