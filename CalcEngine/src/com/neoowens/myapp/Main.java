package com.neoowens.myapp;

import com.neoowens.pluralsight.Adder;
import com.neoowens.pluralsight.CalculateBase;
import com.neoowens.pluralsight.CalculateHelp;
import com.neoowens.pluralsight.Divider;
import com.neoowens.pluralsight.InvalidStatementException;
import com.neoowens.pluralsight.MathEquation;
import com.neoowens.pluralsight.Multiply;
import com.neoowens.pluralsight.Subtract;

//about is insert on demand.
public class Main {

    public static void main(String[] args) {

//        useMathEquation();
//        useMathEquation();
//        useCalculateBase();

    }


    static void useMathEquation(){
        MathEquation[] equations = new MathEquation[4];
        //uses the constructor in MathEquation class to accept the values.
        equations[0] = new MathEquation('d', 10, 10);
        equations[1] = new MathEquation('s', 10, 10);
        equations[2] = new MathEquation('m', 10, 10);
        equations[3] = new MathEquation('a', 10, 10);

        /*for each loop uses MathEquation array and checks each
         equation in the array. execute each equation in the array
         using the create method.
        */

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        MathEquation equationOverLoad = new MathEquation('d');

        equationOverLoad.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.print(equationOverLoad.getResult());

        int leftInt = 20;
        int rightInt = 30;

        equationOverLoad.execute(leftInt, rightInt);
        System.out.print("result = ");
        System.out.print(equationOverLoad.getResult());

        equationOverLoad.execute((double)leftInt, rightInt);
        System.out.print("result = ");
        System.out.print(equationOverLoad.getResult());

        // below should return a new instance of MathEquation from the class.
//    public static MathEquation create(double leftVal, double rightVal, char opCode){
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRighttVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();
    }

    static void useCalculateBase(){
        CalculateBase[] calculators = {
                new Divider(60,38),
                new Multiply(45,23),
                new Subtract(350,5),
                new Adder(100,200)
        };
        //for each operator in the calculatebase array instance calculcators using local variable name calculator.

        for(CalculateBase calculator: calculators){
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }
    }

    static void useCalculateHelp(){

        System.out.println();
        System.out.println("Encapsulation");
        System.out.println();

        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.00 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelp helper = new CalculateHelp();
        for (String statement : statements) {
            //not handling the exception.
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                //check to see if there is another exception
                if (e.getCause() != null) {
                    //remember to use .getMessage to return the cause.
                    System.out.println("  Original exception: " + e.getCause().getMessage());
                }
            }
        }
    }
}
