public class DoubleLiteral extends Expression{
    private double literal;

    public DoubleLiteral(double literal){
        this.literal=literal;
    }

    @Override
    public double evaluate() {
        return literal;
    }

    @Override
    public String toString() {
        return "("+ this.literal+")";
    }
}