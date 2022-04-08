package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {

        /*
TASK-1
Create an ArrayList called numbers that stores below numbers,

10
12
13
8
9
15

Print the list
 */

        System.out.println("\n--------Task-1-------\n");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);

        System.out.println("\n--------Task-2-------\n");

        int countOdds = 0;
        for(Integer element : numbers){
            if (element % 2 == 1)
           countOdds++;
        }
        System.out.println("Odds = " + countOdds);

        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");

        System.out.println(colors);

    /*
    TASK-4
Count how many colors in the colors list are starting with uppercase

RESULT:
5
 */
        System.out.println("\n-----for each loop-----\n");
        int countUpperCase = 0;
        for(String element : colors){
            if (Character.isUpperCase(element.charAt(0)))
                countUpperCase++;
        }
        System.out.println(countUpperCase);

        System.out.println("\n-----fori loop-----\n");

       int countU=0;
        for( int i =0; i < colors.size(); i++){
           if(Character.isUpperCase(colors.get(i).charAt(0))) countU++;
        }

        System.out.println(countU);

        /*
        Practices
        Lowercases
        nulls
        empties
        That has length of 4 at least
        That has length of even or odd
        That has a or A
         */
    }
}
