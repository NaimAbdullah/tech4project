package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {

        /*
        Pseudo Code:
        1. Create object Scanner
        2. Ask the user to enter first and last name
        3. Use next() method for reading
        4. Print out first and last name in one statement
         */

        Scanner fullName = new Scanner(System.in);

       System.out.println("What is your first name?");
       String firstName = fullName.nextLine();

       System.out.println("What is your last name?");
       String lastName = fullName.nextLine();

       System.out.println("The users full name is: " + "\"" + firstName + " " + lastName + "\"");

        /*
        Address Exercise
         */

        System.out.println("What is your address?");
        String address = fullName.nextLine();

        System.out.println("The users address is: " + address);
    }
}
