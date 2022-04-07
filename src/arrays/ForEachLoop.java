package arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};

        System.out.println(chars.length);


        System.out.println("\nFirst way\n");
        System.out.println("Element 1 = " + chars[0]);
        System.out.println("Element 2 = " + chars[1]);
        System.out.println("Element 3 = " + chars[2]);
        System.out.println("Element 4 = " + chars[3]);
        System.out.println("Element 5 = " + chars[4]);
        System.out.println("Element 6 = " + chars[5]);
        System.out.println("Element 7 = " + chars[6]);

        System.out.println("\nSecond way\n");
        for (int i = 0; i < 7; i++) {
            System.out.println("Element = " + chars[i]);
        }

        System.out.println("\nThird way\n");
        int count = 1;
        for (int i = 0; i < 7; i++) {
            System.out.println("Element " + count + " = " + chars[i]);
            count++;
        }

        System.out.println("\nFor each loop\n");
        for (char c: chars){
            System.out.println("Element " + c);
        }


    }
}
