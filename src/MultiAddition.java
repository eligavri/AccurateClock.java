/**
 * defining a MultiAddition Expressions
 */
public class MultiAddition extends Expression {
    /**
     * defining parameter - array of expressions.
     */
    private Expression[] expressionArr;

    /**
     * creates a new MultiAddition expression.
     * counts number of passed expressions and creates an array containing them.
     * @param expressions - Arbitrary Number of Arguments of type Expression are passed.
     */
    public MultiAddition(Expression... expressions){
        int count=0;
        for (Expression expression : expressions){
            count++;
        }
        this.expressionArr=new Expression[count];
        for (int i =0; i<count; i++){
            this.expressionArr[i]=expressions[i];
        }
    }

    /**
     * sums the value of the expressions in the array.
     * @return the sum value.
     */
    @Override
    public double evaluate() {
        double sum=0;
        for(Expression expression : this.expressionArr){
            sum+=expression.evaluate();
        }
        return sum;
    }

    /**
     * this method creates a string which repre
     * @return a string representing the expression of the multiple addition
     */
    @Override
    public String toString() {
        StringBuilder stringBuild=new StringBuilder();
        stringBuild.append("(");
        for(int i=0; i<this.expressionArr.length-1;i++){
            stringBuild.append(this.expressionArr[i].toString());
            stringBuild.append(" + ");
        }
        stringBuild.append(this.expressionArr[this.expressionArr.length-1]+")");
        return stringBuild.toString();
    }
}
