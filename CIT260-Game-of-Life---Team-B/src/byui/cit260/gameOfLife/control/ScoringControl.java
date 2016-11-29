/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.exceptions.ItemControlException;
import byui.cit260.gameOfLife.exceptions.ScoringControlException;
import byui.cit260.gameOfLife.model.AdolescenceSceneType;
import byui.cit260.gameOfLife.model.AdulthoodSceneType;
import byui.cit260.gameOfLife.model.ChildhoodSceneType;
import byui.cit260.gameOfLife.model.ChoicePoints;
import byui.cit260.gameOfLife.model.Game;
import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Scene;
import byui.cit260.gameOfLife.model.SeniorSceneType;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.util.ArrayList;

/**
 *
 * @author cbrown
 */
public class ScoringControl {
    static Game game = CIT260GameOfLifeTeamB.getCurrentGame();
    static Map map = game.getMap();
    static Scene[] scenes = map.getScenes();
    
    /**************************************************************************
    * Score the players choice in the Childhood School Cafeteria scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodSchoolCafeteriaChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    switch (choice) {
        case 'A':
            break;
        case 'B':
            choicePoints = -5;
            break;
        case 'C':
            choicePoints = 2;
            break;
        case 'D':
            choicePoints = 5;
            break;
    }
    
    recordChoicePoints(scenes[ChildhoodSceneType.SchoolCafeteria.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Childhood School Gym scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodSchoolGymChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = -5;
            break;
        case 'B':
            choicePoints = -2;
            break;
        case 'C':
            choicePoints = 2;
            break;
        case 'D':
            choicePoints = 5;
            break;
    }
    
    recordChoicePoints(scenes[ChildhoodSceneType.SchoolGym.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Childhood School Playground scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodSchoolPlaygroundChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    switch (choice) {
        case 'A':
            break;
        case 'B':
            choicePoints = -5;
            break;
        case 'C':
            choicePoints = 2;
            break;
        case 'D':
            choicePoints = 5;
            break;
    }
    
    recordChoicePoints(this.scenes[ChildhoodSceneType.SchoolPlayground.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Childhood Church scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodChurchChoice(char choice, char location) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the location is a valid choice - S, P or B
    if (location != 'S' && choice != 'P' && choice != 'B') {
        throw new ScoringControlException("Location " + location + " is not a valid "
                  + "location. Must be an 'S', 'P' or 'B'.");
    }

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Childhood Home scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodHomeChoice(char choice, char location) throws ScoringControlException {
    int choicePoints = 0;

        // validate that the location is a valid choice - A, B or C
    if (location != 'K' && choice != 'L' && choice != 'Y') {
        throw new ScoringControlException("Location " + location + " is not a valid "
                  + "location. Must be an 'K', 'L' or 'Y'.");
    }

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

    /**************************************************************************
    * Score the players choice in the Adolescence School scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceSchoolChoice(char choice) throws ScoringControlException, ItemControlException {
    int choicePoints = 0;
    boolean giveScholarship = false;
    String grade = "B+";
    int die1Roll;
    Die die1 = new Die();

    System.out.println("Incoming Choice is " + choice); // DEBUG

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }
    
    switch (choice) {
        case 'A':
            choicePoints = -10;
            grade = "A";
            break;
        case 'B':
            choicePoints = 5;
            die1Roll = die1.roll();
            if (die1Roll > 4)
                grade = "A";
            break;
        case 'C':
            choicePoints = 5;
            die1Roll = die1.roll(3);
            if (die1Roll > 4)
                grade = "A";
            break;
    }
    System.out.println("Grade is " + grade); // DEBUG
    
    /* A grade of A means an automatic scholarship, otherwise granting of a 
     * schohlarship will be controlled by the roll of a die. A roll of a 4, 5 
     * or 6 will result in the granting of a scholarship.
     */
    if ("A".equals(grade)) {
        // some function in the ItemControl class to award scholarship
            giveScholarship = true;
            System.out.println("Scholarship Awarded!"); // DEBUG
    } else {
            die1Roll = die1.roll();
            System.out.println("Die roll is " + die1Roll); // DEBUG
            if (die1Roll > 3) {
                // some function in the ItemControl class to award scholarship
                giveScholarship = true;
            }
    }
    if (giveScholarship) {
        try { 
            ItemControl.changeToItemQuantityInStock("Scholarship", 1);
        }  catch (Exception ie) {
            System.out.println(ie.getMessage());
        }
    }
    recordChoicePoints(scenes[10 + AdolescenceSceneType.School.ordinal()], choicePoints);
        
