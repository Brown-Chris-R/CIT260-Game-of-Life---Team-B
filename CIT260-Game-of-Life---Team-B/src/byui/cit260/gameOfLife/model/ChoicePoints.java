/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.model;

/**
 *
 * @author cbrown
 */
public class ChoicePoints {
    private String name;
    private int choicePoints;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChoicePoints(int choicePoints) {
        this.choicePoints = choicePoints;
    }

    public int getChoicePoints() {
        return choicePoints;
    }

    
    public ChoicePoints() {
    }

}
