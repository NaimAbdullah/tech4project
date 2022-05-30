import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StudentMentoring {

    // Task 1 : Write a method that takes a String and returns a new String with each word reversed
    public static String reversedEachWord(String str){
        StringBuilder newStr = new StringBuilder();
        for (String word : str.split(" ")) {
            for (int i = word.length()-1; i >= 0; i--) {
                newStr.append(word.charAt(i));
            }
            newStr.append(" ");
        }
        return newStr.toString().trim();
    }


    // Task 2: Write a method that takes 2 Strings and returns a boolean to checks if the two strings are Anagrams
    public static boolean isAnagram(String str1, String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }


    // Task 3: Write a method that takes a String and returns a new String with the first and last characters replaced
    public static String replaceFirstAndLast(String str){
        String newStr = str.trim();

        if(str.trim().length() < 2) return "";
        else{
        return newStr.charAt(newStr.length()-1) + newStr.substring(1, newStr.length()-1) + newStr.charAt(0);
        }
    }


    // Task 4: Write a method that takes 2 int values and returns a List of all Prime numbers between those 2 numbers
    public static List<Integer> findPrimes(int start, int end){
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i < end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i != 1) primes.add(i);
        }
        return primes;
    }


    // Task 5: Write a method that takes an int[] and returns a new Array with all duplicate numbers removed
    public static int[] removeDuplicateNumbers(int[] numbers){
        HashSet<Integer> uniques = new HashSet<>();
        for (int i : numbers) {
            uniques.add(i);
        }
        int[] arr = new int[uniques.size()];
        int index = 0;
        for (Integer number : uniques) {
            arr[index++] = number;
        }
        return arr;
    }

    // Testing Methods
    public static void main(String[] args) {

        System.out.println(reversedEachWord("Java is very fun"));
        System.out.println(isAnagram("State", "taste"));
        System.out.println(replaceFirstAndLast("Java is fun"));
        System.out.println(findPrimes(1, 100));
        int[] nums = {1, 2, 2, 3, 3, 5, 6, 7, 7};
        System.out.println(Arrays.toString(removeDuplicateNumbers(nums)));
    }
}
