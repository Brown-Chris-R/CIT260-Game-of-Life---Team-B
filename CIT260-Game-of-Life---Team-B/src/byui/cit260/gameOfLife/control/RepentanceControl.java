/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import byucit260.gameOfLife.exceptions.RepentanceControlException;

/**
 *
 * @author cbrown
 */
public class RepentanceControl { 

   
public double repentance(double faith  
                               , double sorrowForSin 
                            , double confession 
                            , double abandonmentOfSin 
                            , double restitution 
                              , double righteousLiving 
                                ) throws RepentanceControlException { 
     
      
         if (faith < 1 || 
             faith >  5 ) { 
             throw new RepentanceControlException("Invalid input "
                     + "because input is range between 1 to 5");
         } 
 
 
         if (sorrowForSin < 1 || 
             sorrowForSin > 5  ) { 
              
      } 
 
         if (confession < 1|| confession > 5) { 
             
         } 
 
 
         if (abandonmentOfSin < 1 || abandonmentOfSin > 5  ) { 
             
         } 
          
        if (restitution < 1 || restitution > 5 ) { 
         
         }  
 
 
        if (righteousLiving < 1 || 
             righteousLiving > 5) { 
         
        } 
         
         double receiveForgivness = faith + sorrowForSin + 
                                     confession + abandonmentOfSin +  
                                    restitution + righteousLiving; 

 
         return receiveForgivness; 
    } 
 
    
}
