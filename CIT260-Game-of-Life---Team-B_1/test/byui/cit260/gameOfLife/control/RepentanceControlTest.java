/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RMLOY_000
 */
public class RepentanceControlTest {
    
    public RepentanceControlTest() {
    }

    /**
     * Test of repentance method, of class RepentanceControl.
     */
    @Test
    public void testRepentance() {
        //Test case 1
           System.out.println("test 1");
        double faith = 5.0;
        double sorrowForSin = 5.0;
        double confession = 5.0;
        double abandonmentOfSin = 5.0;
        double restitution = 5.0;
        double righteousLiving = 5.0;
        double recieveForgiveness = 30.0;
        RepentanceControl instance = new RepentanceControl();
        double expResult = 30.0;
        double result = instance.repentance(faith, sorrowForSin, confession, abandonmentOfSin, restitution, righteousLiving, recieveForgiveness);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        //Test Case 2 
         System.out.println("Test Case 2"); 
          faith = 1.0; 
          sorrowForSin = 5.0; 
          confession = 5.0; 
          abandonmentOfSin = 5.0; 
         restitution = 5.0; 
          righteousLiving = 5.0; 
          recieveForgiveness = 5.0; 

 
          expResult = -1.0; 
          result = instance.repentance(faith, sorrowForSin, confession, abandonmentOfSin, restitution, righteousLiving, recieveForgiveness); 
         assertEquals(expResult, result, 0.0001);   
     //Test Case 3 
         System.out.println("Test Case 3"); 
          faith = 5.0; 
          sorrowForSin = 1.0; 
          confession = 5.0; 
          abandonmentOfSin = 5.0; 
          restitution = 5.0; 
          righteousLiving = 5.0; 
          recieveForgiveness = 5.0; 
 
          expResult = -1.0; 
         result = instance.repentance(faith, sorrowForSin, confession, abandonmentOfSin, restitution, righteousLiving, recieveForgiveness); 
        assertEquals(expResult, result, 0.0001);   
     //Test Case 4 
        System.out.println("Test Case 4"); 
         faith = 5.0; 
          sorrowForSin = 5.0; 
          confession = 1.0; 
         abandonmentOfSin = 5.0; 
         restitution = 5.0; 
         righteousLiving = 5.0; 
        recieveForgiveness = 5.0; 
 
          expResult = -1.0; 
          result = instance.repentance(faith, sorrowForSin, confession, abandonmentOfSin, restitution, righteousLiving, recieveForgiveness); 
         assertEquals(expResult, result, 0.0001);   
     //Test Case 5 
         System.out.println("Test Case 5"); 
         faith = 5.0; 
         sorrowForSin = 5.0; 
         confession = 5.0; 
         abandonmentOfSin = 1.0; 
          restitution = 5.0; 
          righteousLiving = 5.0; 
          recieveForgiveness = 5.0; 
 
          expResult = -1.0; 
         result = instance.repentance(faith, sorrowForSin, confession, abandonmentOfSin, restitution, righteousLiving, recieveForgiveness); 
         assertEquals(expResult, result, 0.0001);   
    //Test Case 6 
        System.out.println("Test Case 6"); 
          faith = 5.0; 
          sorrowForSin = 5.0; 
         confession = 5.0; 
         abandonmentOfSin = 5.0; 
          restitution = 1.0; 
          righteousLiving = 5.0; 
         recieveForgiveness = 5.0; 
 
          expResult = -1.0; 
          result = instance.repentance(faith, sorrowForSin, confession, abandonmentOfSin, restitution, righteousLiving, recieveForgiveness); 
         assertEquals(expResult, result, 0.0001);   
      
     //Test Case 7 
         System.out.println("Test Case 7"); 
          faith = 5.0; 
         sorrowForSin = 5.0; 
          confession = 5.0; 
          abandonmentOfSin = 5.0; 
         restitution = 5.0; 
          righteousLiving = 9.0; 
          recieveForgiveness = 1.0; 
 
          expResult = -1.0; 
          result = instance.repentance(faith, sorrowForSin, confession, abandonmentOfSin, restitution, righteousLiving, recieveForgiveness); 
         assertEquals(expResult, result, 0.0001);   
     } 
      
     
      
     
 } 
