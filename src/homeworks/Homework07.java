package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args){

        /*
        -------------------TASK 1-------------------

        PSEUDO - CODE:
        1. Generate 4 random numbers and store them in (int) variable
        2. Print out numbers
        3. Create equations with absolute difference and max/min and print it out
         */

        System.out.println("-------------------TASK 1-------------------");

        // Random # Generator

        int num1T1 = (int) (Math.random() * 11);
        int num2T1 = (int) (Math.random() * 11);
        int num3T1 = (int) (Math.random() * 11);
        int num4T1 = (int) (Math.random() * 11);

        System.out.println("Number 1 = " + num1T1);
        System.out.println("Number 2 = " + num2T1);
        System.out.println("Number 3 = " + num3T1);
        System.out.println("Number 4 = " + num4T1);

        // Absolute Difference

        System.out.println("Absolute difference of " + num1T1 + " with 5 is = " + Math.abs(num1T1 - 5));
        System.out.println("Absolute difference of " + num2T1 + " with 5 is = " + Math.abs(num2T1 - 5));
        System.out.println("Absolute difference of " + num3T1 + " with 5 is = " + Math.abs(num3T1 - 5));
        System.out.println("Absolute difference of " + num4T1 + " with 5 is = " + Math.abs(num4T1 - 5));

        // Max & Min

        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(num1T1, num2T1), num3T1), num4T1));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(num1T1, num2T1), num3T1), num4T1));

        System.out.println();


        /*
        -------------------TASK 2-------------------

        PSEUDO - CODE:
        1. Generate random numbers and print out
        2. Create max, min, and average equations
        3. Print out answers
        4. Create if - else statements for all project requirements
         */

        System.out.println("-------------------TASK 2-------------------");

        // Random # Generator

        int rando1T2 = (int) (Math.random() * 101 - 50), rando2T2 = (int) (Math.random() * 101 - 50),
        rando3T2 = (int) (Math.random() * 101 - 50), rando4T2 = (int) (Math.random() * 101 - 50),
        rando5T2 = (int) (Math.random() * 101 - 50), rando6T2 = (int) (Math.random() * 101 - 50),
        rando7T2 = (int) (Math.random() * 101 - 50), rando8T2 = (int) (Math.random() * 101 - 50);

        System.out.println("Number 1 is = " + rando1T2);
        System.out.println("Number 2 is = " + rando2T2);
        System.out.println("Number 3 is = " + rando3T2);
        System.out.println("Number 4 is = " + rando4T2);
        System.out.println("Number 5 is = " + rando5T2);
        System.out.println("Number 6 is = " + rando6T2);
        System.out.println("Number 7 is = " + rando7T2);
        System.out.println("Number 8 is = " + rando8T2);

        // Max & Min

        int max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(rando1T2, rando2T2),
                rando3T2), rando4T2), rando5T2), rando6T2), rando7T2), rando8T2);

        int min = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(rando1T2, rando2T2),
                rando3T2), rando4T2), rando5T2), rando6T2), rando7T2), rando8T2);

        System.out.println("Greatest number is = " + max);
        System.out.println("Smallest number is = " + min);

        // Average

        System.out.println("Average of 8 numbers is = " + (rando1T2 + rando2T2 + rando3T2 + rando4T2 + rando5T2 + rando6T2 + rando7T2 + rando8T2) / 8);

        // Absolute Difference

        System.out.println("Absolute difference between smallest and greatest is = " + Math.abs(min - max));

        // If - Else

        if(rando3T2 > 0) System.out.println("3rd number is positive = true");
        else System.out.println("3rd number is positive = false");
        if(rando5T2 < 0) System.out.println("5th number is negative = true");
        else System.out.println("5th number is negative = false");
        if(rando1T2 == 0 || rando2T2 == 0 || rando3T2 == 0 || rando4T2 == 0 || rando5T2 == 0 || rando6T2 == 0 || rando7T2 == 0 || rando8T2 == 0)
            System.out.println("There is at least one zero among those numbers is = true");
        else System.out.println("There is at least one zero among those numbers is = false");

        System.out.println();


        /*
        -------------------TASK 3-------------------

        PSEUDO - CODE:
        1. Ask user question
        2. Print out user inputs
        3. Create equations for max, min, and average
        4. Create if - else statements for requirements
         */

        System.out.println("-------------------TASK 3-------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 7 numbers between 0 & 50 (0 and 50 included");

        // Number inputs

        int num1T3 = input.nextInt(), num2T3 = input.nextInt(), num3T3 = input.nextInt(), num4T3 = input.nextInt(),
                num5T3 = input.nextInt(), num6T3 = input.nextInt(), num7T3 = input.nextInt();

        System.out.println("Number 1 is = " + num1T3);
        System.out.println("Number 2 is = " + num2T3);
        System.out.println("Number 3 is = " + num3T3);
        System.out.println("Number 4 is = " + num4T3);
        System.out.println("Number 5 is = " + num5T3);
        System.out.println("Number 6 is = " + num6T3);
        System.out.println("Number 7 is = " + num7T3);

        // Max & Min

        int maxT3 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(num1T3, num2T3), num3T3), num4T3), num5T3), num6T3), num7T3);
        System.out.println("Greatest number is = " + maxT3);

        int minT3 = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(num1T3, num2T3), num3T3), num4T3), num5T3), num6T3), num7T3);
        System.out.println("Smallest number is = " + minT3);

        // Average

        System.out.println("The average of 7 numbers is = " + (num1T3 + num2T3 + num3T3 + num4T3 + num5T3 + num6T3 + num7T3) / 7);

        // If - Else

        if(num1T3 >= 10) System.out.println("First number is greater than 10 = True");
        else System.out.println("First number is greater than 10 = False");

        if(num7T3 <= 40) System.out.println("Last number is less than or equal to 40 = True");
        else System.out.println("Last number is less than or equal to 40 = False");

        if(num1T3 > 25 && num7T3 > 25) System.out.println("Both first and last numbers are greater than 25 = True");
        else System.out.println("Both first and last numbers are greater than 25 = False");

        if(num1T3 == 0 || num2T3 == 0 || num3T3 == 0 || num4T3 == 0 || num5T3 == 0 || num6T3 == 0 || num7T3 == 0 ||
                num1T3 == 50 || num2T3 == 50 || num3T3 == 50 || num4T3 == 50 || num5T3 == 50 || num6T3 == 50 || num7T3 == 50){
            System.out.println("At least one of those numbers is 0 or 50 = True");
        }
        else System.out.println("At least one of those numbers is 0 or 50 = False");

        if(num1T3 >= 40 && num1T3<= 50 || num2T3 >= 40 && num2T3<= 50 ||num3T3 >= 40 && num3T3<= 50 ||num4T3 >= 40 && num4T3<= 50 ||
                num5T3 >= 40 && num5T3<= 50 ||num6T3 >= 40 && num6T3<= 50 ||num7T3 >= 40 && num7T3<= 50){
            System.out.println("There is no number between 40 and 50 = False");
        }
        else System.out.println("There is no number between 40 and 50 = True");

        if(num1T3 < 0 || num1T3 > 50 || num2T3 < 0 || num2T3 > 50 ||num3T3 < 0 || num3T3 > 50 ||num4T3 < 0 || num4T3 > 50 ||
                num5T3 < 0 || num5T3 > 50 ||num6T3 < 0 || num6T3 > 50 ||num7T3 < 0 || num7T3 > 50) {
            System.out.println("One of these is not a valid number! Please try again!");
        }

        System.out.println();


        /*
        -------------------TASK 4-------------------

        PSEUDO - CODE:
        1. Generate random numbers and print it out
        2. Create if - else statement for project requirement
         */

        System.out.println("-------------------TASK 4-------------------");

        // Random # generator
        int num1T4 = (int) (Math.random() * 101), num2T4 = (int) (Math.random() * 101), num3T4 = (int) (Math.random() * 101);
        System.out.println("The three numbers are = " + num1T4 + ", " + num2T4 + ", " + num3T4);

        // If - Else
        if(num1T4 > 25 && num2T4 > 25 && num3T4 > 25) System.out.println("All numbers are greater than 25 = True");
        else System.out.println("All numbers are greater than 25 = False");

        System.out.println();


        /*
        -------------------TASK 5-------------------

        PSEUDO - CODE:
        1. Ask user question
        2. Create if - else if - else statements
        3. Print out day
         */

        System.out.println("-------------------TASK 5-------------------");

        System.out.println("Please enter a number between 1 & 7 (1 and 7 included)");
        int numT5 = input.nextInt();

        if(numT5 == 1) System.out.println("The number entered returns Monday");
        else if(numT5 == 2) System.out.println("The number entered returns Tuesday");
        else if(numT5 == 3) System.out.println("The number entered returns Wednesday");
        else if(numT5 == 4) System.out.println("The number entered returns Thursday");
        else if(numT5 == 5) System.out.println("The number entered returns Friday");
        else if(numT5 == 6) System.out.println("The number entered returns Saturday");
        else if(numT5 == 7) System.out.println("The number entered returns Sunday");
        else System.out.println("Invalid Number");

        System.out.println();


        /*
        -------------------TASK 6-------------------

        PSEUDO - CODE:
        1. Ask user question
        2. Create if - else if - else statement
        3. Print out appropriate text
         */

        System.out.println("-------------------TASK 6-------------------");

        System.out.println("Please enter a number between -10 & 10 (-10 and 10 included)");
        int numT6 = input.nextInt();

            if (numT6 > 0) System.out.println("Number entered is POSITIVE");
            else if (numT6 < 0) System.out.println("Number entered is NEGATIVE");
            else System.out.println("Number entered is ZERO");
            if (numT6 % 2 == 0) System.out.println("Number entered is EVEN");
            else System.out.println("Number entered is ODD");


        System.out.println();


        /*
        -------------------TASK 7-------------------

        PSEUDO - CODE:
        1. Ask user question
        2. Create average equation
        3. Create if - else statement and print out results
         */

        System.out.println("-------------------TASK 7-------------------");

        System.out.println("Please enter your exam results");
        int grade1 = input.nextInt(), grade2 = input.nextInt(), grade3 = input.nextInt(), avg = (grade1 + grade2 + grade3) / 3;

        if(avg >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");

        System.out.println();


        /*
        -------------------TASK 8-------------------

        PSEUDO - CODE:
        1. Ask user question
        2. Create variable
        3. Create if - else if - else statement and print out results
         */

        System.out.println("-------------------TASK 8-------------------");

        System.out.println("Please enter 3 numbers");
        int num1T8 = input.nextInt(), num2T8 = input.nextInt(), num3T8 = input.nextInt();

        if(num1T8 == num2T8 && num2T8 == num3T8) System.out.println("TRIPLE MATCH");
        else if(num1T8 == num2T8 || num2T8 == num3T8 || num1T8 == num3T8) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");

        System.out.println("End Of Program!");
    }
}














