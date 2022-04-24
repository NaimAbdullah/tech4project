package collectionsFramework;

import java.util.LinkedHashMap;

public class Exercise03_count_each_character_in_string {
    public static void main(String[] args) {

        String word = "Chicago is a nice city";

        /*
        Count each character

         */

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for(Character c: word.toCharArray()){
            if(!charCount.containsKey(c)) charCount.put(c, 1);
            else charCount.put(c, charCount.get(c) + 1);
        }

        System.out.println(charCount);
    }
}
