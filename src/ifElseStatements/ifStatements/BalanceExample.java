package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;

        // expression which is going to be true if balance is less than 0

        boolean isBalanceLessThan0 = balance < 0;   //false
        boolean isBalanceEqualTo100 = balance == 100;   //false
        boolean isBalanceBiggerOrEquals1000 = balance >= 1000;  //false

        //Create an expression for checking if balance is not equal to -1

        boolean isBalanceNotEqual_1 = balance != -1;    //true

        if(balance < 0){ // if this is true, execute otherwise skip
            System.out.println("Your balance is not equal to -1");
        }

    }
}
