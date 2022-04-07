package operator.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please your enter your balance");
        double balance = input.nextDouble();

        System.out.println("Please enter the amount of your first transaction");
        double transaction1 = input.nextDouble();

        balance -= transaction1;

        System.out.println("Balance after 1st transaction = $" + balance);

        System.out.println("Please enter the amount of your second transaction");
        double transaction2 = input.nextDouble();

        balance -= transaction2;

        System.out.println("Balance after 2st transaction = $" + balance);

        System.out.println("Please enter the amount of your third transaction");
        double transaction3 = input.nextDouble();

        balance -= transaction3;

        System.out.println("Balance after 2st transaction = $" + balance);


    }
}
