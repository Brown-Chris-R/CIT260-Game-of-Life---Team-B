/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byui.cit260.gameOfLife.model.Game;
import byui.cit260.gameOfLife.model.Item;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.util.ArrayList;


/**
 *
 * @author cbrown
 */
public class ItemControl {
    static Game game = CIT260GameOfLifeTeamB.getCurrentGame();
   
    public static void itemControl() {
    }
  
    public static Item [] createItems (){
        Item[] items =
        new Item[6];

        Item diploma = new Item();
        diploma.setInventoryType("Diploma");
        diploma.setQuantityInStock(0);
        diploma.setRequiredAmount(0);
        items[0]= diploma;

        Item scholarship = new Item();
        scholarship.setInventoryType("Scholarship");
        scholarship.setQuantityInStock(0);
        scholarship.setRequiredAmount(0);
        items[1]= scholarship;

        Item money = new Item();
        money.setInventoryType("Money");
        money.setQuantityInStock(0);
        money.setRequiredAmount(0);
        items[2]= money;

        Item scriptures = new Item();
        scriptures.setInventoryType("Scriptures");
        scriptures.setQuantityInStock(0);
        scriptures.setRequiredAmount(0);
        items[3]= scriptures;

        Item cellphone = new Item();
        cellphone.setInventoryType("Cellphone");
        cellphone.setQuantityInStock(0);
        cellphone.setRequiredAmount(0);
        items[4]= cellphone;

        Item backpack = new Item();
        backpack.setInventoryType("Backpack");
        backpack.setQuantityInStock(0);
        backpack.setRequiredAmount(0);
        items[5]= backpack;

        return items;
    }

  public static void changeToItemQuantityInStock(String inventoryType, int quantity) {
      Item[] items = game.getItems();
      for (Item item : items) {
        if (item.getInventoryType() == inventoryType) {
            item.setQuantityInStock(item.getQuantityInStock() + quantity);
            break;
        }
      }
  }
    
}
