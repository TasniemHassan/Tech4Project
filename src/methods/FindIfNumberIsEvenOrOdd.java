package methods;
import utilities.RandomNumberGenerator;
import utilities.MathHelper;
public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {



        /*
    Generate a random number between 17 and 33 (both included)
    First, print the random number generated with a message "The number generated is = "
    Print "The number generated is EVEN" if the number is even
    Print "The number generated is ODD" if the number is odd
         */


    int ran1= RandomNumberGenerator.getRandomNumber(17,33);

        System.out.println("The number generated is = " + ran1);

        if(MathHelper.isOdd (ran1)){
            System.out.println("The number generated is ODD");
        }
        if(MathHelper.isEven(ran1)){
            System.out.println("The number is EVEN");
        }



        System.out.println("End of the Program");
    }
}
