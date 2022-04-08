package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String [] args){

        /*
        Pseudo Code:
        1. Create an object of scanner (import)
        2. print out instructions about what we need
        3. use next() method for reading
        4.Print out the first and last name in one statement
         */

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.next();


        System.out.println("What is your last name?");
        String lastName = input.next();

        System.out.println("Users first and last name: " + firstName +" " + lastName);

        /*
        Pseudo Code:
        1. Create an object of Scanner
        2. Print out the question
        3. Get the address by the nextLine() method and store it
        4. Print out the user's address
         */

        String address = input.nextLine();

        System.out.println("\nWhat is your address?");
        String mailingAddress = input.nextLine();

        System.out.println("Enter users address: " + mailingAddress);

        /*
        Pseudo Code:
        1.Create an object of scanner
        2. Print out the question
        3.
         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("First Number:");
        int num1 = userInput.nextInt();
        System.out.println("Second Number:");
        int num2 = userInput.nextInt();
        System.out.println("Third Number:");
        int num3 = userInput.nextInt();

        int sum1= num1 + num2 + num3;

        System.out.println("Sum of the number is =" +(num1 + num2 + num3)); // to add like math, put them in parenthesis

        System.out.println("Sum of the number is =" + sum1);





    }
}
