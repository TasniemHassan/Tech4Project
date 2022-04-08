package arrays;
import utilities.CharacterHelper;
import java.util.Arrays;

public class _03_Practice_Int_Array {
    public static void main(String[] args){

     /*
    TASK-1
    Create an int array and store below data

    -3
    -7
    0
    2
    0
    7
    7
    10
    2
    15

    Print the array with message "Array not sorted = "
    Print the sorted array with message "Array sorted = "
    */

        System.out.println("\n-------TASK-1-------\n");
        int[] numbers = {-3, -7, 0, 2, 0, 7,7,10,2,15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers));



        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

         /*
        TASK-2
        Count how many positive-negative and zero numbers you have

        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
         */

        System.out.println("\n-------TASK-2-------\n");

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for(int element :numbers){
            if(element > 0 ) countPositive++;
                else if (element < 0) countNegative++;
                else countZero++;
        }
        System.out.println("Positives = " + countPositive + "\nNegatives = " + countNegative +
                "\nZeros = " + countZero);


        System.out.println("\n-------TASK-3-------\n");
        int evens = 0;
        int odds = 0;
        for(int element :numbers){
            if(element % 2 == 0 ) evens++;
            else  odds++;

        }
        System.out.println("Evens = " + evens + "\nOdds = " + odds);

        /*
        EXTRA PRACTICE
        count numbers that are more than 7 // 2
        numbers that can be divided by 5  // 4
        numbers can be divided by 2 but not by 3  // 3
        check if it contains 10 // true
        check is it contains 8 // false

         Please do this
        Count how many numbers are 2 digits
         */

    }
}
