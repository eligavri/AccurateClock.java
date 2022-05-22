/**
 * defining a Multiplication Expressions
 */
public class Multiplication extends Expression   {
    /**
     * defining parameters.
     */
    private Expression expression1;
    private Expression expression2;
    /**
     * creates a new Subtraction expression.
     * @param expression1 first expression
     * @param expression2 second expression
     */
    public Multiplication(Expression expression1, Expression expression2){
        this.expression1=expression1;
        this.expression2=expression2;
    }
    /**
     * @return the value of the multiplication.
     */
    @Override
    public double evaluate() {
        return this.expression1.evaluate()*this.expression2.evaluate();
    }

    /**
     * @return a string representing the expression of the multiplication.
     */
    @Override
    public String toString() {
        return "("+this.expression1.toString()+" * "+this.expression2.toString()+")";
    }
}