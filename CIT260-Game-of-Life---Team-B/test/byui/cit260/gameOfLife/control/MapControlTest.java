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
 * @author cbrown
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of getLocations method, of class MapControl.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");

        /**********************************************************************
         * Test Case #1
         *********************************************************************/
        System.out.println("Test Case #1");       
        String phase = "Childhood";
        MapControl instance = new MapControl();
        String[] expResult = {"Church", "School", "Home",null};
        String[] result = instance.getLocations(phase);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #2
         *********************************************************************/
        System.out.println("Test Case #2");       
        phase = "Adolescence";
        expResult[0] = "Church";
        expResult[1] = "School";
        expResult[2] = "Home";
        expResult[3] = null;
        result = instance.getLocations(phase);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #3
         *********************************************************************/
        System.out.println("Test Case #3");       
        phase = "Adulthood";
        expResult[0] = "Mission";
        expResult[1] = "Work";
        expResult[2] = "University";
        expResult[3] = "Family";
        result = instance.getLocations(phase);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #4
         *********************************************************************/
        System.out.println("Test Case #4");       
        phase = "Senior";
        expResult[0] = "Church";
        expResult[1] = "Home";
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getLocations(phase);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #5
         *********************************************************************/
        System.out.println("Test Case #5");       
        phase = "Nothing";
        expResult[0] = "Invalid";
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getLocations(phase);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getScenarios method, of class MapControl.
     */
    @Test
    public void testGetScenarios() {
        System.out.println("getScenarios");

        /**********************************************************************
         * Test Case #1
         *********************************************************************/
        System.out.println("Test Case #1");       
        String phase = "Childhood";
        String location = "School";
        MapControl instance = new MapControl();
        String[] expResult = {"Cafeteria","Gymn","Playground","Classroom"};
        String[] result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #2
         *********************************************************************/
        System.out.println("Test Case #2");       
        phase = "Childhood";
        location = "Church";
        expResult[0] = "Sunday School";
        expResult[1] = "Primary";
        expResult[2] = "Bishop's Office";
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #3
         *********************************************************************/
        System.out.println("Test Case #3");       
        phase = "Childhood";
        location = "Home";
        expResult[0] = "Kitchen";
        expResult[1] = "Living Room";
        expResult[2] = "Back Yard";        
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #4
         *********************************************************************/
        System.out.println("Test Case #4");       
        phase = "Adolescence";
        location = "School";
        expResult[0] = null;
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #5
         *********************************************************************/
        System.out.println("Test Case #5");       
        phase = "Adolescence";
        location = "Church";
        expResult[0] = "Sacrament";
        expResult[1] = "Priesthood";
        expResult[2] = "Additional";
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #6
         *********************************************************************/
        System.out.println("Test Case #6");       
        phase = "Adolescence";
        location = "Home";
        expResult[0] = "Back Yard";
        expResult[1] = "Bedroom";
        expResult[2] = null;        
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #7
         *********************************************************************/
        System.out.println("Test Case #7");       
        phase = "Adulthood";
        location = "Mission";
        expResult[0] = "Apartment";
        expResult[1] = "Investigator's House";
        expResult[2] = "Member's House";
        expResult[3] = "On the Street";        
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #8
         *********************************************************************/
        System.out.println("Test Case #8");       
        phase = "Adulthood";
        location = "Work";
        expResult[0] = "Break Room";
        expResult[1] = "Office";
        expResult[2] = "Parking Lot";
        expResult[3] = "Supervisor's Office";        
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #9
         *********************************************************************/
        System.out.println("Test Case #9");       
        phase = "Adulthood";
        location = "University";
        expResult[0] = "Certificate";
        expResult[1] = "Associates";
        expResult[2] = "Bachelors";
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #10
         *********************************************************************/
        System.out.println("Test Case #10");       
        phase = "Adulthood";
        location = "Family";
        expResult[0] = null;
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #11
         *********************************************************************/
        System.out.println("Test Case #11");       
        phase = "Senior";
        location = "Church";
        expResult[0] = "Sacrament";
        expResult[1] = "Sunday School";
        expResult[2] = "Priesthood";
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #12
         *********************************************************************/
        System.out.println("Test Case #12");       
        phase = "Senior";
        location = "Home";
        expResult[0] = "Back Yard";
        expResult[1] = "Living Room";
        expResult[2] = null;        
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #13
         *********************************************************************/
        System.out.println("Test Case #13");       
        phase = "Nothing";
        location = "Church";
        expResult[0] = "Invalid";
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #14
         *********************************************************************/
        System.out.println("Test Case #14");       
        phase = "Childhood";
        location = "Nothing";
        expResult[0] = "Invalid";
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #15
         *********************************************************************/
        System.out.println("Test Case #15");       
        phase = "Adolescence";
        location = "Nothing";
        expResult[0] = "Invalid";
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #16
         *********************************************************************/
        System.out.println("Test Case #16");       
        phase = "Adulthood";
        location = "Nothing";
        expResult[0] = "Invalid";
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
        /**********************************************************************
         * Test Case #17
         *********************************************************************/
        System.out.println("Test Case #17");       
        phase = "Senior";
        location = "Nothing";
        expResult[0] = "Invalid";
        expResult[1] = null;
        expResult[2] = null;
        expResult[3] = null;
        result = instance.getScenarios(phase, location);
        assertArrayEquals(expResult, result);
    }
    
}
