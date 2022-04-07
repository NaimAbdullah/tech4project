package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        System.out.println("--------------- TASK 1 ---------------");

        String str = "SDLC is step by step procedure to create an application";

        System.out.println("The length of the string is = " + str.length());
        System.out.println("The index of SDLC is = " + str.indexOf("SDLC"));
        System.out.println("The index of application is = " + str.indexOf("application"));


        System.out.println("--------------- TASK 2 ---------------");

        String str2 = " I know how to code with Python ";

        System.out.println(str2.trim().replace("Python", "java").toUpperCase());


        System.out.println("--------------- TASK 3 ---------------");

        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();

        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(str3.length()-1));


        System.out.println("--------------- TASK 4 ---------------");

        String s1 = "  TECH ";
        String s2 = " glo  ";
        String s3 = " BAL       ";
        String s4 = s1.trim() + s2.trim() + s3.trim();

        System.out.println(s4.toLowerCase().replace("t", "T").replace("g", "G"));


        System.out.println("--------------- TASK 5 ---------------");

        System.out.print("Please enter your favorite color");
        String color = ScannerHelper.getAStringFromUser();

        System.out.println("First character is = " + color.charAt(0));
        System.out.println("Last character is = " + color.charAt(color.length() - 1));
        System.out.println("First 3 characters are = " + color.substring(0, 3));
        System.out.println("Last 3 characters are = " + color.substring(color.length() - 3));


        System.out.println("--------------- TASK 6 ---------------");

        System.out.print("Please enter a full sentence");
        String sentence = ScannerHelper.getAStringFromUser().toLowerCase().trim();

        System.out.println("First word is = " + sentence.substring(0, sentence.indexOf(' ')));
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ') + 1));


        System.out.println("--------------- TASK 7 ---------------");

        System.out.print("Please enter a sentence");
        String sentence2 = ScannerHelper.getAStringFromUser();

        if(sentence2.contains("$")){
            System.out.println("This sentence contains $ character\n" + "$ character index is = " + sentence2.indexOf('$'));
        }
        else System.out.println("This sentence does not contain $ character");

    }
}
