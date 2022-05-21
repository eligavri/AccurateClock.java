public abstract class ExpressionParser {

    public abstract Expression parse(String expressionString);

    protected int typeOfString(String str){
        if(str.charAt(0)>(int)'9' || str.charAt(0)<(int)'0'){
            if( (str.charAt(0)!='-') && !(str.length()>1) ){
                return 0;
            }
            else if(str.charAt(1)=='u'){
                return 3;
            }
        }
        if( str.contains(".") )
            return 1;
        return 2;
    }

    /*protected Expression stringToExpression(){


        return null;
    }*/
}
