/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.exceptions.GameControlException;
import byui.cit260.gameOfLife.model.ChildhoodSceneType;
import byui.cit260.gameOfLife.model.AdolescenceSceneType;
import byui.cit260.gameOfLife.model.AdulthoodSceneType;
import byui.cit260.gameOfLife.model.SeniorSceneType;
import byui.cit260.gameOfLife.model.Game;
import byui.cit260.gameOfLife.model.Item;
import byui.cit260.gameOfLife.model.Location;
import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Player;
import byui.cit260.gameOfLife.model.Scene;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.util.Scanner;

/**
 *
 * @author cbrown
 */
public class GameControl {
    
    public static void GameControl(String[]args){
    Scanner in = new Scanner(System.in);
    
  
    System.out.println("1. New Game");
    System.out.println("2. Open Map");
    System.out.println("3. Save Game");
    System.out.println("4. Select Game");
    System.out.println("5. New Player");
    System.out.println("0. Quit");
    
    boolean quit = false;
    int menuItem;
    
    do{
        System.out.println("Choose a menu item:");
        menuItem = in.nextInt();
        
        switch (menuItem){
                  case 1:
                          System.out.println("You have chosen New Game ");
                          break;
                  case 2:
                        System.out.println("You have chosen Open Map");
                       
                        break;
                  case 3:
                        System.out.println("You have chosen Save Game");
                        
                        break;
                  case 4:
                        System.out.println("You have chosen Select Game");
                       
                        break;
                  case 5:
                        System.out.println("You have chosen New Player");
                       
                        break;
                  case 0:
                        quit = true;
                        break;
                  default:
                        System.out.println("Invalid choice.");
                
        }
        
    }while (!quit);
      System.out.println("Game ended!");
    }

    public static Player createPlayer(String playersName) throws GameControlException {
        if (playersName == null) {
            throw new GameControlException("Players name does not have a value. "
                + "Please enter a player name.");
        }
        
        Player player = new Player(); // create player object
        player.setName(playersName);  // set players name
                
        CIT260GameOfLifeTeamB.setPlayer(player); // save the player
        return player;
    }

    public static void createNewGame(Player player) throws GameControlException {
        if (player == null) {
            throw new GameControlException("Player object does not exist.");
        }

        Game game = new Game();// create a new game
        CIT260GameOfLifeTeamB.setCurrentGame(game); // save the game into CIT260GameOflife

        game.setPlayer(player);
        game.setScore(0);
        game.setTotalTurns(0);
        game.nextPhase(null); //will initialize phase to "Childhood"

        Item[] items = ItemControl.createItems();
        game.setItems(items);

        Map map = MapControl.createMap();
        game.setMap(map);

    }

    static void assignScenesToLocations(Map map, Scene[] scenes) throws GameControlException {
        if (map == null) {
            throw new GameControlException("Map object does not exist.");
        } else if (scenes == null) {
            throw new GameControlException("Scenes object does not exist.");            
        }

        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[ChildhoodSceneType.SchoolCafeteria.ordinal()]);
        locations[0][1].setScene(scenes[10 + AdolescenceSceneType.School.ordinal()]);

        locations[1][1].setScene(scenes[10 + AdolescenceSceneType.ChurchSacrament.ordinal()]);

        locations[4][2].setScene(scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()]);

        locations[0][3].setScene(scenes[30 + SeniorSceneType.Hospital.ordinal()]);
    }
}
