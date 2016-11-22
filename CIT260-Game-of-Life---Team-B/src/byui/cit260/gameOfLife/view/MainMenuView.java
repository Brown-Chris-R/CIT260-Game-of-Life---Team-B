/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.GameControl;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;

/**
 *
 * @author cbrown
 */
public class MainMenuView extends View {
    public MainMenuView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n| Main Menu                            |"
                  + "\n----------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\n1 - Test AdolescenceLocationMenu"
                  + "\n2 - Test SeniorStartView"
                  + "\n3 - Test ChildhoodStartView"
                  + "\n4 - Test AdulthoodStartView"
                  + "\n5 - Test RepentanceStartView"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "N": // create and start new game
                this.startNewGame();
                break;
            case "G": // get and start saved game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // create and start new game
                this.saveGame();
                break;
            case "1": // create and start new game
                this.test1();
                break;
            case "2": // create and start new game
                this.test2();
            case "3": // create and start new game
                this.test3();
                break;
            case "4": // create and start new game
                this.test4();
            case "5": // create and start new game
                this.test5();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(CIT260GameOfLifeTeamB.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {

        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        // Display the main menu view
        helpMenuView.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void test1() {
        AdolescenceLocationMenuView almView = new AdolescenceLocationMenuView();
        almView.display();
    }

    private void test2() {
        SeniorStartView ssView = new SeniorStartView();
        ssView.display();
    }

    private void test3() {
        ChildhoodStartView childhood = new ChildhoodStartView();
        childhood.display();
    }

    private void test4() {
        AdulthoodStartView adulthood = new AdulthoodStartView();
        adulthood.display();
    }

    private void test5() {
        RepentanceStartView repentance = new RepentanceStartView();
        repentance.display();
    }
    
}
