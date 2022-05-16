package homeworks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HomeworkR4 {

    // Task - 1
    public static String noSpace(String str){
        return str.replace(" ", "");
    }

    // Task - 2
    public static String replaceFirstLast(String str){
        String newStr = str.trim();
        if(str.trim().length() < 2) return "";
        else{
           return newStr.charAt(str.trim().length()-1) + newStr.substring(1, str.trim().length()-1) + newStr.charAt(0);
        }
    }

    // Task - 3
    public static boolean hasVowel(String str){
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        }
        return false;
    }

    // Task - 4
    public static void checkAge(int a){
        int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        int age = currentYear - a;

        if(age > 100 || a > currentYear) System.out.println("AGE IS NOT VALID");
        else if(age >= 16) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT ALLOWED");
    }

    // Task - 5
    public static int averageOfEdge(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

    // Task - 6
    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) arr[i] = "###";
        }
        return arr;
    }

    // Task - 7
    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 15 == 0) arr[i] = 101;
            else if(arr[i] % 5 == 0) arr[i] = 99;
            else if(arr[i] % 3 == 0) arr[i] = 100;
        }
        return arr;
    }

    // Task - 8
    public static int countPrimes(int[] arr){
        int count = 0;
        for (int a : arr) {
            int  countInside = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && a != 1) {
                    countInside++;
                }
            }
            if(countInside == 2) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(noSpace("   Hello World   "));
        System.out.println(replaceFirstLast("     Hello World    "));
        System.out.println(hasVowel("ABCD"));
        checkAge(2006);
        System.out.println(averageOfEdge(-2, -2, 10));

        String[] arr = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr)));
        int[] arr2 = { 7, 4, 11, 23, 17};
        System.out.println(countPrimes(arr2));

    }
}
