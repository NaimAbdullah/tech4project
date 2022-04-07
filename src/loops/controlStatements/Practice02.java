package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {


        /*
        PSEUDO CODE:
        1. Ask user to enter 2 numbers
        2. Store numbers
        3. Create max and min
        4. Create for-i to print numbers with the exception of 5
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 different numbers between 0-10 (0 and 10 included");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        String s = "";

        for (int i = min; i <= max; i++) {
            if(i == 5) continue;
            s += i + " - ";
        }
        System.out.print(s.substring(0, s.length()-3));
    }
}
