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
class AdulthoodUniversityScenario extends View {
    public AdulthoodUniversityScenario(){
    super("\n"
                + "\n------------Adulthood University Scenario------------------"
                + "\n"
                + "\nIt would display different degrees, in different level of study." 
               
//Which level of study are you going to choose?
//C-Certificate 
//In this scenario, a roll of the dice will determine how many points you get from your choice, but the probabilities are less from option A or B)
//A-Associate
//End user will gain point less than the associate and bachelor
//B-Bachelor 
//display three options, 
//C- Computer information technology
//p- Public Health
//U- Universities study
//The end user might choose CIT will gain the max points, Public health and university studies will play with a roll dice will determine how many point end user gets from her/his choice.
//The player is awarded one of the diplomas, and the program displays which one was awarded.


                + "\n----------------------------------------");
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
    

