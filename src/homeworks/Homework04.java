package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        -------------------TASK 1-------------------

        PSEUDO - CODE:
        1. Ask the question
        2. Create a variable for the int numbers
        3. Print out the average of numbers entered
         */

        System.out.println("-------------------TASK 1-------------------");

        System.out.println("Please enter your first number");
        int num1 = input.nextInt();

        System.out.println("PLease enter your second number");
        int num2 = input.nextInt();

        System.out.println("The average of the given 2 numbers is: " + (num1 + num2) / 2);

        System.out.println();

        /*
        -------------------TASK 2-------------------

        PSEUDO - CODE:
        1. Ask user question
        2. Create variable
        3. Print out sum of numbers entered
         */

        System.out.println("-------------------TASK 2-------------------");

        System.out.println("Please enter your first number");
        int num3 = input.nextInt();

        System.out.println("Please enter your second number");
        int num4 = input.nextInt();

        int sum3_4 = num3 * num4;

        System.out.println("The product of the 2 given numbers is: " + sum3_4);

        System.out.println();

        /*
        -------------------TASK 3-------------------

        PSEUDO - CODE:
        1. Ask user questions
        2. Create variable for inputted numbers
        3. Print out numbers and the square of each
         */

        System.out.println("-------------------TASK 3-------------------");

        System.out.println("Please enter your first number");
        int num5 = input.nextInt();

        System.out.println("Please enter your second number");
        int num6 = input.nextInt();

        System.out.println("Please enter your third number");
        int num7 = input.nextInt();

        System.out.println("The " + num5 + " multiplied with " + num5 + " is = " + num5 * num5);
        System.out.println("The " + num6 + " multiplied with " + num6 + " is = " + num6 * num6);
        System.out.println("The " + num7 + " multiplied with " + num7 + " is = " + num7 * num7);

        System.out.println();


        /*
        -------------------TASK 4-------------------

        PSEUDO - CODE:
        1. Ask user question
        2. Create variable
        3. Print out numbers and remainder
         */

        System.out.println("-------------------TASK 4-------------------");

        System.out.println("Please enter your first number");
        int num8 = input.nextInt();

        System.out.println("Please enter your second number");
        int num9 = input.nextInt();

        int remainder = num8 % num9;

        System.out.println("The remainder of " + num8 + " % " + num9 + " = " + remainder);

        System.out.println();


        /*
        -------------------TASK 5-------------------

        PSEUDO - CODE:
        1. Ask the user all the questions
        2. Create variables
        3. Calculate the average and assign it to a variable name
        4. Print out the average
         */

        System.out.println("-------------------TASK 5-------------------");

        System.out.println("Please enter your first number");
        int num10 = input.nextInt();

        System.out.println("Please enter your second number");
        int num11 = input.nextInt();

        System.out.println("Please enter your third number");
        int num12 = input.nextInt();

        System.out.println("Please enter your fourth number");
        int num13 = input.nextInt();

        System.out.println("Please enter your fifth number");
        int num14 = input.nextInt();

        int average = (num10 + num11 + num12 + num13 + num14) / 5;

        System.out.println("The average of the given 5 numbers is: " + average);

        System.out.println();


        /*
        -------------------TASK 6-------------------

        PSEUDO - CODE:
        1. Ask the user the question
        2. Create variable for the users number
        3. Print out each equation and answer
         */

        System.out.println("-------------------TASK 6-------------------");

        System.out.println("PLease enter a number");
        int num15 = input.nextInt();

        System.out.println(num15 + " * " + "1" + " = " + num15);
        System.out.println(num15 + " * " + "2" + " = " + num15 * 2);
        System.out.println(num15 + " * " + "3" + " = " + num15 * 3);
        System.out.println(num15 + " * " + "4" + " = " + num15 * 4);
        System.out.println(num15 + " * " + "5" + " = " + num15 * 5);
        System.out.println(num15 + " * " + "6" + " = " + num15 * 6);
        System.out.println(num15 + " * " + "7" + " = " + num15 * 7);
        System.out.println(num15 + " * " + "8" + " = " + num15 * 8);
        System.out.println(num15 + " * " + "9" + " = " + num15 * 9);
        System.out.println(num15 + " * " + "10" + " = " + num15 * 10);

        System.out.println();


        /*
        -------------------TASK 7-------------------

        PSEUDO - CODE:
        1. Ask the user the question
        2. Create variable for users input
        3. Create equations
        4. Print out answers
         */

        System.out.println("-------------------TASK 7-------------------");

        System.out.println("Please enter the length of a side of a square");
        int num16 = input.nextInt();

        int area = num16 * num16;
        int peri = 4 * num16;

        System.out.println("Perimeter of the square = " + peri);
        System.out.println("Area of the square = " + area);

    }
}
