package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeSubString {
    public static void main(String[] args) {

        String sentence = ScannerHelper.getAStringFromUser();

        String word1 = "" + sentence.substring(0, sentence.indexOf(' '));
        String word2 = "" + sentence.substring(sentence.lastIndexOf(' ') + 1);

        System.out.println("The first word is = '" + word1 + "'");
        System.out.println("The last word is = '" + word2 + "'");
    }
}
