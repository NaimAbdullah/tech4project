package utilities;

public class MathHelper {

    //Create a method that takes 3 ints and returns the max

    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }

    //method overloading
    public static double maxOfThree(double num1, double num2, double num3){
        return Math.max(num1, Math.max(num2, num3));
    }

    // Create a method that takes 3 byte numbers and returns the smallest number

    public static byte minOfThree(byte num1, byte num2, byte num3){
        return (byte) (Math.min(Math.min(num1, num2), num3));
    }

    public static boolean isEven(int num1){
        return num1 % 2 == 0;
    }

    // Create a method called isOdd() that takes one int parameter and returns true if the number is odd, otherwise false

    public static boolean isOdd(int num1){
        return num1 % 2 == 1;
    }

    public static boolean isPositive (int num1){
        return(num1 > 0);
    }

    public static boolean isNegative(int num1){
        return(num1 < 0);
    }

    public static boolean isZero(int num1){
        return(num1 == 0);
    }

}
