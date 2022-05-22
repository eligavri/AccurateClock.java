/**
 * Defining a class representing a division operation.
 * extends expression class.
 */
public class Division extends Expression {
    /**
     * Defining parameters.
     */
    private Expression expression1;
    private Expression expression2;
    /**
     * defining a constructor.
     * @param expression1 the expression which we divide from.
     * @param expression2 the expression which we divide by.
     */
    public Division(Expression expression1, Expression expression2){
        this.expression1=expression1;
        this.expression2=expression2;
    }
    /**
     * calculates the arithmetic expression value, by dividing expressions values.
     * @return the calculated value of the expressions.
     */
    @Override
    public double evaluate() {
        return this.expression1.evaluate()/this.expression2.evaluate();
    }
    /**
     * @return the representation as an arithmetic division expression.
     */
    @Override
    public String toString() {
        return "("+this.expression1.toString()+" / "+this.expression2.toString()+")";
    }
}