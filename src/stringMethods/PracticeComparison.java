package stringMethods;
import java.util.Scanner;
import utilities.ScannerHelper;
public class PracticeComparison {
    public static void main(String[] args){

        /*
Write a Java program that asks user to enter 2 strings
And store answers of user in different String variables
Finally, check if given 2 Strings are equal or not and print messages given below

    Test data 1:
    Java
    java

    Expected output 1:
    These strings are not equal

    Test data 2:
    Hello
    Hello

    Expected output 2:
    These strings are equal
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 strings");
        String str1 = scan.next();
        String str2 = scan.next();


        if (str1.equals(str2)){
            System.out.println("These strings are equal");
        }else{
            System.out.println("These strings are not equal");
        }




        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "These string are equal" : "These string are not equal");

    }
}
