/**
 * Defining an RoundedExpression Expressions
 */
public class RoundedExpression extends Expression{
    /**
     * defining parameters
     */
    private Expression expression;
    private int levelOfRound ;

    /**
     * creates a new RoundedExpression expression.
     * @param expression - this expression will be rounded by the current RoundedExpression expression.
     * @param levelOfRound - number of digits to show after the dot.
     */
    public RoundedExpression(Expression expression, int levelOfRound) {
        this.expression = expression;
        this.levelOfRound = levelOfRound;
    }

    /**
     * this method rounds up the value of the expression according to the requirements.
     * the method acts by these steps:
     * 1. gets the value.
     * 2. gets the length of the Integer part.
     * 3. creates a string containing the Integer part and the wanted fraction part.
     * 4. parses the string back to double.
     * @return the rounded value of the given expression.
     */
    @Override
    public double evaluate() {
        double value = expression.evaluate();
        int integerDigitsCount = String.valueOf((int)value).length();
        if((int) value<0) integerDigitsCount--;
        String formatString="%."+(this.levelOfRound + integerDigitsCount)+"g%n";
        String doubleString=String.format(formatString, value);
        return Double.parseDouble(doubleString);
    }

    /**
     * @return the representation of the value without changing it.
     */
    @Override
    public String toString() {
        return this.expression.toString();
    }
}