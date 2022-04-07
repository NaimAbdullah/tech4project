package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        /*
        The new trend is to have multiple students information
         */

        String[] names = {"Naim", "Ahmad", "Rami"};
        int[] ages = {22, 21, 22};
        char[] favChars = {'A', '%', '5'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        // HOW TO PRINT ARRAYS
        System.out.println(Arrays.toString(names));

        // HOW TO GET A SINGLE ELEMENT FROM ARRAY
        System.out.println(names[0]); // Naim
        System.out.println(names[1]); // Ahmad
        System.out.println(names[2]); // Rami

        // HOW TO UPDATE AN ELEMENT
        names[0] = "Naim Abdullah";
        System.out.println(Arrays.toString(names)); // [Naim Abdullah, Ahmad, Rami]

        // Naim's age is 22 and his fav char is A. His balance is 5.6, and he likes java is false.
        // For-I loop

        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + "'s age is " + ages[i] + " and his fav char is " + favChars[i] + ".");
        }

    }
}
