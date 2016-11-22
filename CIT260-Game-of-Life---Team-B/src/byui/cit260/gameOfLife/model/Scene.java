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
 * @author ferdycipriano
 */
public class Scene implements Serializable{
    private String description;
    private String mapSymbol;
    private boolean blocked;
    private Location[] locations;
    private Choice[] choices;

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public Choice[] getChoices() {
        return choices;
    }
    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }

    public Scene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        int blockedInt = (this.blocked) ? 1 : 0;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash += blockedInt;
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blocked=" + String.valueOf(this.blocked) + '}';
    }

    public void setDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBlockedLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}