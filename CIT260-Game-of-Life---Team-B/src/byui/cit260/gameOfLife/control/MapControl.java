/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.exceptions.GameControlException;
import byui.cit260.gameOfLife.exceptions.MapControlException;
import byui.cit260.gameOfLife.exceptions.MapException;
import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Scene;
import byui.cit260.gameOfLife.model.ChildhoodSceneType;
import byui.cit260.gameOfLife.model.AdolescenceSceneType;
import byui.cit260.gameOfLife.model.AdulthoodSceneType;
import byui.cit260.gameOfLife.model.SeniorSceneType;
import byui.cit260.gameOfLife.view.ErrorView;

/**
 *
 * @author cbrown
 */
public class MapControl {

    String errorText = new String();

    public static Map createMap() throws MapControlException {
        // Create the map - 4 columns represent the 4 game phases
        // 10 columns for the maximum number of locations per phase
        // note that not all rows will have a valid location in some phases
        Map map = null;
        
        try {
            map = new Map(10,4);
        } catch(MapException me) {
            throw new MapControlException(me.getMessage()); 
        }
        
        // create the scenes for the game
        Scene[] scenes = createScenes();
        map.setScenes(scenes);
        
        // assigne scenes to locations
        try {
            GameControl.assignScenesToLocations(map, scenes);
        } catch (GameControlException ge) {
            ErrorView.display("MapControl", ge.getMessage());
        }
        
        return map;
    }
 
