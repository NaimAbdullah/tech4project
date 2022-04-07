package arrays;

import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {

        /*
        Task-1
        Create an array that will store 4 fruit names
        Then, print the empty array

        EXPECTED OUTPUT:
        [null, null, null, null]
         */

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits)); // [null, null, null, null]

        /*
        Task-2
        Store your fav fruit in the index of 0
        Store the 4th fav fruit in the index of 3
        Print the array again

        EXPECTED OUTPUT:
        [Apple, null, null, Banana]
         */

        fruits[0] = "Oranges";
        fruits[3] = "Strawberry";
        System.out.println(Arrays.toString(fruits)); // [Oranges, null, null, Strawberry]


        System.out.println(fruits.length); // 4

        System.out.println(fruits[0] + " " + fruits[3]);


    }
}
