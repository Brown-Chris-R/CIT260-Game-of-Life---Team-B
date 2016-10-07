/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.game.of.life.team.b;

import byui.cit260.gameOfLife.model.Choice;
import byui.cit260.gameOfLife.model.Item;
import byui.cit260.gameOfLife.model.Player;

/**
 *
 * @author RMLOY_000
 */
public class CIT260GameOfLifeTeamB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        Item  itemOne = new Item();
        Choice choiceOption =  new Choice();
                
         //player class       
        playerOne.setName("Rodrigo");
        playerOne.setBestScore(20);
        playerOne.setAttribute("Faith");
        
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //item class
        itemOne.setInventoryType("Scripture");
        itemOne.setQuantityInStock(4);
        itemOne.setRequiredAmount(4);
        
        String itemType = itemOne.toString();
        System.out.println(itemType);
        
        //choice class
        
        choiceOption.setChoiceList("b,c,d");
        choiceOption.setChoicePoints(2);
        
        String choiceResult = choiceOption.toString();
        System.out.println(choiceResult);
       
        
        
    }
    
}
