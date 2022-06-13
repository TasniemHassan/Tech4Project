package homeworks;

import java.util.LinkedHashMap;

public class Homework21 {
    /*
    TASK-1
    Requirement:
-Create a method called fizzBuzz1()
-This method will take an int argument, and it will print
numbers starting from 1 to given argument. BUT, it will print
“Fizz” for the numbers divided by 3, “Buzz” for the numbers
divided by 5, and “FizzBuzz” for the numbers divided both by 3
and 5.
     */
    public static void fizzBuzz(int number){
        for(int i = 1; i <= number; i++){
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    /*
    TASK-2
    Requirement:
-Create a method called fizzBuzz2()
-This method will take an int argument, and it will return
a String. BUT it will return “Fizz” if the given number is
divided by 3, “Buzz” if the number is divided by 5, and
“FizzBuzz” if the number is divided both by 3 and 5.
Otherwise, it will return number itself.
     */

    public static String fizzBuzz2(int num){
        if(num % 15 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        else return String.valueOf(num);
    }

    /*
    TASK-3

-This method will take a String argument and  will return
an int which is the sum of all numbers presented in the String.
NOTE: If there are no numbers represented in the String,
return 0.
     */

    public static int findSumNumbers(String str){
        int sum = 0;
        for (String string : str.replaceAll("[^0-9]", " ").split(" ")) {
            if (!string.isEmpty()) sum += Integer.parseInt(string);
        }
        return sum;
    }

    /*
   TASK-4
Requirement:
-Create a method called findBiggestNumber()
-This method will take a String argument and it will
return an int which is the number presented in the
String.
NOTE: If there are no numbers represented in the String,
return 0.
     */

    public static int findBiggestNumber(String str) {
        int max = Integer.MIN_VALUE;
        for (String string : str.replaceAll("[^0-9]", " ").split(" ")) {
            if (!string.isEmpty()) {
                if (Integer.parseInt(string) > max) max = Integer.parseInt(string);
                return max;
            }
        }
        return 0;
    }

    /*
    TASK-5
    Requirement:
-Create a method called
countSequenceOfCharacters()
-This method will take a String argument and it will
return a String which is the count of repeated
characters in a sequence in the String.
NOTE: If given String is empty, then return empty String.
NOTE: It is case sensitive!!!
     */

//Def not perfect but couldn't figure out any other way
    public static String countSequenceOfCharacters(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character s : str.toCharArray()) {
            if (!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s) + 1);

        }

        StringBuilder result = new StringBuilder();
        for (Character character : map.keySet()) {
            result.append("" + map.get(character) + character);
        }
        return result.toString();

    }







    public static void main(String[] args) {
        System.out.println("=====TASK-1=====");
        fizzBuzz(3);
        fizzBuzz(5);
        fizzBuzz(18);
        System.out.println("=====TASK-2=====");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));
        System.out.println("=====TASK-3=====");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));
        System.out.println("=====TASK-4=====");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));
        System.out.println("=====TASK-5=====");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));
    }
}
