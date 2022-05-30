import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practice {

    // Question 1
    public static String reverseEachWord1(String str){
        StringBuilder newStr = new StringBuilder();
        for(String word : str.split(" ")){
            for (int i = word.length() - 1; i >= 0; i--) {
                newStr.append(word.charAt(i));
            }
            newStr.append(" ");
        }
        return newStr.toString().trim();
    }
//        System.out.println(reverseEachWord1("Java is very fun"));


    // Question 2
    public static boolean isAnagram1(String str1, String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }


    // Question 3
    public static String replaceFirstLast1(String str){
        String newStr = str.trim();
        if(str.trim().length() < 2) return "";
        else{
            return newStr.charAt(str.trim().length()-1) + newStr.substring(1, str.trim().length()-1) + newStr.charAt(0);
        }
    }


    // Question 4
    public static List<Integer> findPrimes1(int start, int end){
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i < end; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime && i != 1) primes.add(i);
        }
        return primes;
    }

    // Question 5
    public static int[] removeDuplicateNumbers1(int[] numbers){
        HashSet<Integer> uniques = new HashSet<>();
        for(int i : numbers) uniques.add(i);

        int[] arr = new int[uniques.size()];

        int index = 0;
        for(int i : uniques) arr[index++] = i;

        return arr;
    }


    public static void main(String[] args) {

        System.out.println(reverseEachWord1("Java is very fun"));
        System.out.println(isAnagram1("state", "taste"));
        //dusty study
        System.out.println(replaceFirstLast1("naim is amazing    "));
        System.out.println(findPrimes1(1, 100));
        int[] numbers = {1, 2, 2, 3, 5, 6, 6, 30};
        System.out.println(Arrays.toString(removeDuplicateNumbers1(numbers)));
    }
}
