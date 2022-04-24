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
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("java","C#","ruby","JAVA","ruby","C#","C++" );
        System.out.println(removeDuplicateStringElements(strList));
    }

     */
    //TASK 6
    public static String removeExtraSpaces(String str){

        String[] strArr = str.trim().split(" ");
        StringBuilder sentence = new StringBuilder();
        for(String el : strArr) {
            if (!el.isEmpty()) sentence.append(el).append(" ");
        }
        return sentence.substring(0, sentence.length()-1);

      // String strTrim = str.trim().replaceAll("\\s+"," ");
      // return strTrim;
    }

   /* public static void main(String[] args) {
        System.out.println(removeExtraSpaces(" I am   learning  Java  "));
    }

    */
    //TASK 7
    /*public static int[] add(int[]arr1,int[]arr2) {
       for(int i = 0; i<Math.min(arr1.length,arr2.length); i++){
           if(
       }
       return (arr1.length> arr2.length) ? arr1:arr2;
    }

     */



    /*public static void main(String[] args) {
        int[] arr1 = {6,8,3,0,0,7,5,10,34};
        int[] arr2 = {10,3,6,3,2};
        System.out.println(Arrays.toString(add(arr1,arr2)));
    }

     */
//Task-8
    public static int findClosestTo10(int[] numbers){
        int closest = Integer.MAX_VALUE;
        Arrays.sort(numbers);
        for(int i = 1; i< numbers.length; i++){
            if(numbers[i] !=10 && (Math.abs(closest - 10) > Math.abs(10-numbers[i])))
                closest = numbers[i];
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] numbers = {10,-13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(numbers));
    }


}
