package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {


        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        System.out.println("\n----------Task-1----------\n");

        boolean mouse = false;

        for (String object : objects) {
            if(object.equalsIgnoreCase("mouse")){
                mouse = true;
                break;
            }
        }
        System.out.println(mouse);


        System.out.println("\n----------Task-2----------\n");

        boolean board = false;

        for (String object : objects) {
            if(object.equalsIgnoreCase("board")){
                board = true;
                break;
            }
        }
        System.out.println(board);


        System.out.println("\n----------Task-3----------\n");

        Arrays.sort(objects);

        System.out.println(Arrays.binarySearch(objects, "Phone"));


        System.out.println("\n----------Task-4----------\n");

        int[] numbers = {5, -2, 0, -7, 0, 5, 8, 45, 53};

        System.out.println(Arrays.binarySearch(numbers, 5) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 0) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 45) >= 0);
        System.out.println(Arrays.binarySearch(numbers, 3) >= 0);
        System.out.println(Arrays.binarySearch(numbers, -7) >= 0);

    }
}
