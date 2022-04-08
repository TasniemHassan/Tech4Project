package arrays;
import java.util.Arrays;
public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {


        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise
        */
        System.out.println("--------Task-1-------");

        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        boolean hasMouse = false;
        for(String element :objects){
            if(element.equalsIgnoreCase("Mouse" )) {
                hasMouse = true;
                break;
            }
        }
        System.out.println(hasMouse);


        System.out.println("--------Task-2-------");
        boolean hasBoard = false;
        for(String element :objects){
            if(element.equalsIgnoreCase("board" )) {
                hasBoard = true;
                break;
            }
        }
        System.out.println(hasBoard);

        System.out.println("--------Task-3-------");


        /*
        Arrays class has binarySearch() method that helps us find if our collection contains
        a specific element or not
        NOTE: To be able to use this method, your array Must be sorted first

        This method is taking 2 args, first is your array collection and the second is the
        element you are looking for

        1. One element is found -> it returns the index of the element
        2. Multiple elements are found -> it returns the index of last occurrence
        3. No element found  -> always returns negative index (-possible index - 1)
         */

        Arrays.sort(objects); //My array is sorted


        System.out.println(Arrays.binarySearch(objects,"iPad"));
        System.out.println(Arrays.binarySearch(objects,"Mouse"));
        System.out.println(Arrays.binarySearch(objects,"Phone")); //-3-1 bc it's not there but places it where it could be


        /*
TASK-4
Create an int array to store below data
{5, -2, 0, -7, 0, 5, 8, 45, 53}

Check if collection has 5
Check if collection has 0
Check if collection has 45
Check if collection has 3
Check if collection has -7

RESULT:
true
true
true
false
 */
        System.out.println("--------Task-4-------");

        int[] numbers = {5, -2, 0, -7, 0, 5, 8, 45, 53};

        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers,5) >= 0);
        System.out.println(Arrays.binarySearch(numbers,0) >= 0);
        System.out.println(Arrays.binarySearch(numbers,45) >= 0);
        System.out.println(Arrays.binarySearch(numbers,3) >= 0);
        System.out.println(Arrays.binarySearch(numbers,-7) >= 0);

    }
}
