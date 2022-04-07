package methods;

import projects.Project07;
import utilities.MathHelper;

import java.util.Arrays;

public class TestingArrayMethods {
    public static void main(String[] args) {


        System.out.println("\n--------Task-1--------\n");

        int[] numbers = {10, 7, 7, 10, -3, 10, -3};

        Project07.findGreatestAndSmallestWithSort(numbers);


        System.out.println("\n--------Task-2--------\n");

        Project07.findGreatestAndSmallest(numbers);

        int[] number = {10, 5, 6, 7, 8, 5, 15, 15};

//        Arrays.sort(number);
        System.out.println("number = " + Arrays.toString(number));


        System.out.println("\n--------Task-3--------\n");
        Project07.findSecondGreatestAndSmallestWithSort(number);


        System.out.println("\n--------Task-4--------\n");
        Project07.findSecondGreatestAndSmallest(number);


        System.out.println("\n--------Task-5--------\n");
        String[] words = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz", "bar"};

        Project07.findDuplicatedElementsInAnArray(words);


        System.out.println("\n--------Task-6--------\n");
        String[] word = {"pen", "word", "word", "pen", "word", "word", "pen", "eraser"};

        Project07.findMostRepeatedElementInAnArray(word);

    }
}
