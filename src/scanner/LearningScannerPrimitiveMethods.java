package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){
    /*
    How to use Scanner Methods
    1. Create an object of Scanner (import the class as well)
        ClassName/DataType variableName/objectName = new ClassName/DataType(if it is needed)
    2. variableName/objectName.methodName(if it is needed parameter);
     */

    /* task 1- ask user to enter their age
            2. print the question
            3. use proper next method (for this scenerio nextint)
            4. print out the users age
     */


    Scanner collect = new Scanner(System.in);

    System.out.println("What is your age");
     int userAge = collect.nextInt();

    System.out.println("What is your age: " + userAge);

    /*
        Ask for account balance of the user
        get the account balance and store it
        print it out
     */

    System.out.println("What is your account balance?");
        double accountBalance = collect.nextDouble();

        System.out.println("\n\t\'User account balance is\' = \"$" + accountBalance + "\"");

        /*
        Ask for user to "Are you
         */

        System.out.println("Are you understanding this java class today?");
        boolean yourAnswer = collect.nextBoolean();

        System.out.println("Are you understanding this java class today? " + "\"" + yourAnswer + "\"");



    }


}
