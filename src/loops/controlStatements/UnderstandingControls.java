package loops.controlStatements;

public class UnderstandingControls {
    public static void main(String[] args) {

        for (int i = 1; i <= 25 ; i++) {
            if(i % 10 == 0) continue;
            System.out.println(i);
            if(i == 15) break;
        }
    }
}
