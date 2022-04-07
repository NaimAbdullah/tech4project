package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {


        System.out.println("\n--------------- TASK 1 ---------------\n");

        String s1 = "";

        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0){
                s1 += i + " - ";
            }
        }
        System.out.println(s1.substring(0, s1.length()-3));

        System.out.println();


        System.out.println("\n--------------- TASK 2 ---------------\n");

        String s2 = "";

        for (int i = 1; i <= 50; i++) {
            if(i % 6 == 0){
                s2 += i + " - ";
            }
        }
        System.out.println(s2.substring(0, s2.length()-3));

        System.out.println();


        System.out.println("\n--------------- TASK 3 ---------------\n");

        String s3 = "";

        for (int i = 100; i >= 50; i--) {
            if(i % 5 == 0){
                s3 += i + " - ";
            }
        }
        System.out.println(s3.substring(0, s3.length()-3));

        System.out.println();


        System.out.println("\n--------------- TASK 4 ---------------\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i * i));
        }

        System.out.println();


        System.out.println("\n--------------- TASK 5 ---------------\n");

        int sumT5 = 0;
        for (int i = 1; i <= 10; i++) {
           sumT5 += i;
        }
        System.out.println(sumT5);

        System.out.println();


        System.out.println("\n--------------- TASK 6 ---------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a positive number");
        int userNum = input.nextInt();

        int factorial = 1;
        for (int i = 1; i <= userNum; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println();


        System.out.println("\n--------------- TASK 7 ---------------\n");

        input.nextLine();
        System.out.print("Please enter your full name");
        String userName = ScannerHelper.getAStringFromUser();

        int vowel = 0;

        for (int i = 0; i < userName.length(); i++){
            if(userName.toLowerCase().charAt(i) == 'a' || userName.toLowerCase().charAt(i) == 'e' ||
                    userName.toLowerCase().charAt(i) == 'i' || userName.toLowerCase().charAt(i) == 'o' ||
                    userName.toLowerCase().charAt(i) == 'u'){
                vowel ++;
            }
        }
        System.out.println("There are " + vowel + " vowels in this full name");

        System.out.println();


        System.out.println("\n--------------- TASK 8 ---------------\n");

        int sum = 0;

        int userNumT8;
        int attempt = 1;
        do {
            if(attempt == 1) {
                System.out.println("Please enter a number");
                attempt++;
            }
            else{
                System.out.println("Please enter another number");
            }
            userNumT8 = input.nextInt();
            sum += userNumT8;

        }
        while (sum < 100);

        if (userNumT8 > 100) System.out.println("This number is already more than 100");
        else System.out.println("Sum of the entered numbers is at least 100");

        System.out.println("\n--------------- TASK 9 ---------------\n");

        int fiboNum = 7;
        int num1 = 0;
        int num2 = 1;
        int num3;

        String s = "";

        for (int i = 1; i <= fiboNum; i++) {
            s += num1 + " - ";
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        System.out.println(s.substring(0, s.length() - 3));

        System.out.println();


        System.out.println("\n--------------- TASK 10 ---------------\n");

        input.nextLine();
        String name;

        do{
            System.out.println("Please enter a name");
            name = input.nextLine();
        }
        while(!name.toLowerCase().startsWith("j"));

        System.out.println("End of program");
    }
}
