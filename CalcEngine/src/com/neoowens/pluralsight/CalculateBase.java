package com.neoowens.pluralsight;

/**
 * Created by Neo Owens on 7/27/2017.
 */
public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal(){
        return leftVal;
    }

    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public double getRightVal(){return rightVal;}
    public void setRighttVal(double leftVal){this.rightVal = leftVal;}

    //use these classes to get the result from a calculation;
    public double getResult(){return result;}
    public void setResult(double result){this.result = result;}

    public CalculateBase(){}; //Empty constructor
    public CalculateBase(double leftVal, double rightVal){
        //set values
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    //declaring this as abstract forces the class to be executed once called.
    public abstract void calculate();
}
