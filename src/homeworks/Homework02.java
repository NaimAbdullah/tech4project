package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        // TASK - 1

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = input.next();

        System.out.println("Please enter your last name");
        String lastName = input.next();

        System.out.println("Please enter your age");
        int userAge = input.nextInt();

        System.out.println("Please enter your email address");
        String userEmail = input.next();

        System.out.println("Please enter your phone number");
        input.nextLine();
        String userPhoneNumber = input.nextLine();

        System.out.println("Please enter your address");
        String userAddress = input.nextLine();

        System.out.println("\n");


        System.out.println("\tUser who joined this program is named " + firstName + " " +
                lastName + ". " + firstName + "'s "+"age is " + userAge+". " + "\n " + firstName +
                "'s " + "email address is " + userEmail + ", phone number is " + userPhoneNumber + "," +
               "\n" + " and address is " + userAddress + ".");

        System.out.println("\n");

        // TASK - 2

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your favorite book?");
        String favBook = userInput.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = userInput.next();

        System.out.println("What is your favorite number?");
        int favNumber = userInput.nextInt();

        System.out.println("Users favorite book is: " + favBook + "\n" +
        "Users favorite color is: " + favColor + "\n" +
                "Users favorite number is: " + favNumber);



    }
}
