package loops.forLoop;
import utilities.ScannerHelper;
public class PrintOddNumbersUsingScanner {
    public static void main (String[] args){

        int number = ScannerHelper.getNumberFromUser();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 1) System.out.println(i);
        }

    }
}
