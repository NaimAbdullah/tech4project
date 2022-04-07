package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {
//
//        /*
//        Write a program ASKS user for 5 of their grades as String
//        and print out their avg
//
//        Input:
//        "45"
//        "50"
//        "55"
//        "60"
//        "65"
//
//        Output:
//        55
//         */
//
        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter 5 grades");
//
//        String grade1 = input.next(), grade2 = input.next(), grade3 = input.next(),
//        grade4 = input.next(), grade5 = input.next();
//
//        double g1D = Double.parseDouble(grade1);
//        double g2D = Double.parseDouble(grade2);
//        double g3D = Double.parseDouble(grade3);
//        double g4D = Double.parseDouble(grade4);
//        double g5D = Double.parseDouble(grade5);
//
//        System.out.println("The avg is = " + (int) (g1D + g2D + g3D + g4D + g5D) / 5);
//
//        /*
//        Write a program that asks user their balance as a string and asks for
//        3 transactions as string and print out the result as double
//
//        Input:
//        "What is your balance?"
//        user:
//        34.1
//        65.3
//        28.4
//
//        Output:
//        "Your balance is now = x"
//         */
//
//        System.out.println("Please enter your balance");
//        String balance = input.next();
//
//        System.out.println("Please enter 3 transactions");
//        String tran1 = input.next();
//        String tran2 = input.next();
//        String tran3 = input.next();
//
//        double bS = Double.parseDouble(balance);
//        double total1 = Double.parseDouble(tran1);
//        double total2 = Double.parseDouble(tran2);
//        double total3 = Double.parseDouble(tran3);
//
//        double totalTran = total1 + total2 + total3;
//
//        System.out.println("Your balance is = " + (bS - totalTran));

        /*
        Write a program asks user for full name, age, phone number
        enter their 3 kids age as string then print out the oldest,
        youngest and the age difference b/w oldest and youngest

        Program: "Please enter your name
        User: John Doe
        Program: "Please enter your age"
        User: 45
        Program: "Please enter your phone number"
        User: (123) 123 1234
        Program: "Enter the age of your kids"
        User:
        12
        22
        17
        Program: Your name is John Doe, your phone number is (123) 123 1234
        You are 45 years old, Your oldest kid is 22 years old, your youngest kid is
        12, difference between oldest and youngest is 10 years.
         */

//        System.out.println("Please enter your full name");
//        String fullName = input.nextLine();
//
//        System.out.println("Please enter your age");
//        String age = input.next();
//
//        input.nextLine();
//
//        System.out.println("Please enter your phone number");
//        String phone = input.nextLine();
//
//        System.out.println("Enter the ages of your kids");
//        String age1 = input.next(), age2 = input.next(), age3 = input.next();
//
//        int age1Int = Integer.parseInt(age1);
//        int age2Int = Integer.parseInt(age2);
//        int age3Int = Integer.parseInt(age3);
//
//        /*
//        Your name is John Doe, your phone number is (123) 123 1234
//        You are 45 years old, Your oldest kid is 22 years old, your youngest kid is
//        12, difference between oldest and youngest is 10 years.
//         */
//
//        int oldest = Math.max(Math.max(age1Int, age2Int), age3Int);
//        int youngest = Math.min(Math.min(age1Int, age2Int), age3Int);
//
//        System.out.println("Your name is " + fullName + ", " + "your phone number is " + phone +
//         ", \nyou are " + age + " years old, " + "your oldest kid is " + oldest +
//                ", your \nyoungest kid is " + youngest + ", difference between " +
//                "oldest and youngest is " + (oldest - youngest) + "\nyears.");

        System.out.println("Please enter your full name");
        String fullName = input.nextLine();

        System.out.println("Please enter your age");
        String age = input.next();

        input.nextLine();

        System.out.println("Please enter your phone number");
        String phone = input.nextLine();

        System.out.println("Enter the ages of your kids");
//        String age1 = input.next(), age2 = input.next(), age3 = input.next();

        int age1Int = Integer.parseInt(input.next());
        int age2Int = Integer.parseInt(input.next());
        int age3Int = Integer.parseInt(input.next());

        int oldest = Math.max(Math.max(age1Int, age2Int), age3Int);
        int youngest = Math.min(Math.min(age1Int, age2Int), age3Int);

        System.out.println("Your name is " + fullName + ", " + "your phone number is " + phone +
                ", \nyou are " + age + " years old, " + "your oldest kid is " + oldest +
                ", your \nyoungest kid is " + youngest + ", difference between " +
                "oldest and youngest is " + (oldest - youngest) + "\nyears.");


    }
}
