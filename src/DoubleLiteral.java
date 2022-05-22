/**
 * Defining a class representing a double type number .
 * extends expression class.
 */
public class DoubleLiteral extends Expression{
    /**
     * Defining parameters.
     */
    private double literal;
    /**
     * defining a constructor.
     * @param literal double type number.
     */
    public DoubleLiteral(double literal){
        this.literal=literal;
    }
    /**
     * @return the double type number value.
     */
    @Override
    public double evaluate() {
        return literal;
    }
    /**
     * @return the representation as an arithmetic double type number.
     */
    @Override
    public String toString() {
        return "("+ this.literal+")";
    }
}