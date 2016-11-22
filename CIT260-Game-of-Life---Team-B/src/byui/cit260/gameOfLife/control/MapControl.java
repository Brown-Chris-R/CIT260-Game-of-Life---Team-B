/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Scene;
import byui.cit260.gameOfLife.model.Phase;
import byui.cit260.gameOfLife.model.ChildhoodSceneType;
import byui.cit260.gameOfLife.model.AdolescenceSceneType;
import byui.cit260.gameOfLife.model.AdulthoodSceneType;
import byui.cit260.gameOfLife.model.SeniorSceneType;

/**
 *
 * @author cbrown
 */
public class MapControl {

    String errorText = new String();

    public static Map createMap() {
        // Create the map - 4 columns represent the 4 game phases
        // 10 columns for the maximum number of locations per phase
        // note that not all rows will have a valid location in some phases
        Map map = new Map(10,4);
        
        // create the scenes for the game
        Scene[] scenes = createScenes();
        
        // assigne scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
 
    private static Scene[] createScenes() {
        // Create scenes array that will consist of scenes for the 4 phases
        // Childhood, Adolescence, Adulthood and Senior
        Scene[] scenes = new Scene[ChildhoodSceneType.values().length + AdolescenceSceneType.values().length + AdulthoodSceneType.values().length + SeniorSceneType.values().length];
        
        // Create Childhood Scenes
        Scene childhoodSchoolCafeteriaScene = new Scene();
        childhoodSchoolCafeteriaScene.setDescription(
            "You are at the cafeteria and you notice that a classmate is sitting "
          + "at the table and didn’t bring his lunch. You have some extra food "
          + "left from your lunch and some money in your pocket. What would you "
          + "do?");
        childhoodSchoolCafeteriaScene.setMapSymbol("C1");
        childhoodSchoolCafeteriaScene.setBlocked(false);
        scenes[ChildhoodSceneType.SchoolCafeteria.ordinal()] = childhoodSchoolCafeteriaScene;

        // Create Adolescence Scenes

        // Create Adulthood Scenes

        // Create Senior Scenes
        Scene seniorHospitalScene = new Scene();
        seniorHospitalScene.setDescription(
            "Contratulations to acheiving Senior status!"
          + "It is your 60th birthday, and you are celebrating "
          + "with your family. You feel a pain in your lower right "
          + "abdomen. You are rushed to the hospital and diagnosed "
          + "with appendicitis. After surgery you spend several "
          + "days in the hospital. Below is the bill from the "
          + "hospital. You need to calculate the amount you will "
          + "pay after the insurance has paid it's portion. Your "
          + "insurance pays 75% of expenses after a $500 deductible. "
          + "Round your answer to the nearest dollar."
          + "--------------------------------------------------------"
          + "Hospital Bill Total: $29,400"
          + "What is your portion of the medical bill?");
        seniorHospitalScene.setMapSymbol("S1");
        seniorHospitalScene.setBlocked(false);
        scenes[SeniorSceneType.Hospital.ordinal()] = seniorHospitalScene;
                
        return scenes;
    }

    /**************************************************************************
    * Enumerate the valid Locations for a valid phase
    * @author cbrown
    **************************************************************************/
public String[] getLocations(String phase) {
    String[] validLocations = new String[4];

    /* validate that the phase is a valid phase - "Childhood", "Adolescence",
    * "Adulthood" or "Senior"
    */
    if (!"Childhood".equals(phase) && !"Adolescence".equals(phase) && !"Adulthood".equals(phase) && !"Senior".equals(phase)) {
        errorText = "Phase " + phase + " is not a valid phase.";
        validLocations[0] = "Invalid";
        return validLocations;
    }
    switch (phase) {
        case "Childhood":
            validLocations[0] = "Church";
            validLocations[1] = "School";
            validLocations[2] = "Home";
            break;
        case "Adolescence":
            validLocations[0] = "Church";
            validLocations[1] = "School";
            validLocations[2] = "Home";
            break;
        case "Adulthood":
            validLocations[0] = "Mission";
            validLocations[1] = "Work";
            validLocations[2] = "University";
            validLocations[3] = "Family";
            break;
        case "Senior":
            validLocations[0] = "Church";
            validLocations[1] = "Home";
            break;
    }
    
    return validLocations;
}    
    /**************************************************************************
    * Enumerate the valid Scenarios for a valid phase and location
    * @author cbrown
    **************************************************************************/
public String[] getScenarios(String phase, String location) {
    String[] validScenarios = new String[4];

    /* validate that the phase is a valid phase - "Childhood", "Adolescence",
    * "Adulthood" or "Senior"
    */
    if (!"Childhood".equals(phase) && !"Adolescence".equals(phase) && !"Adulthood".equals(phase) && !"Senior".equals(phase)) {
        errorText = "Phase " + phase + " is not a valid phase.";
        validScenarios[0] = "Invalid";
        return validScenarios;
    }
    String[] validLocations = getLocations(phase);
    
    /* validate that the location is a valid location for the phase
    */
    switch (phase) {
        case "Childhood":
            if (location != validLocations[0] && location != validLocations[1] && location != validLocations[2]) {
                errorText = "Location " + location + " is not a valid location for the " + phase + " phase.";
                validScenarios[0] = "Invalid";
                return validScenarios;            
            }
            break;
        case "Adolescence":
            if (location != validLocations[0] && location != validLocations[1] && location != validLocations[2]) {
                errorText = "Location " + location + " is not a valid location for the " + phase + " phase.";
                validScenarios[0] = "Invalid";
                return validScenarios;
            }
            break;
        case "Adulthood":
            if (location != validLocations[0] && location != validLocations[1] && location != validLocations[2] && location != validLocations[3]) {
                errorText = "Location " + location + " is not a valid location for the " + phase + " phase.";
                validScenarios[0] = "Invalid";
                return validScenarios;                
            }
            break;
        case "Senior":
            if (location != validLocations[0] && location != validLocations[1]) {
                errorText = "Location " + location + " is not a valid location for the " + phase + " phase.";
                validScenarios[0] = "Invalid";
                return validScenarios;                
            }
            break;       
    }

    /* Enumerate the valid Scenarios for a given Phase/Location
    *
    */
    switch (phase) {
        case "Childhood":
            switch (location) {
                case "School":
                    validScenarios[0] = "Cafeteria";
                    validScenarios[1] = "Gymn";
                    validScenarios[2] = "Playground";
                    validScenarios[3] = "Classroom";
                    break;
                case "Church":
                    validScenarios[0] = "Sunday School";
                    validScenarios[1] = "Primary";
                    validScenarios[2] = "Bishop's Office";
                    break;
                case "Home":
                    validScenarios[0] = "Kitchen";
                    validScenarios[1] = "Living Room";
                    validScenarios[2] = "Back Yard";
                    break;
            }
            break;
        case "Adolescence":
            switch (location) {
                case "School":
                    break;
                case "Church":
                    validScenarios[0] = "Sacrament";
                    validScenarios[1] = "Priesthood";
                    validScenarios[2] = "Additional";
                    break;
                case "Home":
                    validScenarios[0] = "Back Yard";
                    validScenarios[1] = "Bedroom";
                    break;
            }
            break;
        case "Adulthood":
            switch (location) {
                case "Mission":
                    validScenarios[0] = "Apartment";
                    validScenarios[1] = "Investigator's House";
                    validScenarios[2] = "Member's House";
                    validScenarios[3] = "On the Street";
                    break;
                case "Work":
                    validScenarios[0] = "Break Room";
                    validScenarios[1] = "Office";
                    validScenarios[2] = "Parking Lot";
                    validScenarios[3] = "Supervisor's Office";
                    break;
                case "University":
                    validScenarios[0] = "Certificate";
                    validScenarios[1] = "Associates";
                    validScenarios[2] = "Bachelors";
                    break;
                case "Family":
                    break;
            }
            break;
        case "Senior":
            switch (location) {
                case "Church":
                    validScenarios[0] = "Sacrament";
                    validScenarios[1] = "Sunday School";
                    validScenarios[2] = "Priesthood";
                    break;
                case "Home":
                    validScenarios[0] = "Back Yard";
                    validScenarios[1] = "Living Room";
                    break;
            }
            break;
    }
    
    return validScenarios;
}    
    
}
