public class ReversePolishNotationParser extends ExpressionParser {

    @Override
    public Expression parse(String expressionString) {
        Stack<Expression> expressionStack = new Stack<>();
        String[] expressionArr = expressionString.split(" ");

        for(int i=0; i<expressionArr.length; i++){
            int typeOfString =typeOfString(expressionArr[i]);
            switch (typeOfString){
                case 0:
                    Expression expression1, expression2;
                    expression1=expressionStack.pop();
                    expression2=expressionStack.pop();
                    switch (expressionArr[i].charAt(0)){
                        case '+':
                            expressionStack.push(new Addition(expression1,expression2));
                            break;
                        case '-':
                            expressionStack.push(new Subtraction(expression1,expression2));
                            break;
                        case '*':
                            expressionStack.push(new Multiplication(expression1,expression2));
                            break;
                        case '/':
                            expressionStack.push(new Division(expression1,expression2));
                            break;
                    }
                    break;
                case 1:
                    double doubleNumber = Double.parseDouble(expressionArr[i]);
                    expressionStack.push(new DoubleLiteral(doubleNumber));
                    break;
                case 2:
                    double intNumber = Double.parseDouble(expressionArr[i]);
                    expressionStack.push(new IntegerLiteral(intNumber));
                case 3:
                    Expression unaryMinus = new UnaryMinus(expressionStack.pop());
                    expressionStack.push(unaryMinus);
                    break;
            }
        }
        return expressionStack.pop();
    }
}
