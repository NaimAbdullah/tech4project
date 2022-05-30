package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework20 {

    // Task - 1
    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }


    // Task - 2
    public static List<Integer> noZero(ArrayList<Integer> arr){
        ArrayList<Integer> newArr = new ArrayList<>();

        for (Integer number : arr) {
            if(number != 0) newArr.add(number);
        }
        return newArr;
    }


    // Task - 3
    public static int[][] numberAndSquare(int[] arr){
        int[][] squaredArr = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            squaredArr[i][0] = arr[i];
            squaredArr[i][1] = arr[i] * arr[i];
        }
        return squaredArr;
    }


    // Task - 4
    public static boolean containsValue(String[] arr, String str){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, str) >= 0;
    }


    // Task - 5
    public static String reverseSentence(String str){
        String newStr = "";
        if(str.trim().contains(" ")){
            String[] allWords = str.split(" ");
            for (int i = allWords.length - 1; i >= 0; i--) {
                newStr += allWords[i] + " ";
            }
        }else newStr += "There is not enough words!";
        return newStr.substring(0, 1).toUpperCase() + newStr.substring(1).toLowerCase().trim();
    }


    // Task - 6
    public static String removeStringSpecialsDigit(String str){
        return str.replaceAll("[^a-zA-Z ]", "");
    }


    // Task - 7
    public static String[] removeArraySpecialsDigits(String[] arr){
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i].replaceAll("[^a-zA-Z ]", "");
        }
        return newArr;
    }


    // Task - 8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> arr = new ArrayList<>();
        for (String s : list1) {
            for (String value : list2) {
                if (!arr.contains(s) && s.equals(value))
                    arr.add(s);
            }
        }
        return arr;
    }


    // Task - 9
    public static ArrayList<String> noXInVariables(ArrayList<String> arr){
        ArrayList<String> newArr = new ArrayList<>();
        for (String element : arr) {
            newArr.add(element.replaceAll("[xX]", ""));
        }
        newArr.removeIf(String::isEmpty);
        return newArr;
    }


    // Testing Methods
    public static void main(String[] args) {
        System.out.println(hasLowerCase("Java"));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(2);
        System.out.println(noZero(arr));

        int[] arr3 = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(arr3)));

        String[] arr4 = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue(arr4, "abc"));

        System.out.println(reverseSentence("Hello there how are you"));
        System.out.println(removeStringSpecialsDigit("123Java #$%is fun"));
        String[] arr5 = {"123java", "$^%#@is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr5)));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("is");
        list1.add("fun");
        list1.add("C#");
        list1.add("C#");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Python");
        list2.add("C#");
        list2.add("Java");
        list2.add("fun");
        list2.add("Cat");
        list2.add("Dog");
        System.out.println(removeAndReturnCommons(list1, list2));

        ArrayList<String> noX = new ArrayList<>();
        noX.add("xyz");
        noX.add("123x");
        noX.add("xXx");
        noX.add("XXxXxX7");
        System.out.println(noXInVariables(noX));

    }
}
