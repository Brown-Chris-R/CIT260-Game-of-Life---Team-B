/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.ScoringControl;
import byui.cit260.gameOfLife.exceptions.ScoringControlException;

/**
 *
 * @author cbrown
 */
public class ChildhoodChurchPrimaryScenarioView extends View {
            public ChildhoodChurchPrimaryScenarioView() {
    super("\n"
        + "\n------------------ Childhood Church Primary Scenario ------------------"
        + "\nYour teacher tells this story: " 
        + "\nA young boy named Warren lived near a bird refuge. A refuge is a "
        + "\nplace where birds are protected. Warren’s father’s job was to help " 
        + "\nprotect the birds. Warren had found a nest in the tall grass near " 
        + "\nhis home, and he loved to look at the eggs in the nest when the " 
        + "\nmother bird was away. One day when Warren was looking at the eggs, " 
        + "\nhe heard a loud noise. He looked up and saw that two boys from his " 
        + "\nschool had shot a bird with a slingshot. " 
        + "\nThe two boys saw Warren and came up to look at the nest. One of the " 
        + "\nboys wanted to smash the eggs. Warren convinced the boys not to " 
        + "\nsmash the eggs, and he told them that it was against the law to kill " 
        + "\nbirds in the refuge. The boys told Warren that he had better not " 
        + "\ntell anyone that they had shot a bird. They did not want to be " 
        + "\npunished for breaking the law. As Warren went home, he walked very " 
        + "\nslowly, thinking about what he should do. If he told his father " 
        + "\nabout the boys, they might make fun of him or hurt him." 
        + "\nWhat question should Warren ask himself to help him choose the right?" 
        + "\n-------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        ScoringControl sc = null;
        int choicePoints;
        
        if (sc == null)
            sc = new ScoringControl();
        
        if (choice.equals("<")) {
            return true;
        } else {
            try {
                choicePoints = sc.scoreChildhoodChurchPrimaryChoice(choice);
                this.console.println("Points Awarded: " + choicePoints); // DEBUG
                return true;
            } catch (ScoringControlException se) {
                this.console.println(se.getMessage());
            }
        }
        return false;
    }
}
