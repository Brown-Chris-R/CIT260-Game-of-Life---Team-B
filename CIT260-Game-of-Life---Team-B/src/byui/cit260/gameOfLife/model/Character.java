
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.model;

import java.awt.Point;
import java.io.Serializable;



/**
 *
 * @author ferdycipriano
 */
public enum Character implements Serializable{
    Adam ("The first man and prophet on earth"),
    Eve ("The first woman on earth and Adam's help meet ");
    
    private final String description;
    private final Point coordinates;

    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }


}
