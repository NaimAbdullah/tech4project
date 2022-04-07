package operator.relationalOperators;

public class Exercise1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 10;

        boolean b1 = y < z;
        boolean b2 = x <= y;
        boolean b3 = x >= z;
        boolean b4 = y > x;
        boolean b5 = x >= y;
//        boolean b6 = (x >= z) < y;

        System.out.println("B1 = " + b1);
        System.out.println("B2 = " + b2);
        System.out.println("B3 = " + b3);
        System.out.println("B4 = " + b4);
        System.out.println("B5 = " + b5);
//        System.out.println("B6 = " + b6);
    }
}
