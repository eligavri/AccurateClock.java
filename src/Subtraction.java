/**
 * defining a Subtraction Expressions
 */
public class Subtraction extends Expression{
    /**
     * defining parameters.
     */
    private Expression expression1;
    private Expression expression2;
    /**
     * creates a new Subtraction expression.
     * @param expression1 the expression which we subtract from.
     * @param expression2 the expression which we subtract by
     */
    public Subtraction(Expression expression1, Expression expression2){
        this.expression1=expression1;
        this.expression2=expression2;
    }

    /**
     * @return the value of the subtraction.
     */
    @Override
    public double evaluate() {
        return this.expression1.evaluate()-this.expression2.evaluate();
    }

    /**
     * @return a string representing the expression of the subtraction.
     */
    @Override
    public String toString() {
        return "("+this.expression1.toString()+" - "+this.expression2.toString()+")";
    }
}