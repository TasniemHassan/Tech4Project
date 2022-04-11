package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework16 {

    //TASK 1
    public static int countWords(String str){
         int words =  str.trim().split(" ").length;

         return words;
    }

   /* public static void main(String[] args) {
        System.out.println(words("  Java is fun   "));
        System.out.println(words("Selenium is the most common UI automation tool.  "));
    }

    */
    //TASK-2
    public static int countA(String str){
        int countA = 0;
        for(char c : str.toCharArray()){
            if(c == 'A' || c == 'a') countA++;
        }
        return countA;
    }

  /*  public static void main(String[] args) {
        System.out.println(countA("TechGlobal is a QA bootcamp"));
        System.out.println(countA("QA stands for Quality Assurance"));
        System.out.println(countA(" "));
    }

   */
    //TASK 3
    public static int countPos(ArrayList<Integer> numbers){
        int countPos = 0;
        for(Integer element : numbers){
            if(element > 0) countPos++;
        }
        return countPos;
    }

    /*public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-23);
        numbers.add(-4);
        numbers.add(0);
        numbers.add(2);
        numbers.add(5);
        numbers.add(90);
        numbers.add(123);
        System.out.println(countPos(numbers));
    }

     */
    //TASK 4
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numList){
        ArrayList<Integer> newNumList = new ArrayList<>();
        for(Integer element : numList){
            if(!newNumList.contains(element)) newNumList.add(element);
        }
        return newNumList;
    }

    /*public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
       numList.add(10);
        numList.add(20);
        numList.add(35);
        numList.add(20);
        numList.add(35);
        numList.add(60);
        numList.add(70);
        numList.add(60);

        numList.add(1);
        numList.add(2);
        numList.add(5);
        numList.add(2);
        numList.add(3);
        System.out.println(removeDuplicateNumbers(numList));
    }

     */


    //TASK 5
    public static ArrayList<String> removeDuplicateStringElements(ArrayList<String> strList){
        ArrayList<String> newStrList = new ArrayList<>();
        for(String element :strList){
            if(!newStrList.contains(element)) newStrList.add(element);
        }
        return newStrList;
    }

    /*public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("java");
        strList.add("C#");
        strList.add("ruby");
        strList.add("JAVA");
        strList.add("ruby");
        strList.add("C#");
        strList.add("C++");



        strList.add("abc");
        strList.add("xyz");
        strList.add("123");
        strList.add("ab");
        strList.add("ab");
        strList.add("abc");
        strList.add("ABC");

        System.out.println(removeDuplicateStringElements(strList));
    }

     */
    //TASK 6
    public static String removeExtraSpaces(String str){

       String strTrim = str.trim().replaceAll("\\s+"," ");
       return strTrim;
    }

   /* public static void main(String[] args) {
        System.out.println(removeExtraSpaces(" I am   learning  Java  "));
    }

    */
    //TASK 7
    public static int[] add(int[]arr1,int[]arr2) {
        int length = Math.min(arr1.length, arr2.length);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;

        /*if(arr1.length > arr.length){
            for(int i = 0; i < arr.length; i++){
                arr1[i]+= arr[i];
            }
        }

         */
        //STUCK if arr1.length > arr.length.. i want to add i to arr using loop
        // start point arr.length end point arr1.length. BUT i keep getting out of
        //bounds
    }



    /*public static void main(String[] args) {
        int[] arr1 = {6,8,3,0,0,7,5,10,34};
        int[] arr2 = {10,3,6,3,2};
        System.out.println(Arrays.toString(add(arr1,arr2)));
    }

     */
//Task-8
    public static int findClosestTo10(int[] numbers){
        int closest = numbers[0];
        for(int element : numbers){
            if((Math.abs(closest - 10) > Math.abs(10-element)))
                closest = element;
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] numbers = {-13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(numbers));
    }


}
