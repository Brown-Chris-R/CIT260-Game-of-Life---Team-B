/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;

/**
 *
 * @author cbrown
 */
public class HelpMenuView extends View {
    public HelpMenuView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n| Help Menu                            |"
                  + "\n----------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nA - About the game"
                  + "\nV - View Game/Player"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "G": // create and start new game
                this.displayGameGoal();
                break;
            case "A": // get and start saved game
                this.displayAboutGame();
                break;
            case "V": // display the help menu
                this.displayGamePlayer();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayGameGoal() {
        System.out.println("\n*** displayGameGoal function called ***");
    }

    private void displayAboutGame() {
        System.out.println("\nGemeOfLife Version: " + CIT260GameOfLifeTeamB.getGAME_VERSION());
    }

    private void displayGamePlayer() {
        System.out.println("\n*** displayGamePlayer function called ***");
    }
    
    
}
