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

/**
 *
 * @author RMLOY_000
 */
public class CIT260GameOfLifeTeamB {

    private static final String GAME_VERSION = "0.10 - pre-production";
    private static Game currentGame = null;
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create StartProgramView and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

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

    public static String getGameVersion() {
        return GAME_VERSION;
    }
    
    
}
