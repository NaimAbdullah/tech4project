package homeworks;

import utilities.StringHelper;

public class Homework10 {
    public static void main(String[] args) {


        System.out.println("\n--------------- TASK 1 ---------------\n");

        String sT1 = "JavaScript";

        if(sT1.length() >= 1){
            System.out.println("Length is = " + sT1.length());
            System.out.println("First char is = " + sT1.charAt(0));
            System.out.println("Last char is = " + sT1.charAt(sT1.length()-1));
            sT1.toLowerCase();
            if(sT1.contains("a") || sT1.contains("e") || sT1.contains("i") || sT1.contains("o") ||
                    sT1.contains("u")){
                System.out.println("This String has a vowel");
            }
            else System.out.println("This String does not have a vowel");
        }
        else System.out.println("Length is zero");

        System.out.println();


        System.out.println("\n--------------- TASK 2 ---------------\n");

        String sT2 = "Civic";

        if(sT2.length() >= 3){
            System.out.println(StringHelper.getMiddle(sT2));
        }
        else System.out.println("Length is less than 3");

        System.out.println();


        System.out.println("\n--------------- TASK 3 ---------------\n");

        String sT3 = "Java";

        if(sT3.length() >= 4){
            System.out.println("First 2 characters are = " + sT3.substring(0, 2));
            System.out.println("Last 2 characters are = " + sT3.substring(sT3.length()-2));
            System.out.println("The other characters are = " + sT3.substring(2, sT3.length()-2));
        }
        else System.out.println("INVALID INPUT");

        System.out.println();


        System.out.println("\n--------------- TASK 4 ---------------\n");

        String sT4 = "xy";

        if(sT4.length() >= 2){
            if(sT4.substring(0, 2).equals(sT4.substring(sT4.length()-2))){
                System.out.println("True");
            }
            else System.out.println("False");
        }
        else System.out.println("Length is less than 2");

        System.out.println();


        System.out.println("\n--------------- TASK 5 ---------------\n");

        String sT5_1 = "123456";
        String sT5_2 = "Blue";

        if(sT5_1.length() >= 2 && sT5_2.length() >= 2){
            System.out.println(sT5_1.substring(1, sT5_1.length()-1) + sT5_2.substring(1, sT5_2.length()-1));
        }
        else System.out.println("INVALID INPUT");

        System.out.println();


        System.out.println("\n--------------- TASK 6 ---------------\n");

        String sT6 = "xxBluexx";

        if(sT6.length() >= 4){
            if(sT6.substring(0, 2).equals("xx") && sT6.substring(sT6.length()-2).equals("xx")){
                System.out.println("True");
            }
            else System.out.println("False");
        }
        else System.out.println("INVALID INPUT");

        System.out.println("\nEnd Of Program!");

    }
}