package com.neoowens;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(20,3,true);
        System.out.println("Printerlevel at " + printer.getTonerLevel() + " with " + printer.getPagesPrinted() + " Pages selected to be printed");
        printer.fillToner(80);
        printer.printPages(20);
    }
}
