package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        PSEUDO CODE:
        1. Ask user question
        2. Store users input
        3. Find max and min
        4. Create for-i loop to print all descending numbers
         */

        System.out.println("Please enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = max; i >= min ; i--) {
            if(i < 10) break;
            System.out.print(i + " ");

        }
    }
}
