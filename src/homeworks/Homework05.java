package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        -------------------TASK 1-------------------

        PSEUDO - CODE:
        1. Ask the question
        2. Create a variable for the int numbers
        3. Print out the max and min of numbers entered
         */

        System.out.println("-------------------TASK 1-------------------");

        System.out.println("Please enter 3 numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Max value = " + (Math.max(Math.max(num1, num2), num3)));
        System.out.println("Min value = " + (Math.min(Math.min(num1, num2), num3)));

        System.out.println();

        /*
        -------------------TASK 2-------------------

        PSEUDO - CODE:
        1. Ask the question
        2. Create a variable for the int numbers
        3. Print out the max and min of numbers entered
         */

        System.out.println("-------------------TASK 2-------------------");

        System.out.println("Please enter 5 numbers");

        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max((Math.max(Math.max(num4, num5), num6)), num7), num8));
        System.out.println("Min value = " + Math.min(Math.min((Math.min(Math.min(num4, num5), num6)), num7), num8));

        System.out.println();

        /*
        -------------------TASK 3-------------------

        PSEUDO - CODE:
        1. Ask the question
        2. Create a variable for the int numbers
        4. Create equation
        3. Print out the absolute difference of numbers entered
         */

        System.out.println("-------------------TASK 3-------------------");

        System.out.println("Please enter 2 numbers");

        int num9 = input.nextInt();
        int num10 = input.nextInt();

        int difference = num9 - num10;

        System.out.println("The difference between numbers is = " + Math.abs(difference));

        System.out.println();

        /*
        -------------------TASK 4-------------------

        PSEUDO - CODE:
        1. Ask the question
        2. Create a variable for the random int numbers
        3. Create sum equation
        4. Print out answers
         */

        System.out.println("-------------------TASK 4-------------------");

        int random1 = (int) (Math.random() * 51 + 50);
        int random2 = (int) (Math.random() * 51 + 50);
        int random3 = (int) (Math.random() * 51 + 50);

        int sum = random1 + random2 + random3;

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + sum);

        System.out.println();

        /*
        -------------------TASK 5-------------------

        PSEUDO - CODE:
        1. Create variables
        2. Create equation
        3. Print total outcome
         */

        System.out.println("-------------------TASK 5-------------------");

        double alexMoney = 125, mikeMoney = 220;
        double alexAfter = alexMoney - 25.5, mikeAfter = (25.5 + mikeMoney);


        System.out.println("Alex's Money: " + "$" + alexAfter);
        System.out.println("Mike's Money: " + mikeAfter);

        System.out.println();

        /*
        -------------------TASK 6-------------------

        PSEUDO - CODE:
        1. Create variables
        2. Write equation and Print
         */

        System.out.println("-------------------TASK 6-------------------");

        double totalSave = 390, dailySave = 15.6;

        System.out.println((int) (totalSave / dailySave));


    }
}
