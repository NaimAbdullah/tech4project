package collection.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {

        //How to sort an array

        System.out.println("\n-------Sorting an array------\n");

        int[] numbersArray = {3, 7, 0, 4};

        System.out.println("My arrays before sort = " + Arrays.toString(numbersArray));
        Arrays.sort(numbersArray);
        System.out.println("My array after sort = " + Arrays.toString(numbersArray));


        //How to sort an ArrayList
        System.out.println("\n-------Sorting an ArrayList------\n");

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(0);
        numbersList.add(4);

        System.out.println("My list before sort = " + numbersList);

        Collections.sort(numbersList);
        System.out.println("My list after sort = " + numbersList);

    }
}