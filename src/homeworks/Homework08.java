package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        /*
        ---------------TASK 1---------------

        PSEUDO - CODE:
        1. Generate random number between 0-50
        2. Create if - else statement
        3. Print result
         */

        System.out.println("--------------- TASK 1 ---------------");

        int t1_num = (int) (Math.random() * 51);
        System.out.println(t1_num);

        if (t1_num >= 10 && t1_num <= 25) {
            System.out.println(true);
        } else System.out.println(false);

        System.out.println();


        /*
        ---------------TASK 2---------------

        PSEUDO - CODE:
        1. Create random number
        2. Create if - else statements
        3. Print out results
         */

        System.out.println("--------------- TASK 2 ---------------");

        int t2_num = (int) (Math.random() * 100) + 1;
        System.out.println(t2_num);

        if(t2_num >= 1 && t2_num <= 50){
            System.out.println(t2_num + " is in the 1st half");
        }
        else System.out.println(t2_num + " is in the 2nd half");

        if (t2_num >= 1 && t2_num <= 25) {
            System.out.println(t2_num + " is in the 1st quarter");
        }
        else if (t2_num >= 26 && t2_num <= 50) {
            System.out.println(t2_num + " is in the 2nd quarter");
        }
        else if (t2_num >= 51 && t2_num <= 75) {
            System.out.println(t2_num + " is in the 3rd quarter");
        }
        else System.out.println(t2_num + " is in the 4th quarter");

        System.out.println();


        /*
        ---------------TASK 3---------------

        PSEUDO - CODE:
        1. Ask user question
        2. Store user entry in int variable
        3. Create if - else statements and print out results
         */

        System.out.println("--------------- TASK 3 ---------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1-10 (1 & 10 included)");

        int t3_num1 = input.nextInt(), t3_num2 = input.nextInt(), t3_num3 = input.nextInt(),
                t3_num4 = input.nextInt(), t3_num5 = input.nextInt();

        if(t3_num1 >= 1 && t3_num1 <= 10){
            t3_num1 *= 5;
        }
        else t3_num1 *= 0;

        if(t3_num2 >= 1 && t3_num2 <= 10){
            t3_num2 *= 4;
        }
        else t3_num2 *= 0;

        if(t3_num3 >= 1 && t3_num3 <= 10){
            t3_num3 *= 3;
        }
        else t3_num3 *= 0;

        if(t3_num4 >= 1 && t3_num4 <= 10){
            t3_num4 *= 2;
        }
        else t3_num4 *= 0;

        if(t3_num5 >= 1 && t3_num5 <= 10){
            t3_num5 *= 1;
        }
        else t3_num5 *= 0;

        System.out.println("Points = " + (t3_num1 + t3_num2 + t3_num3 + t3_num4 + t3_num5));

        System.out.println("\nEnd Of Program!");
    }
}
