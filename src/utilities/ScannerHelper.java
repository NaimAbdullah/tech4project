package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        return num1;
    }

    public static String getANameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scanner.nextLine();
        return name;
    }

    public static String getAStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(":");
        String string = scanner.nextLine();
        return string;
    }

    public static String getAnAddressFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an address");
        String string = scanner.nextLine();
        return string;
    }
}
