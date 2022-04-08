package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {
        /*
    TASK-1
    Write a program that counts spaces (' ') for below String
    String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

    Expected result: 9
         */
        //first remember space is a character
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count1 = 0; //create a flack count container
        for (int i = 0; i <= address.length() - 1; i++) { // check characters 1 by 1 starting at charAt(0) ->length of string
            if (address.charAt(i) == ' ') {// cant contain space bc .contains will return boolean
                count1++; //if address.charAt(i) is a space, it counts 1,
                //no break means it will continue to check rest of String
            }
        }
        System.out.println(count1);


        //second way
        /*
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count1 = 0;
        for (int i = 0; i <= address.length()-1; i++) {
            if(Character.isSpaceChar(address.charAt(i))) {
                count1++;
            }
        }
        System.out.println(count1);

         */

         /*
        TASK-2
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */

        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count2 = 0;

        for (int i = 0; i <= address1.length() - 1; i++) {
            if (Character.isLetter(address.charAt(i))) {
                count2++;
            }
        }
        System.out.println(count2);

        /*
        What if interviewer says dont use method

        for (int i = 0; i < address.length(); i++){
        char c = address.charAt(i);
        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
        count2++;
        }
        System.out.println("count2);
         */

        /*
        TASK-3
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        String address3 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int countUpperCase = 0;
        int countLowerCase = 0;

        for (int i = 0; i < address3.length(); i++) {
            //char c = address3.charAt(i); // use this instead of what i used to shorten code
            if (Character.isUpperCase(address3.charAt(i))) { //Character.isUpperCase(c)
                countUpperCase++;
            } else if (Character.isLowerCase(address3.charAt(i))) { //can replace address3.charAt(i) with (c)
                countLowerCase++;
            }
        }
        System.out.println(Math.abs(countLowerCase - countUpperCase));

        //ANOTHER WAY THATS BETTER PERFORMANCE WISE
        int count3 = 0;

        for (int i = 0; i < address3.length(); i++) {
            char c = address3.charAt(i);

            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) count3++;
                else count3--;
            }
        }

        /*
TASK-4
Write a program that counts vowel and consonants letters for below String.
Then, print them with below messages

String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

Expected result:
Vowels = 10
Consonants = 15
 */

        int countVowel = 0;
        int countCons = 0;

        for (int i = 0; i < address3.length(); i++) {
            char c = address.charAt(i);

            if (Character.isLetter(c)) {
                if (CharacterHelper.isVowel(c)) countVowel++;
            } else countCons++;
        }
        System.out.println("Vowels = " + countVowel);
        System.out.println("Consonants = " + countCons);

        /*
TASK-5 - Putting all together
Write a program that characters from the below String.
Then, print them with below messages

String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

Expected result:
Letters = 25
Lowercases = 17
Uppercases = 8
Vowels = 10
Consonants = 16
Digits = 12
Spaces = 9
Specials = 2
 */

        // make containers to hold everything being counted
        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0, evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                letterCounter++;
                if(Character.isUpperCase(c)){
                    upperCounter++;
                }
                else{
                    lowerCounter++;
                }

                if(CharacterHelper.isVowel(c)){
                    vowelCounter++;
                }
                else{
                    consonantCounter++;
                }
            }
            else if(Character.isDigit(c)){
                digitCounter++;
                if(Integer.parseInt("" + c) % 2 == 0){
                    evenCounter++;
                }
                else{
                    oddCounter++;
                }
            }
            else if(Character.isSpaceChar(c)){
                spaceCounter++;
            }
            else{
                specialCounter++;
            }
        }

        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercases = " + upperCounter);
        System.out.println("Lowercases = " + lowerCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonants = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Evens = " + evenCounter);
        System.out.println("Odds = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);


    }

}
