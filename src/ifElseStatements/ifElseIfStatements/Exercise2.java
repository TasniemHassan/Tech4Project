package ifElseStatements.ifElseIfStatements;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){

        /*
        Ask user to enter their age and weight and if they are older than 18 print out
        "You are old enough to drive" else "You are not old enough for driving",
        if they are heavier than 150 pounds print out "You are heavier than 150 pounds" else
        "You are lighter than 150 pounds"

        test data: age 15 weight = 159
        age = 67 weight = 110

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Please enter your weight");
        double weight = input.nextDouble();

        if (age >= 18){
            System.out.println("You are old enough to drive");
        }else {
            System.out.println("You are not old enough for driving");
        }

        if (weight > 150.0){
            System.out.println("You are heavier than 150 pounds");
        }else {
            System.out.println("You are lighter than 150 pounds");
        }


    }
}
