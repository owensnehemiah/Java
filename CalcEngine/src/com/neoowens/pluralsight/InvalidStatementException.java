package com.neoowens.pluralsight;

/**
 * Created by Neo Owens on 8/1/2017.
 */

// all clases will extend the exception
public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement){
        //accepts a string that is a message
        super(reason + ": " + statement);
    }

    public InvalidStatementException (String reason, String statement, Throwable cause){
        //accepts a string that is a message
        super(reason + ": " + statement, cause);
    }
}
