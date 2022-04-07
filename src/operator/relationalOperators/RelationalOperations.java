package operator.relationalOperators;

public class RelationalOperations {
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;
        boolean isANotEqualToB = a != b;

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);

        boolean isAGreaterThanB = a > b;
        boolean isALessThanB = a < b;

        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isALessOrEqualThanB = a <= b;

        System.out.println("a > b : " + isAGreaterThanB);
        System.out.println("a < b : " + isALessThanB);
        System.out.println("a >= b : " + isAGreaterOrEqualThanB);
        System.out.println("a <= b : " + isALessOrEqualThanB);

    }
}
