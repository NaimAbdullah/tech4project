package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {

        /*
        Unchecked exception are the ones you get when you run a program
        Unchecked exceptions = Runtime exceptions
         */

        String name = "John";

        //How to handle the exception
        try {
            System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("An exception is caught");
        }

        System.out.println("End of the program!");
    }
}
