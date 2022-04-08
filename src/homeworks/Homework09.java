package homeworks;
import utilities.ScannerHelper;
import java.util.Scanner;
public class Homework09 {
    public static void main(String[] args){


        System.out.println("-------TASK-1-------\n");

        String name = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = "
                + name.charAt(0));
        System.out.println("The last character in the name is = "
                + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = "
                + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = "
                + name.substring(name.length() - 3));

        if(name.startsWith("A") || name.startsWith("a")){
            System.out.println("You are in the club");
        }else {
            System.out.println("Sorry, you are not in the club");
        }


        System.out.println("\n\n-------TASK-2-------\n\n");

        String address = ScannerHelper.getAnAddressFromUser();

        if(address.toLowerCase().contains("chicago")) {
            System.out.println("You are in the club");
        } else if (address.toLowerCase().contains("des plaines")) {
            System.out.println("You are welcome to join the club");
            } else {
            System.out.println("Sorry, you will never be in the club");
            }


        System.out.println("\n\n-------TASK-3-------\n\n");

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter 4 colors");
        String color = scan.nextLine();

        if(color.toLowerCase().contains("green") && color.toLowerCase().contains("red")) {
            System.out.println("Green and red are in the list");
        }else if(color.toLowerCase().contains("green")){
            System.out.println("Green is in the list");
        }else if(color.toLowerCase().contains("red")) {
            System.out.println("Red is in the list");
        }else {
            System.out.println("Green and red are not in the list");
        }


        System.out.println("\n\n-------TASK-4-------\n\n");

        String str = " Java is FUN  "; // 1 space before Java and 2 spaces after FUN
        String str1 = str.trim(); //"Java is FUN"
        String str2 =str1.toLowerCase().substring(0,str1.indexOf(" "));
        String str3 = str1.toLowerCase().substring(str1.indexOf(" ") + 1,str1.lastIndexOf(' '));
        String str4 = str1.toLowerCase().substring(str1.lastIndexOf(' ') + 1);

        System.out.println("The first word in the str is = " + str2);
        System.out.println("The second word in the str is = " + str3);
        System.out.println("The third word in the str is = " + str4);


        }
}
