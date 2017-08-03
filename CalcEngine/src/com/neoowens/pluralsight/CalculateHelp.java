package com.neoowens.pluralsight;

//import java.lang.StringBuilder;
/**
 * Created by Neo Owens on 8/1/2017.
 */
public class CalculateHelp {

    // name constants
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char DIVIDE_SYMBOL = '/';
    private static final char MULTIPLY_SYMBOL = '*';

    MathCommand command;
    double leftValue;
    double rightValue;
    double result;


    public void process(String statement) throws InvalidStatementException {
        //add 1.0 2.0
        String[] parts = statement.split(" ");
        // make sure all the parts are put in the statement

        //InvalidStatementException extends an existing class in java. allowing the reference to the constructor.
        if(parts.length != 3){
            throw new InvalidStatementException("Incorrect number of fields", statement);
        }

        String commandString = parts[0]; //add

        try {
            leftValue = Double.parseDouble(parts[1]);
            rightValue = Double.parseDouble(parts[2]);
        }catch (NumberFormatException e){
            // is the value or explanation for the error
            throw new InvalidStatementException("Non-numeric data", statement, e);
        }
        setCommandFromString(commandString);

        if(command == null){
            throw new InvalidStatementException("Invalid Command", statement);
        }

        //reference classes from calculate base
        CalculateBase calculator = null;

        //switch receives the command and then calculate assigns a type calculate to the calculator.
        //Calculate base is extended by operator classes and can be called after instantiating it into this class
        switch (command) {
            case Add:
                calculator = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                calculator = new Subtract(leftValue, rightValue);
                break;
            case Multiply:
                calculator = new Multiply(leftValue, rightValue);
            case Divide:
                calculator = new Divider(leftValue, rightValue);
                break;
        }
        calculator.calculate();
        result = calculator.getResult();
    }

    //Convert command from string to mathcommand

    private void setCommandFromString(String commandString){
        //convert add -> Mathcommand.Add

        //changes to the numeration value 'Add' and converting it to a string.
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())){
            command = MathCommand.Add;
        } else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())){
            command = MathCommand.Subtract;
        } else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())) {
            command = MathCommand.Multiply;
        } else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())) {
            command = MathCommand.Divide;
        }
    }

    //toString is being overwritten to reformat the output.
    @Override
    public String toString() {
        //1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch(command) {
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
