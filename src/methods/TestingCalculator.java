package methods;

import homeworks.ExtraHomework;
import utilities.Calculator;

public class TestingCalculator {

    public static void main(String[] args) {

        int i1 = 15, i2 = 2;

        int result = Calculator.divide(i1, i2);  // returns int

        System.out.println(result);

        double d1 = 15, d2 = 2;

        double result2 = Calculator.divide(d1, d2); // returns double

        System.out.println(result2);

        Introduction.introduce("Naim", "EMT", 22, "Gaming");

        int max = Math.max(1, 2);

        double max2 = Math.max(15.2, 10);

        System.out.println(Math.max(1, 2)); // this method is a return type
        System.out.println(Calculator.divide(d1, d2));  // this method is also a return type

        double sumD = ExtraHomework.sum(3.4, 5.5);

        System.out.println(sumD);

        int sumI = ExtraHomework.sum(5, 10);
        System.out.println(sumI);

        int abs = ExtraHomework.abs(4, 6);
        System.out.println(abs);

        double absD = ExtraHomework.abs(4.5,8.4);
        System.out.println(absD);

        int proI = ExtraHomework.product(5,5);
        System.out.println(proI);

        double proD = ExtraHomework.product(6.5, 7.7);
        System.out.println(proD);
    }
}
