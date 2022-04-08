package loops;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){

        /*
Write a program that reads a name from user
Reverse the name and print it back

Test data:
Kaly

Expected output:
ylaK

Test data:
Abraham

Expected output:
maharbA
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scan.nextLine();

        String reversedName = "";
        for(int i=(name.length()-1); i >=0; i--) {
            reversedName += name.charAt(i); // review shorthand assignment operators for +=
        }
        System.out.println("The reversed name = " + reversedName);
        System.out.println("The reversed name to uppercase = " + reversedName.toUpperCase());
    }
}
