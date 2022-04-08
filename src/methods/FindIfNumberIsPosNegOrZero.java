package methods;
import java.util.Scanner;
import utilities.MathHelper;
public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
Ask user to enter an any number
-Print "The number is positive" if the user enters a positive number
-Print "The number is negative" if the user enters a negative number
-Print "The number is zero" if the user enters zero
 */

        System.out.println("Please enter a number");

        int number = scan.nextInt();

        if (MathHelper.isPositive (number)){
            System.out.println("The number is positive");
        }else if (MathHelper.isNegative (number)) {
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is zero");

        }

    }
}
