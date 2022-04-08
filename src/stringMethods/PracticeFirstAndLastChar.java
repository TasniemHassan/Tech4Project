package stringMethods;
import java.util.Scanner;
public class PracticeFirstAndLastChar {
    public static void main(String[] args){

 /*
    Write a program that asks user to enter their name
    Print first char of the name with message "First character in the name is = "
    Print last char of the name with message "Last character in the name is = "

    Kaly
    charAt(0)
    charAt(3) -> name.length()-1

    NOTE:
    First character of String is always -> str.charAt(0)
    Last character of String is always -> str.charAt(str.length()-1)
     */

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your name");
        String name = input.nextLine();

        System.out.println("The first character in the name is = "
                + name.charAt(0));
        System.out.println("The last character in the name is = "
                + name.charAt(name.length() - 1));

    }

}
