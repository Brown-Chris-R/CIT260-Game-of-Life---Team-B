/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

/**
 *
 * @author cbrown
 */
public class RepentanceControl { 

   
 public double repentance (double faith  
                               , double sorrowForSin 
                            , double confession 
                            , double abandonmentOfSin 
                            , double restitution 
                              , double righteousLiving 
                                ) { 
     
      
         if (faith < 1 || 
             faith >  5 ) { 
             return -1; 
         } 
 
 
         if (sorrowForSin < 1 || 
             sorrowForSin > 5  ) { 
             return -1; 
      } 
 
         if (confession < 1|| confession > 5) { 
            return -1; 
         } 
 
 
         if (abandonmentOfSin < 1 || abandonmentOfSin > 5  ) { 
            return -1; 
         } 
          
        if (restitution < 1 || restitution > 5 ) { 
        return -1; 
         }  
 
 
        if (righteousLiving < 1 || 
             righteousLiving > 5) { 
            return -1; 
        } 
         
         double receiveForgivness = faith + sorrowForSin + 
                                     confession + abandonmentOfSin +  
                                    restitution + righteousLiving; 

 
         return receiveForgivness; 
    } 
}
