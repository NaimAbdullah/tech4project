package collection.arrayLists;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers.size()); // 3
        System.out.println(numbers); // [5, 7, 10]

        /*
        5
        7
        10
         */
        

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }

    }
}
