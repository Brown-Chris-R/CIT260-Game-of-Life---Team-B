/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.exceptions;

/**
 *
 * @author RMLOY_000
 */
public class ItemControlException extends Exception{

    public ItemControlException() {
    }

    public ItemControlException(String string) {
        super(string);
    }

    public ItemControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ItemControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ItemControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    
    
}
