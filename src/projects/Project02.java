package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*
        ---------------TASK 1---------------

        PSEUDO - CODE:
        1. Ask user question
        2. Create variables
        3. Create equation
        4. Print out answer
         */

        System.out.println("--------------- TASK 1 ---------------");

        System.out.println("Please enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int product = num1 * num2 * num3;

        System.out.println("The product of the numbers entered is = " + product);

        System.out.println();


        /*
        ---------------TASK 2---------------

        PSEUDO - CODE:
        1. Ask the user all questions
        2. Created String and Int variables
        3. Created age equation
        4. Printed out users age
         */

        System.out.println("--------------- TASK 2 ---------------");

        System.out.println("What is your first name?");
        String firstName = input.next();

        System.out.println("What is your last name?");
        String lastName = input.next();

        System.out.println("What is your year of birth");
        int birthYear = input.nextInt();

        int age = 2022 - birthYear;

        System.out.println(firstName + " " + lastName + "'s age is = " + age);

        System.out.println();


        /*
        ---------------TASK 3---------------

        PSEUDO - CODE:
        1. Ask the user all questions
        2. Created String and double variables
        3. Created weight equation
        4. Printed out users weight
         */

        System.out.println("--------------- TASK 3 ---------------");

        System.out.println("What is your full name?");
        input.nextLine();
        String fullName = input.nextLine();

        System.out.println("What is your weight?");
        double weightKg = input.nextDouble();

        double weightLb = weightKg * 2.205;

        System.out.println(fullName + "'s weight is = " + weightLb + " lbs");

        System.out.println();


        /*
        ---------------TASK 4---------------

        PSEUDO - CODE:
        1. Ask the user all the questions
        2. Create variables
        3. Write and calculate all equations
        4. Print out answers
         */

        System.out.println("--------------- TASK 4 ---------------");

        input.nextLine();
        System.out.println("What is your full name?");
        String fullName1 = input.nextLine();

        System.out.println("What is your age?");
        int age1 = input.nextInt();

        input.nextLine();

        System.out.println("What is your full name?");
        String fullName2 = input.nextLine();

        System.out.println("What is your age?");
        int age2 = input.nextInt();

        input.nextLine();

        System.out.println("What is your full name?");
        String fullName3 = input.nextLine();

        System.out.println("What is your age?");
        int age3 = input.nextInt();

        int aveAge = (age1 + age2 + age3) / 3;

        int maxAge1_2 = Math.max(age1, age2);

        int minAge1_2 = Math.min(age1, age2);

        System.out.println(fullName1 + "'s age is " + age1 + "." + "\n" +
                           fullName2 + "'s age is " + age2 + "." + "\n" +
                           fullName3 + "'s age is " + age3 + ".");

        System.out.println("The average age is " + aveAge + ".");
        System.out.println("The eldest age is " + Math.max(maxAge1_2, age3) + ".");
        System.out.println("The youngest age is " + Math.min(minAge1_2, age3) + ".");

    }
}
