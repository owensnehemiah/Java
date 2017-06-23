package com.neoowens;

import java.util.ArrayList;

/**
 * Created by Neo Owens on 5/30/2017.
 */
public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList(){
        //determines size of the list
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++){
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(newItem);
        if(position >=0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >=0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);

    }

    public int findItem(String searchItem){
       // boolean exists = groceryList.contains(searchItem);
       // int position = groceryList.indexOf(searchItem);
       // if(position >= 0){
       //     return groceryList.get(position);
       // }
       // return null;
        return groceryList.indexOf(searchItem);
    }
}
