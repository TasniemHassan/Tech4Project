package characterClass;

public class UnderstandingCharacterClass {
    public static void main(String[] args){


       // char c = 'c';
      // boolean b =  Character.isDigit('9'); //true

       // System.out.println(b); this way is longer and unnecessary 3 steps, can shorten by doing as below

        System.out.println(Character.isDigit('9')); //returns true

        System.out.println(Character.isUpperCase('a')); // false
        System.out.println(Character.isUpperCase('B')); // true

        System.out.println(Character.isLowerCase('G')); //false
        System.out.println(Character.isLowerCase('h')); //true

        System.out.println(Character.isLetter('l')); // true
        System.out.println(Character.isLetter('Z')); // true

        System.out.println(Character.isLetterOrDigit('5')); //true
        System.out.println(Character.isLetterOrDigit('t')); //true
        System.out.println(Character.isLetterOrDigit(' ')); //false

        System.out.println(Character.isWhitespace(' ')); //true
        System.out.println(Character.isSpaceChar(' ')); //true

        char c2='$';
        //if it  is not digit or space or letter then it is special

        //example
        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(c2)); //true


        char c3 = 'A';

        String s = "AEIOUaeiou";

        System.out.println(s.contains(c3 + "")); //true... contains takes only a string.
        // so either u concat with an empty or make it String.valueOf(c3)

        char c4 = 'a';
        boolean isC4Vowel =false;
        //container examples
       // int sum =0;
        //int product =1;
       // String result = "";
        for(int i= 0; i < s.length(); i++){
            if(c4 == s.charAt(i)){
                isC4Vowel =true;
                break;
            }
        }
        if(isC4Vowel) System.out.println("c4 is vowel");
        else System.out.println("c4 is not vowel");

    }
}
