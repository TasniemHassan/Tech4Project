package scanner;

import java.util.Scanner; //needs to be included whenever importing a class

public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I am going to use Scanner class for creating my object
        2. I will use the object for reading the data
         */

        Scanner scanner = new Scanner(System.in); //this is how we create an object and the object is Scanner.
                                                //creating the scanner object for using the methods

        System.out.println("Please put your first name:"); //this is what I want user to put
        String firstName = scanner.next();// storing the first name from user

        System.out.println("Please put your last name:"); //second message for user
        String lastName = scanner.next(); //need to add this to print another output


        System.out.println ("First name = " + firstName); //Printing my object/variable
        System.out.println ("Last name = " + lastName);


    }
}
