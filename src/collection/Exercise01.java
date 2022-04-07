package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {


                /*
        Create a list to store below data
        cities

        Berlin
        Chicago
        Dallas
        Miami
        Brugge
        Kiev

        Print the list
        Then, remove Miami and Dallas
        Print the list again

        RESULT:
        [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        [Berlin, Chicago, Brugge, Kiev]
         */

        String[] cities1 = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        LinkedList<String> cities2 = new LinkedList<>(Arrays.asList(cities1));

        System.out.println(cities2);

        cities2.remove("Miami");
        cities2.remove("Dallas");

        System.out.println(cities1);
    }
}
