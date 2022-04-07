package arrays;

import projects.Project07;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};

        System.out.println("My array is = " + Arrays.toString(numbers));

        // Sort this array in ascending order [-5, 0, 0, 0, 3, 7, 9, 10]

        Arrays.sort(numbers);
        System.out.println("The sorted array is = " + Arrays.toString(numbers));

        System.out.println("\n-------Sorting Characters-----\n");
        char[] c = {'A', 'b', 'z', 'H'};

        System.out.println("My character array is = " + Arrays.toString(c));

        Arrays.sort(c);
        System.out.println("My character array sorted is = " + Arrays.toString(c));


        System.out.println("\n-------Sorting words-----\n");
        String[] names = {"Adam", "Adame", "Alex", "tom", "ally", "Josh", "Adele", "terry"};

        System.out.println("My names array is = " + Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase().charAt(0) + names[i].toLowerCase().substring(1);
        }

        //Lexicographically - Alphabetical

        Arrays.sort(names);
        System.out.println("My names array sorted is = " + Arrays.toString(names));

        System.out.println();

    }
}
