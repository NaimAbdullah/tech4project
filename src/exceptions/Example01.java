package exceptions;

public class Example01 {
    public static void main(String[] args) {

        String[] names = {"Alex", "John", "Max"};
        try{
            System.out.println(names[-5]);

        }
        catch (Exception error){
            error.printStackTrace();
        }

        System.out.println("End of Program!");
    }
}
