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
class AdulthoodFamilyScenario extends View{
    public AdulthoodFamilyScenario(){
    super("\n--------------Adulthood Family Scenario------------------------"
            + "\nYou suddenly become ill with a disabling illness.  You will be forced "
            + "\nto remain home for an extended period of time without the "
            + "\npossibility of working, and with uncertainty about recuperating.   "
            + "\nYou have been praying and asking the Lord to recover your"
            + "\nhealth to be able to work and provide for your family. "
            + "\nFamily economy is going through a rough time.  You don’t "
            + "\nunderstand why the Lord is not answering your prayers, since you"
            + "\nhave been a faithful member all your life."
            + "\nYou can choose your attitude towards this challenge:"
            + "\n\nA – Become angry with God and the Church and stop praying"
            + "\n\nB – Keep praying and accept the Lord’s will about your illness"
            + "\n\nC- Seek additional medical help without relying much on divine intervention.");
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
                choicePoints = sc.scoreAdulthoodFamilyChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }

        
    }
    

