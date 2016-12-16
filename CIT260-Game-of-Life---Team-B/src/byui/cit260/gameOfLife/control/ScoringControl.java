/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.exceptions.ItemControlException;
import byui.cit260.gameOfLife.exceptions.RepentanceControlException;
import byui.cit260.gameOfLife.exceptions.ScoringControlException;
import byui.cit260.gameOfLife.model.AdolescenceSceneType;
import byui.cit260.gameOfLife.model.AdulthoodSceneType;
import byui.cit260.gameOfLife.model.ChildhoodSceneType;
import byui.cit260.gameOfLife.model.ChoicePoints;
import byui.cit260.gameOfLife.model.Game;
import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Repentance;
import byui.cit260.gameOfLife.model.Scene;
import byui.cit260.gameOfLife.model.SeniorSceneType;
import byui.cit260.gameOfLife.view.ErrorView;
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
    private boolean correctChoice;

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
            choicePoints = -5;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = 2;
            break;
        case 'D':
            choicePoints = -5;
            break;
    }
    
    recordChoicePoints(this.scenes[ChildhoodSceneType.SchoolPlayground.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Church Sunday School scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodChurchSundaySchoolChoice(String choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice
    if (choice == "") {
        throw new ScoringControlException("Choice cannot be blank.");
    }

    if ("i will go and do".equals(choice.toLowerCase())) {
        choicePoints = 5;
    }
    
    recordChoicePoints(scenes[ChildhoodSceneType.ChurchSundaySchool.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Church Primary scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodChurchPrimaryChoice(String choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice
    if (choice == "") {
        throw new ScoringControlException("Choice cannot be blank.");
    }

    if ("what would jesus do".equals(choice.toLowerCase()) || "what would jesus want me to do".equals(choice.toLowerCase())) {
        choicePoints = 5;
    }
    
    recordChoicePoints(scenes[ChildhoodSceneType.ChurchSundaySchool.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Church Bishop's Office scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodChurchBishopsOfficeChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A or B
    if (choice != 'A' && choice != 'B') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A' or 'B'.");
    }
    switch (choice) {
        case 'A':
            choicePoints = -2;
            break;
        case 'B':
            choicePoints = 5;
            break;
    }
    
    recordChoicePoints(this.scenes[ChildhoodSceneType.ChurchBishopsOffice.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Home Kitchen scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodHomeKitchenChoice(String choice) throws ScoringControlException {
    int choicePoints = 0;

    Float answer = 0.000f;
    
    // validate that the choice is a valid choice
    if (choice == "") {
        throw new ScoringControlException("Choice cannot be blank.");
    } else {
        try {
            answer = Float.parseFloat(choice);
        } catch (NumberFormatException e) {
            throw new ScoringControlException("Choice is not a valid decimal number.");
        }
    }

    if (answer == 0.167) {
        choicePoints = 5;
    }
    
    recordChoicePoints(this.scenes[ChildhoodSceneType.HomeKitchen.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Home Living Room scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodHomeLivingRoomChoice(String choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice
    if (choice == "") {
        throw new ScoringControlException("Choice cannot be blank.");
    }

    if ("the teachings of the lord jesus christ".equals(choice.toLowerCase())) {
        choicePoints = 5;
    }
    
    recordChoicePoints(this.scenes[ChildhoodSceneType.HomeLivingRoom.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Home Backyard scenario
    * @author cbrown
    **************************************************************************/
public int scoreChildhoodHomeBackyardChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }
    
    switch (choice) {
        case 'A':
            choicePoints = -2;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = 2;
            break;
    }
    
    recordChoicePoints(this.scenes[ChildhoodSceneType.ChurchBishopsOffice.ordinal()], choicePoints);
        
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
    
    /* A grade of A means an automatic scholarship, otherwise granting of a 
     * schohlarship will be controlled by the roll of a die. A roll of a 4, 5 
     * or 6 will result in the granting of a scholarship.
     */
    if ("A".equals(grade)) {
        // some function in the ItemControl class to award scholarship
            giveScholarship = true;
    } else {
            die1Roll = die1.roll();
            if (die1Roll > 3) {
                // some function in the ItemControl class to award scholarship
                giveScholarship = true;
            }
    }
    if (giveScholarship) {
        try { 
            ItemControl.changeToItemQuantityInStock("Scholarship", 1);
        }  catch (Exception ie) {
            ErrorView.display(this.getClass().getName(),ie.getMessage());
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
    * Score the players choice in the Adolescence Church Priesthood scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceChurchPriesthoodChoice(char choice) throws ScoringControlException {
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
            choicePoints = 3;
            break;
        case 'C':
            choicePoints = 2;
            break;
    }
    
    recordChoicePoints(scenes[10 + AdolescenceSceneType.ChurchPriesthood.ordinal()], choicePoints);
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Adolescence Church Additional scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceChurchAdditionalChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C 
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = -2;
            break;
        case 'B':
            choicePoints = 2;
            break;
        case 'C':
            choicePoints = 5;
            break;
    }
    
    recordChoicePoints(scenes[10 + AdolescenceSceneType.ChurchAdditional.ordinal()], choicePoints);
        
    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Adolescence Home Backyard scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceHomeBackyardChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = -2;
            break;
        case 'B':
            choicePoints = 2;
            break;
        case 'C':
            choicePoints = 5;
            break;
    }

    return choicePoints;
}    
    /**************************************************************************
    * Score the players choice in the Adolescence Home scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdolescenceHomeBedroomChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 5;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = 0;
            break;
    }
    return choicePoints;
}    

/**************************************************************************
    * Score the players choice in the Adulthood Mission scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodApartmentChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C 
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = -2;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = 2;
            break;
    }
    
    recordChoicePoints(scenes[10 + AdolescenceSceneType.ChurchSacrament.ordinal()], choicePoints);
        
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
    * Score the players choice in the Adulthood Family scenario
    * @author cbrown
    **************************************************************************/
public int scoreAdulthoodFamilyChoice(char choice) throws ScoringControlException {
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
            choicePoints = -2;
            break;
    }
    
    recordChoicePoints(scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()], choicePoints);
        
    return choicePoints;
}    

/**************************************************************************
    * Score the players choice in the Senior Church scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorChurchSacramentChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 2;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = -2;
            break;
    }
    
    recordChoicePoints(scenes[30 + SeniorSceneType.ChurchSacrament.ordinal()], choicePoints);
        
    return choicePoints;
}   
public int scoreAdulthoodParkinLotChoice(char choice) throws ScoringControlException{
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
            choicePoints = 3;
            break;
        case 'D':
            choicePoints = -5;
            
    }
    
    recordChoicePoints(scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()], choicePoints);
        
    return choicePoints;
    }

    public int scoreAdulthoodWorkOfficeChoice(char choice)throws ScoringControlException{
              int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 3;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = -5;
            break;
    }
    
    recordChoicePoints(scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()], choicePoints);
        
    return choicePoints;
    }

    public int scoreAdulthoodOfficeSupervisorChoice(char choice)throws ScoringControlException{
              int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 3;
            break;
        case 'B':
            choicePoints = -5;
            break;
        case 'C':
            choicePoints = 5;
            break;
        case 'D':
            choicePoints = -5;
            break;
    }
    
    recordChoicePoints(scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()], choicePoints);
        
    return choicePoints;
       
    }

    public int scoreAdulthoodInvestigadorHouseChoice(char choice)throws ScoringControlException{
        int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C 
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = -5;
            break;
        case 'B':
            choicePoints = -5;
            break;
        case 'C':
            choicePoints =  3;
            break;
        case 'D':
            choicePoints =  5;
            break;
    }
    
    recordChoicePoints(scenes[10 + AdolescenceSceneType.ChurchSacrament.ordinal()], choicePoints);
        
    return choicePoints;
    }

    public int scoreAdulthoodMemberHouseChoice(char choice) throws ScoringControlException{
         int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C 
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = -5;
            break;
        case 'B':
            choicePoints =  3;
            break;
        case 'C':
            choicePoints =  5;
            break;
    }
    
    recordChoicePoints(scenes[10 + AdolescenceSceneType.ChurchSacrament.ordinal()], choicePoints);
        
    return choicePoints;
    }
/**************************************************************************
    * Score the players choice in the Senior Church scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorChurchSundaySchoolChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 2;
            break;
        case 'B':
            choicePoints = 5;
            break;
        case 'C':
            choicePoints = -2;
            break;
    }
    
    recordChoicePoints(scenes[30 + SeniorSceneType.ChurchSundaySchool.ordinal()], choicePoints);
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Senior Church scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorChurchPriesthoodChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 5;
            break;
        case 'B':
            choicePoints = 2;
            break;
        case 'C':
            choicePoints = -5;
            break;
    }
    
    recordChoicePoints(scenes[30 + SeniorSceneType.ChurchPriesthood.ordinal()], choicePoints);
        
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Senior Home Backyard scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorHomeBackyardChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B, C or D
    if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B', 'C' or 'D'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 2;
            break;
        case 'B':
            choicePoints = -5;
            break;
        case 'C':
            choicePoints = 5;
            break;
        case 'D':
            choicePoints = -5;
            break;
    }
    return choicePoints;
}    
/**************************************************************************
    * Score the players choice in the Senior Home Living Roomg scenario
    * @author cbrown
    **************************************************************************/
public int scoreSeniorHomeLivingRoomChoice(char choice) throws ScoringControlException {
    int choicePoints = 0;

    // validate that the choice is a valid choice - A, B or C
    if (choice != 'A' && choice != 'B' && choice != 'C') {
        throw new ScoringControlException("Choice " + choice + " is not a valid "
                  + "choice. Must be an 'A', 'B' or 'C'.");
    }

    switch (choice) {
        case 'A':
            choicePoints = 5;
            break;
        case 'B':
            choicePoints = 3;
            break;
        case 'C':
            choicePoints = -2;
            break;
    }
    
    recordChoicePoints(scenes[30 + SeniorSceneType.HomeLivingRoom.ordinal()], choicePoints);

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
   public int repentance(double faith  
                               , double sorrowForSin 
                            , double confession 
                            , double abandonmentOfSin 
                            , double restitution 
                              , double righteousLiving 
                                ) throws RepentanceControlException { 
     
      
         if (faith < 1 || 
             faith >  5 ) { 
             throw new RepentanceControlException("Invalid input "
                     + "because input is range between 1 to 5");
         } 
 
 
         if (sorrowForSin < 1 || 
             sorrowForSin > 5  ) { 
              
      } 
 
         if (confession < 1|| confession > 5) { 
             
         } 
 
 
         if (abandonmentOfSin < 1 || abandonmentOfSin > 5  ) { 
             
         } 
          
        if (restitution < 1 || restitution > 5 ) { 
         
         }  
 
 
        if (righteousLiving < 1 || 
             righteousLiving > 5) { 
         
        } 
         
         double receiveForgivness = faith + sorrowForSin + 
                                     confession + abandonmentOfSin +  
                                    restitution + righteousLiving; 

         
         return selfAssessment(); 
       
        }

    public int selfAssessment() {
          
            int choicePoints = 0;
    
        if (correctChoice) {
            choicePoints = 5;
        }
        recordChoicePoints(scenes[30 + Repentance.faith.confession.sorrowForSin.abandonmentOfSin.restitution.righteousLiving.ordinal()], choicePoints);
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


