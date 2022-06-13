import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test {

//    Write a method that takes an array of String and returns the count of each unique element in the array as a Map
//    Test Data:
//            [“Apple”, “Apple”, “Orange”, “Apple”, “Kiwi”]
//    Expected:
//    {Apple=3, Orange=1, Kiwi=1}

    public static LinkedHashMap<String, Integer> countUniques (String[] arr){
        LinkedHashMap<String, Integer> uniques = new LinkedHashMap<>();

        for (String element : arr) {
            if(!uniques.containsKey(element)) uniques.put(element, 1);
            else uniques.put(element, uniques.get(element) + 1);
        }
        return uniques;
    }

    public static void main(String[] args) {
        String [] arr = {"Apple", "Apple", "Orange", "Apple", "Kiwi"};
        System.out.println(countUniques(arr));
    }
}
