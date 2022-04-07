package operator.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {

        /*
        Pseudo - Code
        Create the variable
        Find the monthly income
        Find the bi-weekly income
        Print them out
         */

        double num1 = 90_000.00;
        double monthly = num1 / 12;
        double biweekly = num1 / 26;

        System.out.println("The monthly pay is = " + monthly);
        System.out.println("The bi-weekly pay is = " + biweekly);

    }
}
