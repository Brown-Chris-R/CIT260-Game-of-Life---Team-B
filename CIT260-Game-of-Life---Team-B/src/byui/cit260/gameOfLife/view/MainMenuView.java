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
                  + "\nG - Get and start saved"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\n1 - Test Adolescence Menu"
                  + "\n2 - Test Senior Menu"
                  + "\n3 - Test Childhood Menu"
                  + "\n4 - Test Adulthood Menu"
                  + "\n5 - Test SeniorStartView"
                  + "\n6 - Test RepentanceStartView"
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
                break;
            case "3": // create and start new game
                this.test3();
                break;
            case "4": // create and start new game
                this.test4();
                break;
            case "5": // create and start new game
                this.test5();
                break;
            case "6": // create and start new game
                this.test6();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl.createNewGame(CIT260GameOfLifeTeamB.getPlayer());
        } catch (GameControlException ge) {
            System.out.println(ge.getMessage());
            return;
        } catch (Throwable te){
            System.out.println(te.getMessage());
        }
   
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
}


    private void startExistingGame(){
        // display the game menu
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
        this.console.println("\n*** saveGame function called ***");
    }

    private void test1() {
        AdolescenceMenuView adolescenceMenu = new AdolescenceMenuView();
        adolescenceMenu.display();
    }

    private void test2() {
        SeniorMenuView seniorMenu = new SeniorMenuView();
        seniorMenu.display();
    }

    private void test3() {
        ChildhoodMenuView childhoodMenu = new ChildhoodMenuView();
        childhoodMenu.display();
    }

    private void test4() {
        AdulthoodMenuView adulthoodMenu = new AdulthoodMenuView();
        adulthoodMenu.display();
    }

    private void test5() {
        SeniorStartView seniorStart = new SeniorStartView();
        seniorStart.display();
    }
    
    private void test6() {
        RepentanceStartView repentanceStart = new RepentanceStartView();
        repentanceStart.display();
    }

}
