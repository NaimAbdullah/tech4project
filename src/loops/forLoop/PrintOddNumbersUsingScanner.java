package loops.forLoop;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

        int num = ScannerHelper.getNumberFromUser();

        for(int i = 0; i <= num; i++){
            if(MathHelper.isOdd(i)) System.out.println(i);
        }
    }
}