    private static Scene[] createScenes() {
        // Create scenes array that will consist of scenes for the 4 phases
        // Childhood, Adolescence, Adulthood and Senior
        Scene[] scenes = new Scene[ChildhoodSceneType.values().length + AdolescenceSceneType.values().length + AdulthoodSceneType.values().length + SeniorSceneType.values().length];
        
        // Create Childhood Scenes
        // Childhood School Cafeteria scene
        Scene childhoodSchoolCafeteriaScene = new Scene();
        childhoodSchoolCafeteriaScene.setName("Childhood | School | Cafeteria");
        childhoodSchoolCafeteriaScene.setDescription(
            "You are at the cafeteria and you notice that a classmate is sitting "
          + "at the table and didn’t bring his lunch. You have some extra food "
          + "left from your lunch and some money in your pocket. What would you "
          + "do?");
        childhoodSchoolCafeteriaScene.setMapSymbol("C1");
        childhoodSchoolCafeteriaScene.setBlocked(false);
        scenes[ChildhoodSceneType.SchoolCafeteria.ordinal()] = childhoodSchoolCafeteriaScene;
        // Childhood School Gymn scene
        Scene childhoodSchoolGymScene = new Scene();
        childhoodSchoolGymScene.setName("Childhood | School | Gym");
        childhoodSchoolGymScene.setDescription(
            "You are in the gymn with all the other students playing. You notice "
          + "some boys are bullying a little boy because of the way he is "
          + "dressed. What would you do?");
        childhoodSchoolGymScene.setMapSymbol("C2");
        childhoodSchoolGymScene.setBlocked(false);
        scenes[ChildhoodSceneType.SchoolGym.ordinal()] = childhoodSchoolGymScene;
        // Childhood School Playground scene
        Scene childhoodSchoolPlaygroundScene = new Scene();
        childhoodSchoolPlaygroundScene.setName("Childhood | School | Playground");
        childhoodSchoolPlaygroundScene.setDescription(
            "At the playground you find a backpack that was left behind. You "
          + "open the backpack and see a cellphone, money and an iPod. You have "
          + "always wanted those things. You look around and see that no one is "
          + "looking. What would you do?");
        childhoodSchoolPlaygroundScene.setMapSymbol("C3");
        childhoodSchoolPlaygroundScene.setBlocked(false);
        scenes[ChildhoodSceneType.SchoolPlayground.ordinal()] = childhoodSchoolPlaygroundScene;
        // Childhood Church Primary scene
        Scene childhoodChurchPrimaryScene = new Scene();
        childhoodChurchPrimaryScene.setName("Childhood | Church | Primary");
        childhoodChurchPrimaryScene.setDescription(
            "Your teacher tells this story: "
          + "A young boy named Warren lived near a bird refuge. A refuge is a "
          + "place where birds are protected. Warren’s father’s job was to help "
          + "protect the birds. Warren had found a nest in the tall grass near "
          + "his home, and he loved to look at the eggs in the nest when the "
          + "mother bird was away. One day when Warren was looking at the eggs, "
          + "he heard a loud noise. He looked up and saw that two boys from his "
          + "school had shot a bird with a slingshot.\n" 
          + "The two boys saw Warren and came up to look at the nest. One of the "
          + "boys wanted to smash the eggs. Warren convinced the boys not to "
          + "smash the eggs, and he told them that it was against the law to kill "
          + "birds in the refuge. The boys told Warren that he had better not "
          + "tell anyone that they had shot a bird. They did not want to be "
          + "punished for breaking the law. As Warren went home, he walked very "
          + "slowly, thinking about what he should do. If he told his father "
          + "about the boys, they might make fun of him or hurt him."
          + "What question should Warren ask himself to help him choose the right?");
        childhoodChurchPrimaryScene.setMapSymbol("C5");
        childhoodChurchPrimaryScene.setBlocked(false);
        scenes[ChildhoodSceneType.ChurchPrimary.ordinal()] = childhoodChurchPrimaryScene;
        // Childhood Church Sunday School scene
        Scene childhoodChurchSundaySchoolScene = new Scene();
        childhoodChurchSundaySchoolScene.setName("Childhood | Church | Sunday School");
        childhoodChurchSundaySchoolScene.setDescription(
            "And it came to pass, that I, Nephi, said unto my father: _ ____ __ "
          + "___ __ the things the Lord has commanded, for I know that the Lord "
          + "giveth no commandment unto the children of men, save he shall "
          + "prepare a way for them that they may accomplish the thing which "
          + "he commandeth them."
          + "Fill in the missing phrase.");
        childhoodChurchSundaySchoolScene.setMapSymbol("C6");
        childhoodChurchSundaySchoolScene.setBlocked(false);
        scenes[ChildhoodSceneType.ChurchSundaySchool.ordinal()] = childhoodChurchSundaySchoolScene;
        // Childhood Church Bishop's Office scene
        Scene childhoodChurchBishopsOfficeScene = new Scene();
        childhoodChurchBishopsOfficeScene.setName("Childhood | Church | Bishop's Office");
        childhoodChurchBishopsOfficeScene.setDescription(
            "You are at the bishop’s office for your interview before getting "
          + "baptized. You are in the middle of you interview when he asked you "
          + "about for behavior at home. You know you have been saying bad words "
          + "at home and at school. You don't want to upset the bishop if you "
          + "tell him about your conduct. What will you do?");
        childhoodChurchBishopsOfficeScene.setMapSymbol("C7");
        childhoodChurchBishopsOfficeScene.setBlocked(false);
        scenes[ChildhoodSceneType.ChurchBishopsOffice.ordinal()] = childhoodChurchBishopsOfficeScene;
        // Childhood Home Kitchen scene
        Scene childhoodHomeKitchenScene = new Scene();
        childhoodHomeKitchenScene.setName("Childhood | Home | Kitchen");
        childhoodHomeKitchenScene.setDescription(
            "You have to make 24 cupcakes for a school activity. Your mother has "
          + "recipe for a dozen cupcakes, as follows: "
          + "White Flour:    2 cups"
          + "Sugar:          1 1/2 cups"
          + "Baking Powder:  2 1/2 cups"
          + "Salt:           1 tsp."
          + "Butter:         1/3 cup"
          + "Milk:           2/3 cup"
          + "Vanilla:        1 tsp."
          + "Dark Cocoa:     1 cup"          
          + "You are mixing the recipe and find that you only have 1 stick of "
          + " butter. How much more butter will you need to make 24 cupcakes? "
          + "Enter your answer with 3 decimals (0.xxx):");
        childhoodHomeKitchenScene.setMapSymbol("C8");
        childhoodHomeKitchenScene.setBlocked(false);
        scenes[ChildhoodSceneType.HomeKitchen.ordinal()] = childhoodHomeKitchenScene;
        // Childhood Home Living Room scene
        Scene childhoodHomeLivingRoomScene = new Scene();
        childhoodHomeLivingRoomScene.setName("Childhood | Home | Living Room");
        childhoodHomeLivingRoomScene.setDescription(
            "Happiness in family life is most likely to be achieved when founded "
          + "upon ___ _________ __ ___ ____ _____ ______. " 
          + "Fill in the missing phrase.");
        childhoodHomeLivingRoomScene.setMapSymbol("C9");
        childhoodHomeLivingRoomScene.setBlocked(false);
        scenes[ChildhoodSceneType.HomeLivingRoom.ordinal()] = childhoodHomeLivingRoomScene;
        // Childhood Home Backyard scene
        Scene childhoodHomeBackyardScene = new Scene();
        childhoodHomeBackyardScene.setName("Childhood | Home | Backyard");
        childhoodHomeBackyardScene.setDescription(
            "You are practicing baseball in your backyard and hit the ball into "
          + "the neigbors window, breaking it. What do you do? ");
        childhoodHomeBackyardScene.setMapSymbol("C10");
        childhoodHomeBackyardScene.setBlocked(false);
        scenes[ChildhoodSceneType.HomeBackyard.ordinal()] = childhoodHomeBackyardScene;

        // Create Adolescence Scenes (use 10 + ordinal)
        Scene adolescenceSchoolScene = new Scene();
        adolescenceSchoolScene.setName("Adolescence | School");        
        adolescenceSchoolScene.setDescription(
            "In this scenario, achieving a college scholarship allows you to pay for " 
        + "your mission and launch into adulthood. Not achieving it means you have to "
        + "go through a few more adolescent scenarios to accumulate enough points to "
        + "launch into adulthood."
        + "-------------------------------------------------------------------------"
        + "You are only one A away from achieving your goal of a 4.0 grade point "
        + "average. You are currently getting a B+ in one class and only have the "
        + "final exam left. You know if you do well on the exam, you’ll get an A in"
        + "the class. A classmate has somehow obtained a copy of the exam answer key, "
        + "and has offered to share it with you. What do you do?"
        + "-------------------------------------------------------------------------"
        + "A) Take the answer key, achieve a 4.0 and get a college scholarship."
        + "B) Tell your classmate no thanks. A “dice roll” of 5 or 6 will result in"
        + "   acing the exam and getting an A and a scholarship. Any other roll will "
        + "   result in a B+ in the class. Another roll of the dice will determine if "
        + "   you get a scholarship."
        + "C) Report your classmate to the teacher. Receive thanks from the teacher, "
        + "   but also anger from other classmates who were planning on cheating. A "
        + "   dice roll will determine your grade and scholarship.");
        adolescenceSchoolScene.setMapSymbol("a1");
        adolescenceSchoolScene.setBlocked(false);
        scenes[10 + AdolescenceSceneType.School.ordinal()] = adolescenceSchoolScene;
        
        Scene adolescenceChurchSacramentScene = new Scene();
        adolescenceChurchSacramentScene.setName("Adolescence | Church | Sacrament");        
        adolescenceChurchSacramentScene.setDescription(
            "You are at sacrament meeting and notice a text message on your phone "
          + "from your best friend. You try to ignore it but notice another text "
          + "message. You are eager to see what they have to say. You promised "
          + "yourself you wouldn’t use your phone at church. What do you do?");
        adolescenceChurchSacramentScene.setMapSymbol("a2");
        adolescenceChurchSacramentScene.setBlocked(false);
        scenes[10 + AdolescenceSceneType.ChurchSacrament.ordinal()] = adolescenceChurchSacramentScene;
        
        // Create Adulthood Scenes (use 20 + ordinal)
        Scene adulthoodWorkBreakroomScene = new Scene();
        adulthoodWorkBreakroomScene.setName("Adulthood | Work | Breakroom");
        adulthoodWorkBreakroomScene.setDescription(
            "You are thirsty and go to the break room to get a snack from the "
          + "vending machine. You put the required amount of money in for 1 "
          + "snack. The machine takes your money, but spits out two snacks "
          + "instead of just one. What do you do?");
        adulthoodWorkBreakroomScene.setMapSymbol("A5");
        adulthoodWorkBreakroomScene.setBlocked(false);
        scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()] = adulthoodWorkBreakroomScene;
        
        // Create Senior Scenes (use 30 + ordinal)
        Scene seniorHospitalScene = new Scene();
        seniorHospitalScene.setName("Senior | Hospital");
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
        scenes[30 + SeniorSceneType.Hospital.ordinal()] = seniorHospitalScene;
                
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
