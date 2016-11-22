/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.model.Game;
import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Item;
import byui.cit260.gameOfLife.model.Location;
import byui.cit260.gameOfLife.model.Player;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;

/**
 *
 * @author cbrown
 */
public class GameMenuView extends View {
    public GameMenuView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n| Game Menu                            |"
                  + "\n----------------------------------------"
                  + "\nV - View status"
                  + "\nD - Display Map"
                  + "\nC - Continue Current level"
                  + "\nM - Move to next level"
                  + "\nR - Repent"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "V": // view status
                this.viewStatus();
                break;
            case "D": // display map
                this.displayMap();
                break;
            case "C": // continue current level
                break;
            case "M": // move to next level
                this.moveToNextLevel();
                break;
            case "R": // create and start new game
                this.repent();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    private void viewStatus() {
        StringBuilder line;
        
        Game game = CIT260GameOfLifeTeamB.getCurrentGame();
        Player player = game.getPlayer();
        Item[] items = game.getItems();
        System.out.println("\n--------------- Game Status ---------------");
        System.out.println("\n" + player.toString());
        System.out.println("\n---------------  Item List  ---------------");
        line = new StringBuilder("                                           ");
        line.insert(0, "Type");
        line.insert(20, "Required");
        line.insert(30, "In Stock");
        System.out.println(line.toString());
        
        for (Item item : items) {
            line = new StringBuilder("                                           ");
            line.insert(0, item.getInventoryType());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            System.out.println(line.toString());
        }
    
    }

    private void displayMap() {
        Game game = CIT260GameOfLifeTeamB.getCurrentGame();
        Map map = game.getMap();
        int rows = map.getNoOfRows();
        int columns = map.getNoOfColumns();
        Location[][] locations = map.getLocations();

        System.out.println("\n -------------MAP-------------");

        for (int i = 0; i< rows; i++){
            if (i < (rows - 1)) {
                System.out.print(" ");
            }
            System.out.print((i+1) + " |");
            for (int j=0; j<columns; j++){
                if (locations[i][j].getScene() == null){
                System.out.print(" ?? ");
                }
                else {
                System.out.print(" "+locations[i][j].getScene().getMapSymbol()+" ");
                }
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }
    private void moveToNextLevel() {
        System.out.println("\n*** moveToNextLevel function called ***");
    }

    private void repent() {
        RepentanceStartView repentance = new RepentanceStartView();
        repentance.display();
    }

}
