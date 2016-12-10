/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.exceptions.GameControlException;
import byui.cit260.gameOfLife.exceptions.MapControlException;
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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author cbrown
 */
public class GameControl {
    
    public GameControl(){
    }

    public static void saveGame(Game game, String filepath) 
            throws GameControlException{
        
     
        try ( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
           
            
            output.writeObject(game); //write the game object out to file
            
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

   

    public static void getSavedGame(String filePath)
                        throws GameControlException{
        Game game = null;
        try (FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();// read the game object from file
            
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        CIT260GameOfLifeTeamB.setCurrentGame(game);
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

    public static void createNewGame(Player player) throws GameControlException, MapControlException {
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

    static void assignScenesToLocations(Map map, Scene[] scenes) throws GameControlException, MapControlException {
        if (map == null) {
            throw new GameControlException("Map object does not exist.");
        } else if (scenes == null) {
            throw new GameControlException("Scenes object does not exist.");            
        }
        try {
            
        
            Location[][] locations = map.getLocations();

            //start point
            locations[0][0].setScene(scenes[ChildhoodSceneType.SchoolCafeteria.ordinal()]);
            locations[1][0].setScene(scenes[ChildhoodSceneType.SchoolGym.ordinal()]);
            locations[2][0].setScene(scenes[ChildhoodSceneType.SchoolPlayground.ordinal()]);
            //locations[3][0].setScene(scenes[ChildhoodSceneType.SchoolCafeteria.ordinal()]);
            locations[4][0].setScene(scenes[ChildhoodSceneType.ChurchPrimary.ordinal()]);
            locations[5][0].setScene(scenes[ChildhoodSceneType.ChurchSundaySchool.ordinal()]);
            locations[6][0].setScene(scenes[ChildhoodSceneType.HomeKitchen.ordinal()]);
            locations[7][0].setScene(scenes[ChildhoodSceneType.HomeLivingRoom.ordinal()]);
            locations[0][1].setScene(scenes[10 + AdolescenceSceneType.School.ordinal()]);

            locations[1][1].setScene(scenes[10 + AdolescenceSceneType.ChurchSacrament.ordinal()]);

            locations[4][2].setScene(scenes[20 + AdulthoodSceneType.WorkBreakroom.ordinal()]);

            locations[0][3].setScene(scenes[30 + SeniorSceneType.Hospital.ordinal()]);
        } catch (Exception e) {
        }
    }
}
