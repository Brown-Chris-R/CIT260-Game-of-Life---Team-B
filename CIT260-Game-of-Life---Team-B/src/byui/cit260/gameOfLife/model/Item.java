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
public class Item implements Serializable{
       
       //class instances variables
    private String inventoryType;
    private int quantityInStock;
    private double requiredAmount;
    
    private Location [] locations;
    private Game game;  //cbrown

    private Choice choice;
    public Item() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
    
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.inventoryType);
        hash = 83 * hash + this.quantityInStock;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
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
        final Item other = (Item) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
    

}
