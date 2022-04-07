package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {
        /*
        Find the min and max of given 3 numbers

         */

        int x = 4, y = 67, z = -54;

        int minOfXY = Math.min(x, y);
        int maxOfXY = Math.max(x,y);

        int minOfXYZ = Math.min(minOfXY,z);
        int maxOfXYZ = Math.max(maxOfXY,z);

        System.out.println("Min of every is = " + minOfXYZ);
        System.out.println("Max of every is = " + maxOfXYZ);

        /*
        Write a program which will print the max of given 3 numbers
        4, 56, 23
         */

        System.out.println("The max number is = " + Math.max(Math.max(4, 56),23));

        /*
        Write a program which asks user to enter 4 numbers and print
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 4 numbers");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//        int num4 = input.nextInt();

//        System.out.println("The max number entered is = " + Math.max(Math.max(num1, num2), Math.max(num3, num4)));

        System.out.println("The min number is = " + Math.min(Math.min(input.nextInt(), input.nextInt()),
                Math.min(input.nextInt(), input.nextInt())));

    }
}
