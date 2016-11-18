/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.model.Map;

/**
 *
 * @author cbrown
 */
public class MapControl {

    static Map createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    String errorText = new String();

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
