/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.GameControl;
import byui.cit260.gameOfLife.exceptions.GameControlException;
import byui.cit260.gameOfLife.model.Player;
import java.util.Scanner;

/**
 *
 * @author cbrown
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
        
    }    

    private void displayBanner() {
        System.out.println(
                "\n************************************************************"
              + "\n*                                                          *"
              + "\n* This is the game of Life. In this game you will take on  *"
              + "\n* the role of a son or daughter of God. You have chosen to *"
              + "\n* come to earth to gain experience through challenges,     *"
              + "\n* experience joy, success, love and happiness. You will    *"
              + "\n* also experience illness, pain, hard decisions, failures  *"
              + "\n* and dissapointments. These are all things you need in    *"
              + "\n* order to reach your potential. Succeeding requires       *"
              + "\n* patience, faith, repentance, following the commandments, *"
              + "\n* and reliance on your brother Jesus Christ.               *"
              + "\n*                                                          *"
              + "\n* The objective of this game is to return home to our      *"
              + "\n* Heavenly Father. You will pass through 4 major phases of *"
              + "\n* life: Childhood, Adolescence, Adulthood and Senior.      *"
              + "\n* In each phase you will have experiences and will gain    *"
              + "\n* points by making decisions. To move from one phase to    *"
              + "\n* the next, you will need to get 25 or more points in that *"
              + "\n* phase, and you may also be required to obtain certain    *"
              + "\n* items along the way. In any phase, repentance may be     *"
              + "\n* used to gain additional points.                          *"
              + "\n*                                                          *"
              + "\n************************************************************"
        );
    }

    public void displayStartProgramView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game

            done = this.doAction(playersName);
        
        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // set flag to not valid
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end the loop    
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        Player player;
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        // create player object
        try {
            player = GameControl.createPlayer(playersName);
        } catch (GameControlException ge) {
            System.out.println(ge.getMessage());
            return false;
        }

        this.displayNextView(player);
        return true; // success
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n==================================="
                          + "\n Welcome to Life " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n=================================="
                          );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }
}
