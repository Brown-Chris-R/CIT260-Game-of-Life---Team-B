/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

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
    String errorText = new String();
    static Game game = CIT260GameOfLifeTeamB.getCurrentGame();
    static Map map = game.getMap();
    static Scene[] scenes = map.getScenes();
    
    /**************************************************************************
    * Score the players choice in the Childhood School Cafeteria scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodSchoolCafeteriaChoice(char choice) {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
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
public int scoreChildhoodSchoolGymChoice(char choice) {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
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
public int scoreChildhoodSchoolPlaygroundChoice(char choice) {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
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
public int scoreChildhoodChurchChoice(char choice, char location) {
    int choicePoints = 0;

    // validate that the location is a valid choice - A, B or C
    if (location != 'S' && choice != 'P' && choice != 'P' && choice != 'B') {
        errorText = "Location " + location + " is not a valid choice.";
        return -1;
    }

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Childhood Home scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodHomeChoice(char choice, char location) {
    int choicePoints = 0;

        // validate that the location is a valid choice - A, B or C
    if (location != 'K' && choice != 'L' && choice != 'Y') {
        errorText = "Location " + location + " is not a valid choice.";
        return -1;
    }

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

    /**************************************************************************
    * Score the players choice in the Adolescence School scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceSchoolChoice(char choice) {
    int choicePoints = 0;
    boolean giveScholarship = false;
    String grade = "B+";
    int die1Roll;
    Die die1 = new Die();

    System.out.println("Incoming Choice is " + choice); // DEBUG

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
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
        ItemControl.changeToItemQuantityInStock("Scholarship", 1);
    }
    recordChoicePoints(scenes[10 + AdolescenceSceneType.School.ordinal()], choicePoints);
        
    return choicePoints;
}    

    /**************************************************************************
    * Score the players choice in the Adolescence Church Sacrament scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceChurchSacramentChoice(char choice) {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C 
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
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
public int scoreAdolescenceChurchChoice(char choice, char location) {
    int choicePoints = 0;

    // validate that the location is a valid choice - S, P or A
    if (location != 'S' && choice != 'P' && choice != 'A') {
        errorText = "Location " + location + " is not a valid choice.";
        return -1;
    }

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Adolescence Home scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceHomeChoice(char choice, char location) {
    int choicePoints = 0;

    // validate that the location is a valid choice - Y or B
    if (location != 'Y' && choice != 'B') {
        errorText = "Location " + location + " is not a valid choice.";
        return -1;
    }

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
    }

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

/**************************************************************************
    * Score the players choice in the Adulthood Mission scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodMissionChoice(char choice) {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Adulthood Work Breakroom scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodWorkBreakroomChoice(char choice) {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        errorText = "Choice " + choice + " is not a valid choice.";
        return -1;
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
public int scoreAdulthoodUniversityChoice(char choice) {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Adulthood Family scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodFamilyChoice(char choice) {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

/**************************************************************************
    * Score the players choice in the Senior Church scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorChurchChoice(char choice) {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Senior Home scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorHomeChoice(char choice) {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
    return choicePoints;
}    

    /**
 * Calculate the patient portion of a hospital surgery bill
 * @author cbrown
 */    
public float calcOperation(float hospitalBillAmt, float insuranceDeductibleAmt, float insuranceCoverageAmt ) {
    float amountOwed;
    
    if (hospitalBillAmt <= 0) {
        errorText = "Hospital Bill Amount is <= Zero";
        return -1;
    } else if (hospitalBillAmt > 30000) {
        errorText = "Hospital Bill Amount is > 30,000";
        return -1;
    } else if (insuranceDeductibleAmt < 0) {      
        errorText = "Insurance Deductible Amount is < 0";
        return -1;
    } else if (insuranceDeductibleAmt > 500) {      
        errorText = "Insurance Deductible Amount is > 500";
        return -1;
    } else if (insuranceCoverageAmt < 0) {      
        errorText = "Insurance Coverage Amount is < 0";
        return -1;
    } else if (insuranceCoverageAmt > 1) {      
        errorText = "Insurance Coverage Amount is > 100%";
        return -1;
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
