package ifElseStatements.ifElseIfStatment;

import java.util.Scanner;

public class FindTheSmallestOfTwoNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("The smaller number is = " + num2);
        }
        else{
            System.out.println("The smaller number is = " + num1);
        }

        /* ternary operator

         */

        int smallestNumber = num1 < num2 ? num1 : num2;

        System.out.println(smallestNumber);
    }
}
