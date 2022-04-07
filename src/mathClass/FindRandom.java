package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        // random * (end point - start point + 1) + start point
//
//        double random = Math.random(); // 0.0 - 0.9999
//        System.out.println(random);
//
//        int random0And10Included = (int) (Math.random() * 11); // 0 - 10
//        System.out.println(random0And10Included);
//
//        int random0And20 = (int) (Math.random() * 21);
//        System.out.println(random0And20);
//
//        int random10And20 = (int) (Math.random() * 11) + 10; // 10 - 20
//        System.out.println(random10And20);
//
//        int random103And346 = (int) (Math.random() * 244) + 103; // 103 - 346
//        System.out.println(random103And346);
//
//        int random_50And50 = (int) (Math.random() * 101) + (-50); // -50 - 50
//        System.out.println(random_50And50);
//
//        int rando = (int) (Math.random() * 16 + 15); // 15 - 30
//        System.out.println(rando);

//        int rando1 = (int) (Math.random() * 54 + 45); // 45 - 98
//        System.out.println((int) (Math.random() * 54 + 45));

        int random1 = (int) (Math.random() * 19 + 67); // 67 - 85
        int random2 = (int) (Math.random() * 19 + 67); // 67 - 85

        System.out.println("The first number is = " + random1);
        System.out.println("The second number is = " + random2);

        System.out.println("The max number is = " + Math.max(random1, random2));
        System.out.println("The min number is = " + Math.min(random1, random2));

    }
}
