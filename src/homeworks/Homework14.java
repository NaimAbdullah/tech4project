package homeworks;

import java.util.ArrayList;

public class Homework14 {
    public static void main(String[] args) {


        System.out.println("\n--------------- TASK 1 ---------------\n");

        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        boolean firstFound = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j] && !firstFound){
                    System.out.println(numbers[i]);
                    firstFound = true;
                }
            }
        }

        if(!firstFound) System.out.println("There is no duplicates");


        System.out.println("\n--------------- TASK 2 ---------------\n");

        String[] words = {"Z", "abc", "z", "123", "#"};
//        String[] words = {"a", "xyz", "java", "A", "abc"};

        ArrayList<String> duplicate = new ArrayList<>();
        boolean firstWordFound = false;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j]) && !firstWordFound){
                    System.out.println(words[i]);
                    firstWordFound = true;
                }
            }
        }

        if(!firstWordFound) System.out.println("There are no duplicates");


        System.out.println("\n--------------- TASK 3 ---------------\n");

        int[] numbersT3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
//        int[] numbersT3 = {2, -4, 7, 50, 5, 10, 45, -7, 0};

        ArrayList<Integer> duplicateNumbers = new ArrayList<>();

        for (int i = 0; i < numbersT3.length; i++) {
            for (int j = i + 1; j < numbersT3.length; j++) {
                if(numbersT3[i] == numbersT3[j] && !duplicateNumbers.contains(numbersT3[i])){
                    System.out.println(numbersT3[i]);
                    duplicateNumbers.add(numbersT3[i]);
                }
            }
        }

        if(duplicateNumbers.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("\n--------------- TASK 4 ---------------\n");

        String[] wordsT4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
//        String[] wordsT4 = {"python", "foo", "bar", "java", "a"};

        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < wordsT4.length; i++) {
            for (int j = i + 1; j < wordsT4.length; j++) {
                if(wordsT4[i].equalsIgnoreCase(wordsT4[j]) && !duplicates.contains(wordsT4[i].toLowerCase())){
                    System.out.println(wordsT4[i]);
                    duplicates.add(wordsT4[i].toLowerCase());
                }
            }
        }

        if(duplicates.isEmpty()) System.out.println("There are no duplicates");


        System.out.println("\n--------------- TASK 5 ---------------\n");

        String[] wordsT5 = {"abc", "foo", "bar"};
//        String[] wordsT5 = {"java", "python", "ruby"};

        ArrayList<String> reverseArray = new ArrayList<>();

        for (String word : wordsT5) {
            reverseArray.add(0, word);
        }
        System.out.println(reverseArray);


        System.out.println("\n--------------- TASK 6 ---------------\n");

        String str = "Today is a fun day";

        String[] word = str.split(" ");

        String fullReverse = "";

        for (String s : word) {
            String reversedWord = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversedWord += s.charAt(i);
            }
            fullReverse += reversedWord + " ";
        }

        System.out.println(fullReverse.trim());

        System.out.println("\n--------------------\nEnd of the program!");

    }
}
