/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.exceptions.RepentanceControlException;
import byui.cit260.gameOfLife.control.RepentanceControl;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.Response;

/**
 *
 * @author RMLOY_000
 */
public class RepentanceStartView extends View {
    
    public  RepentanceStartView() {
        
        super("\n==========================================================="
                + "\nYour are about to take a self-assessment about repantance"
                + "\ndo you like to continue press Y "
                + "\nfor the response key"
                + "\n1 = never"
                + "\n2 = sometimes"
                + "\n3 = often "
                + "\n4 = almost always"
                + "\n5 = always"
                + "Or you may enter 'Q' to return Game Menu"
                + "\n========================================================="
        );
}
   
    
         @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        if  ("Y".equals(choice)) {
            
                this.SelfAssessment();
            
                 
        }
        return false;
    }

    private void SelfAssessment() {
    //System.out.println("\n*** SelfAssessment() function called ***\"");
    Scanner SelfAssesmentScanner = new Scanner(System.in);
    boolean validInput = false;
    int reponse = 0;
    while (!validInput) {
        System.out.println("\nI firmly believe that through the Atonement of "
                         + "\nJesus Christ I can be forgiven of all my sins. "
                         + "\n(Enos 1:5–8)");
        try {
            reponse = SelfAssesmentScanner.nextInt();
            validInput = true;
        } 
        catch (Exception e) {
        validInput= false;
        SelfAssesmentScanner.nextLine();
        }
       }
        validInput = false;
        while (!validInput){
            System.out.println("Question about sorrowForSin");
            try {
                reponse =SelfAssesmentScanner.nextInt();
                validInput = true;          
            } catch (Exception e) {
                validInput = false;
                SelfAssesmentScanner.nextLine();
                
            }
        }
         validInput = false;
         while (!validInput){
             System.out.println("\nI keep the required commandments to be worthy of"
                               +"\na temple recommend. (D&C 97:8)  ");
            try {
            reponse = SelfAssesmentScanner.nextInt();
            validInput = true;
        } catch (Exception e) {
            validInput = false;
            SelfAssesmentScanner.nextLine();
        }
         }
         validInput = false;
         while (!validInput){
            System.out.println("Question about abandonmentOfSin "); 
         try {
             reponse = SelfAssesmentScanner.nextInt();
             validInput = true;
            
        } catch (Exception e) {
            validInput = false;
            SelfAssesmentScanner.nextLine();
        }
         }
         validInput = false;
         while (!validInput){
             System.out.println("Question about restitution");
        try {
            reponse = SelfAssesmentScanner.nextInt();
            validInput = true;
        } catch (Exception e) {
             validInput = false;
             SelfAssesmentScanner.nextLine();
        }
         }
        validInput = false;
        while (!validInput){
            System.out.println("Question about righteousLiving ");
        try {
            reponse = SelfAssesmentScanner.nextInt();
            validInput = true;
                       
          } catch (Exception e) {
              validInput = false;
              SelfAssesmentScanner.nextLine();
        }
        }
    }
                   
}