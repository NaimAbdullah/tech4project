package collectionsFramework;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {

        TreeMap<String, Integer> studentAges = new TreeMap<>();
        studentAges.put("Kaly", 17);
        studentAges.put("Torrie", 20);
        studentAges.put("alona", 15);
        studentAges.put("Andrei", 25);
//        studentAges.put(null, 15); // NullPointerException
        studentAges.put("Guluzar", null);
        studentAges.put("Melda", null);
        studentAges.put("Taylor", null);
        studentAges.put("Ismail", null);

        System.out.println(studentAges);

        Hashtable<String, String> names = new Hashtable<>();
        names.put("apple", "Naim");
        names.put("banana", "Ahmad");
        names.put("cow", "Shadi");
        names.put("dog", "Rami");
        names.put("elephant", "NAim1");

        System.out.println(names);
    }
}
