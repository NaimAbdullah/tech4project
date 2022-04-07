package ifElseStatements.ifElseIfStatment;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are old enough to drive!");
        }
        else{
            System.out.println("You are not old enough to drive");
        }

        System.out.println("Please enter you weight");
        double weight = input.nextDouble();

        if(weight > 150){
            System.out.println("You are heavier than 150 lb");
        }
        else{
            System.out.println("You are lighter than 150 lb");
        }
    }
}
