package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        /*
TASK-1
Assume you are given a String as below
Please find how many words you have in the given String

String s1 = "Today is Tuesday";

RESULT:
3
 */
        System.out.println("------Task-1-----");

        String s1 = "Today is Tuesday";

        int countSpace = 0;

        for (char c : s1.toCharArray()) {
            if(c == ' ') countSpace++;
        }

        System.out.println(countSpace + 1);


        //OR

        System.out.println(s1.split(" ").length);



        String s2 = "Some countries I visited were Argentina, Belgium and Malt";

        String[] words2 = s2.split(" ");
        int countA = 0;
        for(String word : words2){
            if(word.toLowerCase().startsWith("a")) countA++;
        }
        System.out.println(countA);

    }
}
