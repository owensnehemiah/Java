
package com.neoowens.pluralsight;
import com.neoowens.myapp.Main;
/**
 * Created by Neo Owens on 7/27/2017.
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;


    //Accessor(getters)/Mutators(setters) method to get and set the values.
    public double getLeftVal(){
        return leftVal;
    }

    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public double getRightVal(){
        return rightVal;
    }

    public void setRighttVal(double leftVal){
        this.rightVal = leftVal;
    }

    public double getOpCode(){
        return opCode;
    }

    public void setOpCode(char opCode){
        this.opCode = opCode;
    }


    //get result does not accept a parameter but results one.
    public double getResult(){
        return result;
    }
    // create an empty constructor to keep from being required to enter  a value.
    public MathEquation(){

    }

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    //example of overloading.
    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        //calling the execute allows the parameters to be processed according to the opCode.
        execute();
    }

    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();

        result = (int)result;
    }
    public void execute(){
        switch(opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal/rightVal: 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
