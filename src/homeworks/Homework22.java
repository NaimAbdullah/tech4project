package homeworks;

import java.util.*;

public class Homework22 {

    // Task - 1
    public static int[] fibonacciSeries1(int n) {
        // 0 1 1 2 3 5
        int a0 = 0, a1 = 1, a2 = 0;
        int[] newArr = new int[n];
        for (int i = 1; i < n; i++) {
            newArr[0] = 0;
            newArr[1]= 1;
            newArr[i] = a2;
            a2 = a0 + a1;
            a0 = a1;
            a1 = a2;
        }
        return newArr;
    }


    // Task - 2
    public static int fibonacciSeries2(int n){
//        if (a == 1 || a == 2) return 1;
//        return fibonacciSeries2(a - 1) + fibonacciSeries2(a - 2);

            int[] array = new int[n];
            int zero = 0, one = 1, sum;
            for(int i = 0; i <= array.length-1; i++){
                if(i == 0) array[0] = 0;
                else if (i == 1) array[1] = 1;
                else
                    array[i] += zero;
                sum = zero + one;
                zero = one;
                one = sum;
            }
            return array[array.length-1];
    }

    // Task - 3
    public static int[] findUniques(int[] num1, int[] num2) {
        Set<Integer> uncommon = new HashSet<>();
        List<Integer> common = new ArrayList<>();
        for (int i1 : num1) for (int i2 : num2) if (i1 == i2) common.add(i1);
        for (int i : num1) if (!common.contains(i)) uncommon.add(i);
        for (int i : num2) if (!common.contains(i)) uncommon.add(i);

        int[] uniques = new int[uncommon.size()];
        int index = 0;
        for (Integer uncommons : uncommon) uniques[index++] = uncommons;
        return uniques;
    }


    // Task - 4
    public static boolean isPowerOf3(int a){
        if (a < 3) return 3 % a == 0;
        else return a % 3 == 0;
    }


    // Task - 5
    public static int firstDuplicate(int[] array) {
        if (array.length <= 1) return -1;
        else {
            int[] arr = new int[array.length];
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == array[i + 1]) {
                    arr[i] = array[i];
                }
                Arrays.sort(arr);
            }
            return arr[arr.length - 1];
        }
    }


    public static void main(String[] args) {

        System.out.println("\n----Task 1----");
        System.out.println(Arrays.toString(fibonacciSeries1(4)));

        System.out.println("\n----Task 2----");
        System.out.println(fibonacciSeries2(8));

        System.out.println("\n----Task 3----");
        int[] arr1 = {};
        int[] arr2 = {};
        System.out.println(Arrays.toString(findUniques(arr1, arr2)));

        System.out.println("\n----Task 4----");
        System.out.println(isPowerOf3(9));

        System.out.println("\n----Task 5----");
        int[] nums = {1, 2, 2, 3};
        System.out.println(firstDuplicate(nums));

    }
}
