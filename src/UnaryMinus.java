public class UnaryMinus extends Expression {
    private Expression expression1;
    public UnaryMinus(Expression expression1, Expression expression2){
        this.expression1=expression1;
    }

    @Override
    public double evaluate() {
        return this.expression1.evaluate()*(-1);
    }

    @Override
    public String toString() {
        return "(-" + this.expression1.toString() +")";
    }
}

}
