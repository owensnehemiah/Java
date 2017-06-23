package com.neoowens;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String [] Args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchforItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item in the list");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        //enter the number of the item to be replaced
        System.out.println("Please enter the item to be modified");
        searchforItem();
        String modifyNum = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the item to replace previous item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(modifyNum, newItem);
    }

    public static void removeItem(){
        System.out.println("Please select the item to be removed");
        String removePosition = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(removePosition);
    }

    public static void searchforItem(){
        System.out.println("Enter Item to be found");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) !=null){
            System.out.println("Item " + searchItem + " has been found");
        }else {
            System.out.println(searchItem + "Is not in the grocery list.");
        }
        scanner.nextLine();
        groceryList.findItem(searchItem);
    }
}
