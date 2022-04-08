package loops.whileLoop;
import java.util.Random;
import utilities.ScannerHelper;

public class GuessMyNumber {
    public static void main(String[] args){

        Random random = new Random();
        int myNumber = random.nextInt(10) + 1;
        int userNumber = random.nextInt(10)+1;

        int attempt = 1;

        while(userNumber != myNumber){
            System.out.println("My random attempt number is = " + userNumber);
            userNumber = random.nextInt(10) + 1;
            attempt++;
        }


        System.out.println("Finally you could find the number!");
        System.out.println("You could find it after " + attempt + " times!!!");


    }
}
