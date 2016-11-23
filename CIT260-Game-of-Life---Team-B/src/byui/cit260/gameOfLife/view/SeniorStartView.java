/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.ScoringControl;
import byui.cit260.gameOfLife.model.Game;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;

/**
 *
 * @author cbrown
 */
public class SeniorStartView extends View {
    public SeniorStartView() {
        super("\n"
                  + "\nContratulations to acheiving Senior status!"
                  + "\nIt is your 60th birthday, and you are celebrating"
                  + "\nwith your family. You feel a pain in your lower right"
                  + "\nabdomen. You are rushed to the hospital and diagnosed"
                  + "\nwith appendicitis. After surgery you spend several"
                  + "\ndays in the hospital. Below is the bill from the"
                  + "\nhospital. You need to calculate the amount you will"
                  + "\npay after the insurance has paid it's portion. Your "
                  + "\ninsurance pays 75% of expenses after a $500 deductible."
                  + "\nRound your answer to the nearest dollar."
                  + "\n--------------------------------------------------------"
                  + "\nPress Q to quit without answering."
                  + "\n--------------------------------------------------------"
                  + "\nHospital Bill Total: $29,400"
                  + "\nWhat is your portion of the medical bill?");
    }

    @Override
    public boolean doAction(String choice) {
        // System.out.println("\n*** evaluateResponse() function called ***");
        int userAmount = Integer.parseInt(choice);
        int choicePoints;
        boolean correctChoice = false;
        
        ScoringControl scoringControl = new ScoringControl();

        float answer = scoringControl.calcOperation(29400.0F, 500.0F, 0.75F);

        int answerInt = (int) Math.round(answer);
        
        if (userAmount == answer) {
            System.out.println("\nCongratulations!! You nailed it!");
            correctChoice = true;
        } else if (userAmount > answer) {
            System.out.println("\nOH NO!! You OVERPAID!!!");           
        } else if (userAmount < answer) {
            System.out.println("\nSorry, but you owe more than that.");                       
        }
        choicePoints = scoringControl.scoreSeniorHospitalChoice(correctChoice);
        System.out.println("Points Awarded: " + choicePoints); // DEBUG
      
        return true;
    }
    
}
