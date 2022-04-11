package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework16 {

    // Task 1
    public static int countWords(String str){
        int spaceCount = 1;
        if(str.trim().isEmpty()) return 0;
        else {
            for (int i = 0; i < str.trim().length(); i++) {
                if(Character.isSpaceChar(str.charAt(i))) spaceCount++;
            }
        }
        return spaceCount;
    }


    // Task 2
    public static int countA(String str){
        int countA = 0;
            for (int i = 0; i < str.trim().length(); i++) {
                if(str.toLowerCase().charAt(i) == 'a') countA++;
            }
        return countA;
    }


    // Task 3
    public static int countPos(ArrayList<Integer> numbers){
        int posCount = 0;
        for (Integer number : numbers) {
            if(number > 0) posCount++;
        }
        return posCount;
    }


    // Task 4
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (Integer number : numbers) {
            if(!noDuplicates.contains(number)) noDuplicates.add(number);
        }
        return noDuplicates;
    }


    //Task 5
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){
        ArrayList<String> noDuplicates = new ArrayList<>();
        for (String element : str) {
            if(!noDuplicates.contains(element)) noDuplicates.add(element);
        }
        return noDuplicates;
    }


     // Task 6
    public static String removeExtraSpaces(String str){
        String[] split = str.trim().split(" ");
        String newString = "";
        for (String element : split) {
            if(!element.isEmpty()) newString += element + " ";
        }
        return newString.trim();
    }


    //Task 7
    public static int[] add(int[] arr1, int[] arr2){
     int[] sumArr;
     if(arr1.length >= arr2.length) sumArr = arr1;
     else sumArr = arr2;
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
        sumArr[i] = arr1[i] + arr2[i];
        }
        return sumArr;
    }


    // Task 8
    public static int findClosestTo10(int[] arr){
        Arrays.sort(arr);
        int farLeft = Integer.MIN_VALUE;
        int farRight = Integer.MAX_VALUE;

        for(int number : arr){
            if(number < 10 && number > farLeft) farLeft = number;
            else if(number > 10 && number < farRight) farRight = number;
        }
        if(10 - farLeft > farRight - 10) return farRight;
        return farLeft;
    }

    // Testing Methods
    public static void main(String[] args) {
        System.out.println("\n-------Task-1-------\n");
        System.out.println(countWords(""));

        System.out.println("\n-------Task-2-------\n");
        System.out.println(countA("QA stands for quality assurance"));

        System.out.println("\n-------Task-3-------\n");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-45);
        numbers.add(0);
        numbers.add(0);
        numbers.add(34);
        numbers.add(5);
        numbers.add(67);
        System.out.println(countPos(numbers));

        System.out.println("\n-------Task-4-------\n");
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(35);
        numbersList.add(20);
        numbersList.add(35);
        numbersList.add(60);
        numbersList.add(70);
        numbersList.add(60);

        System.out.println(removeDuplicateNumbers(numbersList));

        System.out.println("\n-------Task-5-------\n");
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("C#");
        words.add("ruby");
        words.add("JAVA");
        words.add("ruby");
        words.add("C#");
        words.add("C++");

        System.out.println(removeDuplicateElements(words));

        System.out.println("\n-------Task-6-------\n");
        System.out.println(removeExtraSpaces("    I am    learning     java    "));

        System.out.println("\n-------Task-7-------\n");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};

        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("\n-------Task-8-------\n");
        int[] numbers10 = {10, -13, 12, 8, 70, 15, 57};
        System.out.println(findClosestTo10(numbers10));

    }
}
