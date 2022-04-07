package loops;

import java.util.Scanner;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userNum;
        int attempt = 1;
        do{
            if(attempt == 1) System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
            userNum = input.nextInt();
            if(userNum % 5 != 0) System.out.println("This number is not divisible by 5");
            attempt++;
        }
        while((userNum % 5) != 0);

        System.out.println("This number is divisible by 5");

    }
}
