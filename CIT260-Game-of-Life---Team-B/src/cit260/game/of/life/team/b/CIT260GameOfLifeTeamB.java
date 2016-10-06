/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.game.of.life.team.b;

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
        
        playerOne.setName("Rodrigo");
        playerOne.setBestScore(20);
        playerOne.setAttribute("Faith");
                
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
