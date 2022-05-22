

public class MultiAddition extends Expression {
    private Expression[] expressionArr;
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

    @Override
    public double evaluate() {
        double sum=0;
        for(Expression expression : this.expressionArr){
            sum+=expression.evaluate();
        }
        return sum;
    }

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
