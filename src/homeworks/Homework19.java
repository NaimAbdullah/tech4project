package homeworks;

import java.util.Arrays;

public class Homework19 {

    // Task - 1
    public static String noDigit(String str){
        return str.replaceAll("[0-9]", "");
    }

    // Task - 2
    public static String noVowel(String str){
        return str.replaceAll("[AEIOUaeiou]", "");
    }

    // Task - 3
    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i + 1));
        }
        return sum;
    }

    // Task - 4
    public static boolean hasUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))return true;
        }
        return false;
    }

    // Task - 5
    public static int middleInt(int a, int b, int c){
        if(a >= b && a <= c || a >= c && a <= b) return a;
        else if(b >= a && b <= c || b >= c && b <= a) return b;
        else return c;
    }

    // Task - 6
    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    // Task - 7
    public static int[] arrFactorial(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else {
                int fact = 1;
                for (int j = 1; j <= arr[i]; j++) {
                    fact *= j;
                }
                arr[i] = fact;
            }
        }
        return arr;
    }

    // Task - 8
    public static String[] categorizeCharacters(String str){
        String[] newArr = {"", "", ""};
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) newArr[0] += str.charAt(i);
            else if(Character.isDigit(str.charAt(i))) newArr[1] += str.charAt(i);
            else newArr[2] += str.charAt(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(noDigit("123Hello"));
        System.out.println(noVowel("JAVA"));
        System.out.println(sumOfDigits("John is 29"));
        System.out.println(hasUpperCase("joHn"));
        System.out.println(middleInt(-1, 25, 10));
        int[] arr = {13, 13, 14, 6, 7};
        System.out.println(Arrays.toString(no13(arr)));
        System.out.println(Arrays.toString(arrFactorial(arr)));
        String s = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(s)));
    }
}
