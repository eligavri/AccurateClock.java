/**
 * Defining an Expression.
 */
public abstract class Expression {
    /**
     * an abstract method.
     * calculates the arithmetic expression value, according to the dynamic type.
     * @return the calculated value of the expression.
     */
    public abstract double evaluate();
    /**
     * an abstract method.
     * @return the representation as an arithmetic expression.
     */
    public abstract String toString();
}