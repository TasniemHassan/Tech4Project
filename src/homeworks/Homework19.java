package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework19 {

/*
TASK-1
Requirement:
-Create a method called noDigit()
-This method will take one String argument and it will
return a new String with all digits removed from the
original String
 */
    public static String noDigit(String str){
        return str = str.replaceAll("[0-9]","");
    }

    /*
    TASK-2
    Requirement:
-Create a method called noVowel()
-This method will take one String argument and it will
return a new String with all vowels removed from the
original String
     */

    public static String noVowel(String str){
        return str = str.replaceAll("[aeiouAEIOU]" , "");
    }

    /*
    TASK-3
    Requirement:
-Create a method called sumOfDigits()
-This method will take one String argument and it will return an int sum
of all digits from the original String
     */

    public static int sumOfDigits(String str) {
        str = str.replaceAll("[^0-9]", "");
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.isEmpty()) return 0;
            else sum += Integer.parseInt("" + str.charAt(i));
        }
        return sum;
    }
    /*
    TASK-4
    Requirement:
-Create a method called hasUpperCase()
-This method will take one String argument and it will return boolean
true if there is an uppercase letter and false otherwise.
     */
    public static boolean hasUpperCase(String str){
        for(int i = 0; i< str.length(); i++){
           if(Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }
    /*
    TASK-5
    Requirement:
-Create a method called middleInt()
-This method will take three int arguments and it will return the middle
int.
     */
    public static int middleInt(int a, int b, int c){
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }

    /*
    TASK-6
    Requirement:
-Create a method called no13()
-This method will take an int array as argument and it will return a new
array with all 13 replaced with 0.
     */
    public static int[] no13(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    /*
    TASK-7
    Requirement:
-Create a method called arrFactorial()
-This method will take an int array as argument and it will return the
array with every number replaced with their factorials.
     */
    public static int[] arrFactorial(int[] array){
        for (int i = 0; i < array.length; i++) {
            int factorial = 1;
            for (int j = 2; j <= array[i]; j++) {
                factorial *= j;
            }
            array[i] = factorial;
        }
        return array;
    }



    /*
    TASK-8
    Requirement:
-Create a method called categorizeCharacters()
-This method will take String as an argument and return a String array as
letters at index of 0, digits at index of 1 and specials at index of 2
     */
    public static String[] categorizeCharacters(String str) {
        String letters = "";
        String specials = "";
        String digits = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
            else if (!(Character.isLetterOrDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i))))
                specials += str.charAt(i);
        }
        String[] arr = new String[3];
        arr[0] = letters;
        arr[1] = digits;
        arr[2] = specials;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noVowel("JAVA"));
        System.out.println(sumOfDigits(""));
        System.out.println(hasUpperCase("$125.0"));
        System.out.println(middleInt(-1,25,10));
        int[] arr = {13,13,13,13,13};
        System.out.println(Arrays.toString(no13(arr)));
        int [] array = {5,0,6};
        System.out.println(Arrays.toString(arrFactorial(array)));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));
    }
}
