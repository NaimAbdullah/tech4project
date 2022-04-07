package loops.nestedLoops;

public class Practice1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++){
            System.out.println(i);

            for(int x = 5; x >= 3; x--){
                System.out.println("\t" + x);
            }
        }
    }
}
