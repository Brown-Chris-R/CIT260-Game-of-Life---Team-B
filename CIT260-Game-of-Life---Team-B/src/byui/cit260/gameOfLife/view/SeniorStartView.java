/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.ScoringControl;
import java.util.Scanner;

/**
 *
 * @author cbrown
 */
public class SeniorStartView {
    private String scenario;
    public SeniorStartView() {
        this.scenario = "\n"
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
                  + "\nHospital Bill Total: $29,400"
                  + "\nWhat is your portion of the medical bill?";
    }
    /**
     * displays the main menu view
     */
    void displaySeniorStartView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get the players menu choice
            int userAmount = Integer.parseInt(this.getInput());
            if (userAmount == 0) // user wants to quit
                return; // exit the game

            // evaluate the response display the result
            done = this.evaluateResponse(userAmount);
        
        } while (!done);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // set flag to not valid
        String selection = null; // value to be returned

        while (!valid) {
            System.out.println("\n" + this.scenario);
            
            selection = keyboard.nextLine(); // get next line typed on keyboard
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid entry *** Try again");
                continue;
            }
            break; // end the loop    
        }
        return selection; // return the selection
    }


    private boolean evaluateResponse(int userAmount) {
        // System.out.println("\n*** evaluateResponse() function called ***");

        ScoringControl scoringControl = new ScoringControl();

        float answer = scoringControl.calcOperation(29400.0F, 500.0F, 0.75F);

        int answerInt = (int) Math.round(answer);
        
        if (userAmount == answer) {
            System.out.println("\nCongratulations!! You nailed it!");
            // TODO: call method to award points
        } else if (userAmount > answer) {
            System.out.println("\nOH NO!! You OVERPAID!!!");           
        } else if (userAmount < answer) {
            System.out.println("\nSorry, but you owe more than that.");                       
        }
              
        return true;
    }
    
}
