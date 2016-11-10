/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import byui.cit260.gameOfLife.control.RepentanceControl;
import java.util.Scanner;

/**
 *
 * @author RMLOY_000
 */
public class RepentanceStartView extends View {
    
    public  RepentanceStartView() {
        
        super("\n==========================================================="
                + "\nYour are about to take a self-assessment about repantance"
                + "\nfor the response key 1    = never,   2    =   sometimes, "
                + "\n 3 = often 4 = almost always, 5 = always"
                + "Or enter 'Q' to return Game Menu"
                + "\n========================================================="
        );
}
    @Override
    @SuppressWarnings("empty-statement")
    public boolean doAction(String choice) {
        int i;
       
        //System.out.println("***RepentanceControl () function called***");
        for (i=0; i<5; i++);{
        System.out.println("\nQestio"+ i );
    }
        return true;
    }
        
     
}