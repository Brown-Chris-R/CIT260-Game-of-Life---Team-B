/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.model;

/**
 *
 * @author cbrown
 */
public enum Phase {
   Childhood(10),
   Adolescence(6),
   Adulthood(10),
   Senior(6);
   
   private final int noOfLocations;
   Phase(int noOfLocations) {
       this.noOfLocations = noOfLocations;
   }
   
   public int getNoOfLocations() {
       return noOfLocations;
   }
}
