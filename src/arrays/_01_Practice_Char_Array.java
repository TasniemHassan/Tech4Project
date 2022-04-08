package arrays;
import utilities.CharacterHelper;
import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] arg){

/*
TASK-1
Create a char array and store values below
#
$
5
A
b
H
Print the array

Expected:
[#, $, 5, A, b, H]
 */

        System.out.println("\n----------Task-1------\n");
        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        String charactersToString = Arrays.toString(characters);
        System.out.print(charactersToString);

/*
TASK-2
Print the size of the array with a message

EXPECTED:
The size of the array is = 6
 */


        System.out.println("\n----------Task-2------\n");
        System.out.println("The size of the array is = " + characters.length);


/*
TASK-3
Print each element using fori loop

EXPECTED:
#
$
5
A
b
H
 */
        System.out.println("\n----------Task-3------\n");
        for(int i=0; i<= characters.length-1; i++){
            System.out.println(characters[i]);
        }

        /*
TASK-4
Print each element using for each loop

EXPECTED:
#
$
5
A
b
H
*/
        System.out.println("\n----------Task-4------\n");
        for(char element : characters){
            System.out.println(element);
        }


/*
TASK-5
Print each element that are letters

EXPECTED:
A
b
H
 */
        System.out.println("\n----------Task-5------\n");

        for(int i=0; i<= characters.length-1; i++){
           if(Character.isLetter(characters [i])) System.out.println(characters[i]);

        }

        for(char element : characters){
            if(Character.isLetter(element)) System.out.println(element);
        }

        /*
TASK-6
Count how many uppercase characters you have in the array

EXPECTED:
2
 */
        System.out.println("\n----------Task-6------\n");


        int upperCounter = 0;
        for(char element :characters){
            if(Character.isUpperCase(element)){
                upperCounter++;
            }
        }
        System.out.println(upperCounter);



        /*
        Extra Practices
        counter lowercase letter
        count digits
        count spaces
        count specials
         */
    }
}
