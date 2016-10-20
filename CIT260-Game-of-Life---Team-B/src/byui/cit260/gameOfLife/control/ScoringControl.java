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
public class ScoringControl {
    String errorText = new String();

/**
 * Calculate the patient portion of a hospital surgery bill
 * @author cbrown
 */    
public float calcOperation(float hospitalBillAmt, float insuranceDeductibleAmt, float insuranceCoverageAmt ) {
    float amountOwed;
    
    if (hospitalBillAmt <= 0) {
        errorText = "Hospital Bill Amount is <= Zero";
        return -1;
    } else if (hospitalBillAmt > 30000) {
        errorText = "Hospital Bill Amount is > 30,000";
        return -1;
    } else if (insuranceDeductibleAmt < 0) {      
        errorText = "Insurance Deductible Amount is < 0";
        return -1;
    } else if (insuranceDeductibleAmt > 500) {      
        errorText = "Insurance Deductible Amount is > 500";
        return -1;
    } else if (insuranceCoverageAmt < 0) {      
        errorText = "Insurance Coverage Amount is < 0";
        return -1;
    } else if (insuranceCoverageAmt > 1) {      
        errorText = "Insurance Coverage Amount is > 100%";
        return -1;
    }
    
    /* amount owed by the patient is determined by reducing the amount of the bill by the portion paid by insurance,
     * and adding in the patient's deductible. The portion paid by insurance is calculated on the bill amount minus
     * the patient's deductible.
     */
    amountOwed = (hospitalBillAmt - insuranceDeductibleAmt) * (1-insuranceCoverageAmt) + insuranceDeductibleAmt;
    
    return amountOwed;
}

}
