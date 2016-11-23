/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.model;

/**
 *
 * @author RMLOY_000
 */
public enum Repentance {
    faith,
    sorrowForSin, 
                  confession 
                            ,  abandonmentOfSin 
                            ,  restitution 
                              , righteousLiving;

    public static Repentance getFaith() {
        return faith;
    }

    public static Repentance getSorrowForSin() {
        return sorrowForSin;
    }

    public static Repentance getConfession() {
        return confession;
    }

    public static Repentance getAbandonmentOfSin() {
        return abandonmentOfSin;
    }

    public static Repentance getRestitution() {
        return restitution;
    }

    public static Repentance getRighteousLiving() {
        return righteousLiving;
    }
            
}
