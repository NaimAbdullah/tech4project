package ifElseStatements.ifElseIfStatment;

public class FindTheGreatestOfTwoNumbers {
    public static void main(String[] args){

        /*
        How to get random number between 0-10 (both included)
        Math.random() returns numbers between 0.0 and 1.0 (0.0 included, but not 1.0)
        0 1 2 3 4 5 6 7 8 9 10
         */
        int num1 = (int) (Math.random() * 11), num2 = (int) (Math.random() * 11);

        System.out.println(num1);
        System.out.println(num2);

        //Math.max()

//        System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + Math.max(num1, num2));

        if(num1 > num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num1);
        }
        else{
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num2);

        }
    }
}
