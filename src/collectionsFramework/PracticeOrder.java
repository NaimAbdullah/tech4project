package collectionsFramework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class PracticeOrder {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(16);
        numbers.add(6);
        numbers.add(6);
        numbers.add(5);

        Thread.sleep(2000);
        // Before removing duplicates
        System.out.println(numbers);

        HashSet<Integer> noDuplicates = new HashSet<>(numbers);

        // After removing duplicates
        System.out.println(noDuplicates);

        //Order the numbers
        TreeSet<Integer> orderedNum = new TreeSet<>(numbers);

        System.out.println(orderedNum);

        int age = 6;

        try{

            int[] nums = {1, 2, 3, 4};
        System.out.println(nums[7]);

        }
        finally{
            System.out.println("There was an error! Try again!");
        }

        System.out.println("hello");

    }
}
