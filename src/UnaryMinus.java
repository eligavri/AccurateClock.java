public class UnaryMinus extends Expression {
    private Expression expression;
    public UnaryMinus(Expression expression){
        this.expression=expression;
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