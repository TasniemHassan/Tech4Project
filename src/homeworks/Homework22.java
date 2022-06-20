package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework22 {

    /*
    TASK-1
    Requirement:
-Create a method called fibonacciSeries1()
-This method will take an int argument as n, and it will
return n series of Fibonacci numbers as an int
array.
REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
     */

    public static int[] fibonacciSeries1(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    /*
    TASK-2
    Requirement:
-Create a method called fibonacciSeries2()
-This method will take an int argument as n, and it will
return the nth series of Fibonacci number as an
int.
REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
     */

    public static int fibonacciSeries2(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n-1];
    }

    /*
    TASK-3
    Requirement:
-Create a method called findUniques()
-This method will take 2 int array argument and it will return
an int array which has only the unique values from both given
arrays.
NOTE: If both arrays are empty, then return an empty array.
NOTE: if one of the array is empty, then return unique values
from the other array.
     */

    public static int[] findUniques(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        boolean contains = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) list.add(arr1[i]);
            else contains = false;

        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
    /*
    TASK-4
    Requirement:
-Create a method called isPowerOf3()
-This method will take an int argument and it will
return true if given int argument is equal to 3
power of the X. Otherwise, it will return false.
Numbers that are power of 3 = 1, 3, 9, 27, 81, 243...
     */

    public static boolean isPowerOf_3(int number) {
        if (number < 1) return false;
        while (number % 3 == 0) {
            number /= 3;
        }
        return number == 1;
    }

    /*
    TASK-5
    Requirement:
-Create a method called firstDuplicate()
-This method will take an int array argument and it will
return an int which is the first duplicated number.
NOTE: All elements will be positive numbers.
NOTE: If there are no duplicates, then return -1
NOTE: If there are more than one duplicate, then return
the one for which second occurrence has the smallest
index.
     */

    public static int firstDuplicate(int[] array) {
        if (array.length <= 1) return -1;
        else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : array) list.add(num);
            ArrayList<Integer> newListWithDups = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {//1, 2, 3, 3, 4, 1
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) newListWithDups.add(list.get(i));
                }
                Collections.sort(newListWithDups);
            }
            return newListWithDups.get(newListWithDups.size() - 1);
        }
    }




    public static void main(String[] args) {
        System.out.println("-----TASK 1------");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println("-------TASK 2------");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));
        System.out.println("--------TASK 3-------");
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));
        System.out.println("--------TASK 4-------");
        System.out.println(isPowerOf_3(1));
        System.out.println(isPowerOf_3(2));
        System.out.println(isPowerOf_3(3));
        System.out.println(isPowerOf_3(81));
        System.out.println("----------TASK 5----------");
        System.out.println(firstDuplicate(new int[]{}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));



    }

}
