package homeworks;

import projects.Project07;
import utilities.*;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {


        System.out.println("\n--------------- TASK 1 ---------------\n");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("FooBar");
            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 5 == 0) {
                System.out.println("Bar");
            } else System.out.println(i);
        }


        System.out.println("\n--------------- TASK 2 ---------------\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean isFirstPositive = false;
        boolean isFirstNegative = false;
        int neg = 0, pos = 0;

        for (int number : numbers) {
            if (number < 0 && !isFirstNegative) {
                isFirstNegative = true;
                neg = number;
            } else if (number > 0 && !isFirstPositive) {
                isFirstPositive = true;
                pos = number;
            }
            if (isFirstNegative && isFirstPositive) break;
        }

        System.out.println("First positive number is: " + pos);
        System.out.println("First negative number is: " + neg);

        if (!isFirstNegative) System.out.println("There are no negatives in this array");
        if (!isFirstPositive) System.out.println("There are no positives in this array");


        System.out.println("\n--------------- TASK 3 ---------------\n");

        int[] randomNumbers = new int[5];

        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = RandomNumberGenerator.getRandomNumber(1, 10);
        }

        System.out.println(Arrays.toString(randomNumbers));

        boolean contains2Or3 = false;

        for (int number : randomNumbers) {
            if (number == 2 || number == 3) {
                contains2Or3 = true;
                break;
            }
        }
        System.out.println(contains2Or3);


        System.out.println("\n--------------- TASK 4 ---------------\n");

        String[] list = {"banana", "orange", "Apple"};

        boolean isEqualApple = false;

        for (String element : list) {
            if (element.equalsIgnoreCase("apple")) {
                isEqualApple = true;
                break;
            }
        }
        System.out.println(isEqualApple);


        System.out.println("\n--------------- TASK 5 ---------------\n");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean matching = false;

        for (int number1 : numbers1) {
            for (int number2 : numbers2) {
                if (number1 == number2) {
                    matching = true;
                    System.out.println(number1);
                }
            }
        }
        if (!matching) System.out.println("There is no matching elements");


        System.out.println("\n---------- TASK-6 ----------\n");

        String str = "baNana";

        String[] letters = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            letters[i] = String.valueOf(str.charAt(i));
        }

        String duplicate = "";

        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i].equalsIgnoreCase(letters[j]) && !duplicate.contains(letters[i])) {
                    System.out.println(letters[i]);
                    duplicate += letters[i];
                }
            }
        }
        System.out.println("\nEnd of the program!");

    }
}
