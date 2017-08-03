package com.neoowens.pluralsight;

/**
 * Created by Neo Owens on 7/27/2017.
 */
public class Multiply extends CalculateBase {
    public Multiply(){};
    public Multiply(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}

