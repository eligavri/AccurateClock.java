/**
 * Defining an UnaryMinus Expressions
 */
public class UnaryMinus extends Expression {
    private Expression expression;

    /**
     * creates a new UnaryMinus expression.
     * @param expression - this expression will be reversed by the current UnaryMinus expression.
     */
    public UnaryMinus(Expression expression){
        this.expression=expression;
    }

    /**
     * @return the reversed value of the given expression.
     */
    @Override
    public double evaluate() {
        return this.expression.evaluate()*(-1);
    }

    /**
     * @return the reversed presentation of the value of the given expression.
     */
    @Override
    public String toString() {
        return "(-" + this.expression.toString() +")";
    }
}