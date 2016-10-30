/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gameOfLife.control;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author cbrown
 *
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


Scanner choice = new Scanner(System.in);
    
  
    System.out.println("1. Add");
    System.out.println("2. Remove");
    System.out.println("3. Save");

    
    int itemOption;
    
    do{
        System.out.println("Choose an action:");
        itemOption = choice.nextInt();
        
        switch (itemOption){
                  case 1:
                          System.out.println("Add");
                          break;
                  case 2:
                        System.out.println("Remove");
                       
                        break;
                  case 3:
                        System.out.println("Save");
                        
                        break;

	}
  
    
        
        
        
        
        /**
*
* @author 
*/
public class ItemControl {

   ArrayList<String> items = new ArrayList<String>();
 
   // This is the constructor.  It initializes the items list
// with the items below.
public ItemControl(){
items.add("House key");
items.add("Diploma");
items.add("Money");
items.add("Scriptures");
items.add("Cellphone");
items.add("Backpack");
}

// This method is called to display the items
   public void displayItems() {

       // display initial contents of inventory
       System.out.println("Item List:");
       for ( String item : items )
           System.out.println(item);  
   }

// This is the method that is called to add another item to the list.
public void addItem(String newItem) {
   items.add(newItem);
   
} 
}

