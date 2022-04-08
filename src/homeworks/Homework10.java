package homeworks;
import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args){


        System.out.println("____TASK-1____");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("String str = \"" + str + "\"");
        if(str.length() == 0) System.out.println("Length is zero");
        else System.out.println("Length is = " + str.length() +
                "\nFirst char is = " + str.charAt(0) + "\nLast char is = " + str.substring(str.length() - 1));

        if(str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
       || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) {
            System.out.println("This String has vowel");
        }else System.out.println("This String does not have vowel");


        System.out.println("\n\n____TASK-2______\n\n");

        System.out.println("Please enter a String");
        String str1 = input.nextLine();
        System.out.println("String str = \"" + str1 + "\"");

        if (str1.length() < 3 ) System.out.println("Length is less than 3");
        else if (str1.length() % 2 == 1)  System.out.println("String str1 = " + str1.charAt(str1.length()/2));
        else  System.out.println("String str1 = " + str1.substring((str1.length()/2 - 1) ,(str1.length()/2 + 1)));


        System.out.println("\n\n____TASK-3______\n\n");

        System.out.println("Please enter a String");
        String str2 = input.nextLine();
        System.out.println("String str = \"" + str2 + "\"");

        if (str2.length() < 4) System.out.println("INVALID INPUT");
        else System.out.println("First 2 characters are = " + str2.substring(0,2) +
                "\nLast 2 characters are = " + str2.substring(str2.length() -2) +
                "\nThe other characters are = " + str2.substring(2,str2.length()-2));


        System.out.println("\n\n____TASK-4______\n\n");

        System.out.println("Please enter a String");
        String str3 = input.nextLine();
        System.out.println("String str = \"" + str3 + "\"");

        if(str3.length() < 2) System.out.println("Length is less than 2");
        else if (str3.substring(0,2).equals(str3.substring(str3.length()-2))) {
            System.out.println("true");
        }else System.out.println("false");


        System.out.println("\n\n____TASK-5______\n\n");

        System.out.println("Please enter a String");
        String s1 = input.nextLine();
        System.out.println("Please enter another String");
        String s2 = input.nextLine();
        System.out.println("String s1 = " + "\"" + s1 + "\"");
        System.out.println("String s2 = " + "\"" + s2 + "\"");



        if(s1.length() < 2 || s2.length() < 2) System.out.println("INVALID INPUT!");
        else System.out.println( s1.substring(1,s1.length()-1) + s2.substring(1,s2.length()-1));


        System.out.println("\n\n____TASK-6______\n\n");
        System.out.println("Please enter a String");
        String s6 = input.nextLine();
        System.out.println("String s6 = \"" + s6 + "\"");

        if(s6.length() < 4) System.out.println("INVALID INPUT");
        else if (s6.startsWith("xx") && s6.endsWith("xx")) System.out.println("true");
        else System.out.println("false");


    }
}
