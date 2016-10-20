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
public class ScoringControlTest {
    
    public ScoringControlTest() {
    }

    /**
     * Test of calcOperation method, of class ScoringControl.
     */
    @Test
    public void testCalcOperation() {
        
        System.out.println("calcOperation");

        /**********************************************************************
         * Test Case #1
         *********************************************************************/
        System.out.println("Test Case #1");       
        float hospitalBillAmt = 29400.0F;
        float insuranceDeductibleAmt = 350.0F;
        float insuranceCoverageAmt = 0.75F;
        ScoringControl instance = new ScoringControl();
        float expResult = 7612.5F;

        float result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        /**********************************************************************
         * Test Case #2
         *********************************************************************/
        System.out.println("Test Case #2");       
        hospitalBillAmt = 0.0F;
        insuranceDeductibleAmt = 400.0F;
        insuranceCoverageAmt = 0.5F;
        expResult = -1.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        /**********************************************************************
         * Test Case #3
         *********************************************************************/
        System.out.println("Test Case #3");       
        hospitalBillAmt = 31000.0F;
        insuranceDeductibleAmt = 400.0F;
        insuranceCoverageAmt = 0.5F;
        expResult = -1.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        /**********************************************************************
         * Test Case #4
         *********************************************************************/
        System.out.println("Test Case #4");       
        hospitalBillAmt = 1000.0F;
        insuranceDeductibleAmt = -500.0F;
        insuranceCoverageAmt = 0.5F;
        expResult = -1.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        /**********************************************************************
         * Test Case #5
         *********************************************************************/
        System.out.println("Test Case #5");       
        hospitalBillAmt = 1000.0F;
        insuranceDeductibleAmt = 1000.0F;
        insuranceCoverageAmt = 0.5F;
        expResult = -1.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        /**********************************************************************
         * Test Case #6
         *********************************************************************/
        System.out.println("Test Case #6");       
        hospitalBillAmt = 1000.0F;
        insuranceDeductibleAmt = 400.0F;
        insuranceCoverageAmt = -0.25F;
        expResult = -1.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        /**********************************************************************
         * Test Case #7
         *********************************************************************/
        System.out.println("Test Case #7");       
        hospitalBillAmt = 1000.0F;
        insuranceDeductibleAmt = 400.0F;
        insuranceCoverageAmt = 1.1F;
        expResult = -1.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        /**********************************************************************
         * Test Case #8
         *********************************************************************/
        System.out.println("Test Case #8");       
        hospitalBillAmt = 1.0F;
        insuranceDeductibleAmt = 0.0F;
        insuranceCoverageAmt = 0.0F;
        expResult = 1.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);
        /**********************************************************************
         * Test Case #9
         *********************************************************************/
        System.out.println("Test Case #9");       
        hospitalBillAmt = 30000.0F;
        insuranceDeductibleAmt = 500.0F;
        insuranceCoverageAmt = 0.8F;
        expResult = 6400.0F;

        result = instance.calcOperation(hospitalBillAmt, insuranceDeductibleAmt, insuranceCoverageAmt);
        
        assertEquals(expResult, result, 0.01);

    }
    
}
