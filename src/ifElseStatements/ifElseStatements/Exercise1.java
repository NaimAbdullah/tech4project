package ifElseStatements.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {

        int rando1 = (int) (Math.random() * 46) + 45;
        int rando2 = (int) (Math.random() * 46) + 45;
        int rando3 = (int) (Math.random() * 46) + 45;

        int max = Math.max(Math.max(rando1, rando2), rando3);
        int min = Math.min(Math.min(rando1, rando2), rando3);
        int mid = 0;

        System.out.println("The 3 numbers are - " + rando1 + ", " + rando2 + ", " + rando3);
        System.out.println("Max is = " + max + "\nMin is = " + min);

        if(rando1 != max && rando1 != min){
            mid = rando1;
        } else if(rando2 != max && rando2 != min){
            mid = rando2;
            }else{
            mid = rando3;
        }
        System.out.println(mid);

//        if(rando1 != max && rando1 != min){
//            System.out.println("The middle number is = " + rando1);
//        }
//        if(rando2 != max && rando2 != min) {
//            System.out.println("The middle number is = " + rando2);
//        }
//        if(rando3 != max && rando3 != min) {
//            System.out.println("The middle number is = " + rando3);
//        }

    }
}
