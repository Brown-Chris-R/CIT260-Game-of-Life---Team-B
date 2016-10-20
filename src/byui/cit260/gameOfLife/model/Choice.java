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
 * @author RMLOY_000
 */
public class Choice implements Serializable{
    //class
    
    private String choiceList;
    private int choicePoints;

    public String getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(String choiceList) {
        this.choiceList = choiceList;
    }

    public int getChoicePoints() {
        return choicePoints;
    }

    public void setChoicePoints(int choicePoints) {
        this.choicePoints = choicePoints;
    }

    public Choice() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.choiceList);
        hash = 23 * hash + this.choicePoints;
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
        final Choice other = (Choice) obj;
        if (this.choicePoints != other.choicePoints) {
            return false;
        }
        if (!Objects.equals(this.choiceList, other.choiceList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Choice{" + "choiceList=" + choiceList + ", choicePoints=" + choicePoints + '}';
    }
    
    
    
    
}
