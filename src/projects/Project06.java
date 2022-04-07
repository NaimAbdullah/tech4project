package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n--------------- TASK 1 ---------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine().trim();

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        if (!sentence.contains(" ")) {
            System.out.println("This sentence does not have multiple words");
        } else System.out.println("This sentence has " + (count + 1) + " words.");


        System.out.println("\n--------------- TASK 2 ---------------\n");

        System.out.println("Please enter a word:");
        String word = input.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.length() >= 1) {
            if (word.equals(reverse)) {
                System.out.println("This word is a palindrome");
            } else {
                System.out.println("This word is not a palindrome");
            }
        } else System.out.println("This word does not have 1 or more characters");


        System.out.println("\n--------------- TASK 3 ---------------\n");

        System.out.println("Please enter a sentence:");
        String sentence2 = input.nextLine().toLowerCase();

        int aCount = 0;

        for (int i = 0; i < sentence2.length(); i++) {
            if(sentence2.charAt(i) == 'a'){
                aCount++;
            }
        }
        if(sentence2.length() == 0){
            System.out.println("This sentence does not have any characters");
        }
        else System.out.println("This sentence has " + aCount + " a or A letters.");


        System.out.println("\n--------------- TASK 4 ---------------\n");

        int num = ScannerHelper.getNumberFromUser();

        for (int i = 1; i <= num; i++) {
            if(i % 2 == 0 && i % 3 == 0){
                System.out.println("FooBar");
            }
            else if(i % 2 == 0) System.out.println("Foo");
            else if(i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
}
