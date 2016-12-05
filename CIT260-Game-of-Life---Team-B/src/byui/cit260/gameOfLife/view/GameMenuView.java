/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.view;

import static byui.cit260.gameOfLife.control.ScoringControl.summarizeChoicePoints;
import byui.cit260.gameOfLife.exceptions.ItemControlException;
import byui.cit260.gameOfLife.exceptions.MapControlException;
import byui.cit260.gameOfLife.exceptions.RepentanceControlException;
import byui.cit260.gameOfLife.model.ChoicePoints;
import byui.cit260.gameOfLife.model.Game;
import byui.cit260.gameOfLife.model.Map;
import byui.cit260.gameOfLife.model.Item;
import byui.cit260.gameOfLife.model.Location;
import byui.cit260.gameOfLife.model.Phase;
import byui.cit260.gameOfLife.model.Player;
import cit260.game.of.life.team.b.CIT260GameOfLifeTeamB;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cbrown
 */
public class GameMenuView extends View {

    Game game = CIT260GameOfLifeTeamB.getCurrentGame(); // make the game object available throughout this class

    public GameMenuView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n| Game Menu                            |"
                  + "\n----------------------------------------"
                  + "\nV - View status"
                  + "\nO - Item report"
                  + "\nD - Display Map"
                  + "\nP - Print Map"
                  + "\nC - Continue Current phase"
                  + "\nM - Move to next phase"
                  + "\nR - Repent"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // need upper case for comparison
        