    return choicePoints;
}    

    /**************************************************************************
    * Score the players choice in the Adolescence Church Sacrament scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceChurchSacramentChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C 
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 5;
            break;
        case 'B':
            choicePoints = -2;
            break;
        case 'C':
            choicePoints = 2;
            break;
    }
    
    recordChoicePoints(scenes[10 + AdolescenceSceneType.ChurchSacrament.ordinal()], choicePoints);
        
    return choicePoints;
}    

/**************************************************************************
    * Score the players choice in the Adolescence Church scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceChurchChoice(char choice, char location) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the location is a valid choice - S, P or A
    if (location != 'S' && choice != 'P' && choice != 'A') {
        throw new ScoringControlException("Location " + location + " is not a valid "
                  + "location. Must be an 'S', 'P' or 'A'.");
    }

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Adolescence Home scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceHomeChoice(char choice, char location) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the location is a valid choice - Y or B
    if (location != 'Y' && choice != 'B') {
        throw new ScoringControlException("Location " + location + " is not a valid "
                  + "location. Must be a 'Y' or 'B'.");
    }

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

/**************************************************************************
    * Score the players choice in the Adulthood Mission scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodMissionChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Adulthood Work Breakroom scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodWorkBreakroomChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = -5;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = -5;
            break;
        case 'D':
            choicePoints = -5;
            break;
    }
    
    recordChoicePoints(scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()], choicePoints);
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Adulthood University scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodUniversityChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Adulthood Family scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodFamilyChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

/**************************************************************************
    * Score the players choice in the Senior Church scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorChurchChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Senior Home scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorHomeChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

    /**
 * Calculate the patient portion of a hospital surgery bill
 * @author cbrown
 */    
public float calcOperation(float hospitalBillAmt, float insuranceDeductibleAmt, float insuranceCoverageAmt ) throws ScoringControlException {
    float amountOwed;
    
    if (hospitalBillAmt <= 0) {
        throw new ScoringControlException("Hospital Bill Amount must be greater "
                  + "than zero.");
    } else if (hospitalBillAmt > 30000) {
        throw new ScoringControlException("Hospital Bill Amount must be less "
                  + "than $30,000.");
    } else if (insuranceDeductibleAmt < 0) {      
        throw new ScoringControlException("Insurance Deductible Amount cannot "
                  + "be less than zero");
    } else if (insuranceDeductibleAmt > 500) {      
        throw new ScoringControlException("Insurance Deductible Amount cannot "
                  + "be greater than %500");
    } else if (insuranceCoverageAmt < 0) {      
        throw new ScoringControlException("Insurance Coverage Amount cannot "
                  + "be less than zero");
    } else if (insuranceCoverageAmt > 1) {      
        throw new ScoringControlException("Insurance Coverage Amount cannot "
                  + "be greater than 100%");
    }
    
    /* amount owed by the patient is determined by reducing the amount of the bill by the portion paid by insurance,
     * and adding in the patient's deductible. The portion paid by insurance is calculated on the bill amount minus
     * the patient's deductible.
     */
    amountOwed = (hospitalBillAmt - insuranceDeductibleAmt) * (1-insuranceCoverageAmt) + insuranceDeductibleAmt;
    
    return amountOwed;
}

    public int scoreSeniorHospitalChoice(boolean correctChoice) {
        int choicePoints = 0;
    
        if (correctChoice) {
            choicePoints = 5;
        }
        recordChoicePoints(scenes[30 + SeniorSceneType.Hospital.ordinal()], choicePoints);
        return choicePoints;
    }

    private void recordChoicePoints(Scene scene, int choicePoints) {
        scene.setScoreFromChoice(choicePoints);
        this.game.addToScore(choicePoints);
    }

    public static ArrayList<ChoicePoints> summarizeChoicePoints() {
        ArrayList<ChoicePoints> choicePointsList = new ArrayList<ChoicePoints>();
        ChoicePoints choicePoints;
        int points;
        
        for (Scene scene : scenes) {
            if (scene != null) {
                points = scene.getScoreFromChoice();
                if (points != 0) {
                    choicePoints = new ChoicePoints();
                    choicePoints.setName(scene.getName());
                    choicePoints.setChoicePoints(points);
                    choicePointsList.add(choicePoints);
                }
            }
        }
        
        return choicePointsList;
    }
}
