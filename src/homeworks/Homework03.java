package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        /*
        TASK - 1

        PSEUDO - CODE:
        1. Print out question
        2. Create variable
        3. Find the sum
        4. Print it out

         */

        System.out.println("Task - 1");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number of your choice");
        int num1 = input.nextInt();

        System.out.println("Please enter the second number of your choice");
        int num2 = input.nextInt();

        int sum = (num1 + num2);

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and number 2 entered by user is = " + sum);

        System.out.println();

        /*
        TASK - 2

        PSEUDO - CODE:
        1. Print out question
        2. Create variables
        3. Print out div answer

         */

        System.out.println("Task - 2");

        System.out.println("Please enter the first floating number");
        double floatingNum1 = input.nextDouble();

        System.out.println("Please enter the second floating number");
        double floatingNum2 = input.nextDouble();

        double div = floatingNum1 / floatingNum2;

        System.out.println("The number 1 entered by user is = " + floatingNum1);
        System.out.println("The number 2 entered by user is = " + floatingNum2);
        System.out.println("The division of number 1 and 2 entered by user is = " + div);

        System.out.println();

        /*
        TASK - 3
        PSEUDO - CODE:
        1. Create equation
        2. Print out answer

         */

        System.out.println("Task - 3");

        System.out.println("1.\t" + (-10+(7 * 5)));
        System.out.println("2.\t" + (72+24) % 24);
        System.out.println("3.\t" + (10+(-3*9) / 9));
        System.out.println("4.\t" + ((5+(18/3)*3) - (6%3)));

        System.out.println();

        /*
        TASK - 4
        PSEUDO - CODE:
        1. Print out question
        2. Create variables
        3. Create equations and print out answer

         */

        System.out.println("Task - 4");

        System.out.println("Please enter the first floating number");
        double float1 = input.nextDouble();

        System.out.println("Please enter the second floating number");
        double float2 = input.nextDouble();

        System.out.println("The number 1 entered by user is = " + float1);
        System.out.println("The number 2 entered by user is = " + float2);

        System.out.println("The sum of the given numbers is = " + (float1 + float2));
        System.out.println("The product of the given numbers is = " + float1 * float2);
        System.out.println("The subtraction of the given numbers is = " + (float1 - float2));
        System.out.println("The division of the given numbers is = " + float1 / float2);
        System.out.println("The remainder of the given numbers is = " + float1 % float2);

        System.out.println();

        /*
        TASK - 5
        PSEUDO - CODE:
        1. Create variables
        2. Create equation and print out answer

         */

        float width = 7.5F;
        float height = 10.5F;

        System.out.println("The area of the rectangle = " + width * height);
        System.out.println("The perimeter of the rectangle = " + 2 * (width + height));

        System.out.println();

        /*
        TASK - 6
        PSEUDO - CODE:
        1.Create variable
        2. Create equation for salary and print it out

         */

        System.out.println("Task - 6");
        float salary = 90_000;

        System.out.println("A Software Engineer in Test can earn " + salary * 3 + " in 3 years.");
    }
}
