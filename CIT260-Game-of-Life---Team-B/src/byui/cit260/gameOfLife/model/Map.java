/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cbrown
 */
public class Map implements Serializable {

    //class instances variables
    private int noOfRows;
    private int noOfColumns;
    private Location [][] locations;
    
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number or rows and columns must be > zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // Create array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assigne the Location object to the current position in the array
                locations[row][column] = location;
            }
            
        }
    }    

    public int getNoOfRows() {
        return this.noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return this.noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.noOfRows;
        hash = 67 * hash + this.noOfColumns;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rows=" + this.noOfRows + ", columns=" + this.noOfColumns + '}';
    }

    public Location[][] getLocations() {
        return locations;
    }

}
