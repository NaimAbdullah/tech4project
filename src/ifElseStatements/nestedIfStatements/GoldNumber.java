package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {

//        int num = (int) (Math.random() * 101) -50; // -50 - 50
//        System.out.println(num);
//
//              /*
//        Positive
//            more than 25
//            number == 7
//        Negative
//            less than -25
//            number == -7
//         */
//
//        // Positive             --> 10
//        // > 25                 --> +10
//        // Number is == -7      --> +100
//        // Number is == 7       -->
//        // Negative
//        // < -25
//
//        int points = 0;
//
//        if(num > 0){
//            // positive
//            points += 10;           // adding 10 points
//            if (num > 25){
//                points += 10;       // adding 10 points
//            }else if(num == 7){
//                points += 100;      // adding 100 points
//            }
//
//        }else if(num < 0){
//            // negative
//            if(num < -25){
//                points += 0;
//            }else if(num == -7){
//
//            }
//
//        }else{
//            // zero
//            points += 0;
//        }
//
//        System.out.println("Your points are = ");


        /*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
        less than -25 get 100 points
        */

        int n = (int) (Math.random() * 101) -50;
        int point = 0;
        System.out.println("The number is = " + n);

        if(n > 0) {             // POSITIVE
            point += 10;
            if(n == 30){
                point += 100;
            }else if(n > 25){
                point += 10;
            }
        }else if(n < 0){        // NEGATIVE
            point += 0;
            if(n == -7){
                point += 10;
            }else if(n > -25){
                point += 100;
            }
        }else{                  // ZERO
            point += 35;
        }

        System.out.println("Your points are = " + point);

    }
}
