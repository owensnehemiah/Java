package com.neoowens.pluralsight;

/**
 * Created by Neo Owens on 8/1/2017.
 */
public interface MathProcessing {

    String SEPARATOR = " ";
    String getKeyWord(); //add
    char getSymbol();
    double getCalculation(double leftVal, double rightVal);
}
