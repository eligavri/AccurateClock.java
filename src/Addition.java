public class Addition extends Expression{
    private Expression expression1;
    private Expression expression2;
    public Addition(Expression expression1, Expression expression2){
        this.expression1=expression1;
        this.expression2=expression2;
    }

    @Override
    public double evaluate() {
        return this.expression1.evaluate()+this.expression2.evaluate();
    }

    @Override
    public String toString() {
        return "("+this.expression1.toString()+" + "+this.expression2.toString()+")";
    }
}
