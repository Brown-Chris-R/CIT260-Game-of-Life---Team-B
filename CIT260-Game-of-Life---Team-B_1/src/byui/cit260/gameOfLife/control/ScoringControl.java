/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

/**
 *
 * @author cbrown
 */
public class ScoringControl {
    String errorText = new String();

    /**************************************************************************
    * Score the players choice in the Childhood School scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodSchoolChoice(char choice, char location) {
    int choicePoints = 0;

    // validate that the location is a valid choice - A, B or C
    if (location != 'C' && choice != 'G' && choice != 'P' && choice != 'R') {
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
            System.out.println("Scholarship Awarded!"); // DEBUG
    } else {
            die1Roll = die1.roll();
            System.out.println("Die roll is " + die1Roll); // DEBUG
            if (die1Roll > 3) {
                // some function in the ItemControl class to award scholarship
                    System.out.println("Scholarship Awarded!"); // DEBUG
            }
    }
    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
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
    * Score the players choice in the Adulthood Work scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodWorkChoice(char choice) {
    int choicePoints = 0;

    System.out.println("Points Awarded: " + choicePoints); // DEBUG
        
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
}
