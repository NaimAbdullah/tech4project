package ifElseStatements.switchStatements;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String greeting = input.nextLine();

        switch (greeting){
            case "Good morning":
                System.out.println("Then, it is morning");
                break;
            case "Good afternoon":
                System.out.println("Then, it is afternoon");
                break;
            case "Good night":
                System.out.println("Then, it is night");
                break;
            default:
                System.out.println("I should study more");
        }
    }
}
