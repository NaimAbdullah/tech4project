package projects;

import java.util.Arrays;

public class Project07 {

    // Task - 1
    public static void findGreatestAndSmallestWithSort(int[] num){
        Arrays.sort(num);
        System.out.println("Smallest = " + num[0]);
        System.out.println("Greatest = " + num[num.length - 1]);
    }

    // Task - 2
    public static void findGreatestAndSmallest(int[] num){
        int min = num[0], max = num[0];

        for(int i = 0; i < num.length; i++){
                if(num[i] < min){
                    min = num[i];
                }
                if(num[i] > max){
                    max = num[i];
                }
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    // Task - 3
    public static void findSecondGreatestAndSmallestWithSort(int[] num){
        Arrays.sort(num);
        int min = num[0], secondMin = num[1];
        int max = num[num.length-1], secondMax = num[num.length-2];

        for (int number : num) {
            if(min != number){
                secondMin = number;
                break;
            }
        }
        for (int number : num) {
            if(max != number){
                secondMax = number;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }

    // Task - 4
    public static void findSecondGreatestAndSmallest(int[] num){
        int min = Math.min(num[0], num[1]), secondMin = Math.max(num[0], num[1]);
        int max = Math.max(num[num.length-1], num[num.length - 2]), secondMax = Math.min(num[num.length-1], num[num.length - 2]);

        for (int number : num) {
            if(min != number){
                secondMin = number;
                break;
            }
        }
        for (int number : num) {
            if(max != number){
                secondMax = number;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }

    // Task - 5
    public static void findDuplicatedElementsInAnArray(String[] words){
        String duplicate = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j]) && !duplicate.contains(words[i])){
                    System.out.println(words[i]);
                    duplicate += words[i];
                }
            }
        }
    }

    // Task - 6
    public static void findMostRepeatedElementInAnArray(String[] words){
        String element = "";
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String tempElement = words[i];
            int tempCount = 0;
            for (int j = 0; j < words.length; j++) {
                if(words[j].equals(tempElement)) tempCount++;
                if(tempCount > count){
                    element = tempElement;
                    count = tempCount;
                }
            }
        }
        System.out.println(element);
    }
}
