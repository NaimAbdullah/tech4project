package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

        //DataType variableName = data/value;
        //DataType variableName = new DataType/className
        // creating an object

        Scanner inputReader = new Scanner(System.in);

        System.out.println("What is your address?");
        String usersAddress = inputReader.nextLine(); //variableName.methodName();

        System.out.println("The users address is = " + usersAddress);

    }
}
