package ifElseStatements.ifElseStatements;

import java.util.Scanner;
public class Between0And100 {
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int num1 = input.nextInt();

        boolean between0_100 = num1 >= 0 && num1 <= 100;

        if(between0_100){
            System.out.println("It is between 0 and 100");
        }else{
            System.out.println("It is not between 0 and 100");
        }
    }
}
