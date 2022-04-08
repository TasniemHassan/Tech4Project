package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args){
        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the Array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */

        String[] students ={"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array = " + Arrays.toString(students));


        /*
        TASK-2
        Print the first and the last names after it is sorted

        EXPECTED:
        First name is = Adam
        Last name is = Tom
        */

        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length-1]);

        int counter = 0;
        for(String element :students){
            if(element.charAt(0) == 'A'){
                //if(students.startsWith("A")) can also be used
                counter++;
            }
        }
        System.out.println(counter);

        int countA2 = 0;
        for(int i = 0; i < students.length; i++){
            //if(students[i].startsWith("A") countA2++;
            if(students[i].charAt(0) == 'A') countA2++;
        }
        System.out.println(countA2);
 /*
        TASK-4
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names contains a-A or e-E

        EXPECTED:
        5
         */


        int count = 0;
        for(String element :students){
            if(element.contains("A")  || element.contains("a") || element.contains("e") || element.contains("E") ){
         //if(student.toUpperCase().contains("A") || student.toUpperCase().contains("E))
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\n---------TASK-4 fori loop----------\n");

        int countAorE2 = 0;

        for (int i = 0; i < students.length; i++) {
            if(students[i].toUpperCase().contains("A") || students[i].toUpperCase().contains("E")) countAorE2++;
        }

        System.out.println(countAorE2);

        /*
        TASK-5
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names has at least 5 characters 5,6,7,8,9,.....

        EXPECTED:
        3
         */
        int count5 = 0;
        for(String element :students){
            if(element.length()+1 == 5){
                count5++;
            }
        }
        System.out.println(count5);

     /* other tasks we can do
        Count how many names starts with J or j
        Count how many names starts or ends with S-s
        Count names has O-o
        Count names has even length
        Count names that has odd length
        Count names that starts with a vowel letter
         */



        boolean hasJennifer = false;
        for(String element :students){
            if(element.equalsIgnoreCase("Jennifer" )) {
                hasJennifer = true;
                break;

            }
        }

        System.out.println(hasJennifer);


    }
}
