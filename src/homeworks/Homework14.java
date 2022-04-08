package homeworks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("\n------Task-1------\n");
        /*
        Find the first duplicate in an Array
         */

       // int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        //int[] numbers = {-8, 56, 7, 8, 65};
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        // first. hardcode array given to test

       List<Integer> duplicatedNum = new ArrayList<>();
       //convert array to ArrayList to make it dynamic

       //loop through dynamic size array with i and j. if i==j then add i to new ArrayList
       for(int i=0; i < numbers.length; i++){
           for(int j = i+1; j < numbers.length; j++){
               if(numbers [i] == numbers[j]) duplicatedNum.add(numbers[i]);
               break;
           }
       }// if else to determine if there were any duplicates added
        //print the first element [0] by get() to access first duplicate found and added to ArrayList
       if(duplicatedNum.size()>=1) System.out.println(duplicatedNum.get(0));
       else System.out.println("There is no duplicates");

        System.out.println("\n------Task-2------\n");

        //String[] words = {"Z", "abc", "z", "123","#"};// ask why this isn't working
        //String[] words = {"xyz", "java", "abc"};
        String[] words = {"a", "b", "B", "XYZ", "123"};

        List<String> wordsDuplicate = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])) wordsDuplicate.add(words[i]);
                break;
            }
        }
        if(wordsDuplicate.size()>=1) System.out.println(wordsDuplicate.get(0));
        else System.out.println("There is no Duplicates");

        System.out.println("\n------Task-3------\n");

        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        //int[] numbers3 = {1, 2, 5, 0, 7};

        List<Integer> dupNums = new ArrayList<>(); // convert Array to List bc more dynamic size

        //loop through i and j to find duplicates. if i = j and its not already in the new array, add it
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (numbers3[i] == numbers3[j] && !dupNums.contains(numbers3[i]))
                    dupNums.add(numbers3[i]);
            }
        }
        //if else to print with another for i loop to print list
        if (dupNums.size() == 0) System.out.println("There is no duplicates");
        else {
            for (int i = 0; i < dupNums.size(); i++) {
                System.out.println(dupNums.get(i));

            }
        }
        System.out.println("\n------Task-4------\n"); //ask y a and A both print

        String[] words4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        List<String> duplicatedWords = new ArrayList<>();

        for (int i = 0; i < words4.length; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if (words4[i].equalsIgnoreCase(words4[j]) && !duplicatedWords.contains(words4[i]) )
                    duplicatedWords.add(words4[i]);
            }
        }
        if (duplicatedWords.size() == 0) System.out.println("There is no duplicates");
        else {
            for (int i = 0; i < duplicatedWords.size(); i++) {
                System.out.println(duplicatedWords.get(i));
            }
        }

        System.out.println("\n------Task-5------\n");
        String[] words5 = {"abc", "foo", "bar"};
        List<String>wordsList =Arrays.asList(words5); //convert array to list
        Collections.reverse(wordsList); //use Collections reverse method to reverse list
        String [] reversed = wordsList.toArray(words5); //convert list back to array

        System.out.println(Arrays.toString(reversed)); //print array

        //way1
        //String[] words2 = {"java", "python", "ruby"};
        //String[] reverseWords2 = new String[words.length];

        //for (int i = 0; i<words.length; i++){
            //reverseWords2[i] = words2[words2[words2.length - 1 - i]];
       // }
       // System.out.println(Arrays.toString(reversedWords2));

        //Way2... watch recap 4/4

        System.out.println("\n------Task-6------\n");

        String str ="Java is fun";
        String [] newStr = str.split(" ");
        //Split the string at whitespaces which will give u seperate words

        String reverseString = "";
        for (int i =0; i < newStr.length; i++){
            String word6 = newStr[i]; //loop through the string and take each word and reverse it
            String reverseWord6 = "";
            for(int j = word6.length()-1; j >= 0; j--){
                reverseWord6 = reverseWord6 + word6.charAt(j);
            }
            reverseString = reverseString + reverseWord6 + " "; //attach the string to the words
        }
        System.out.println(reverseString); // print


        /*
        String str = "Java is fun"

        String[] w = str.spli(" ");

        for (int i = 0; i< w.length; i++){

            String currentReverseW = "";
            for (int j = w[i].length() - 1; j >=0; j--){
            currentReverseW += "" + w[i].charAt(j);

            }
            w[i] = currentReverseW;
            }
            for (int i =0; i < w.length, i++){
            System.out.println(i == w.length - 1) ? w[i] : w[i] + " ");

            }
         */






    }
}
