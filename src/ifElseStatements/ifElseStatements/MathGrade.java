package ifElseStatements.ifElseStatements;
import java.util.Scanner;
public class MathGrade {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String fullName = input.nextLine();

        System.out.println("Hey " + fullName + "! What is your balance?");
        double balance = Double.parseDouble(input.next()); //if we get balance as string

        if(balance >=600.0) {
            System.out.println("Awesome! You have enough money!");
        }else {
            System.out.println("Sorry! You are poor");
        }
    }
}
