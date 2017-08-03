package com.neoowens.pluralsight;

/**
 * Created by Neo Owens on 7/27/2017.
 */
public class Adder extends CalculateBase implements MathProcessing {
    public Adder(){}
    public Adder(double leftVal,double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    };

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double getCalculation(double leftVal, double rightVal) {
        setRighttVal(rightVal);
        setLeftVal(leftVal);
        calculate();

        return getResult();
    }
}
