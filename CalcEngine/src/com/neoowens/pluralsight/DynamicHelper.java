package com.neoowens.pluralsight;

/**
 * Created by Neo Owens on 8/1/2017.
 */
public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
    }

    public String process(String statement){
        //IN add 1.0 2.0
        //OUT 1.0 + 2.0 = 3.0

        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0];

        MathProcessing theHandler = null;

        for(MathProcessing handler:handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyWord())){
                theHandler = handler;
                break;
            }
        }
    }
}
