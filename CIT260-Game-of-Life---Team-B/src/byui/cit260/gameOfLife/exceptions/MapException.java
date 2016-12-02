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
public class MapException extends Exception {

    public MapException() {
    }

    public MapException(String message) {
        super(message);
    }

    public MapException(String message, Throwable cause) {
        super(message, cause);
    }

    public MapException(Throwable cause) {
        super(cause);
    }

    public MapException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
