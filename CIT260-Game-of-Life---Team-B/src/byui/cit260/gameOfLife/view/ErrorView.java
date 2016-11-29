/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.io.PrintWriter;

/**
 *
 * @author cbrown
 */
public class ErrorView {
    private static final PrintWriter errorFile = CIT260GameOfLifeTeamB.getOutFile();
    private static final PrintWriter logFile = CIT260GameOfLifeTeamB.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                    "------------------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n------------------------------------------------------------");
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
