/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.ScoringControl;

/**
 *
 * @author cbrown
 */
public class AdolescenceSchoolScenarioView extends View {
    public AdolescenceSchoolScenarioView() {
    super("\n"
        + "\n---------------------- Adolescence School Scenario ----------------------"
        + "\nIn this scenario, achieving a college scholarship allows you to pay for "
        + "\nyour mission and launch into adulthood. Not achieving it means you have to "
        + "\ngo through a few more adolescent scenarios to accumulate enough points to "
        + "\nlaunch into adulthood."
        + "\n-------------------------------------------------------------------------"
        + "\nYou are only one A away from achieving your goal of a 4.0 grade point "
        + "\naverage. You are currently getting a B+ in one class and only have the "
        + "\nfinal exam left. You know if you do well on the exam, you’ll get an A in"
        + "\nthe class. A classmate has somehow obtained a copy of the exam answer key, "
        + "\nand has offered to share it with you. What do you do?"
        + "\n-------------------------------------------------------------------------"
        + "\nA) Take the answer key, achieve a 4.0 and get a college scholarship."
        + "\nB) Tell your classmate no thanks. A “dice roll” of 5 or 6 will result in"
        + "\n   acing the exam and getting an A and a scholarship. Any other roll will "
        + "\n   result in a B+ in the class. Another roll of the dice will determine if "
        + "\n   you get a scholarship."
        + "\nC) Report your classmate to the teacher. Receive thanks from the teacher, "
        + "\n   but also anger from other classmates who were planning on cheating. A "
        + "\n   dice roll will determine your grade and scholarship."
        + "\n<) Previous Menu"
        + "\n-------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        ScoringControl sc = null;
        int choicePoints;
        
        if (sc == null)
            sc = new ScoringControl();
        
        if (choice.equals("A") || choice.equals("B") || choice.equals(("C"))) {
            choicePoints = sc.scoreAdolescenceSchoolChoice(choice.charAt(0));
            System.out.println("Points Awarded: " + choicePoints); // DEBUG
            return true;
        } else if (choice.equals("<")) {
            return true;
        } else {    
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }

}
