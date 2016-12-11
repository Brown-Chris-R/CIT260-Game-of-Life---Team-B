/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.GameControl;
import byui.cit260.gameOfLife.exceptions.GameControlException;
import byui.cit260.gameOfLife.exceptions.MapControlException;
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
                  + "\nC - Continue existing game"
                  + "\nG - Get and start saved"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\n1 - Test SeniorStartView"
                  + "\n2 - Test RepentanceStartView"
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
            case "C": // continue game
                this.continueExistingGame();
                break;
            case "G": // get and start saved game
                this.startSavedGame();
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
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl.createNewGame(CIT260GameOfLifeTeamB.getPlayer());
        } catch (GameControlException ge) {
            ErrorView.display(this.getClass().getName(), ge.getMessage());
            return;
        } catch (Throwable te){
            ErrorView.display(this.getClass().getName(), te.getMessage());
        }
   
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
}

    private void continueExistingGame(){
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startSavedGame(){
        // promopt for and get the name of the file to save the game in
        this.console.print("\n\nEnter tne file path for file where the game "
                            +"is to be saved.");
        String filePath = this.getInput();
        try {
            // start a save game from the specified file
            GameControl.getSavedGame(filePath);
            this.console.println("Game successfully retrieved!");
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {

        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        // Display the main menu view
        helpMenuView.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game "
                             + "is to be saved.");
        String filePath = this.getInput();
        try {
            //save the game to the speciried file
            GameControl.saveGame(CIT260GameOfLifeTeamB.getCurrentGame(), filePath);
            this.console.println("Game successfully saved!");
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
                
    }

    private void test1() {
        SeniorStartView seniorStart = new SeniorStartView();
        seniorStart.display();
    }
    
    private void test2() {
        RepentanceStartView repentanceStart = new RepentanceStartView();
        repentanceStart.display();
    }

}
