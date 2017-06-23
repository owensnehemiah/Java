package com.neoowens;



class Car{

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int exhaust;
//    private String color;

    //set Car constructor to accept name but provide default
    //values for cylinders etc;
    // this class can be extended using Car constructor fields.
    public Car(int cylinders, String name){

        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.exhaust = 2;
        this.engine = true;

    }

    public String getName(){
       return name;
    }

    public String color(){
        String color = "Yellow";
        return color;
    }

    public String startEngine(){
        return getName() + " Car --> Engine has started";
    }

    public String accelerate() {
        return getName() + " Car is accelerating";
    }

    public String brake(){
        return getName() + " Car brakes have been pressed. ";
    }

    public int getCylinders(){
        return cylinders;
    }

    public int getExhaust(){
        return exhaust;
    }

}

/* Corvette */

class Corvette extends Car {
    public Corvette(){
        super(8,"Corvette");
    }

    @Override
    public String color(){
        String color = "Green";
        return color;
    }

    @Override
    public String startEngine() {
        return getName() + " : " + " Car Engine Starting. ";
    }

    @Override
    public String accelerate() {
        return getName() + " : " + " Car Accelerating. ";
    }

    @Override
    public String brake() {
        return getName() + " : " + " Car brakes have been pressed. ";
    }

}

/* Viper */

class Viper extends Car {
    public Viper(){
        super(10,"Viper");
    }

    @Override
    public String color(){
        String color = "Green";
        return color;
    }

    @Override
    public String startEngine() {
        return getName() + " : " + " Car Engine Starting. ";
    }

    @Override
    public String accelerate() {
        return getName() + " : " + " Car Accelerating. ";
    }

    @Override
    public String brake() {
        return getName() + " : " + " Car brakes have been pressed. ";
    }

//    @Override
//    public int getCylinders() {
//        return getCylinders();
//    }

}

/* Mustang*/
class Mustang extends Car {
    public Mustang(){
        super(8,"Mustang");
    }

    @Override
    public String color(){
        String color = "Red";
        return color;
    }

    @Override
    public String startEngine() {
        return getName() +" : " + "Car Engine Starting. ";
    }

    @Override
    public String accelerate() {
        return getName() + " : " + "Car Accelerating. ";
    }

    @Override
    public String brake() {
        return getName() + " : " + "Car brakes have been pressed. ";
    }

//    @Override
//    public int getCylinders() {
//        return getCylinders();
//    }
}

/* Challenger*/
class Challenger extends Car {
    public Challenger(){
        super(8,"Challenger");
    }

    @Override
    public String color(){
        String color = "Red";
        return color;
    }

    @Override
    public String startEngine() {
        return getName() +" : " + "Car Engine Starting. ";
    }

    @Override
    public String accelerate() {
        return getName() + " : " + "Car Accelerating. ";
    }

    @Override
    public String brake() {
        return getName() + " : " + "Car brakes have been pressed. ";
    }

//    @Override
//    public int getCylinders() {
//        return getCylinders();
//    }


}

public class Main {


    public static void main(String[] args) {
        // write your code here


        Mustang mustang = new Mustang();
        Corvette corvette = new Corvette();
        Viper viper = new Viper();

        for (int i = 1; i < 4; i++) {
            Car car = randomCar();
            System.out.println("Car " + car.getName() + "\n"
                                + "Color: " + car.color() + "\n"
                                + "Cylinder: " + car.getCylinders() + "\n" +  car.startEngine() + "\n");
        }

        //how to change the get cylinders without running into an exception.
    }

    public static Car randomCar() {

        int randomCar = (int) (Math.random() * 4) + 1;
        switch (randomCar){
            case 1:
                return new Viper();
            case 2:
                return new Corvette();
            case 3:
                return new Mustang();
            case 4:
                return new Challenger();
        }
        return null;

    }
}


