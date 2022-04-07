package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        System.out.println("\n-------Task-1------\n");

        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};

        System.out.println("Unsorted array is = " + Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("Sorted array is = " + Arrays.toString(students));


        System.out.println("\n-------Task-2------\n");

        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length-1]);


        System.out.println("\n-------Task-3------\n");

        int count = 0;

        for(String element : students){
            if(element.startsWith("A")) count++;
        }
        System.out.println(count);


        System.out.println("\n-------Task-4------\n");

        count = 0;

        for (String element : students) {
            if(element.toUpperCase().contains("A") || element.toUpperCase().contains("E")){
                count++;
            }
        }
        System.out.println(count);


        System.out.println("\n-------Task-5------\n");

        count = 0;

        for (String element : students) {
            if(element.length() >= 5) count++;
        }
        System.out.println(count);


        System.out.println("\n-------Task-6------\n");

        boolean containJennifer = false;

        for (String element : students) {
            if(element.equalsIgnoreCase("Jennifer")){
                containJennifer = true;
                break;
            }
        }
        System.out.println(containJennifer);
    }
}
