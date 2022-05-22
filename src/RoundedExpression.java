public class RoundedExpression extends Expression{
    private Expression expression1;
    private int levelOfRound ;

    public RoundedExpression(Expression expression1, int levelOfRound) {
        this.expression1 = expression1;
        this.levelOfRound = levelOfRound;
    }

    /*@Override
    public double evaluate() {
        int i;
        double beforeRound = this.expression1.evaluate();
        for (i=0; i < levelOfRound;i++){
            beforeRound = (beforeRound)*10;
        }
        beforeRound = (int) beforeRound;
        beforeRound = (double) beforeRound;
        for (i=0; i < levelOfRound;i++){
            beforeRound = (beforeRound)/10;
        }
        double afterRound=beforeRound;
        return afterRound;
    }*/

    @Override
    public double evaluate() {
        double value = expression1.evaluate();
        int integerDigitsCount = String.valueOf((int)value).length();
        if((int) value<0) integerDigitsCount--;
        String formatString="%."+(this.levelOfRound + integerDigitsCount)+"g%n";
        String doubleString=String.format(formatString, value);
        return Double.parseDouble(doubleString);
    }

    @Override
    public String toString() {
        return this.expression1.toString();
    }
}