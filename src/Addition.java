/**
 * Defining a class representing an addition operation.
 * extends expression class.
 */
public class Addition extends Expression{
    /**
     * Defining parameters.
     */
    private Expression expression1;
    private Expression expression2;
    /**
     * defining a constructor.
     * @param expression1 first expression
     * @param expression2 second expression.
     */
    public Addition(Expression expression1, Expression expression2){
        this.expression1=expression1;
        this.expression2=expression2;
    }
    /**
     * calculates the arithmetic expression value, by adding expressions values.
     * @return the calculated value of the expressions.
     */
    @Override
    public double evaluate() {
        return this.expression1.evaluate()+this.expression2.evaluate();
    }
    /**
     * @return the representation as an arithmetic addition expression.
     */
    @Override
    public String toString() {
        return "("+this.expression1.toString()+" + "+this.expression2.toString()+")";
    }
}