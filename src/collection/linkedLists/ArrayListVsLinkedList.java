package collection.linkedLists;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();

        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);

        System.out.println("\n-------Looping LinkedList---------");

        for (Double d : numbers) {
            System.out.println(d);
        }

        System.out.println("\n-------Some methods of LinkedList-------");

        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); // 17.7

        System.out.println("\n-------Some additional methods of LinkedList-------");
        System.out.println(numbers.peek()); // getFirst() 10.5
        System.out.println(numbers.peekFirst()); // getFirst() 10.5
        System.out.println(numbers.peekLast()); // getLast() 17.7

        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]

        System.out.println("\n-----------------");

        System.out.println(numbers.poll()); // pulls out first element and removes it
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast()); // pulls out last element and removes it
        System.out.println(numbers);

        System.out.println("\n-----------------"); // 12.5

        numbers.push(5.7); // adds the object to the first position
        System.out.println(numbers); // [5.7, 12.5]
        numbers.push(8.9); // adds the object to the first position
        System.out.println(numbers);// [8.9, 5.7, 12.5]

        System.out.println(numbers.pop()); // removes the object from the beginning
        System.out.println(numbers); // [5.7, 13.3]
    }
}
