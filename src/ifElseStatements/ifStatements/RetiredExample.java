package ifElseStatements.ifStatements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter their age
        And print "It is your time to get retired!" if their age is more than or equal to 55
        NOTE: Write PSEUDO CODE first

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 60

        Program: It is your time to get retired!

        EXAMPLE PROGRAM 1
        Program: Please enter your age?
        User: 45

        Program:

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = input.nextInt();

        boolean ifOlder55 = age >= 55;

        if(ifOlder55){
            System.out.println("It is time to get retired");
        }
        else{
            System.out.println("Time to work buddy!!");
        }
    }
}
