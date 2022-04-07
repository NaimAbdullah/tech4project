package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {

        String name = ScannerHelper.getANameFromUser();

        if(name.startsWith("A") || name.startsWith("a")){
            System.out.println("You are in the club A");
        }
        else System.out.println("You are not in the club A");

        // or

        System.out.println(name.toLowerCase().startsWith("a") ? "You are in the club A" : "You are not in the club A");
    }
}
