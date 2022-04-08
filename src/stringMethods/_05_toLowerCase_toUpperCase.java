package stringMethods;

public class _05_toLowerCase_toUpperCase {
    public static void main(String[] args){

        /*
        Method Task:
        These methods are used to convert letters of a String to uppercase to lowercase
        -They are non-static methods that you can call them with objects of String class
        -They are return type, and they return the modified String object back
        -They don't take any argument
         */
        String s1 = "HELLO world 10$";

        System.out.println(s1); // HELLO world 10$
        System.out.println(s1.toLowerCase()); // hello world 10$.. turns letters to lower case
        System.out.println(s1.toUpperCase()); // HELLO WORLD 10$ .. turns letters to uppercase

        String sentence = "I paid &100.99 to buy airpods.";

        String s2 = sentence.toLowerCase(); // i paid $100.99 to buy airpods.
        String s3 = sentence.toUpperCase(); // I PAID $100.99 TO BUY AIRPODS.

        System.out.println(s3.toLowerCase().toUpperCase()); // goes from lower case to upper case
    }
}
