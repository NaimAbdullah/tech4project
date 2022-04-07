package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I am going to use Scanner class for creating my object.
        2. I will use the object for reading data.
         */

        Scanner scanner = new Scanner(System.in); // creating a scanner object for using the methods

        System.out.println("Please enter first name"); // This is what I want user to enter
        String firstName = scanner.next(); // storing the first name from user

        System.out.println("Please enter your last name");
        String lastName = scanner.next();

        System.out.println("The full name of the user is = " + firstName + " " + lastName); //Printing my object/variable

    }
}