        switch (choice) {
            case "V": // view status
                this.viewStatus();
                break;
            case "O": {
           
            try {
                this.reportItem();
            } catch (ItemControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }    
  
            }
            break;
            case "D": {
                try {
                    // display map
                    this.displayMap();
                } catch (MapControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "P": {
                try {
                    // Print map
                    this.printMap();
                } catch (MapControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "C": {
                try {
                    // continue current phase
                    this.continuePhase();
                } catch (MapControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "M": {
                try {
                    // move to next phase
                    this.moveToNextPhase();
                } catch (MapControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "R": {
                try {
                    // create and start new game
                    this.repent();
                } catch (RepentanceControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    private void viewStatus() {
        StringBuilder line;
        ChoicePoints minChoicePoints = new ChoicePoints();
        ChoicePoints maxChoicePoints = new ChoicePoints();
        int points = 0;
        int totalChoicePoints = 0;
        int averageChoicePoints = 0;
        
        Player player = this.game.getPlayer();
        
        Item[] items = this.game.getItems();
        
        this.console.println("\n--------------- Game Status ---------------");
        this.console.println(player.toString());
        this.console.println(this.game.toString());
        this.console.println("\n---------------  Item List  ---------------");
        line = new StringBuilder("                                           ");
        line.insert(0, "Type");
        line.insert(20, "Required");
        line.insert(30, "In Stock");
        this.console.println(line.toString());
        
        for (Item item : items) {
            line = new StringBuilder("                                           ");
            line.insert(0, item.getInventoryType());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            this.console.println(line.toString());
        }
    
        // Show choicePoint stattistics - lowest points, highest points, and average points per scenario
        ArrayList<ChoicePoints> choicePointsList = summarizeChoicePoints();
        if (choicePointsList.size() != 0) {
            for (ChoicePoints choicePoints : choicePointsList) {
                points = choicePoints.getChoicePoints();
                totalChoicePoints += points;

                if (points < minChoicePoints.getChoicePoints()) {
                    minChoicePoints.setChoicePoints(points);
                    minChoicePoints.setName(choicePoints.getName());
                }
                if (points > maxChoicePoints.getChoicePoints()) {
                    maxChoicePoints.setChoicePoints(points);
                    maxChoicePoints.setName(choicePoints.getName());
                }
            }
            averageChoicePoints = totalChoicePoints / choicePointsList.size();

            this.console.println("\n----------- Summary of points from choices -----------");
            line = new StringBuilder("                                           ");
            line.insert(10, "Scenario");
            line.insert(40, "Points");
            this.console.println(line.toString());
            line = new StringBuilder("                                           ");
            line.insert(0, "Lowest:");
            line.insert(10, minChoicePoints.getName());
            line.insert(43, minChoicePoints.getChoicePoints());
            this.console.println(line.toString());
            line = new StringBuilder("                                           ");
            line.insert(0, "Highest:");
            line.insert(10, maxChoicePoints.getName());
            line.insert(43, maxChoicePoints.getChoicePoints());
            this.console.println(line.toString());
            line = new StringBuilder("                                           ");
            line.insert(0, "Average:");
            line.insert(10, choicePointsList.size() + " scenarios");
            line.insert(43, averageChoicePoints);
            this.console.println(line.toString());
        }
    }

    private void displayMap() throws MapControlException{
        Map map = this.game.getMap();
        int rows = map.getNoOfRows();
        int columns = map.getNoOfColumns();
        Location[][] locations = map.getLocations();

        this.console.println("\n -------------MAP-------------");

        for (int i = 0; i< rows; i++){
            if (i < (rows - 1)) {
                this.console.print(" ");
            }
            this.console.print((i+1) + " |");
            for (int j=0; j<columns; j++){
                if (locations[i][j].getScene() == null){
                this.console.print(" ?? ");
                }
                else {
                this.console.print(" "+locations[i][j].getScene().getMapSymbol()+" ");
                }
                this.console.print("|");
            }
            this.console.println();
        }
    }
    
    private void printMap() throws MapControlException{

        this.console.println("\n\nEnter the file path for file where the map "
                             + "is to be printed.");
        String filePath = this.getInput();
        try {
            //print the game to the speciried file
            outputMap(filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void outputMap(String filepath) throws MapControlException, FileNotFoundException{
        Map map = this.game.getMap();
        int rows = map.getNoOfRows();
        int columns = map.getNoOfColumns();
        Location[][] locations = map.getLocations();
        PrintWriter mapPrintFile = null;
        //Path printFilePath = null;
        //File printFile = null;
        //String printFilePathString = null;
        
        //try {
        //    printFilePath = Paths.get(filepath).toRealPath();
        //} catch (NoSuchFileException x) {
        //    System.err.format("%s: no such" + " file or directory%n", filepath);
            // Logic for case when file doesn't exist.
        //    printFile = new File(filepath);
        //} catch (IOException x) {
        //    System.err.format("%s%n", x);
            // Logic for other sort of file error.
        //}
        try {
            mapPrintFile = new PrintWriter(filepath);
            mapPrintFile.println("\n -------------MAP-------------");

            for (int i = 0; i< rows; i++){
                if (i < (rows - 1)) {
                    mapPrintFile.print(" ");
                }
                mapPrintFile.print((i+1) + " |");
                for (int j=0; j<columns; j++){
                    if (locations[i][j].getScene() == null){
                    mapPrintFile.print(" ?? ");
                    }
                    else {
                    mapPrintFile.print(" "+locations[i][j].getScene().getMapSymbol()+" ");
                    }
                    mapPrintFile.print("|");
                }
                mapPrintFile.println();
            }
            this.console.println("Map successfully printed to" + filepath + "!");
        } catch (FileNotFoundException e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());    
        } finally {
            if (mapPrintFile != null) {
                mapPrintFile.close();
            }
        }
    }

    private void continuePhase()throws MapControlException{
        
        switch (this.game.getPhase()) {
            case "Childhood":
                ChildhoodMenuView childhoodMenu = new ChildhoodMenuView();
                childhoodMenu.display();
                break;
            case "Adolescence":
                AdolescenceMenuView adolescenceMenu = new AdolescenceMenuView();
                adolescenceMenu.display();
                break;
            case "Adulthood":
                AdulthoodMenuView adulthoodMenu = new AdulthoodMenuView();
                adulthoodMenu.display();
                break;
            case "Senior":
                SeniorMenuView seniorMenu = new SeniorMenuView();
                seniorMenu.display();
                break;
        }
        this.console.println("\n*** moveToNextLevel function called ***");
    }

    private void moveToNextPhase() throws MapControlException{
        game.nextPhase(game.getPhase());
        this.console.println("\n*** Phase is now: " + game.getPhase() + " ***");
    }

    private void repent() throws RepentanceControlException{
        RepentanceStartView repentance = new RepentanceStartView();
        repentance.display();
    }

    private void reportItem() throws ItemControlException {
         Item[] items = this.game.getItems();
         String OuputLocation = null;
         PrintWriter ItemPrintFile = null;
          this.console.println("\n\nEnter the file path for file where the items report "
                             + "is to be printed.");
        String filePath = this.getInput();
         
        try (PrintWriter out = new PrintWriter(OuputLocation)){
              ItemPrintFile = new PrintWriter(filePath);
                       
            ItemPrintFile.println("\n---------------  Item List  ---------------");
            out.printf("%n%-20s%10s%10s","Type","Required","In Stock");
            out.printf("%n%-20s%10s%10s","----","---------","-------");
        
        for (Item item : items) {
                 ItemPrintFile.printf("%n%-20s%7s%7d",item.getInventoryType()
            , item.getRequiredAmount()
           , item.getQuantityInStock());   
   
        }
        this.console.println("Item Report successfully printed to" + filePath + "!");
        } catch (Exception e) {
              ErrorView.display(this.getClass().getName(), e.getMessage());    
        }finally {
            if (ItemPrintFile != null) {
                ItemPrintFile.close();
            }
        }       
}
}


