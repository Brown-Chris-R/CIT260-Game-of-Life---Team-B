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
class AdulthoodApartmentScenario extends View{

    public AdulthoodApartmentScenario() {
    super(  "\n"
          + "\n------------------ Adulthood Apartment Scenario ----------------"
          + "\nYou rode your bike around the area all day yesterday,and you are"
          + "\nreally tired.It’s now 6:30am and your alarm just  went off "
          + "\nWhat do you do?"
          + "\n"
          + "\nA)–Decide that you don’t need a shower today.You can use the extra"
          + "\n   time to sleep just a little bit longer.."
          + "\n"
          + "\nB)–Get up and on your knees.Ask Heavenly Father to bless you with "
          + "\n   the energy that you will need today." 
          + "\n" 
          + "\nC)-Get up and take a bath so you can get a little extra rest by " 
          + "\n   relaxing in the bathtub." 
          + "\n"  
          + "\nW)-These choices are too hard, let me try a different scenario"
          + "\n");
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
                choicePoints = sc.scoreAdulthoodApartmentChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
        
}
    
    

