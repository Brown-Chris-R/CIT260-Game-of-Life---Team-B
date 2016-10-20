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
public class Game implements Serializable {

    //class instance variables    
    private int totalTurns;

    public Game() {
    }

    public int getTotalTurns() {
        return totalTurns;
    }

    public void setTotalTurns(int totalTurns) {
        this.totalTurns = totalTurns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.totalTurns;
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
        final Game other = (Game) obj;
        if (this.totalTurns != other.totalTurns) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTurns=" + totalTurns + '}';
    }
}
