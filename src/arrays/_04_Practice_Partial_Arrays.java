package arrays;

import java.util.Arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        System.out.println("\n----------Task-1----------\n");

        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for (int number : numbers) {
            System.out.println(number);
        }


        System.out.println("\n----------Task-2----------\n");

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);


        System.out.println("\n----------Task-3----------\n");

        sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);


        System.out.println("\n----------Task-4----------\n");

        sum = 0;

        for (int i = numbers.length - 5; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);


        System.out.println("\n----------Task-5----------\n");

        int product = 1;

        for (int i = numbers.length-4; i < numbers.length; i++) {
            if(numbers[i] != 0){
                product *= numbers[i];
            }
        }

        System.out.println(product);


        System.out.println("\n----------Task-6----------\n");

        boolean zero = false;

        for (int number : numbers) {
            if(number == 0){
                zero = true;
                break;
            }
        }
        System.out.println(zero);

    }
}













