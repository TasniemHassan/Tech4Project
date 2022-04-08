package utilities;

public class CharacterHelper {

//PROJECT-04

//Task-1

    public static boolean isSpace(char space){
        return space == 32; // ' ' (a space)
    }


    //Task-2

    public static boolean isDigit(char digit){
        return digit >=48 && digit <=57; // or digit >= '0' && digit <= '9
    }


    //Task-3

    public static boolean isUpperCase(char letter){
        return letter >=65 && letter <=90; // letter >= 'A' && letter <= 'Z'
    }

    //Task-4

    public static boolean isLowerCase(char letter){
        return letter >=97 && letter <=122; // letter >='a' && letter <= 'z'
    }


    //Task-5

    public static boolean isLetter(char letter){
        //return (letter >=65 && letter <=90) || (letter >=97 && letter <=122);
        //we already defined this above so can do
        return isUpperCase(letter) || isLowerCase(letter);
    }

    //Task-6

    public static boolean isVowel(char vowel){
        return vowel == 'a' || vowel == 'e' || vowel =='i' || vowel =='o' ||vowel =='u'
                || vowel =='A'|| vowel =='E'|| vowel =='I' || vowel =='O' || vowel =='U';
    }

    //Task-7

    public static boolean isConsonant(char c){
        /* return c != 'a' && c != 'e' && c !='i' && c !='o' && c !='u'
                && c !='A'&& c !='E'&& c !='I' && c !='O' && c !='U'
        && c >65 && c <=90 || c >97 && c <=122;

        //the above is correct but not preferred, the bottom return is much better

         */

        return isLetter(c) && !isVowel(c);
    }


}
