package loops;

public class Practice {
    public static void main(String[] args) {

        System.out.println("\n-------for-i loop-------\n");

        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0 && i % 3 != 0){
                System.out.println(i);
            }
        }

        System.out.println("\n-------while loop-------\n");


        int i = 1;

        while(i <= 100){
            if(i % 2 != 0 && i % 3 != 0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("\n-------do-while loop-------\n");

        int count = 1;

        do{
            if(count % 2 != 0 && count % 3 != 0) System.out.println(count);
            count++;
        }
        while(count <= 100);
    }
}
