package arrays;

import utilities.MathHelper;

import java.util.Arrays;

public class _03_Practice_int_Arrays {
    public static void main(String[] args) {

        System.out.println("\n-------Task-1------\n");

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted = " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));


        System.out.println("\n-------Task-2------\n");

        int countP = 0;
        int countN = 0;
        int countZ = 0;

        for (int number : numbers) {
            if(MathHelper.isPositive(number)){
                countP++;
            }
            else if(MathHelper.isZero(number)) countZ++;
            else countN++;
        }
        System.out.println("Positives = " + countP);
        System.out.println("Negatives = " + countN);
        System.out.println("Zeros = " + countZ);


        System.out.println("\n-------Task-3------\n");

        int even = 0, odd = 0;

        for (int number : numbers) {
            if(MathHelper.isEven(number)) even++;
            else odd++;
        }
        System.out.println("Evens = " + even);
        System.out.println("Odds = " + odd);

    }
}
