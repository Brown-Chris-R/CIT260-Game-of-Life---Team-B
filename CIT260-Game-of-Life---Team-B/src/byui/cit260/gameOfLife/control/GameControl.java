/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

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

    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player(); // create player object
        player.setName(playersName);  // set players name
                
        CIT260GameOfLifeTeamB.setPlayer(player); // save the player
        return player;
    }

    public static void createNewGame(Player player) {
     Game game = new Game();// create a new game
     CIT260GameOfLifeTeamB.setCurrentGame(game); // save the game into CIT260GameOflife
     
     game.setPlayer(player);
     
     Item[] item = GameControl.createItem();
    
     Map map = MapControl.createMap();
     //game.setMap(map);
     
    }
    public static Item [] createItem (){
        Item[] item =
        new Item[5];
        
        Item diploma = new Item();
        diploma.setInventoryType("Diploma");
        diploma.setQuantityInStock(0);
        diploma.setRequiredAmount(0);
        item[0]= diploma;
        
        Item money = new Item();
        money.setInventoryType("Money");
        money.setQuantityInStock(0);
        money.setRequiredAmount(0);
        item[1]= money;
        
        Item scriptures = new Item();
        scriptures.setInventoryType("Scriptures");
        scriptures.setQuantityInStock(0);
        scriptures.setRequiredAmount(0);
        item[2]= scriptures;
        
        Item cellphone = new Item();
        cellphone.setInventoryType("Cellphone");
        cellphone.setQuantityInStock(0);
        cellphone.setRequiredAmount(0);
        item[3]= cellphone;
        
        Item backpack = new Item();
        backpack.setInventoryType("Backpack");
        backpack.setQuantityInStock(0);
        backpack.setRequiredAmount(0);
        item[4]= backpack;
        
        return item;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[ChildhoodSceneType.SchoolCafeteria.ordinal()]);

        locations[3][0].setScene(scenes[SeniorSceneType.Hospital.ordinal()]);
    }
}
