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
class AdulthoodWorkParkingLotScenario extends View {
    public AdulthoodWorkParkingLotScenario(){
        super("\n"
                  + "\n-------------Parking Lot Scenario-----------------------"
                  + "\n"
                  + "\nYou are late for work and drive into the parking lot in a hurry."
                  + "\nYou end up bumping into someone else’s car. What do you do?"
                  + "\nA – Move your car to a different spot in the parking lot. They"
                  + "\nwill probably not even notice the little dent anyway. "
                  + "\n"
                  + "\nB)–Report the problem to the office administrator so"
                  + "\n    you can contact the owner of the vehicle."
                  + "\n"
                  + "\nC)-You are in a hurry. Leave a note on the vehicle with"
                  + "\n   your name and phone number"
                  + "\n"
                  + "\nD)-Move your car to a different spot in the parking lot."
                  + "\n   Call the police and report that someone has bumped into"
                  + "\n   your vehicle in the parking lot and damaged it."
                  + "\n"
                  + "\n< - These choices are too hard, let me try a different scenario" 
                );

  




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
                choicePoints = sc.scoreAdulthoodParkinLotChoice(choice.charAt(0));
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
    
}

 
