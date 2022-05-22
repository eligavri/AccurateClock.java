/**
 * Defining an Expression parser.
 */
public abstract class ExpressionParser {
    /**
     * an abstract method.
     * gets a string and analyzes it.
     * @return an expression after being parsed into arithmetic expression.
     */
    public abstract Expression parse(String expressionString);
    /**
     * a method which defines what kind of expression needed to be added by a parser method .
     * gets a string and analyzes it.
     * @return 0 for a regular arithmetic operation such as : +,-,/,*.
     *         1 for a double number.
     *         2 for an integer number.
     *         3 for an UnaryMinus.
     */
    protected int typeOfString(String str){
        if(str.charAt(0)>(int)'9' || str.charAt(0)<(int)'0'){
            if( (str.charAt(0)!='-') && !(str.length()>1) ){
                return 0;
            }
            else if(str.charAt(1)=='u'){
                return 3;
            }
        }
        if( str.contains(".") )
            return 1;
        return 2;
    }

}