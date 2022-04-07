package casting;

public class CastingPrimitives {
    public static void main(String[] args) {

        /*
        double > float > long > int = char > short > byte
         */

        int myInt = 32;
        long myLong = myInt;        // implicit casting - smaller to larger

        myInt = (int) myLong;       // explicit casting - larger to smaller

        int myInt2 = 'B';           // implicit casting

        char myChar = (char) 22;    // you don't have to cast
        char myChar2 = 56;          // same thing

        int myInt3 = (int) 45.5;

        short myShort = (short) myChar;
        char myChar3 = (char) myShort;

        /*
        short =
         */
        System.out.println("Short max =" + Short.MAX_VALUE);
        System.out.println("Short min =" + Short.MAX_VALUE);
        System.out.println("Int max =" + Short.MAX_VALUE);
        System.out.println("Int min =" + Short.MAX_VALUE);


    }
}
