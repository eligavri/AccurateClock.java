public class IntegerLiteral extends Expression {
    private double literal;
    public IntegerLiteral(double literal){
        this.literal=literal;
    }

    @Override
    public double evaluate() {
        return literal;
    }

    @Override
    public String toString() {
        int intValue = (int) this.literal;
        return "("+intValue+")";
    }
}
