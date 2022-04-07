package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args){

        /*
        -------------------TASK 1-------------------

        PSEUDO - CODE:
        1. Create String variable
        2. Convert String to Int data type
        3. Create equations and Print out
         */

        System.out.println("-------------------TASK 1-------------------");

        String s1 = "5", s2 = "10";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println("-Sum of " + num1 + " and " + num2 + " is = " + (num1 + num2));
        System.out.println("-Product of " + num1 + " and " + num2 + " is = " + (num1 * num2));
        System.out.println("-Division of " + num1 + " and " + num2 + " is = " + (num1 / num2));
        System.out.println("-Subtraction of " + num1 + " and " + num2 + " is = " + (num1 - num2));
        System.out.println("-Remainder of " + num1 + " and " + num2 + " is = " + (num1 % num2));

        System.out.println();

        /*
        -------------------TASK 2-------------------

        PSEUDO - CODE:
        1. Create String variable
        2. Convert String into Int data type
        3. Create equations and Print out
         */

        System.out.println("-------------------TASK 2-------------------");

        String s3 = "200", s4 = "-50";

        int num3 = Integer.parseInt(s3);
        int num4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(num3, num4));
        System.out.println("The smallest value is = " + Math.min(num3, num4));
        System.out.println("The average value is = " + (num3 + num4) / 2);
        System.out.println("The absolute difference is = " + Math.abs(num3 - num4));

        System.out.println();

        /*
        -------------------TASK 3-------------------

        PSEUDO - CODE:
        1. Create variable
        2. Create equation and convert print to Int
        3. Print out answers
         */

        System.out.println("-------------------TASK 3-------------------");

        double dailySave = 0.96;

        System.out.println((int) (24 / dailySave) + " days");
        System.out.println((int) (168 / dailySave) + " days");
        System.out.println("$" + (150 * dailySave));

        System.out.println();

        /*
        -------------------TASK 4-------------------

        PSEUDO - CODE:
        1. Create variable
        2. Convert double to Int
        3. Create equation and Print out answers
         */

        System.out.println("-------------------TASK 4-------------------");

        double jessieSaving = 62.5;
        int savingsInt = (int) jessieSaving;

        System.out.println(1250 / savingsInt);

        System.out.println();

        /*
        -------------------TASK 5-------------------

        PSEUDO - CODE:
        1. Create variable
        2. Convert double to Int
        3. Create equation and Print out answers
         */

        System.out.println("-------------------TASK 5-------------------");

        double option1 = 475.5, option2 = 951;
        int option1Int = (int) option1;
        int option2Int = (int) option2;

        System.out.println("Option 1 will take " + 14265 / option1Int + " months");
        System.out.println("Option 2 will take " + 14265 / option2Int + " months");

        System.out.println();

        /*
        -------------------TASK 6-------------------

        PSEUDO - CODE:
        1. Create Scanner object / import it
        2. Create variables
        3. Create equation
        4. Convert int to double and print out answer
         */

        System.out.println("-------------------TASK 6-------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");
        int num5 = input.nextInt();
        int num6 = input.nextInt();

        System.out.println((double) num5 / num6);

    }
}
