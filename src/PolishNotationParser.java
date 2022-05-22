/**
 * Defining a PolishNotationParser.
 * extends ExpressionParser.
 */
public class PolishNotationParser extends ExpressionParser {
    public PolishNotationParser(){
    }
    /**
     * creates a new stack to store the expressions in order to pop them by a certain order.
     * we divide the string to an array by splitting them by spaces.
     * each cell represent a part of the expression.
     * we start the division to cases from the end.
     * in each case, according to the "type of string" we are implementing the wanted action.
     * @param expressionString the string which we want to parse into expression.
     * @return an arithmetic expression.
     */
    @Override
    public Expression parse(String expressionString) {
        Stack<Expression> expressionStack = new Stack<>();
        String[] expressionArr = expressionString.split(" ");

        for(int i=expressionArr.length-1; i>=0; i--){
            int typeOfString =typeOfString(expressionArr[i]);
            /**
             * now we got the type of the string in the current cell.
             * we act accordingly.
             */
            switch (typeOfString){
                /**
                 * cases : +,-,*,/
                 */
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
                /**
                 * case: a double type number.
                 */
                case 1:
                    double doubleNumber = Double.parseDouble(expressionArr[i]);
                    expressionStack.push(new DoubleLiteral(doubleNumber));
                    break;
                /**
                 * case: an integer type number.
                  */
                case 2:
                    double intNumber = Double.parseDouble(expressionArr[i]);
                    expressionStack.push(new IntegerLiteral(intNumber));
                    break;
                /**
                 * case: unaryMinus operation.
                  */
                case 3:
                    Expression unaryMinus = new UnaryMinus(expressionStack.pop());
                    expressionStack.push(unaryMinus);
                    break;
            }
        }
        return expressionStack.pop();
    }
}