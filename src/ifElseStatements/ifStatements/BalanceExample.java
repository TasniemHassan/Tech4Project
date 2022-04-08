package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args){

        double balance = 150;
        // you can use relational and logical operators
        //expression which is going to be true if balance is less than 0

        boolean isBalanceLessThan0 = balance < 0; //False ex: comparing is a type of expression
        boolean isBalanceEquals100 = balance == 100; //false
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000; //false

        // create an expression for checking if balance is not equals to -1

        boolean isBalanceNotNeg1 = balance != -1; //true
        if(isBalanceNotNeg1){ // if this is true execute otherwise skip
            System.out.println("Your balance is not equal to -1");

        }
        //if(statement, expression, boolean, anything returning true or false){
            //action my code to be executed

    }


}
