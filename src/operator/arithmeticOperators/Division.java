package operator.arithmeticOperators;

public class Division {
    public static void main(String[] args) {

        double num1 = 15;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double division = num1 / num2;
        double divInt = num1 / num3;
        double divDouble = num4 / num2;

        System.out.println("num1 / num2 = " + (num1 / num2)); // double / double
        System.out.println("num1 / num3 = " + divInt);   // double / int
        System.out.println("num4 / num2 = " + divDouble);// int / double
    }
}
