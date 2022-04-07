package loops;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= num) {
            System.out.println("Please enter number " + i);
            sum += input.nextInt();
            i++;
        }

        System.out.println("The sum of the numbers entered is = " + sum);
    }
}
