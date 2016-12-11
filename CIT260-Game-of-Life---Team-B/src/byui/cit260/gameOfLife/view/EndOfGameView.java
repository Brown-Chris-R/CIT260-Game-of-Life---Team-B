/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.model.Game;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author cbrown
 */
class EndOfGameView {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = CIT260GameOfLifeTeamB.getInFile();
    protected final PrintWriter console = CIT260GameOfLifeTeamB.getOutFile();

    public EndOfGameView() {
    }

    public void display() {

        Game game = CIT260GameOfLifeTeamB.getCurrentGame();
        int score = game.getScore();
        String destination = "Spirit Prison";
        if (score >= 150) {
            destination = "Paradise";
        }
        displayMessage = "\n"
        + "\nContratulations on finishing Life. You scored " + score
        + "\npoints and have earned a place in " + destination + "!" 
        + "\n--------------------------------------------------------"
        + "\nPress any key to end the game."
        + "\n--------------------------------------------------------";
        
        this.console.println("\n" + this.displayMessage);

        // prompt for and get the players menu choice
        try {
            String value = keyboard.readLine();
        } catch (IOException e) {
            return; // exit the game
        }
        return; // exit the game
    }
  
}
