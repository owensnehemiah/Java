package com.neoowens;

/**
 * Created by Neo Owens on 4/10/2017.
 */
public class Car extends Vehicle implements Transmission{

    private int wheels;
    private int doors;
    private int gears;

    //private boolean isManual

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
    }

    // setter for current gear
    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.currentGear(): Changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }

//    @Override
//    public void stop() {
//        super.stop();
//    }
}
