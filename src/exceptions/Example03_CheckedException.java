package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) throws InterruptedException{

        /*
        First way to handle checked exception is using try-catch block

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000); // 2 seconds
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         */

        //Second way is adding exception to the method signature using throws keyword
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000); // 2 seconds
            System.out.println(i);
        }

        throw new RuntimeException();
    }
}
