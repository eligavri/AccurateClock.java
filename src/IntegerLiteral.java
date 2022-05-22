/**
 * Defining a class representing an integer type number .
 * extends expression class.
 */
public class IntegerLiteral extends Expression {
    /**
     * Defining parameters.
     */
    private double literal;
    /**
     * defining a constructor.
     * @param literal integer type number.
     */
    public IntegerLiteral(double literal){
        this.literal=literal;
    }
    /**
     * @return the integer type number value.
     */
    @Override
    public double evaluate() {
        return literal;
    }
    /**
     * casts the input to an int
     * @return the representation as an arithmetic integer type number.
     */
    @Override
    public String toString() {
        int intValue = (int) this.literal;
        return "("+intValue+")";
    }
}