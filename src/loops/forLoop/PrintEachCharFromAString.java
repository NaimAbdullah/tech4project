package loops.forLoop;

public class PrintEachCharFromAString {
    public static void main(String[] args) {

        String str = "TechGlobal School";

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
