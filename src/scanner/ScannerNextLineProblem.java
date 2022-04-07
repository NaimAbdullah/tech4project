package scanner;

import java.util.Scanner;
public class ScannerNextLineProblem {
    public static void main(String[] args) {

        /**
        Name        --> next()
        Age         --> nextInt()
        MyBrainOk
        Fav Quote   --> nextLine()
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();

        System.out.println("What is your age?");
        int age = input.nextInt();

        System.out.println("Your brain is fried true / false ?");
        boolean brainFried = input.nextBoolean();

        System.out.println("What is your address?");
        input.nextLine();
        String userAddress = input.nextLine();

        System.out.println("The users name is: " + "\"" + name + "\"" +
                "\n" + "The users age is: " + "\"" + age + "\"" +
                "\n" + "The users brain is Ok T/F: " + brainFried +
                "\n" + "The users address is: " + userAddress);

       Scanner userNumber = new Scanner(System.in);
        System.out.println("Enter first number");

        int firstNumber = userNumber.nextInt();

        System.out.println("Please enter your second number");
        int secondNumber = userNumber.nextInt();

        System.out.println("Please enter your third and final number");
        int thirdNumber = userNumber.nextInt();

        System.out.println("The total number is = " + (firstNumber + secondNumber + thirdNumber));

    }
}
