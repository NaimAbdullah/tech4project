package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter their favorite book name and quote and store answers of user in different Strings
        Finally, print the length of those Strings with proper message
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite book name");
        String bookName = input.nextLine();

        System.out.println("Please also enter your favorite quote");
        String quote = input.nextLine();

        System.out.println("The length of the book name is " + bookName.length());
        System.out.println("The length of the quote is " + quote.length());
    }
}
