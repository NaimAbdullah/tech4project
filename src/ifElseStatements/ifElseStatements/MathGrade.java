package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class MathGrade {
    public static void main(String[] args) {

        /*

        Write a program that asks David what his balance is. If David's balance is greater
        than or equal to $600.0, then print message "Awesome! You have money".
        If David's balance is less than $600.0, then print message "Sorry! You broke".

        EXAMPLE PROGRAM 1
        Program: Hey David! Please enter your balance?
        User: 600.0

        Program: Awesome! You have money!

        EXAMPLE PROGRAM 2
        Program: Hey David! Please enter your balance?
        User: 590.0

        Program: Sorry! Your broke!

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Hey David! Please enter your balance?");
        double balance = input.nextDouble();

        if(balance >= 600.0){
            System.out.println("Awesome! You have money!");
        } else {
            System.out.println("You are broke");
        }
    }
}
