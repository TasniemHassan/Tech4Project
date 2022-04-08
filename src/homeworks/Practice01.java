package homeworks;
import utilities.ScannerHelper;
public class Practice01 {
    public static void main(String[] args){

        /*
        TASK-1:

        Requirement:
Assume that you are given a String as below;
String str = ”SDLC is step by step procedure to create an application”;
Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */

        String str = "SDLC is step by step procedure to create an application";
        System.out.println("The length of the String is = " + str.length()); // 55
        System.out.println("The index of 'SDLC' is = " + str.indexOf("SDLC")); // 0
        System.out.println("The index of 'application' is = " + str.indexOf("application")); //44


        /*
        TASK -2:
            Requirement:
Assume that you are given a String as below;
String str = “  I know how to code with Python  ”;
•
Write a program to manipulate given String and convert it to be:
“I KNOW HOW TO CODE WITH JAVA”

         */

        String str1 = " I know how to code with Python  ";
        String str2 = str1.trim();
        String str3 = str2.toUpperCase();
        System.out.println(str3.replace("PYTHON" , "JAVA"));
        System.out.println(str1.trim().toUpperCase().replace("PYTHON" , "JAVA"));


        /*
        TASK-3

        Assume that you are given a String as below;
String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
1.Find the first character of given String which is not white space
2.Find the last character of given String which is not white space
         */

        String str4 ="    SDLC has planning, design, development, testing, deployment and " +
                "maintenance phases    ";

        System.out.println("The first character of given String is : " + str4.trim().charAt(0));
        System.out.println("The last character of given String is : " + str4.trim().charAt(str4.trim().length() - 1));



        /*
        Assume you are given 3 Strings as below;
String s5 = “  TECH ”;
String s6 = “ glo  ”;
String s7 = “ BAL       “;
Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
Note: The length of s4 will be 10 at the end!!!
         */

        String s5 = "  TECH  ".trim();
        String s6 = " glo  ".trim();
        String s7 = "BAL     ".trim();

        String s8 = s5.replace("ECH" , "ech") + s6.trim().replace("g" , "G" )
                + s7.trim().toLowerCase();

        System.out.println(s8);


        /*
        Requirement:
Write a program that asks user to enter their favorite color.
Then, print the first and last characters of the color
Also, print the first and last 3 characters of the color
Test data:
green
Expected output:
1st character is = g
2nd character is = n
First 3 characters are = gre
Last 3 characters are = een
         */
        String color = ScannerHelper.getAStringFromUser();
        System.out.println("The first character is : " + color.charAt(0));
        System.out.println("The last character is : " + color.charAt(color.length() - 1));
        System.out.println("The first 3 chars in the color is = " + color.substring (0 , 3));
        System.out.println("The last 3 chars in the color is = " + color.substring (color.length()-3));


        /*
        Requirement:
Write a program that asks user to enter a full sentence
Then, convert all sentence to lower case and print the first and last words in the given sentence
Test data:
JavA is an object-oriented programming LanguAGE
Expected output:
1st word is = java
2nd word is = language
         */

        String sentence = ScannerHelper.getAStringFromUser();
        System.out.println("The first word is : " + sentence.toLowerCase().substring(0, sentence.indexOf(' ')));
        System.out.println("The last word is : " + sentence.substring(sentence.lastIndexOf(' ') + 1).toLowerCase());


        // TASK - 7
        /*
        Requirement:
Write a program that asks user to enter a full sentence
Then, check if given sentence contains $ character
If it contains $ character, then find the index of the $ character and print a proper message for the found index
Test data 1:
I saved $100 to buy new airpods
Expected output 1:
This sentence contains $ character
$ character’s index is = 8
Test data 2:
I’ll become a Software Engineer in Test
Expected output 2:
This sentence does not contain $ character
         */

        String sentence1 = ScannerHelper.getAStringFromUser();

        if(sentence.contains("$")) System.out.println("This sentence contains $ character" +
                "\n$ character's index is = " + sentence.indexOf('$'));
        else System.out.println("This sentence does not contain $ character");


    }
}
