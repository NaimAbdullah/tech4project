package ifElseStatements.ifElseIfStatment;

public class Exercise1 {
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 21 + (-10));

        System.out.println(num1);

        if(num1 > 0){
            System.out.println("The number is POSITIVE!");
        }
        else if(num1 < 0){
            System.out.println("The number is NEGATIVE!");
        } else{
            System.out.println("The number is ZERO!");
        }
    }
}
