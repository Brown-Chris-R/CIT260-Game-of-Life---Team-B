/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.exceptions;

/**
 *
 * @author cbrown
 */
public class ScoringControlException extends Exception {

    public ScoringControlException() {
    }

    public ScoringControlException(String message) {
        super(message);
    }

    public ScoringControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoringControlException(Throwable cause) {
        super(cause);
    }

    public ScoringControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
