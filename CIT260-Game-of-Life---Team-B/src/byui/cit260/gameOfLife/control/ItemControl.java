/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import java.util.ArrayList;

/**
 *
 * @author cbrown
 */
public class ItemControl {
   
  public static void itemControl(String [] args)
	{
	
       ArrayList<String> items = new ArrayList<String>();
items.add("House key");
items.add("Diploma");
items.add("Money");
items.add("Scriptures");
items.add("Cellphone");
items.add("Backpack");

// display initial contents of inventory
System.out.println("Item List:");
for ( String item : items )
	System.out.println(item);   
	}
  
    
}
