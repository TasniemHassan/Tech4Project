package stringMethods;
import utilities.ScannerHelper;
public class _12_contains {
    public static void main(String[] args){
        /*
        Method Task: It is used to find out if a String contains another String or character
        -It is non-static, and we can call it with an object
        -it is a return type, and it returns a boolean
        it takes a String argument
         */

        String s = "Good Morning";

        System.out.println(s.contains("Good")); // true
        System.out.println(s.contains("")); // true
        System.out.println(s.contains("123")); // false
        System.out.println(s.contains(s)); // true


        String address = ScannerHelper.getAnAddressFromUser();

        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");


        if(address.toUpperCase().contains("CHICAGO")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");

        //Ternary method
        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");

    }
}
