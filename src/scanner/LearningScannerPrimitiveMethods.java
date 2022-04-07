package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args) {

        /*
        How to use Scanner Methods
        1. Create an object of Scanner
        ClassName/DatType variableName/objectName = new ClassName/DataType(If needed);
        2. variableName/objectName.methodName(if needed);
         */

        /*
        Task-1
        1. Ask user to enter age
        2. Print question
        3. Use the proper next method (nextInt)
        4. Print out the user's age
         */

        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter your age");

        int userAge = collect.nextInt();

        System.out.println("The users age is = " + "\"" + userAge + "\"");

        /*
        Ask for account balance of the user
        Get the account balance and store it
        Print it out
         */

        System.out.println("Please enter account balance");

        float userBalance = collect.nextFloat();

        System.out.println("The users balance is = " + "\"" + userBalance + "\"");

        /*
        Ask for user are you understanding this java class?
        Get the answer and store i
        Print the answer
         */

        System.out.println("Are you understanding this Java class today?");

        boolean userAnswer = collect.nextBoolean();

        System.out.println("The users answer is = " + "\"" + userAnswer + "\"");

    }
}
