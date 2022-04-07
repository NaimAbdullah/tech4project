package stringMethods;

import utilities.ScannerHelper;

public class PracticeFirstAndLastCharAt {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their name
        Print first char of the name with message "First character in the name is = "
        Print last char of the name with message "Last character in the name is = "
         */

        String name = ScannerHelper.getANameFromUser();

        System.out.println("First character in " + name + " is " + name.charAt(0));
        System.out.println("Last character in " + name + " is " + name.charAt(name.length() - 1));
    }
}
