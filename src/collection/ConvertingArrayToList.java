package collection;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        /*
        Create a List and store below data - countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your list

        RESULT:
        [USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
         */

        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};

        System.out.println("\n----------First way to convert to a list-----------\n");
        // Way - 1 to convert an Array to List (ArrayList or LinkedList)

        List<String> countries1 = new LinkedList<>(Arrays.asList(countries));
        List<String> countries2 = new ArrayList<>(Arrays.asList(countries));

        System.out.println(countries1);
        System.out.println(countries2);

        System.out.println("\n----------Second way to convert to a list-----------\n");

        // Way - 2 to convert an Array to List (ArrayList or LinkedList)

        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries); // Adds all Array elements to the list collection
        Collections.addAll(countries4, countries); // Adds all Array elements to the list collection

        System.out.println(countries3);
        System.out.println(countries4);

        System.out.println("\n----------Third way to convert to a list-----------\n");

        // Way - 3 to convert an Array to List (ArrayList or LinkedList)

        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new ArrayList<>();

        for (int integer : numbers) {
            numbersList.add(integer);
        }

        System.out.println(numbersList);


    }
}
