package com.neoowens;

/**
 * Created by Neo Owens on 4/11/2017.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter){

        //if
        if(tonerLevel >= 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }else if(tonerLevel < 0) {
            System.out.println("Printer level below: Please chose amount greater that zero and below or equal to maximum 100");
        }else if(tonerLevel > 100){
            System.out.println("Printer level below: Please chose amount greater that zero and below or equal to maximum 100");
        }

        if (pagesPrinted > 0) {
            this.pagesPrinted = pagesPrinted;
        } else {
            System.out.println("Please choose amount of printer copies");
        }

        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int tonerAmount){
        if ((tonerAmount > 0) && (this.tonerLevel += tonerAmount) <= 100 ){
         //   this.tonerLevel += tonerAmount;
            System.out.println("Toner Level is now: " + this.tonerLevel);
        }else {
            System.out.println("Please select amount for toner fill");
        }
    }

    public void printPages(int pageAmount){
        if (pageAmount > 0 && duplexPrinter == true) {
            pagesPrinted = pageAmount / 2 ;
            System.out.println(pagesPrinted + " Pages printed, double sided.");
        }else if(pageAmount > 0){
            System.out.println(pagesPrinted + " Pages printed, 1 side per page.");
        }else {
            System.out.println("Invalid Option. Please chose page amount and single or double side option.");
        }
    }
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter(boolean duplexPrinter) {
        return duplexPrinter;
    }
}
