/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

/**
 * This is a "helper" class used in some of the scoring controls
 * @author cbrown
 */
public class Die {

//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.

   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die

   //-----------------------------------------------------------------
   //  Constructor: Sets the initial face value.
   //-----------------------------------------------------------------
   public Die() {
      faceValue = 1;
   }

   // Alternate Constructor

   public Die(int value) {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //  Use of the 'min' parameter allows you to "juice" the dice
   //  (guarantee a minimum value)
   //-----------------------------------------------------------------
   public int roll(int min) {
       int range = (MAX - min) + 1;     
       faceValue = (int)(Math.random() * range) + min;
   
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll() {
       int min = 1;
       int range = (MAX - min) + 1;     
       faceValue = (int)(Math.random() * range) + min;
   
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue (int value) {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue() {
      return faceValue;
   }

// Returns a string representation of this die. 
       public String toString() { 
             String result = Integer.toString(faceValue); 
             return result; 
        } 

}
