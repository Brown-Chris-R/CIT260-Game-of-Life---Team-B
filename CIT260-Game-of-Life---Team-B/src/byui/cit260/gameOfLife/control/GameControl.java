/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.model.Player;
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
        System.out.println("\n*** createNewGame function called ***");
    }
}
