/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byucit260.gameOfLife.exception;

/**
 *
 * @author RMLOY_000
 */
public class RepentanceControlException extends Exception{

    public RepentanceControlException() {
    }

    public RepentanceControlException(String string) {
        super(string);
    }

    public RepentanceControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RepentanceControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RepentanceControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
