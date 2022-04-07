package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {


        System.out.println("--------------- TASK 1 ---------------");

        String name = ScannerHelper.getANameFromUser();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length() - 3));

        if(name.toLowerCase().charAt(0) == 'a'){
            System.out.println("You are in the club!");
        }
        else System.out.println("You are not in the club!");


        System.out.println("--------------- TASK 2 ---------------");

        String address = ScannerHelper.getAnAddressFromUser();

        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club!");
        else if(address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join the club!");
        else System.out.println("Sorry, you will never be in the club");


        System.out.println("--------------- TASK 3 ---------------");

        System.out.print("Please enter 4 of your favorite colors");
        String color = ScannerHelper.getAStringFromUser();

        if(color.toLowerCase().contains("red") || color.toLowerCase().contains("green")){
            if(color.toLowerCase().contains("red") && !color.toLowerCase().contains("green")){
                System.out.println("Red is in the list");
            }
            else if(color.toLowerCase().contains("green") && !color.toLowerCase().contains("red")){
                System.out.println("Green is in the list");
            }
            else System.out.println("Green and red are in the list");
        }
        else System.out.println("Green and red are not in the list");


        System.out.println("--------------- TASK 4 ---------------");

        String str = "  Java is FUN  ";

        System.out.println("The first word in the str is = " + str.trim().toLowerCase().substring(0,4));
        System.out.println("The second word in the str is = " + str.trim().toLowerCase().substring(5,7));
        System.out.println("The third word in the str is = " + str.trim().toLowerCase().substring(8));


        System.out.println("END OF PROGRAM!");
    }
}
