public class UnaryMinus extends Expression {
    private Expression expression;
    public UnaryMinus(Expression expression1, Expression expression2){
        this.expression=expression1;
    }

    @Override
    public double evaluate() {
        return this.expression.evaluate()*(-1);
    }

    @Override
    public String toString() {
        return "(-" + this.expression.toString() +")";
    }
}
