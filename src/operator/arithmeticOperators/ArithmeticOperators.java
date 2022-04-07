package operator.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 3;

        // Addition
        int sum = number1 + number2;        // 8

        // Subtraction
        int sub = number1 - number2;        // 2

        // Multiplication
        int times = number1 * number2;      // 15

        // Division
        int div = number1 / number2;        // 1.6

        // Remainder
        int remainder = number1 % number2;  // 5 - (3 * 1) = 2

        System.out.println("Addition is = " + sum);
        System.out.println("Subtraction is = " + sub);
        System.out.println("Multiplication is = " + times);
        System.out.println("Division is = " + div);
        System.out.println("Remainder is = " + remainder);

    }
}
