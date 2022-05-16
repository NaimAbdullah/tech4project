package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(-56);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);

//        numbers.removeIf(element -> element.equals(5));
//        System.out.println(numbers.stream().filter(element -> element < 0).count());


        System.out.println(numbers);

    }
}
