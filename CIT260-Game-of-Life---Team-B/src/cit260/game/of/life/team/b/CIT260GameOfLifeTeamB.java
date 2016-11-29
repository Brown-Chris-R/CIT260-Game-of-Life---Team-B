/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.game.of.life.team.b;

import byui.cit260.gameOfLife.view.StartProgramView;

import byui.cit260.gameOfLife.model.Character;
import byui.cit260.gameOfLife.model.Game;
import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Location;
import byui.cit260.gameOfLife.model.Choice;
import byui.cit260.gameOfLife.model.Item;
import byui.cit260.gameOfLife.model.Player;
import byui.cit260.gameOfLife.model.Scene;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RMLOY_000
 */
public class CIT260GameOfLifeTeamB {

    private static final String GAME_VERSION = "0.80 - pre-production";
    private static Game currentGame = null;
    private static Player player = null;
    private static BufferedReader inFile = null;
    private static PrintWriter outFile = null;
    private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // open character stream files for end user input and output
            CIT260GameOfLifeTeamB.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            CIT260GameOfLifeTeamB.outFile = new PrintWriter(System.out, true);
            // open log file
            
            String filePath = "log.txt";
            CIT260GameOfLifeTeamB.logFile = new PrintWriter(filePath);
            // create StartProgramView and display the start program view
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch(Throwable e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                if (CIT260GameOfLifeTeamB.inFile != null)
                    CIT260GameOfLifeTeamB.inFile.close();
                if (CIT260GameOfLifeTeamB.outFile != null)
                    CIT260GameOfLifeTeamB.outFile.close();
                if (CIT260GameOfLifeTeamB.logFile != null)
                    CIT260GameOfLifeTeamB.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CIT260GameOfLifeTeamB.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CIT260GameOfLifeTeamB.player = player;
    }
    public static String getGAME_VERSION() {
        return GAME_VERSION;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CIT260GameOfLifeTeamB.inFile = inFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }
    
    public static void setOutFile(PrintWriter outFile) {
        CIT260GameOfLifeTeamB.outFile = outFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CIT260GameOfLifeTeamB.logFile = logFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }
    
}
