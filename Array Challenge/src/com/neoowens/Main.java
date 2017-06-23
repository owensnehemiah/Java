package com.neoowens;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
      int[] inputValue = getIntegers(5);
      int[] sortValue = sortIntegers(inputValue);
      printArray(sortValue);


    }

    public static int[] sortIntegers(int[] number){

        int[] array = new int[number.length];
        // copy input array into new variable.
        //int[] array = Arrays.copyOf(array, array.length);
        for(int i=0; i < number.length; i++) {
            array[i] = number[i];
        }
        int temp;
        int minMaxValue;
        for(int i = 0; i < array.length; i++ ){
            if (array[i] < array[i +1]) {
                minMaxValue = array[i];
                array[i] = array[i + 1];
                array[i + 1] = minMaxValue;
                break;
            }
        }
        return array;
    }


    public static int[] getIntegers(int number){
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contains " + array[i]);
        }
    }
}
