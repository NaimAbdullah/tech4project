package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {

        /*
        Write a program that reads a name from user
        Reverse the name and print it back

        Test data:
        Kaly

        Expected output:
        ylaK

        Test data:
        Abraham

        Expected output:
        maharbA
         */

        String name = ScannerHelper.getANameFromUser();

        String reversedName = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }
        System.out.println("The reverse name is = " + reversedName);
        System.out.println("The reverse name in uppercase is = " + reversedName.toUpperCase());
    }
}
